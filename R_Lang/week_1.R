# NOTE: To import dataset in R - datasets :: mtcars
#-----------------------------------------------------------

# Create data for the graph

x <- c(1,62,10,53)

labels <- c("London", "New York", "Singapore", "Germany")

# Give the chart file name

png(file = "city.jpg")

# plot the chart

pie(x,labels)

dev.off() #to close the file that we created.



# Shortcut to run- first to end - Cmd+opti+B | Cmd + Enter (line by line)

#----------------------------------------------------------------------------
#----------------------------------------------------------------------------
# Example - 2

# Create data for the graph.
x <- c(21, 62, 10, 53)
labels <- c("London", "New York", "Singapore", "Mumbai")

# Give the chart file a name.
png(file = "city_title_colours.jpg")

# Plot the chart with title and rainbow color pallet.
pie(x, labels, main = "City pie chart", col = rainbow(length(x)))

# Save the file.
dev.off()

#----------------------------------------------------------------------------
#----------------------------------------------------------------------------

#Example 3
# Create data for the graph.
x <-  c(21, 62, 10,53)
labels <-  c("London","New York","Singapore","Mumbai")

piepercent<- round(100*x/sum(x), 1)

# Give the chart file a name.
png(file = "city_percentage_legends.jpg")

# Plot the chart.
pie(x, labels = piepercent, main = "City pie chart",col = rainbow(length(x)))
legend("topright", c("London","New York","Singapore","Mumbai"), cex = 0.8,
       fill = rainbow(length(x)))

# Save the file.
dev.off()

#----------------------------------------------------------------------------
#----------------------------------------------------------------------------

# Barplot in R

# barplot(H,xlab,ylab,main, names.arg,col)
        #data, x axis, y axis, title value, color


# Create the data for the chart
H <- c(7,12,28,3,41)

# Give the chart file a name
png(file = "barchart.png")

# Plot the bar chart 
barplot(H)

# Save the file
dev.off()

#----------------------------------------------------------------------------
#----------------------------------------------------------------------------
#Exerice 2
# Create the data for the chart
H <- c(7,12,28,3,41)
M <- c("Mar","Apr","May","Jun","Jul")

# Give the chart file a name
png(file = "barchart_months_revenue.png")

# Plot the bar chart 
barplot(H,names.arg=M,xlab="Month",ylab="Revenue",col="blue",
        main="Revenue chart",border="red")

# Save the file
dev.off()
