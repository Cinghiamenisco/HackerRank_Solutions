def print_formatted(number):
    # your code goes here
    w = len(str(bin(number)))-2
    for i in range(1,number+1):
        print (
            str(i).rjust(w,' '),
            str(oct(i)[2:]).rjust(w,' '),
            str(hex(i)[2:].upper()).rjust(w,' '),
            str(bin(i)[2:]).rjust(w,' '),sep=' ')