work process: 
1. data -> RFM analytic -> rfm_ data (customerID, recent, frequent, money) 
2. cluster them simple k mean number cluster 4 ->  assign label 
3. Transform data into FP growth data index = customerID, columns = list of item ( mark ='t' if person buy '?' if not)
4. split into cluster 1,2,3,4 
5. run FP growth on all dataset and each cluster
=============================================================
CSV2Arff to convert to arff file 
simplekmean to cluster 
FPgrowth to frequent itemset mining
=============================================================
Unfortunately no rules appear on each cluster and all dataset 