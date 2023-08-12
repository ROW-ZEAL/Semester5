
# Data Type in R
num1 = 3
char1 = "hello"
log1 = TRUE
complex1 = 4 + 7i

#To know which data type it is: class(variable_name)
# R is dynamic type programming langauge


# Assignemnt Operator in R

b = 1
b <-1
1 -> b

# Arithmetic Operator

num1 = 10
num2 = 20

# num1 + num2
# num1 - num2
# num1 * num2
# num1 / num2


# Relational Operators:
# ==, >, <, !=

# Logical Operator:
# AND(&) - Both True , OR (|) - Either one True, then True

#-----------------------------------
# DATA STRUCTURE IN R

# 1. vectors:
#-> single dimension data set
# (homogeneous data structre)
# -> we cannot store element of different type
# -> No row or columns only single dimension
# c symbol must  be used to create vector

vec1 <- c(1,2,3)
vec2 <- c("a", "b", "c")
vec3 <- c(T,F,T)

mixbag1 <- c(1,T,2,F)
# output - numeric (convert into) which have high precedence value. 
mixbag2 <- c(1,"a",2,"b")
mixbag3 <- c(1,"a",T)

# Extracting elements from vector
# Note- index start from 1 not 0 in R

mixbag2[1]
mixbag2[2]
mixbag2[1:3] 

#2. List
# single dimension - hetrogeneous datastruture
# -> we can store element of different type

li <- list(1, "a", TRUE)

class(li[[1]])
class(li[[2]])
class(li[[3]])

lst2 = list(c(1,2,3), c("a", "b", "c"), c(T,F,T))

lst2[[2]][2] # second component ko vitra ko 2nd index ko value
lst2[[1]][3]


# 3. Matrix -> Row and Columms
# -> 2D homogenoenous datastructure
# -> So, only same datatype data can be store


m1 <- matrix(c(1,2,3,4,5,6)) # 1 column and 6 rows

# To define no. of row and column
m1 <- matrix(c(1,2,3,4,5,6), nrow = 2, ncol = 3)

# To store row wise
m1 <- matrix(c(1,2,3,4,5,6), nrow = 2, ncol = 3, byrow = T)

# To extract element in matrix
m1[2,2]

#4. Array - stack of matrixes
# -> multi- dimension homogeneous data structure

vec1 <- c(1,2,3,4,5,6)
vec2 <- c(7,8,9,10,11,12)

a1 <- array(c(vec1, vec2), dim = c(2,3,2))
# here, dim = c(2,3,2) - row, columns, no. of dimension

#Extract value

a1[1,1,2] 
# To extract 7, - row 1, column 1 and dimension 2


# 5. Factor


