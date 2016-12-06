package com.github.korriganed.carnac.bean;

import java.util.List;

import com.github.korriganed.carnac.data.Feature;
import com.github.korriganed.carnac.data.Target;

public class DigitImage {

	private List<Integer> shadesOfGray;
	private Integer digit;

	public void setDigit(Integer digit) {
		this.digit = digit;
	}

	@Target
	public Integer getDigit() {
		return digit;
	}

	public void setShadesOfGray(List<Integer> shadesOfGray) {
		this.shadesOfGray = shadesOfGray;
	}

	@Feature
	public List<Integer> getShadesOfGray() {
		return shadesOfGray;
	}

}
