			const int PIN_D8 = 8;
			const int PIN_D9 = 9;
			const int PIN_D10 = 10;


				enum TrafficState {
						STATE_RED
				,
						STATE_GREEN
				,
						STATE_YELLOW
				}
				
TrafficState currentState = STATE_RED;
unsigned long stateStartTime = millis();



void setup()
{
			pinMode(PIN_D8, OUTPUT);
			pinMode(PIN_D9, OUTPUT);
			pinMode(PIN_D10, OUTPUT);
}

void loop()
{

switch(currentState) {
				

}
}
