x = 8;
y = 6;

print("Arithmetic Operators")

print("Addition: ",x+y);
print("Substraction: ",x-y);
print('Multiplication: ',x*y);
print("Division: ",x/y);
print("Modulus: ",x%y);
print("Exponentiation: ",x**y);
print("")

print("Comparison Operators ")
a = 13
b = 33
print(a > b)
print(a < b)
print(a == b)
print(a != b)
print(a >= b)
print(a <= b)
print("")

print("Logical Operator")
a = True
b = False
print(a and b)
print(a or b)
print(not a)
print("")

print("Bitwise Operators")
a = 10
b = 4
print(a & b)
print(a | b)
print(~a)
print(a ^ b)
print(a >> 2)
print(a << 2)
print("")

print("Assignment Operator")
a = 10
b = a
print(b)
b += a
print(b)
b -= a
print(b)
print("")

print("Membership Operator")
x = 24
y = 20
list = [10, 20, 30, 40, 50]
if (x not in list):
    print("x is NOT present in given list")
else:
    print("x is present in given list")
 
if (y in list):
    print("y is present in given list")
else:
    print("y is NOT present in given list")