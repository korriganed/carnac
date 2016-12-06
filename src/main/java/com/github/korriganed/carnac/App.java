package com.github.korriganed.carnac;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class App {
	public static void main(String[] args) {
		System.out.println("start...");
		BufferedImage image = null;
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			String file = classloader.getResource("mnist_train0.jpg").getFile();
			image = ImageIO.read(new File(file));
			BufferedImage small = image.getSubimage(0, 0, 25, 25);
			ArrayList<Integer> pixels = new ArrayList<>();
			for (int row = 0; row < small.getWidth(); ++row) {
				for (int column = 0; column < small.getHeight(); ++column) {
					int pixel = small.getRGB(row, column);
					int shadeOfgray = (pixel >> 16) & 0xff;
					pixels.add(shadeOfgray);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
