//Arduino Workshop Fall

int led = 7;

void setup() {
  // put your setup code here, to run once:
  pinMode(led, OUTPUT); // initialize LED
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(led,HIGH); ///turn LED on
  delay(1000);// wait one second
  digitalWrite(led,LOW);//turn off LED
  delay(1000); // wait one second
}
