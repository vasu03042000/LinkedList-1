package lab6;

import lab6.q3.Node;

public class q4 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public static q4 insert(q4 list, int data)
	{
		Node node = new Node(data);
		if(list.head==null)
		{
			list.head = node;
		}
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = node;
		}
		return list;
	}
	public static q4 del(q4 list, int n)
	{
		Node h=list.head;
		Node prev =null;
		if(h.data==n) {
			
				list.head=h.next;
			}
		else {
			while(h.data!=n) {
				prev=h;
				h=h.next;
				
			}
			if(prev.data<prev.next.data)
			{
				prev.next=h.next;
			}
			
		}
		return list;
	}
	
	public static q4 rightdel(q4 list)
	{
		//int c=0;
		Node node = list.head;
		////Node n = list.head;
		//Node prev = null;
		while(node.next!=null)
		{
			//c++;
			//node = node.next;
			if(node.data<node.next.data)
			{
				
				del(list,node.data);
			}
			node=node.next;
		}
		return list;
	}
	public static void show(q4 list)
	{
		Node last = list.head;
		while(last!=null)
		{
			System.out.println(last.data);
			last = last.next;
		}
		
	}

	public static void main(String[] args) {
		q4 a = new q4();
		
		insert(a,100);
		insert(a,20);
		insert(a,30);
		insert(a,40);
		insert(a,50);
		insert(a,60);

		rightdel(a);
		
		show(a);
		
		 
		// TODO Auto-generated method stub

	}

}
