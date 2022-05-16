## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

##work process: 
1. data -> RFM analytic -> rfm_ data (customerID, recent, frequent, money) 
2. cluster them simple k mean number cluster 4 ->  assign label 
3. Transform data into FP growth data index = customerID, columns = list of item ( mark ='t' if person buy '?' if not)
4. split into cluster 1,2,3,4 
5. run FP growth on all dataset and each cluster
=============================================================
## Files
CSV2Arff to convert to arff file 
simplekmean to cluster 
FPgrowth to frequent itemset mining
=============================================================
##Result
Unfortunately no rules appear on each cluster and all dataset 
