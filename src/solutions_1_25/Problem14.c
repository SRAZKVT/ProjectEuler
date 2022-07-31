#include <stdio.h>
#include <stdlib.h>
#include <bits/types.h>

#define LUT_SZ 1000000
int* lut;

int sizeOfPath(__uint64_t s) {
	if (s == 1) return 0;
	int size = 0;
	while (1) {
    	if (s < LUT_SZ && lut[s] != -1) return size + lut[s];
		if (s % 2 == 0) s /= 2;
		else s = s * 3 + 1;
		size++;
	}
}

int main(void) {
    lut = malloc(sizeof(int) * LUT_SZ);
    for (int i = 0; i < 1000000; i++) lut[i] = -1;
	__uint64_t max = 0;
	for (__uint64_t i = 1; i < LUT_SZ; i++) {
		lut[i] = sizeOfPath(i);
		if (lut[i] > lut[max]) max = i;
	}
	printf("Biggest source is [%lu], with a size of [%d]\n", max, lut[max]);
	return 0;
}
