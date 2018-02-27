library(ggplot2)
library(reshape)

listings<-read.csv("output.csv",header=TRUE)
prices<-as.data.frame(cbind(listings$convertedBuyItNowPrice,listings$convertedCurrentPrice))
colnames(prices)<-c("BIN Prices","Auction Prices")
prices.m<-melt(prices)
ggplot(prices.m) + geom_freqpoly(aes(x = value,color=variable,binwidth = 5))