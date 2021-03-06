package com.philips.bootcamp.input.services;

public class PulseRate {
	private float lowerRange = 70;
	private float upperRange = 95;
	private float updatedPulseRateVal;

	public float getUpdatedPulseRateVal() {
		updatedPulseRateVal = new VitalsGenerator().randomNumberFunction(lowerRange, upperRange);
		return updatedPulseRateVal;
	}
}