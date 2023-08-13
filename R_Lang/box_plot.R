# Syntax: boxplot(x, data, notch, varwidth, names, main)

datasets:: mtcars
input <- mtcars[,c('mpg','cyl')]
print(tail(input))

png(file = "boxplot.png")

boxplot(mpg ~ cyl, data = mtcars,
        xlab = "Number of cylinders",
        ylab = "Miles per galon",
        main = "Mileage data",
        col = rainbow(5),
        horizontal = TRUE
)


dev.off()
