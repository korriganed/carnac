package net.korriganed.carnac.struct;

import java.util.HashMap;

import net.korriganed.carnac.struct.activation.IActivationFunction;

public class Neuron {
	private HashMap<Neuron, Double> weights;
	private IActivationFunction activation;
}
