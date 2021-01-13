n = int(input())
lst = list(input().split())
cnt = 0
for i in range(0,n):
  t = int(lst[i])
  if(t < 0):
    cnt+=1
print(cnt)