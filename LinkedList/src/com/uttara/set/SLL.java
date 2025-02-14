package com.uttara.set;
public class SLL implements LL {
   Node head;
   Node last;
   long size;
@Override
public boolean add(String data) {
	Node n=new Node(data);
	long pos=0;
	  size++;
	if(head==null && last==null)
	{  n.setPosition(0);
		head=last=n;
		return true;
	}
	else
	{
		Node temp=head;
	  for(int i=0;temp.getNext()!=null;i++)
	  {
		temp=temp.getNext();
	  }
	  pos=temp.getPosition()+1;
	  n.setPosition(pos);
	  temp.setNext(n);
	  return true;
	}	
}
@Override
public void print() {
	// TODO Auto-generated method stub
	if(head==null)
		System.out.println("list is empty...");
	else
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println("position= "+temp.getPosition()+" "+temp);
			temp=temp.getNext();
		}
	}
	
}
@Override
public boolean contains(String data) {
	// TODO Auto-generated method stub
	if(head==null)
	 {
		 return false;
	 }
	 else
	 {
		 Node temp=head;
		 while(temp!=null)
		 {
			 if((temp.getData()).equals(data))
				 return true;
	
			 temp=temp.getNext();
		 }
		 return false;
	 }
}
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	if(size==0)
		return true;
	else
		return false;
}
@Override
public long size() {
	// TODO Auto-generated method stub
	return size;
}
@Override
public void insert(String data, int position) {
	// TODO Auto-generated method stub
	Node n=new Node(data,position);
	System.out.println("inserting node= "+n);
	if(position<0 && position>=size)
		System.out.println("provide proper position to add element");
	else
	{
		if(n.getPosition()==0)
		{
			n.setNext(head);
			head = n;	
		}
		else
		{	
			Node temp = head;
			while(temp.getPosition()!=position-1)
			{
				temp=temp.getNext();
			}
			n.setNext(temp.getNext().getNext());
			temp.setNext(n);
		}
		reposition();
	
	}
	
}
private  void reposition(){
	if(head==null)
	{
		return;
	}
	else
	{
		Node temp=head;
		int i=0;
		while(temp!=null)
		{
			temp.setPosition(i);
			temp=temp.getNext();
			i++;
		}
	}
}
@Override
public String remove(int position){
	if(head==null)
	{
		return null;
	}
	else
	{
		if(position==0)
		{
			String s=head.getData();
			head=head.getNext();
			reposition();
			return s;
		}
		else
		{    Node temp=head;
			for(int i=0;i<position-1;i++)
		      temp=temp.getNext();
			
			Node remove=temp.getNext();
			temp.setNext(remove.getNext());
			remove.setNext(null);
			reposition();
			return remove.getData();
			
		}
	
	}
}
@Override
public String get(int position) {
	if(head==null)
	 {
		 return null;
	 }
	else
	{
		Node temp=head;
		for(int i=0;i<position;i++)
		{
			temp=temp.getNext();
		}
		return temp.getData();
	}
}
@Override
public void clear() {
	head=last=null;
	size=0;	
}
@Override
public boolean search(String data) {
	// TODO Auto-generated method stub
	if(head==null)
	{
		return false;
	}
	else
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.getData().equals(data))
				return true;
			else
				temp=temp.getNext();
		}
		return false;
	}

}

	
 
}
