package com.uttara.set;

public class NodeD {
	private  String data;
	private long position;
	private NodeD next;
	private NodeD previous;
	
	public NodeD() {
		// TODO Auto-generated constructor stub
	}

	public NodeD(String data) {
		super();
		this.data = data;
	}

	public NodeD(String data, long position) {
		super();
		this.data = data;
		this.position = position;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public long getPosition() {
		return position;
	}

	public void setPosition(long position) {
		this.position = position;
	}

	public NodeD getNext() {
		return next;
	}

	public void setNext(NodeD next) {
		this.next = next;
	}

	public NodeD getprevious() {
		return previous;
	}

	public void setprevious(NodeD previous) {
		this.previous = previous;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((previous == null) ? 0 : previous.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + (int) (position ^ (position >>> 32));
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
		NodeD other = (NodeD) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (position != other.position)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NodeD [data=" + data + ", position=" + position + "]";
	}
	
}
