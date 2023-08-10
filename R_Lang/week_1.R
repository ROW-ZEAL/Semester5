# Create data for the graph

x <- c(1,62,10,53)

labels <- c("London", "New York", "Singapore", "Germany")

# Give the chart file name

png(file = "city.jpg")

# plot the chart

pie(x,labels)

dev.off() #to close the file that we created.



# Shortcut to run- first to end - Cmd+opti+B

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


