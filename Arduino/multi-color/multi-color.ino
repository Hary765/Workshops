//Multi-color LED

int red = 7;
int green = 6;
int blue = 5;

void setup() {
  // put your setup code here, to run once:
  pinMode(red,OUTPUT);
  pinMode(green,OUTPUT);
  pinMode(blue, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  setColor(255,0,0); // Color red
  delay(1000);
  setColor(0,255,0); // Color green
  delay(1000);
  setColor(0,0,255); // Color blue
  delay(1000);
  setColor(255,255,255); // Color white
  delay(1000);
  setColor(170,0,255); // Color purple
  delay(1000);
  
  

}

void setColor(int redValue, int greenValue, int blueValue){
  analogWrite(red,redValue);
  analogWrite(green,greenValue);
  analogWrite(blue,blueValue);

  
  }



