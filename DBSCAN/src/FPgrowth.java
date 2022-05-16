import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.core.converters.ArffLoader.ArffReader;
import weka.associations.FPGrowth;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import weka.core.converters.ConverterUtils.DataSource;
public class FPgrowth {
    public static void main(String[] args) throws Exception {

    String path="C:\\Users\\Godde\\OneDrive\\Máy tính\\Java\\data mining\\DBSCAN\\data\\";
    BufferedReader reader = new BufferedReader(new FileReader(path+"FPgrowth.arff"));
    ArffReader arff = new ArffReader(reader);
    Instances data = arff.getData();
    data.deleteStringAttributes();
    
    FPGrowth model = new FPGrowth();
    model.buildAssociations(data);
    System.out.println("Testing on entire dataset:");
    System.out.println(model);
    // result in testing show no rules found on the entire dataset and each cluster
    //
    //
    //


    
    


    
}
}
