import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import java.io.File;


public class CSV2Arff {
    public static void main(String[] args) throws Exception {
        CSVLoader loader = new CSVLoader();
        String path="C:\\Users\\Godde\\OneDrive\\Máy tính\\Java\\data mining\\DBSCAN\\data\\";
        loader.setSource(new File(path+"cluster4.csv"));
        Instances data = loader.getDataSet();
        //System.out.println(data.toSummaryString());
        // save ARFF
        ArffSaver saver = new ArffSaver();
        saver.setInstances(data);
        
        saver.setFile(new File(path+"cluster4.arff"));
        
        saver.writeBatch();
    }
}
