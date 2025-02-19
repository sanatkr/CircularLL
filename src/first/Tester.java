package first;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		CircularLL cll = new CircularLL();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int l = 0;
		do
		{
			System.out.println("Press 1 for creation ");
			System.out.println("Press 2 for deletion ");
			System.out.println("Press 3 for traversal ");
			System.out.println("Press 4 for to know the length of the LL ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1: cll.creation();
					break;
			
			case 2: cll.deletion();
					break;
			
			case 3: cll.traversal();
					break;
					
			case 4:cll.getLength();
					break;
					
			default:System.out.println("Invalid input entered, please enter again");
			
			}
			System.out.println("Press 1 to continue LL operatiosn, else press any key");
			l = sc.nextInt();
		}while(l==1);
		System.out.println("LL operation ended");
		sc.close();
	}

}
