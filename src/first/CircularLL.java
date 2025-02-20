package first;

import java.util.Scanner;


public class CircularLL {
	
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node tail = null;
	int len;
	Scanner sc = new Scanner(System.in);
	
	public void creation()
	{
		int data,choice;
		int pos;
		int l;
		do
		{
			System.out.println("Enter the data");
			data = sc.nextInt();
			Node newNode= new Node(data);
			
			if(head == null)
			{
				head = newNode;
				tail = newNode;
				tail.next = newNode;
				len++;
			}
			else
			{
				System.out.println("Press 1 to insert at the beginning");
				System.out.println("Press 2 to insert at the end");
				System.out.println("Press 3 to insert at the middle");
				
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					newNode.next = head;
					head = newNode;
					tail.next = newNode;
					len++;
					break;
				
				case 2: 
					Node temp = head;
					while(temp.next!=head)
					{
						temp = temp.next;
					}
					temp.next = newNode;
					tail = newNode;
					tail.next = head;
					len++;
					break;
					
				case 3:
					System.out.println("Enter the position where we have to insert the node");
					pos = sc.nextInt();
					
					if(pos>len)
					{
						pos = pos%len;
					}
					
					Node temp1 = head;
					
//					if(pos>len+1)
//					{
//						System.out.println("Position provided is greater than the length of the LL");
//					}
					if(pos==1)
					{
						newNode.next = head;
						head = newNode;
						tail.next = newNode;
						len++;
					}
					else
					{
						for(int i=1;i<=pos-2;i++)
						{
							temp1 = temp1.next;
						}
						newNode.next = temp1.next;
						temp1.next = newNode;
						len++;
					}
					
					break;
					
				default:System.out.println("Please enter a valid creation input");
				}
			}

				System.out.println("Press 1 to continue creation otherwise press any other key to exit");
				
				l = sc.nextInt();
			
		}while(l==1);
		
	}
	
	public void traversal()
	{
		if(head == null)
		{
			System.out.println("Head is null, cannot traversal thorugh the LL");
		}
		else
		{
			Node temp = head;
			while(temp.next!=head)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}
	public void getLength()
	{
		System.out.println("Length of the LL is --> "+len);
	}
	public void deletion()
	{
		int data;
		int choice;
		int pos;
		int l;
		do
		{

			if(head == null)
			{
				System.out.println("Linked list is empty, can't delete");
			}
			else
			{
				System.out.println("Press 1 to delete at the beginning");
				System.out.println("Press 2 to delete at the end");
				System.out.println("Press 3 to delete at the middle");
				System.out.println("Press 4 to traverse through the LL");
				
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					head = head.next;
					len--;
					break;
				
				case 2: 
					if(head==null || head.next==null)
					{
						head = null;
						len--;
						break;
					}
					
					Node temp = head;
					while(temp.next.next!=null)
					{
						temp = temp.next;
					}
					temp.next = null;
					len--;
					break;
//					if(len==1)
//					{
//						head = head.next;
//						len--;
//						return;
//					}
//					Node temp = head;
//					Node ptr = head.next;
//					while(temp!=null && ptr!=null && ptr.next!=null)
//					{
//						temp = temp.next;
//						ptr = ptr.next;
//					}
//					temp.next = null;
//					len--;
//					break;
					
				case 3:
					System.out.println("Enter the position where we want to delete the node");
					pos = sc.nextInt();
					Node temp1 = head;
					
					
					if(pos>len)
					{
						System.out.println("Position provided is greater than the length of the LL");
						//break;
					}
					else if(pos==1)
					{
						head = head.next;
						len--;
					}
					else
					{
						for(int i=1;i<=pos-2;i++)
						{
							
							temp1 = temp1.next;
						}
					
						temp1.next = temp1.next.next;
						len--;
					}
					break;
					
				case 4:
					traversal();
					break; 
					
				default:System.out.println("Please enter a valid deletion input");
				}
			}

				System.out.println("Press 1 to continue deletion otherwise press any other key to exit");
				
				l = sc.nextInt();
			
		}while(l==1);
	}

}
