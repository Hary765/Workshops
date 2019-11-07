int mic=A5;
int micVal;
int enable = 1;

int thresh = 900;
int LEDState = LOW;
int LED= 3;

long lastDebounceTime=0;
long debounceDelay=500;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(LED, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  micVal = analogRead(mic);

  //Serial.println(micVal);
  if(micVal>900 && enable){
    enable =LOW;
    lastDebounceTime = millis();
    LEDState = !LEDState;
    Serial.println(LEDState);
    }

    if (millis() - lastDebounceTime > debounceDelay) {
      enable = HIGH;
      }

    
    
    digitalWrite(LED, LEDState);
    delay(10);
}
