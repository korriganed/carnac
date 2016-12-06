package net.korriganed.carnac.algo;

import java.util.List;

import net.korriganed.carnac.struct.INeuronFactory;
import net.korriganed.carnac.struct.Layer;
import net.korriganed.carnac.struct.Neuron;

public class NeuralNetwork<D, R> {

	public Layer inputLayer;

	public static class Builder {

		private Layer currentLayer;
		private Layer firstLayer;

		public Builder() {
			this.firstLayer = new Layer();
			this.currentLayer = firstLayer;
		}

		public Builder addLayer() {
			Layer newLayer = new Layer();
			newLayer.setPrevious(this.currentLayer);
			this.currentLayer.setNext(newLayer);
			this.currentLayer = newLayer;
			return this;
		}

		public Builder addNeuron(Neuron n) {
			this.currentLayer.addNeuron(n);
			return this;
		}

		public Builder addNeurons(INeuronFactory f, Integer number) {
			for (int i = 0; i < number; ++i)
				this.addNeuron(f.create());
			return this;
		}
	}

	private NeuralNetwork(Builder b) {
		this.inputLayer = b.firstLayer;
	}

	public void fit(List<D> learningSet) {
		// (TODO)
	}

	public R predict(D data) {
		// (TODO)
		return null;
	}

}
