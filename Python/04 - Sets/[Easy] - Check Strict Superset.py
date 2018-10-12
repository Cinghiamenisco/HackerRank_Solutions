set_a = set(input().split())
query = int(input())
flag = True
while query > 0:
    temp_set = set(input().split())
    if temp_set.difference(set_a):
        flag = False
    
    query -=1
print(flag)
