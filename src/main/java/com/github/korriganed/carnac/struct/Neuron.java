package com.github.korriganed.carnac.struct;

import java.util.HashMap;

import com.github.korriganed.carnac.struct.activation.IActivationFunction;

public class Neuron {
	private HashMap<Neuron, Double> weights;
	private Double sumOfWeights = 0.;
	private IActivationFunction activation;

	public Neuron(IActivationFunction activation) {
		this.activation = activation;
	}

	public HashMap<Neuron, Double> getWeights() {
		return weights;
	}

	public void initializeWeight(Neuron n) {
		// (TODO) configurable seed
		this.weights.put(n, Math.random());
		this.sumOfWeights += this.weights.get(n);
	}

}
