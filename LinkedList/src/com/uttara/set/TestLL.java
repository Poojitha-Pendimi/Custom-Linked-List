package com.uttara.set;

import java.util.Scanner;

public class TestLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter 1st Huge Value:");
		String l1=sc1.next();
		System.out.println("Enter 2nd Huge Value:");
		String l2=sc1.next();
		System.out.println("Enter 3rd Huge Value:");
		String l3=sc1.next();
		System.out.println("Enter 4th Huge Value:");
		String l4=sc1.next();
		
		
		//SLL list=new SLL();
		DLL list=new DLL();
		
		System.out.println(list.add(l1));
		System.out.println(list.add(l2));
		System.out.println(list.add(l3));
		System.out.println(list.add(l4));
		list.print();
		
		System.out.println("list contains "+l2+" = "+list.contains(l2));
		System.out.println("list contains 22 = "+list.contains("22"));
		System.out.println("isEmpty()--->"+list.isEmpty());
		System.out.println("size()--->"+list.size());
		list.insert("11111",2);
		System.out.println("After Inserted 11111 in pos 2...");
		list.print();
		
		System.out.println("list.search(41)-->"+list.search("41"));
	    System.out.println("list.search(41)-->"+list.search("222"));
	       
		System.out.println("get pos 2--->"+list.get(2));
		
       System.out.println("Removing pos-0--->"+list.remove(0));
       list.print();
       list.clear();
       System.out.println("After clear().....");
       System.out.println(list.isEmpty());
       list.print();
        
	}

}
