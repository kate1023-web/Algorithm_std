A, B = map(int, input().split())
C=int(input())
B=B+C
while ( B >= 60) :
    if ( B >=60 ) :
        B=B-60
        A=A+1
while ( A >= 24) :
    if ( A >= 24) :
        A=A-24
print(A, B)