package com.github.korriganed.carnac;

import java.io.IOException;
import java.util.List;

import com.github.korriganed.carnac.bean.DigitImage;
import com.github.korriganed.carnac.util.DigitImageReader;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("start...");
		List<DigitImage> train = DigitImageReader.img2bean("mnist_train0.jpg", 0);
		System.out.println(train.size());
	}
}
