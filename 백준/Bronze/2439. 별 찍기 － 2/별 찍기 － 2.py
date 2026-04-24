N=int(input())
num=1

for j in range (N, 0, -1) :
    print(" "*(j-1), end="")
    print("*"*num)
    num+=1