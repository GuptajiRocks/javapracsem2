# print("Does it move? ")
# x = str(input())
# 

def checkmove(x):
    if x == "yes":
        print("Should it? ")
        x1 = str(input())
        if x1 == "yes":
            return "No problem"
        else:
            return "Duct Tape"
    elif x == "no":
        print("Should it? ")
        x2 = str(input())
        if x2 == "no":
            return "No problem"
        else:
            return "WD-40"

print("Does it move? ")
x = str(input())
res = checkmove(x)
print(res)