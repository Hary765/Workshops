import math
import sys

def rectangle():
    
    length = float(input("Please enter a length for the rectangle:\n"))    
    width = float(input("Please enter a width for the rectangle:\n"))
    area = length*width
    print("The area of the rectangle is %.2f" % (area))
    
def circle():
    
    radius = float(input("Please enter the radius of the circle:\n"))
    area = math.pi * math.pow(radius, 2)
    print("The area of the circle is %.2f" % (area))
    
def triangle():
    
    base = float(input("Please enter the base of the triangle:\n"))
    height = float(input("Please enter the height of the triangle:\n"))
    area = (0.5)*base*height
    print("The area of the triangle is %.2f" % (area))
    

if __name__ == "__main__":
    
    print("Welcome to the boolin' area calculator\n\n")
    useIt = True
    
    while useIt:
        
        response = input("You trynna use it? (Yes/No)\n")
        response = response.lower()
        
        if response == "yes":
            
            print("Yeet")
            useIt = False
            
        elif response == "no":
            
            print("Okay, have a nice day")
            sys.exit(0)
            
        else:
            
            print("This ain't it dawg, try again")
            
    keepGoing = True
    
    while keepGoing:
        
        shape = input("Pick a shape bro: (rectangle, circle, triangle)\n")
        
        shape = shape.lower()
        
        if shape == "rectangle":
            
            rectangle()
            
        elif shape == "circle":
            
            circle()
            
        elif shape == "triangle":
            
            triangle()
            
        else:
            
            print("You didn't pick a valid shape, and for that reason: I'm out")
        
        tryAgain = True
        
        while tryAgain:
            
            askUser = input("Wanna keep going? (Yes/No)\n")
            askUser = askUser.lower()
        
            if askUser == "yes":
                
                print("Nice!")
                tryAgain = False
                
            elif askUser == "no":
                
                print("That's fine, I guess I wasn't good enough")
                sys.exit(0)
                
            else:
                
                print("C'mon man, you're better than that")
