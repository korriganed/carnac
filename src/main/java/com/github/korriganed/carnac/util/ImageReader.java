package com.github.korriganed.carnac.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

public class ImageReader {

	public static <T> List<T> img2bean(String filename, Class<T> clazz) throws IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		String file = classloader.getResource(filename).getFile();
		BufferedImage image = ImageIO.read(new File(file));

		return null;
	}

}
