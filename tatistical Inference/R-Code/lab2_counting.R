
#1.
factorial(3) 

#2.
perm = function(n,r){
  factorial(n)/factorial(n-r)
}

perm(5,4)

#3.
comb = function(n,r){
  factorial(n) / (factorial(n-r) * factorial(r))
}

comb(10,2)

#4.

install.packages('gtools')
#load library
library(gtools)
#run with 3 balls
x <- c('red', 'blue', 'black')
#pick 2 balls from the urn with replacement
#get all permutations
permutations(n=3,r=2,v=x,repeats.allowed=T)
# - n -> kati ota element
# r -> number of row
# repeats.allowed=T, F -> repeats the same permutation or not.

#5.
#number of permutations (rows)
nrow(permutations(n=3,r=2,v=x,repeats.allowed=T))



