from sys import stdin
from collections import deque
input = stdin.readline

for _ in range(int(input())):
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    q = deque()

    def solve():
        cnt = 0
        while q:
            mx = max(q)[0]
            prior, doc = q.popleft()
            if prior == mx:
                cnt += 1
                if doc == m:
                    print(cnt)
                    return
            else:
                q.append((prior, doc))

    for i in range(n):
        q.append((a[i], i))
    solve()