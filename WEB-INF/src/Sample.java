import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

import org.jfree.chart.ChartUtilities;
import java.io.File;
import java.io.IOException;

public class Sample{
  public static void main(String[] args) {
    DefaultPieDataset data = new DefaultPieDataset();

    data.setValue("アサヒ", 37);
    data.setValue("キリン", 36);
    data.setValue("サントリー", 13);
    data.setValue("サッポロ", 12);
    data.setValue("その他", 2);

    JFreeChart chart = 
      ChartFactory.createPieChart("Sample", data, true, false, false);

    File file = new File("C:/Users/study/workspace_jv11/HEW/images/chart.png");
    try {
      ChartUtilities.saveChartAsPNG(file, chart, 500, 500);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
