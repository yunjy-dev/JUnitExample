package com.linkedList;

public class LinkedList {
	private Node head;
	private Node tail;
	
	private int size = 0;
	
	private class Node{
		private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
			
		}
		 
	}
	public String toString() {
		if(head == null){
            return "[]";
        }
        Node tmp = head;
        String str = "[";
        while(tmp.next != null){
            str += tmp.data + ",";
            tmp = tmp.next;
        }

        str+= tmp.data+"]";
        return str;
	}
	
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null) {
			 tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
		
		
	}
}
