x=float(raw_input("enter number"))
print x
p=0
while (2**p*x<1):
	print('Remainder = ' + str((2**p)*x - int((2**p)*x)))
	p+=1
print p,2**p*x

num = int(x*(2**p))

result = ''
if num == 0:
    result = '0'
while num > 0:
    result = str(num%2) + result
    num = num/2
for i in range(p - len(result)):
    result = '0' + result

result = result[0:-p] + '.' + result[-p:]
print('The binary representation of the decimal ' + str(x) + ' is ' + str(result))