int accelVal;
int mappedVal;

int LED =3;
int accelerometer = A5;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  
  pinMode(LED, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  accelVal = analogRead(accelerometer);


  mappedVal = map(accelVal, 267, 404, 0, 255);
  Serial.println(mappedVal);
  analogWrite(LED, mappedVal);
  delay(100);
}
