package com.github.korriganed.carnac.bean;

import java.util.List;

import com.github.korriganed.carnac.data.Feature;
import com.github.korriganed.carnac.data.Target;

public class DigitImage {

	private List<Boolean> blackOrWhitePixels;
	private Integer digit;

	public void setDigit(Integer digit) {
		this.digit = digit;
	}

	@Target
	public Integer getDigit() {
		return digit;
	}

	public void setShadesOfGray(List<Boolean> blackOrWhitePixels) {
		this.blackOrWhitePixels = blackOrWhitePixels;
	}

	@Feature
	public List<Boolean> getBlackOrWhitePixels() {
		return blackOrWhitePixels;
	}
}
