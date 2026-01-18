const int PIN_RED = 8;
const int PIN_YELLOW = 9;
const int PIN_GREEN = 10;
const int PIN_RED_LED = 11;
const int PIN_GREEN_LED = 12;
const int PIN_PED_BTN = 2;


enum TrafficState {
	STATE_VEH_RED,
	STATE_VEH_RED_YELLOW,
	STATE_VEH_GREEN,
	STATE_VEH_YELLOW
};

TrafficState currentState = TrafficState::STATE_VEH_RED;
unsigned long stateStartTime = millis();
bool pedAllowed = false;


void setup() {
	pinMode(PIN_RED, OUTPUT);
	pinMode(PIN_YELLOW, OUTPUT);
	pinMode(PIN_GREEN, OUTPUT);
	pinMode(PIN_RED_LED, OUTPUT);
	pinMode(PIN_GREEN_LED, OUTPUT);
	pinMode(PIN_PED_BTN, INPUT_PULLUP);
}

void loop() {

	if (digitalRead(PIN_PED_BTN) == LOW) {
		pedAllowed = true;
	}
	switch (currentState) {
		case STATE_VEH_RED:
			digitalWrite(PIN_RED, HIGH);
			if (pedAllowed == true) {
				digitalWrite(PIN_GREEN_LED, HIGH);
				digitalWrite(PIN_RED_LED, LOW);
			}

			if (millis() - stateStartTime >= 5000) {
				digitalWrite(PIN_RED, LOW);
				digitalWrite(PIN_GREEN_LED, LOW);
				digitalWrite(PIN_RED_LED, HIGH);
				pedAllowed = false;
				currentState = STATE_VEH_RED_YELLOW;
				stateStartTime = millis();
			}
			break;
		case STATE_VEH_RED_YELLOW:
			digitalWrite(PIN_RED, HIGH);
			digitalWrite(PIN_YELLOW, HIGH);

			if (millis() - stateStartTime >= 3000) {
				digitalWrite(PIN_RED, LOW);
				digitalWrite(PIN_YELLOW, LOW);
				currentState = STATE_VEH_GREEN;
				stateStartTime = millis();
			}
			break;
		case STATE_VEH_GREEN:
			digitalWrite(PIN_GREEN, HIGH);

			if (millis() - stateStartTime >= 7000) {
				digitalWrite(PIN_GREEN, LOW);
				currentState = STATE_VEH_YELLOW;
				stateStartTime = millis();
			}
			break;
		case STATE_VEH_YELLOW:
			digitalWrite(PIN_YELLOW, HIGH);

			if (millis() - stateStartTime >= 0) {
				digitalWrite(PIN_YELLOW, LOW);
				currentState = STATE_VEH_RED;
				stateStartTime = millis();
			}
			break;
	}
}
