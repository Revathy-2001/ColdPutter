
n = gets.to_i
arr = gets.chomp.split.map(&:to_i)
cnt = i = 0
while(i < n)
  t = arr[i].to_i
  if(t < 0)
    cnt+=1
  end
  i+=1
end
print(cnt)