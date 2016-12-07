package com.github.korriganed.carnac.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;

import com.github.korriganed.carnac.bean.DigitImage;

public class DigitImageReader {

	public static List<DigitImage> img2bean(String filename, Integer target) throws IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		String file = classloader.getResource(filename).getFile();
		BufferedImage image = ImageIO.read(new File(file));
		int x = image.getWidth() / 25; // (TODO) more generic
		int y = image.getHeight() / 25;

		ArrayList<DigitImage> result = new ArrayList<>();
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				BufferedImage small = image.getSubimage(i * 25, j * 25, 25, 25);
				ArrayList<Boolean> pixels = new ArrayList<>();
				for (int row = 0; row < small.getWidth(); ++row) {
					for (int column = 0; column < small.getHeight(); ++column) {
						int pixel = small.getRGB(row, column);
						int shadeOfgray = (pixel >> 16) & 0xff;
						pixels.add(shadeOfgray > 255 / 2);
					}
				}
				if (pixels.stream().filter(Boolean::booleanValue).count() > 0) {
					DigitImage di = new DigitImage();
					di.setDigit(target);
					di.setShadesOfGray(pixels);
					result.add(di);
				}
			}
		}

		return result;
	}

}
