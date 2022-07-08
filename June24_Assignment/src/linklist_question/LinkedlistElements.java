
//1. Write a Java program to insert the specified element at the specified position in the linked list.  

//2. Write a Java program to insert elements into the linked list at the first and last position.  

//3. Write a Java program to insert the specified element at the front of a linked list.  

//4. Write a Java program to insert the specified element at the end of a linked list.  

//5. Write a Java program to insert some elements at the specified position into a linked list.  

//6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.  

//7. Write a Java program to display the elements and their positions in a linked list. 

//------------------------------------------------------------------------------------------------------------------------


package linklist_question;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistElements {
	
	public void menu(LinkedList<String> ll) {
		int ch=9;
		int idx;
		String element;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose one of the operation : ");
		System.out.println(" 1.Add \n 2.Add from starting node \n 3.Add from last node \n 4.Retrieve \n 5.Update \n 6.Remove \n 7.Search \n 8.FirstNlast occuraence \n 9.Display \n 0.Exit");
		
		
		while(ch !=0){
			
			switch(ch) {
				case 1:{
					System.out.print("Element to add in List :");
					
					element = sc.nextLine();
					ll.add(element);
					System.out.println(element + " is added in list");
					break;
				}
				case 2:{
					System.out.print("Element to add in List :");
					element = sc.nextLine();
					ll.add(0, element);
					System.out.println(element + " is at first position in list");
					break;
				}
				case 3:{
					System.out.print("Element to add in List :");
					element = sc.nextLine();
					idx = ll.size();
					
					ll.add(idx, element);
					System.out.println(element + " is at last position in list");
					break;
				}
				case 4:{
					System.out.print("index : ");
					idx = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Element present at index "+idx+ " : "+ll.get(idx));
					break;
				}
				case 5:{
					System.out.println("Element to be updated :");
					element = sc.nextLine();
					System.out.println("new element :");
					String element2 = sc.nextLine();
					idx=ll.indexOf(element);
					ll.remove(idx);
					ll.add(idx, element2);
					System.out.println(element +" is updated to "+element2);
					break;
				}
				case 6:{
					System.out.println("index of element to be removed : ");
					idx = sc.nextInt();
					sc.nextLine();
					element = ll.remove(idx);
					System.out.println(element+" is removed form list");
					break;
				}
				case 7:{
					System.out.println("Element to be serched : ");
					element = sc.nextLine();
					System.out.println("is present in list :"+ ll.contains(element));
					break;
				}
				case 8:{
					System.out.println("Element to be serched : ");
					element = sc.nextLine();
					System.out.println("first occurance at index 	: "+ll.indexOf(element));
					System.out.println("last occurance at index		: "+ll.lastIndexOf(element));
					break;
				}
				case 9:{
					Iterator t = ll.iterator();
					System.out.println();
					System.out.print("your list : ");
					int i =1;
					while(t.hasNext()) {
						System.out.print(i + "."+ t.next()+" ");
						i++;
					}
					System.out.println();
					break;
				}
				default :
					System.out.println("invalid choiece.");
					break;
			}
			
			System.out.print("choose : ");
			ch = sc.nextInt();
			sc.nextLine();
//			System.out.println();
			
		};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> colors = new LinkedList<>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Indigo");
		LinkedlistElements obj = new LinkedlistElements();
		obj.menu(colors);
	}

}
