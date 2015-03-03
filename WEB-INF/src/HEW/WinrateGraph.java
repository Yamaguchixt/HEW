package HEW;

import riot.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.jfree.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleInsets;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WinrateGraph extends HttpServlet{
    
    
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        
        //requestからSNもらう
        String summonerName = request.getParameter("summonerName");
        System.out.println(summonerName+"でdoGetされました。");
        
        //SNの勝率をえる
        double[] winrate = Winrate.getWinrate(summonerName);
        
        /*
        response.setContentType("image/png");
        OutputStream out = response.getOutputStream();
        */
        try {
               /* JFreeChart chart =*/ createChart(winrate,summonerName);
                //ChartUtilities.writeChartAsPNG(out, chart,1100,600);
        } catch (SQLException e) {
                e.printStackTrace();
        }finally{
          //  out.close();
        }
    }
    
        //勝率が格納されたdouble配列をもらう
        private void createChart(double[] winrate,String summonerName) throws SQLException, IOException{
            
            DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
            
            for(int i= 9; i > -1; i--){
                    line_chart_dataset.addValue(winrate[i] , "0", ((i+1)*15 )+"-"+(((i+1)*15)-15));
                    
            }
            
            JFreeChart lineChartObject = ChartFactory.createLineChart(
               summonerName,"games",
               "Winrate",
               line_chart_dataset,PlotOrientation.VERTICAL,
               false,false,false);
        
            //JFreeChart objectからplotオブジェクトをもらう
            CategoryPlot plot = lineChartObject.getCategoryPlot();
           
            
            //背景色を指定、透明度も指定できる
            plot.setBackgroundPaint(new Color(18,44,56,100));
            plot.getRenderer().setSeriesPaint(0, new Color(236,225,46));
            plot.setOutlineVisible(false);
            plot.setForegroundAlpha(0.5f);
           
            RectangleInsets insets = new RectangleInsets(25d, 25d, 25d, 100d);
            plot.setInsets(insets);
            
            //グリッドラインの表示、非表示
            plot.setDomainGridlinesVisible(false);
            plot.setRangeGridlinesVisible(false);
            
            
           //lineの太さを設定
            LineAndShapeRenderer renderer = (LineAndShapeRenderer)plot.getRenderer();
            renderer.setSeriesStroke(0, new BasicStroke(6));
            renderer.setSeriesShapesVisible(0,false);
            renderer.setSeriesPaint(0, new Color(236,225,46));
            //背景画像を読み込む
            BufferedImage image = null;
            try {
                image = ImageIO.read(new File("C:/Users/study/workspace_jv11/HEW/images/bg.jpg"));
            }catch (Exception e){System.out.println("背景画像取得失敗");}
            
            lineChartObject.setBackgroundImage(image);
            lineChartObject.setBackgroundImageAlpha(0.5f);
            //lineChartObject.setBackgroundPaint(new Color(142,142,142,100));
            
            
            
            File jpgfile = new File( "C:/Users/study/workspace_jv11/HEW/images/Winrate.jpeg") ; 
            ChartUtilities.saveChartAsJPEG(jpgfile ,lineChartObject,1100 ,600);  
            System.out.println("画像作成しました");
           //return lineChartObject;
        
        
    }
}
    