//Button Press

int pushButton = 2;// button pin

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600); //start serial moniter
  pinMode(pushButton, INPUT); //btn pin as input
}

void loop() {
  // put your main code here, to run repeatedly:
  int buttonState = digitalRead(pushButton);
  //print button state
  Serial.println(buttonState);
  delay(100);
}
