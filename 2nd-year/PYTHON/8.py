import math

class Shape:
    def area(self):
        pass
    
class Circle(Shape):
    def __init__(self,radius):
        self.radius = radius
    def area(self):
        return math.pi*self.radius**2
    
class Rectangle(Shape):
    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth
    def area(self):
        return self.length*self.breadth

class Triangle(Shape):
    def __init__(self,base,height):
        self.base = base
        self.height = height
    def area(self):
        return 0.5*self.base*self.height

circle = Circle(5)
rectangle = Rectangle(4, 6)
triangle = Triangle(3, 7)
# Display the area of each shape
print("Area of Circle:",circle.area())
print("Area of Rectangle:", rectangle.area())
print("Area of Triangle:",triangle.area())