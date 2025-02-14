package com.uttara.set;

public interface LL {
	public boolean add(String data);
	public void print();
	public boolean contains(String data);
	public boolean isEmpty();
	public long size();
	public void insert(String data,int position);
	public String remove(int position);
	public String get(int position);
	public boolean search(String data);
	public void clear();
}
