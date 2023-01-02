package mart.supermarket;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Avalability {
	Scanner sc = new Scanner(System.in);
	String str = null;
	ArrayList<Products> Selected = new ArrayList<Products>();

	public ArrayList<Products> avalableproducts(ArrayList<Products> Cloth, ArrayList<Products> Food,
			ArrayList<Products> Homeappliances, ArrayList<Products> Electronicgadgets) {
		do {
			try {
				int choice1 = 0;
				System.out.println("Which type of products do you wants to buy :- ");
				System.out.println("\t (1) cloths\n\t (2) Food\n\t (3)Homeapliances\n\t (4) Electronics");
				do {
					try {
						System.out.println("Enter your choice :- ");
						choice1 = sc.nextInt();
						if (choice1 > 0 && choice1 < 5) {
							break;
						} else {
							System.err.println("\n!!!!----Please enter a valid choice----!!!!\n");
						}
					} catch (Exception e) {
						System.err.println("\n!!!!----Please enter a valid choice----!!!!\n");
						sc.nextLine();
					}
				} while (true);

				switch (choice1) {
				case 1:
					buy(Cloth);
					break;

				case 2:
					buy(Food);
					break;

				case 3:
					buy(Homeappliances);
					break;

				case 4:
					buy(Electronicgadgets);
					break;

				default:
					System.err.println("Wrong choice");
				}
			} catch (Exception e) {
				System.err.println("!!!!!-------Illegal argument, Enter a valid Argument ----------!!!!");
			}
			System.out.println("Do you Wants to continue (y/n):- ");
			sc.nextLine();
			str = sc.nextLine();

		} while (str.equals("y"));

		return Selected;
	}

	private void buy(ArrayList<Products> list) {
		int flag = 0;
		System.out.println("Avalable Products are :-\n");
		System.out.println("Product_id" + "\tAvalability" + "\t\t\t Price" + "\t \tDescription");
		System.out.println(
				"_____________________________________________________________________________________________________________");
		for (Products p1 : list) {
			System.out.println(p1.getProductid() + " \t\t " + p1.getNumberofproduct() + "\t\t\t\t " + p1.getPrice()
					+ "\t \t" + p1.getProductdescription());
			System.out.println(
					"------------------------------------------------------------------------------------------------------------");
		}
		do {
			try {

				System.out.println("Enter The Product id which you wants to buy :- ");
				int selectedproduct = sc.nextInt();
				int quantity=0;
				for (Products p1 : list) {
					if (p1.getProductid() == selectedproduct && p1.getNumberofproduct()>0) {
						do {
							try {
								System.out.println("Enter your a number beetween (1 - "+p1.getNumberofproduct()+" ) :- ");
								quantity = sc.nextInt();
								if (quantity > 0 && quantity <= 5 && (p1.getNumberofproduct() - quantity >= 0)) {
									break;
								} else {
									System.err.println("Please enter a valid choice");
								}
							} catch (Exception e) {
								System.err.println("Please enter a valid choice");
								sc.nextLine();
							}
						}while(true);

						if (Selected.contains(p1)) {
							flag = 1;
							p1.setNumberofproduct(p1.getNumberofproduct() - quantity);
							print(quantity);
							System.out.println("\n\t\t\t----Product is sucessfully added to cart----\n");
						} else if (!Selected.contains(p1)) {
							flag = 1;
							p1.setNumberofproduct(p1.getNumberofproduct() - quantity);
							Selected.add(p1);
							print(quantity);
							System.out.println("\n\t\t\t----Product is sucessfully added to cart----\n");
						} else {
							flag = 0;
						}
					}
				
			} 
				if (flag == 0) {
					System.err.println("\t!!----Enter valid product id----!!");
				}
			}catch (Exception e) {
				System.err.println("\t!!----Enter a valid productid----!!");
				sc.nextLine();
			}
		} while (flag == 0);
	}
	
	public void print(int quantity)
	{
		System.out.println("\n\n\t\t\t\t\t\tYour Cart");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
		for (Products p1 : Selected) {
			
			System.out.println(p1.getProductid() + " \t\t " + (5-p1.getNumberofproduct() )+ "\t\t " + p1.getPrice()
					+ "\t \t"+p1.getPrice()*quantity+"\t\t" + p1.getProductdescription());
			System.out.println(
					"------------------------------------------------------------------------------------------------------------");
		}
	}
}