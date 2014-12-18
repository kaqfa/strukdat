#include <stdio.h>
#include <stdlib.h>
#include "stack.h"

int main(){
	Stack tumpukan;
	
	CreateEmpty(&tumpukan);
	
	Push(&tumpukan, 15);
	Push(&tumpukan, 23);
	Push(&tumpukan, 12);
	Push(&tumpukan, 35);
	Push(&tumpukan, 61);
	Push(&tumpukan, 62);
	Push(&tumpukan, 37);
	Push(&tumpukan, 52);
	Push(&tumpukan, 22);
	Push(&tumpukan, 90);
	Push(&tumpukan, 20);
	
	Pop(&tumpukan, 10);
	return 0;
}
