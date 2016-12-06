package net.korriganed.carnac.struct.activation;

import java.util.List;

public class Logistic implements IActivationFunction {

	@Override
	public Double process(List<Double> values) {
		Double sum = values.stream().reduce(0., (a, b) -> a + b);
		return 1 / (1 + Math.exp(-sum));
	}

}
