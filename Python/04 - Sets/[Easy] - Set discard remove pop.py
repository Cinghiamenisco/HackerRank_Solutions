n = int(input())
s = set(map(int, input().split()))
query = int(input())
while query>0:
    
    cmd = input().split()
    if cmd[0] == "pop":
        try:
            s.pop()
        except KeyError:
            print("Pop from an empty set")
    elif cmd[0] == "remove":
        try:
            s.remove(int(cmd[1]))
        except KeyError:
            print("cannot remove")
    elif cmd[0] == "discard":
        s.discard(int(cmd[1]))
        
    query-=1

print(sum(s))
