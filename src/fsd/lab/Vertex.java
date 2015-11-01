package fsd.lab;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private List<Vertex> children;
	private List<Vertex> other;
	private Vertex parent;
	private int value;
	
	
	
	public Vertex(int value) {
		super();
		this.value = value;
		children = new ArrayList<>();
		other = new ArrayList<>();
		parent = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public List<Vertex> getChildren() {
		return children;
	}
	public void setChildren(List<Vertex> children) {
		this.children = children;
	}
	public List<Vertex> getOther() {
		return other;
	}
	public void setOther(List<Vertex> other) {
		this.other = other;
	}
	public Vertex getParent() {
		return parent;
	}
	public void setParent(Vertex parent) {
		this.parent = parent;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (value != other.value)
			return false;
		return true;
	}	
 }
