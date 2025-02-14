package com.uttara.set;

public class Node {
private  String data;
private long position;
private Node next;

public Node(){
	
}

public Node(String data) {
	super();
	this.data = data;
}

public Node(String data, long position) {
	super();
	this.data = data;
	this.position = position;
}

/*public Node(String data){
	this.data=data;
}

public Node(String data,long position){
	this.data=data;
	this.position=position;
}*/
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
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
@Override
public String toString() {
	return "Node [data=" + data + ", position=" + position+"]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((data == null) ? 0 : data.hashCode());
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
	Node other = (Node) obj;
	if (data == null) {
		if (other.data != null)
			return false;
	} else if (!data.equals(other.data))
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



}