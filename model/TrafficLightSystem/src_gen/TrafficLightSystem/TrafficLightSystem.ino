
/* PIN DEFINITIONS */

	const int PIN_TrafficLight_NS_RED = 2;
	const int PIN_TrafficLight_NS_YELLOW = 3;
	const int PIN_TrafficLight_NS_GREEN = 4;
	const int PIN_TrafficLight_EW_RED = 5;
	const int PIN_TrafficLight_EW_YELLOW = 6;
	const int PIN_TrafficLight_EW_GREEN = 7;

	const int PIN_PED_NS_RED = 8;
	const int PIN_PED_NS_GREEN = 9;
	const int PIN_PED_EW_RED = 10;
	const int PIN_PED_EW_GREEN = 11;

	const int PIN_BTN_NS = 12;
	const int PIN_BTN_EW = 13;

/* PEDESTRIAN REQUEST FLAGS */
	bool REQ_BTN_NS = false;
	bool REQ_BTN_EW = false;


	bool LAST_BTN_NS = HIGH;
	bool LAST_BTN_EW = HIGH;

enum Phase {
	PHASE_NS_RED,
	PHASE_NS_RED_YELLOW,
	PHASE_NS_GREEN,
	PHASE_NS_YELLOW,
};
Phase currentPhase = PHASE_NS_RED;
unsigned long phaseStartTime = 0;
void pollButtons() {
	bool current_BTN_NS = digitalRead(PIN_BTN_NS);
	
	if(LAST_BTN_NS == HIGH && current_BTN_NS == LOW) {
		REQ_BTN_NS = true;
	}
	
	LAST_BTN_NS = current_BTN_NS;
	bool current_BTN_EW = digitalRead(PIN_BTN_EW);
	
	if(LAST_BTN_EW == HIGH && current_BTN_EW == LOW) {
		REQ_BTN_EW = true;
	}
	
	LAST_BTN_EW = current_BTN_EW;
}

void setup() 
{
/* TRAFFIC LIGHTS */
	pinMode(PIN_TrafficLight_NS_RED, OUTPUT);
	pinMode(PIN_TrafficLight_NS_YELLOW, OUTPUT);
	pinMode(PIN_TrafficLight_NS_GREEN, OUTPUT);

	pinMode(PIN_TrafficLight_EW_RED, OUTPUT);
	pinMode(PIN_TrafficLight_EW_YELLOW, OUTPUT);
	pinMode(PIN_TrafficLight_EW_GREEN, OUTPUT);

/* LEDs */
	pinMode(PIN_PED_NS_RED, OUTPUT);
	pinMode(PIN_PED_NS_GREEN, OUTPUT);
	pinMode(PIN_PED_EW_RED, OUTPUT);
	pinMode(PIN_PED_EW_GREEN, OUTPUT);

/* Buttons */
	pinMode(PIN_BTN_NS, INPUT_PULLUP);
	pinMode(PIN_BTN_EW, INPUT_PULLUP);

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
		case PHASE_NS_RED: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NS_RED, HIGH );
			digitalWrite(PIN_TrafficLight_NS_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_NS_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_EW_RED,  LOW );
			digitalWrite(PIN_TrafficLight_EW_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_EW_GREEN,  HIGH );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_NS_RED, HIGH);
			digitalWrite(PIN_PED_EW_RED, HIGH);
			digitalWrite(PIN_PED_NS_GREEN, LOW);
			digitalWrite(PIN_PED_EW_GREEN, LOW);
			if(REQ_BTN_NS) {
				digitalWrite(PIN_PED_NS_RED, LOW);
			}
			if(REQ_BTN_EW) {
			}
			if(REQ_BTN_NS) {
				digitalWrite(PIN_PED_NS_GREEN, HIGH);
			}
			if(REQ_BTN_EW) {
			}
			
			
			if(now - phaseStartTime  >= 6000) {
					REQ_BTN_NS = false;
					REQ_BTN_NS = false;
				
				currentPhase = PHASE_NS_RED_YELLOW;
				phaseStartTime = now;
			}				
		break;
		case PHASE_NS_RED_YELLOW: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NS_RED, HIGH );
			digitalWrite(PIN_TrafficLight_NS_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_NS_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_EW_RED,  LOW );
			digitalWrite(PIN_TrafficLight_EW_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_EW_GREEN,  LOW );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_NS_RED, HIGH);
			digitalWrite(PIN_PED_EW_RED, HIGH);
			digitalWrite(PIN_PED_NS_GREEN, LOW);
			digitalWrite(PIN_PED_EW_GREEN, LOW);
			if(REQ_BTN_NS) {
			}
			if(REQ_BTN_EW) {
			}
			if(REQ_BTN_NS) {
			}
			if(REQ_BTN_EW) {
			}
			
			
			if(now - phaseStartTime  >= 2500) {
				
				currentPhase = PHASE_NS_GREEN;
				phaseStartTime = now;
			}				
		break;
		case PHASE_NS_GREEN: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NS_RED,  LOW );
			digitalWrite(PIN_TrafficLight_NS_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_NS_GREEN,  HIGH );
			
			digitalWrite(PIN_TrafficLight_EW_RED, HIGH );
			digitalWrite(PIN_TrafficLight_EW_YELLOW,  LOW );
			digitalWrite(PIN_TrafficLight_EW_GREEN,  LOW );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_NS_RED, HIGH);
			digitalWrite(PIN_PED_NS_GREEN, LOW);
			digitalWrite(PIN_PED_EW_RED, HIGH);
			digitalWrite(PIN_PED_EW_GREEN, LOW);
			if(REQ_BTN_NS) {
			}
			if(REQ_BTN_NS) {
			}
			if(REQ_BTN_EW) {
				digitalWrite(PIN_PED_EW_RED, LOW);
			}
			if(REQ_BTN_EW) {
				digitalWrite(PIN_PED_EW_GREEN, HIGH);
			}
			
			
			if(now - phaseStartTime  >= 7500) {
					REQ_BTN_EW = false;
					REQ_BTN_EW = false;
				
				currentPhase = PHASE_NS_YELLOW;
				phaseStartTime = now;
			}				
		break;
		case PHASE_NS_YELLOW: 
			/* Traffic Lights */
			digitalWrite(PIN_TrafficLight_NS_RED,  LOW );
			digitalWrite(PIN_TrafficLight_NS_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_NS_GREEN,  LOW );
			
			digitalWrite(PIN_TrafficLight_EW_RED, HIGH );
			digitalWrite(PIN_TrafficLight_EW_YELLOW,  HIGH );
			digitalWrite(PIN_TrafficLight_EW_GREEN,  LOW );
			
			
			
			/* Pedestrian Lights */
			digitalWrite(PIN_PED_NS_RED, HIGH);
			digitalWrite(PIN_PED_NS_GREEN, LOW);
			digitalWrite(PIN_PED_EW_RED, HIGH);
			digitalWrite(PIN_PED_EW_GREEN, LOW);
			if(REQ_BTN_NS) {
			}
			if(REQ_BTN_NS) {
			}
			if(REQ_BTN_EW) {
			}
			if(REQ_BTN_EW) {
			}
			
			
			if(now - phaseStartTime  >= 3000) {
				
				currentPhase = PHASE_NS_RED;
				phaseStartTime = now;
			}				
		break;
	}
}
