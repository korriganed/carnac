package net.korriganed.carnac.struct;

import java.util.ArrayList;

public class Layer {

	private ArrayList<Neuron> neurons = new ArrayList<>();
	private Layer previous;
	private Layer next;

	public Layer() {
	}

	public void setPrevious(Layer previous) {
		this.previous = previous;
	}

	public void setNext(Layer next) {
		this.next = next;
	}

	public void addNeuron(Neuron n) {
		this.neurons.add(n);
	}

	public boolean isInput() {
		return previous == null;
	}

	public boolean isOutput() {
		return next == null;
	}

}
