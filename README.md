# Test Driven Development Mock Interview Exercise Practice

## Instructions:

You are required to create a temperature converter that converts temperature values between Celsius, Fahrenheit and Kelvin. 
Use the following for the conversions.

### From Fahrenheit (F):

- To Celsius: (F-32)/1.8
- To Kelvin: (F+459.67)/1.8

### From Celsius (C):
 - To Fahrenheit: (C*1.8)+32
 - To Kelvin: C + 273.15

### From Kelvin (K): 
- To Fahrenheit: (K*1.8)-459.67
- To Celsius: (K): K-273.15

The class converts temperatures between min and max values (inclusive) given below. If a temperature outside these 
limits is provided the conversion method throws an illegal argument exception.

### Fahrenheit
- Max: 9900000000032
- Min: -459.67

### Celsius
- 5500000000000
- -273.15

### Kelvin
- 5500000000273.15
- 0
