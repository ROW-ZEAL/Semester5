# Create data for the graph

x <- c(1,62,10,53)
labels <- c("London", "New York", "Singapore")

# Give the chart file name

png(file = "city.jpg")

# plot the chart

pie(x,labels)


