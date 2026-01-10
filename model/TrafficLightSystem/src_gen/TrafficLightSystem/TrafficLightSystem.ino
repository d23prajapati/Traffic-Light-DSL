			const int PIN_RED = 8;
			const int PIN_YELLOW = 9;
			const int PIN_GREEN = 10;


				enum TrafficState {
						STATE_RED
				,
						STATE_GREEN
				,
						STATE_YELLOW
				};
				
TrafficState currentState = TrafficState::STATE_RED;
unsigned long stateStartTime = millis();



void setup()
{
			pinMode(PIN_RED, OUTPUT);
			pinMode(PIN_YELLOW, OUTPUT);
			pinMode(PIN_GREEN, OUTPUT);
}

void loop()
{

switch(currentState) {
						case STATE_RED:
						digitalWrite(PIN_RED, HIGH);
						if(millis() - stateStartTime >= 5000) {
							digitalWrite(PIN_RED, LOW);
							currentState = STATE_GREEN;
							stateStartTime = millis();
						}
						break;
						case STATE_GREEN:
						digitalWrite(PIN_GREEN, HIGH);
						if(millis() - stateStartTime >= 7000) {
							digitalWrite(PIN_GREEN, LOW);
							currentState = STATE_YELLOW;
							stateStartTime = millis();
						}
						break;
						case STATE_YELLOW:
						digitalWrite(PIN_YELLOW, HIGH);
						if(millis() - stateStartTime >= 2000) {
							digitalWrite(PIN_YELLOW, LOW);
							currentState = STATE_RED;
							stateStartTime = millis();
						}
						break;
				

}
}
