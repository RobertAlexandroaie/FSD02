package fsd.lab;

import org.jgrapht.graph.DefaultEdge;

public class EnumWeightedEdge extends DefaultEdge {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MessageStatus weight;

	public MessageStatus getWeight() {
		return weight;
	}

	public void setWeight(MessageStatus weight) {
		this.weight = weight;
	}

	@Override
	public Object clone() {
		EnumWeightedEdge clone = new EnumWeightedEdge();
		clone.setWeight(weight);
		return clone();
	}
	
	
}
