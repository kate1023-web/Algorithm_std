def fibo(n):
    result = [0, 1]
    def memoize(n):
        if len(result) > n:
            return result[n]
        result.append(memoize(n-1) + memoize(n-2))
        return result[n]
    return memoize(n)

num = int(input())
print(fibo(num))