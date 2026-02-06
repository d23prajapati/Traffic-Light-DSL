
/* PIN DEFINITIONS */

	const int PIN_TrafficLight_NORTH_RED = 8;
	const int PIN_TrafficLight_NORTH_YELLOW = 9;
	const int PIN_TrafficLight_NORTH_GREEN = 10;
	const int PIN_TrafficLight_EAST_RED = 22;
	const int PIN_TrafficLight_EAST_YELLOW = 23;
	const int PIN_TrafficLight_EAST_GREEN = 24;
	const int PIN_TrafficLight_SOUTH_RED = 32;
	const int PIN_TrafficLight_SOUTH_YELLOW = 33;
	const int PIN_TrafficLight_SOUTH_GREEN = 34;

	const int PIN_PED_RED_NORTH = 7;
	const int PIN_PED_GREEN_NORTH = 6;
	const int PIN_PED_RED_EAST = 25;
	const int PIN_PED_GREEN_EAST = 26;
	const int PIN_PED_RED_SOUTH = 36;
	const int PIN_PED_GREEN_SOUTH = 37;

	const int PIN_BTN_NORTH = 11;
	const int PIN_BTN_EAST = 27;
	const int PIN_BTN_SOUTH = 38;

/* PEDESTRIAN REQUEST FLAGS */

bool REQ_North_South = false;
bool REQ_East_West = false;



bool LAST_North_South = HIGH;
bool LAST_East_West = HIGH;
enum Phase {
	PHASE_NS_RED_PHASE,
	PHASE_NS_RED_YELLOW_PHASE,
	PHASE_NS_GREEN_PHASE,
	PHASE_NS_YELLOW_PHASE,
};
Phase currentPhase = PHASE_NS_RED_PHASE;
unsigned long phaseStartTime = 0;
void pollButtons() {
	bool current_BTN_NORTH = digitalRead(PIN_BTN_NORTH);
	
		if(LAST_North_South == HIGH && current_BTN_NORTH == LOW) {
			REQ_North_South = true;
		}
		LAST_North_South = current_BTN_NORTH;
	bool current_BTN_EAST = digitalRead(PIN_BTN_EAST);
	
		if(LAST_East_West == HIGH && current_BTN_EAST == LOW) {
			REQ_East_West = true;
		}
		LAST_East_West = current_BTN_EAST;
	bool current_BTN_SOUTH = digitalRead(PIN_BTN_SOUTH);
	
		if(LAST_North_South == HIGH && current_BTN_SOUTH == LOW) {
			REQ_North_South = true;
		}
		LAST_North_South = current_BTN_SOUTH;
}

void setup() 
{
/* TRAFFIC LIGHTS */
	pinMode(PIN_TrafficLight_NORTH_RED, OUTPUT);
	pinMode(PIN_TrafficLight_NORTH_YELLOW, OUTPUT);
	pinMode(PIN_TrafficLight_NORTH_GREEN, OUTPUT);

	pinMode(PIN_TrafficLight_EAST_RED, OUTPUT);
	pinMode(PIN_TrafficLight_EAST_YELLOW, OUTPUT);
	pinMode(PIN_TrafficLight_EAST_GREEN, OUTPUT);

	pinMode(PIN_TrafficLight_SOUTH_RED, OUTPUT);
	pinMode(PIN_TrafficLight_SOUTH_YELLOW, OUTPUT);
	pinMode(PIN_TrafficLight_SOUTH_GREEN, OUTPUT);

/* LEDs */
	pinMode(PIN_PED_RED_NORTH, OUTPUT);
	pinMode(PIN_PED_GREEN_NORTH, OUTPUT);
	pinMode(PIN_PED_RED_EAST, OUTPUT);
	pinMode(PIN_PED_GREEN_EAST, OUTPUT);
	pinMode(PIN_PED_RED_SOUTH, OUTPUT);
	pinMode(PIN_PED_GREEN_SOUTH, OUTPUT);

/* Buttons */
	pinMode(PIN_BTN_NORTH, INPUT_PULLUP);
	pinMode(PIN_BTN_EAST, INPUT_PULLUP);
	pinMode(PIN_BTN_SOUTH, INPUT_PULLUP);

phaseStartTime = millis();
}

void loop()
{
	pollButtons();
	updatePhase();
}
void updatePhase() {
	unsigned long now = millis();
	
	switch(currentPhase) {
		case PHASE_NS_RED_PHASE: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NORTH_RED, HIGH );
			digitalWrite(PIN_TrafficLight_NORTH_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_NORTH_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_EAST_RED,  LOW );
			digitalWrite(PIN_TrafficLight_EAST_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_EAST_GREEN,  HIGH );
			
			digitalWrite(PIN_TrafficLight_SOUTH_RED, HIGH );
			digitalWrite(PIN_TrafficLight_SOUTH_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_SOUTH_GREEN,  LOW );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_RED_NORTH, HIGH);
			digitalWrite(PIN_PED_GREEN_NORTH, LOW);
			digitalWrite(PIN_PED_GREEN_EAST, LOW);
			digitalWrite(PIN_PED_RED_EAST, HIGH);
			digitalWrite(PIN_PED_RED_SOUTH, HIGH);
			digitalWrite(PIN_PED_GREEN_SOUTH, LOW);
			if(REQ_North_South) {
				digitalWrite(PIN_PED_RED_NORTH, LOW);
			}	
			
			
			if(REQ_North_South) {
				digitalWrite(PIN_PED_GREEN_NORTH, HIGH);
			}	
			
			
			
			if(REQ_East_West) {
			}	
			
			
			if(REQ_East_West) {
			}	
			
			if(REQ_North_South) {
				digitalWrite(PIN_PED_RED_SOUTH, LOW);
			}	
			
			
			if(REQ_North_South) {
				digitalWrite(PIN_PED_GREEN_SOUTH, HIGH);
			}	
			
			
			
			
			if(now - phaseStartTime  >= 6000) {
						REQ_North_South = false;
					
						REQ_North_South = false;
					
						REQ_North_South = false;
					
						REQ_North_South = false;
					
				
				currentPhase = PHASE_NS_RED_YELLOW_PHASE;
				phaseStartTime = now;
			}				
		break;
		case PHASE_NS_RED_YELLOW_PHASE: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NORTH_RED, HIGH );
			digitalWrite(PIN_TrafficLight_NORTH_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_NORTH_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_EAST_RED,  LOW );
			digitalWrite(PIN_TrafficLight_EAST_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_EAST_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_SOUTH_RED, HIGH );
			digitalWrite(PIN_TrafficLight_SOUTH_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_SOUTH_GREEN,  LOW );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_GREEN_NORTH, LOW);
			digitalWrite(PIN_PED_RED_NORTH, HIGH);
			digitalWrite(PIN_PED_GREEN_EAST, LOW);
			digitalWrite(PIN_PED_RED_EAST, HIGH);
			digitalWrite(PIN_PED_RED_SOUTH, HIGH);
			digitalWrite(PIN_PED_GREEN_SOUTH, LOW);
			if(REQ_North_South) {
			}	
			
			
			if(REQ_North_South) {
			}	
			
			
			
			if(REQ_East_West) {
			}	
			
			
			if(REQ_East_West) {
			}	
			
			if(REQ_North_South) {
			}	
			
			
			if(REQ_North_South) {
			}	
			
			
			
			
			if(now - phaseStartTime  >= 2000) {
				
				currentPhase = PHASE_NS_GREEN_PHASE;
				phaseStartTime = now;
			}				
		break;
		case PHASE_NS_GREEN_PHASE: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NORTH_RED,  LOW );
			digitalWrite(PIN_TrafficLight_NORTH_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_NORTH_GREEN,  HIGH );
			
			digitalWrite(PIN_TrafficLight_EAST_RED, HIGH );
			digitalWrite(PIN_TrafficLight_EAST_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_EAST_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_SOUTH_RED,  LOW );
			digitalWrite(PIN_TrafficLight_SOUTH_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_SOUTH_GREEN,  HIGH );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_GREEN_NORTH, LOW);
			digitalWrite(PIN_PED_RED_NORTH, HIGH);
			digitalWrite(PIN_PED_RED_EAST, HIGH);
			digitalWrite(PIN_PED_GREEN_EAST, LOW);
			digitalWrite(PIN_PED_GREEN_SOUTH, LOW);
			digitalWrite(PIN_PED_RED_SOUTH, HIGH);
			if(REQ_North_South) {
			}	
			
			
			if(REQ_North_South) {
			}	
			
			
			
			if(REQ_East_West) {
				digitalWrite(PIN_PED_RED_EAST, LOW);
			}	
			
			
			if(REQ_East_West) {
				digitalWrite(PIN_PED_GREEN_EAST, HIGH);
			}	
			
			if(REQ_North_South) {
			}	
			
			
			if(REQ_North_South) {
			}	
			
			
			
			
			if(now - phaseStartTime  >= 8000) {
					
						REQ_East_West = false;
					
						REQ_East_West = false;
				
				currentPhase = PHASE_NS_YELLOW_PHASE;
				phaseStartTime = now;
			}				
		break;
		case PHASE_NS_YELLOW_PHASE: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NORTH_RED,  LOW );
			digitalWrite(PIN_TrafficLight_NORTH_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_NORTH_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_EAST_RED, HIGH );
			digitalWrite(PIN_TrafficLight_EAST_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_EAST_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_SOUTH_RED,  LOW );
			digitalWrite(PIN_TrafficLight_SOUTH_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_SOUTH_GREEN,  LOW );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_GREEN_NORTH, LOW);
			digitalWrite(PIN_PED_RED_NORTH, HIGH);
			digitalWrite(PIN_PED_GREEN_EAST, LOW);
			digitalWrite(PIN_PED_RED_EAST, HIGH);
			digitalWrite(PIN_PED_GREEN_SOUTH, LOW);
			digitalWrite(PIN_PED_RED_SOUTH, HIGH);
			if(REQ_North_South) {
			}	
			
			
			if(REQ_North_South) {
			}	
			
			
			
			if(REQ_East_West) {
			}	
			
			
			if(REQ_East_West) {
			}	
			
			if(REQ_North_South) {
			}	
			
			
			if(REQ_North_South) {
			}	
			
			
			
			
			if(now - phaseStartTime  >= 3000) {
				
				currentPhase = PHASE_NS_RED_PHASE;
				phaseStartTime = now;
			}				
		break;
	}
}
