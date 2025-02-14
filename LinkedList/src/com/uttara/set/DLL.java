package com.uttara.set;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DLL implements LL {
	  NodeD head;
	   NodeD last;
	   long size;
	@Override
	public boolean add(String data) {
		// TODO Auto-generated method stub
		NodeD n=new NodeD(data);
		long pos=0;
		  size++;
		if(head==null && last==null)
		{  n.setPosition(0);
			head=last=n;
			n.setprevious(null);
			return true;
		}
		else
		{
		  NodeD temp=head;
		  for(int i=0;temp.getNext()!=null;i++)
		  {
			temp=temp.getNext();
		  }
		  pos=temp.getPosition()+1;
		  n.setPosition(pos);
		  temp.setNext(n);
			n.setprevious(temp);
			
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
			NodeD temp=head;
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
			 NodeD temp=head;
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
		NodeD n=new NodeD(data,position);
		System.out.println("inserting node= "+n);
		if(position<0 && position>=size)
			System.out.println("provide proper position to add element");
		else
		{
			if(n.getPosition()==0)
			{
				n.setNext(head.getprevious());
				head.setNext(null); 
				n.setprevious(null);
			}
			else
			{	
				NodeD temp = head;
				while(temp.getPosition()!=position-1)
				{
					temp=temp.getNext();
				}
		
				n.setNext(temp.getNext());
				temp.setNext(n);
				n.setprevious(temp);
				if(n.getNext()!=null)
					n.getNext().setprevious(n);
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
			NodeD temp=head;
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
	public String remove(int position) {
		// TODO Auto-generated method stub
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
			{    NodeD temp=head;
				for(int i=0;i<position;i++)
			      temp=temp.getNext();
			
				temp.getprevious().setNext(temp.getNext());
				temp.getNext().setprevious(temp.getprevious());
				temp.setprevious(null);
				temp.setNext(null);
				return temp.getData();
				
			}
		
		}

	}

	@Override
	public String get(int position) {
		// TODO Auto-generated method stub
		if(head==null)
		 {
			 return null;
		 }
		else
		{
			NodeD temp=head;
			for(int i=0;i<position;i++)
			{
				temp=temp.getNext();
			}
			return temp.getData();
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
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
			NodeD temp=head;
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
