package net.korriganed.carnac.struct.activation;

import java.util.List;

public class Heaviside implements IActivationFunction {

	private Double threshold = 0.;

	public Heaviside(Double threshold) {
		this.threshold = threshold;
	}

	@Override
	public Double process(List<Double> values) {
		return (values.stream().reduce(0., (a, b) -> a + b) > this.threshold) ? 1. : 0.;
	}

}
