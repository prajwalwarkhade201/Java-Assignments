//1. Write a Java program to create a new array list, add some colors (string) and print out the collection. 

//2. Write a Java program to iterate through all elements in a array list. 

//3. Write a Java program to insert an element into the array list at the first position. 

//4. Write a Java program to retrieve an element (at a specified index) from a given array list. 

//5. Write a Java program to update specific array element by given element. 

//6. Write a Java program to remove the third element from a array list. 

//7. Write a Java program to search an element in a array list. 

package arraylist_question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArraylistElements {
	
	public void menu(ArrayList<String> ar) {
		int ch=8;
		int idx;
		String element;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose one of the operation : ");
		System.out.println(" 1.Add \n 2.Add from beg \n 3.Add from last \n 4.Retrieve \n 5.Update \n 6.Remove \n 7.Search \n 8.Display \n 0.Exit");
		
		
		while(ch !=0){
			
			switch(ch) {
				case 1:{
					System.out.print("Element to add in Arraylist :");
					
					element = sc.nextLine();
					ar.add(element);
					System.out.println(element + " is added in list");
					break;
				}
				case 2:{
					System.out.print("Element to add in Arraylist :");
					element = sc.nextLine();
					ar.add(0, element);
					System.out.println(element + " is at first position in list");
					break;
				}
				case 3:{
					System.out.print("Element to add in Arraylist :");
					element = sc.nextLine();
					idx = ar.size();
					
					ar.add(idx, element);
					System.out.println(element + " is at last position in list");
					break;
				}
				case 4:{
					System.out.print("index : ");
					idx = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Element present at index "+idx+ " : "+ar.get(idx));
					break;
				}
				case 5:{
					System.out.println("Element to be updated :");
					element = sc.nextLine();
					System.out.println("new element :");
					String element2 = sc.nextLine();
					idx=ar.indexOf(element);
					ar.remove(idx);
					ar.add(idx, element2);
					System.out.println(element +" is updated to "+element2);
					break;
				}
				case 6:{
					System.out.println("index of element to be removed : ");
					idx = sc.nextInt();
					sc.nextLine();
					element = ar.remove(idx);
					System.out.println(element+" is removed form list");
					break;
				}
				case 7:{
					System.out.println("Element to be serched : ");
					element = sc.nextLine();
					System.out.println("is present in list :"+ ar.contains(element));
					break;
				}
				case 8:{
					Iterator t = ar.iterator();
					System.out.println();
					System.out.print("your list : ");
					while(t.hasNext()) {
						System.out.print(t.next()+" ");
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
			System.out.println();
			
		};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Indigo");
		ArraylistElements obj = new ArraylistElements();
		obj.menu(colors);
	}

}


