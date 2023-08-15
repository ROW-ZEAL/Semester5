factorial(3) 



perm = function(n,x){
  factorial(n)/factorial(n-x)
}

perm(10,2)

comb = function(n,x){
  factorial(n) / (factorial(n-x) * factorial(x))
}

comb(10,2)
