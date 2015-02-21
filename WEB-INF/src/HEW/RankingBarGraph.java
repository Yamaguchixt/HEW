package HEW;

import riot.*;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.jfree.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RankingBarGraph extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("image/png");
		OutputStream out = response.getOutputStream();
		
		try {
				JFreeChart chart = createChart();
				ChartUtilities.writeChartAsPNG(out, chart, 900,10000);
		} catch (SQLException e) {
				e.printStackTrace();
		}finally{
			out.close();
		}
		
		
	}
	
	private JFreeChart createChart() throws SQLException{
		
		int[]favariteArray = DBinterface.getFavariteRanking();
		String[] championList = ChampionApi.championName;
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		for(int i =0; i < 123; i++){
			data.addValue(favariteArray[i],championList[i],"");
		}
		
		JFreeChart chart = ChartFactory.createBarChart(
															/*タイトル*/null,
	                                                       /*横軸*/null,
	                                                       /*縦軸*/null,
	                                                       /*date*/data,
	                                                       /*向き*/PlotOrientation.HORIZONTAL,
	                                                       false,false,false
	                                                       );
		
		final CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(new Color(18,44,56,100));
		plot.setRangeGridlinesVisible(false);
		chart.setBackgroundPaint(new Color(142,142,142,100));
		chart.setBackgroundImageAlpha(0.5f);
		
		final BarRenderer renderer = (BarRenderer)plot.getRenderer();
		renderer.setShadowVisible(false); 

		
		
		
		
		return chart;
				
				
				
		
	}
}
