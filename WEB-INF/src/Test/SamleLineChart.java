package Test;

import java.io.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javafx.scene.text.Font;

import javax.imageio.ImageIO;

import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleInsets;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
public class SamleLineChart{

   public static void main( String[ ] args ) throws Exception{
   
	   DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
	   
	      line_chart_dataset.addValue( 1000 , "0", "970" );
	      line_chart_dataset.addValue( 1200 , "0", "1000" );
	      line_chart_dataset.addValue( 1600 , "0", "1100" );
	      line_chart_dataset.addValue( 1300 , "0", "1200" );
	      line_chart_dataset.addValue( 1300 , "0" , "1300" ); 
	      line_chart_dataset.addValue( 1400 , "0" , "1400" ); 
	      line_chart_dataset.addValue( 1600 , "0" , "1500" ); 
	      line_chart_dataset.addValue( 1800 , "0" , "1600" ); 
	      line_chart_dataset.addValue( 900 , "0" , "1700" ); 
	      line_chart_dataset.addValue( 1400 , "0" , "1800" ); 
	      line_chart_dataset.addValue( 1200 , "0" , "1900" ); 
	     
	      
	      JFreeChart lineChartObject = ChartFactory.createLineChart(
	         "change of your rating","Year",
	         "rating",
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
	    	  image = ImageIO.read(new File("./images/bg.jpg"));
	      }catch (Exception e){System.out.println("背景画像取得失敗");}
	      
		  lineChartObject.setBackgroundImage(image);
		  lineChartObject.setBackgroundImageAlpha(0.5f);
	      //lineChartObject.setBackgroundPaint(new Color(142,142,142,100));
		  
	      int width = 1100; /* Width of the image */
	      int height = 600; /* Height of the image */ 
	      File lineChart = new File( "./images/Winrate.jpg" ); 
	      ChartUtilities.saveChartAsJPEG(lineChart ,lineChartObject, width ,height); 
   }
}