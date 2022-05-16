import weka.core.Instances;

import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.core.converters.ArffLoader.ArffReader;
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.Evaluation;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.DensityBasedClusterer;
import weka.clusterers.SimpleKMeans;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

public class SimpleKmeans {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Godde\\OneDrive\\Máy tính\\Java\\data mining\\DBSCAN\\data\\rfm.arff"));
    ArffReader arff = new ArffReader(reader);
    Instances data = arff.getData();
    
    //System.out.println(data.toSummaryString());

    SimpleKMeans model = new SimpleKMeans();
    
    Remove removeFilter = new Remove();
    int[] myNum = {1,2,3};
    removeFilter.setAttributeIndicesArray(myNum);
    removeFilter.setInvertSelection(true);
    removeFilter.setInputFormat(data);
    Instances newData = Filter.useFilter(data, removeFilter);
    
    
    model.setNumClusters(4);
    model.buildClusterer(newData);

    System.out.println(model);
    ClusterEvaluation clsEval = new ClusterEvaluation();
    Instances cluster = model.getClusterCentroids();
   
    
    
    
    
    }
}
    

