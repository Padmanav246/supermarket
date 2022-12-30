package mart.supermarket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Avalability{
	Scanner sc = new Scanner(System.in);
	String str=null;
	ArrayList<Products> Selected=new ArrayList<Products>();
	public ArrayList<Products> avalableproducts(ArrayList<Products> Cloth,ArrayList<Products> Food,ArrayList<Products> Homeappliances,ArrayList<Products> Electronicgadgets)
	{
		do
		{
			try {
			
			System.out.println("Which type of products do you wants to buy :- ");
			System.out.println("\t (1) cloths\n\t (2) Food\n\t (3)Homeapliances\n\t (4) Electronics");
			System.out.println("Enter your choice :- ");
			int choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
				int flag=0;
				System.out.println("Avalable Products in cloths are :-\n");
				System.out.println("Product_id"+"\tAvalability"+"\t\t\t Price"+"\t \tDescription");
				System.out.println("_____________________________________________________________________________________________________________");
				for(Products p1:Cloth)
				{
					System.out.println(p1.getProductid()+" \t\t "+p1.getNumberofproduct()+"\t\t\t\t "+p1.getPrice()+"\t \t"+p1.getProductdescription());
					System.out.println("------------------------------------------------------------------------------------------------------------");
				}
				System.out.println("Enter The Product id which you wants to buy :- ");
				int selectedproduct=sc.nextInt();
				System.out.println("Enter the Quantity:-");
				int quantity=sc.nextInt();
				for(Products p1:Cloth)
				{
					if(p1.getProductid()==selectedproduct && (p1.getNumberofproduct()-quantity)>0)
					{
						if(Selected.contains(p1))
						{
							flag=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity);
						}
						else
						{
							flag=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity);
							Selected.add(p1);
						}
						System.out.println("\n----Product is sucessfully added to cart----\n");
						break;
					}
					else {
						flag=0;
					}
				}
				if(flag==0)
				{
					System.err.println("sorry you have entered wrong input or the sellected product is empty ");
				}
				
				break;
			case 2:
				int flag1=0;
				System.out.println("Avalable Products in Food are :-\n");
				System.out.println("Product_id"+"\tAvalability"+"\t\t\t Price"+"\t \tDescription");
				System.out.println("_____________________________________________________________________________________________________________");
				for(Products p1:Food)
				{
					System.out.println(p1.getProductid()+" \t\t "+p1.getNumberofproduct()+"\t\t\t\t "+p1.getPrice()+"\t \t"+p1.getProductdescription());
					System.out.println("------------------------------------------------------------------------------------------------------------");
				}
				System.out.println("Enter The Product id which you wants to buy :- ");
				int selectedproduct1=sc.nextInt();
				System.out.println("Enter the Quantity:-");
				int quantity1=sc.nextInt();
				for(Products p1:Food)
				{
					if(p1.getProductid()==selectedproduct1 && (p1.getNumberofproduct()-quantity1)>0)
					{
						if(Selected.contains(p1))
						{
							flag1=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity1);
						}
						else
						{
							flag1=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity1);
							Selected.add(p1);
						}
						System.out.println("\n----Product is sucessfully added to cart----\n");
						break;
					}
					else {
						flag1=0;
					}
				}
				if(flag1==0)
				{
					System.err.println("sorry you have entered wrong input or the sellected product is empty ");
				}
				break;
			case 3:
				int flag3=0;
				System.out.println("Avalable Products in Homeappliances are :-\n");
				System.out.println("Product_id"+"\tAvalability"+"\t\t\t Price"+"\t \tDescription");
				System.out.println("_____________________________________________________________________________________________________________");
				for(Products p1:Homeappliances)
				{
					System.out.println(p1.getProductid()+" \t\t "+p1.getNumberofproduct()+"\t\t\t\t "+p1.getPrice()+"\t \t"+p1.getProductdescription());
					System.out.println("------------------------------------------------------------------------------------------------------------");
				}
				System.out.println("Enter The Product id which you wants to buy :- ");
				int selectedproduct3=sc.nextInt();
				System.out.println("Enter the Quantity:-");
				int quantity11=sc.nextInt();
				for(Products p1:Homeappliances)
				{
					if(p1.getProductid()==selectedproduct3 && (p1.getNumberofproduct()-quantity11)>0)
					{
						if(Selected.contains(p1))
						{
							flag3=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity11);
						}
						else
						{
							flag3=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity11);
							Selected.add(p1);
						}
						System.out.println("\n----Product is sucessfully added to cart----\n");
						
						break;
					}
					else {
						flag3=0;
					}
				}
				if(flag3==0)
				{
					System.err.println("sorry you have entered wrong input or the sellected product is empty ");
				}
				break;
			case 4:
				int flag4=0;
				System.out.println("Avalable Products in Electronicgadgets are :-\n");
				System.out.println("Product_id"+"\tAvalability"+"\t\t\t Price"+"\t \tDescription");
				System.out.println("_____________________________________________________________________________________________________________");
				for(Products p1:Electronicgadgets)
				{
					System.out.println(p1.getProductid()+" \t\t "+p1.getNumberofproduct()+"\t\t\t\t "+p1.getPrice()+"\t \t"+p1.getProductdescription());
					System.out.println("------------------------------------------------------------------------------------------------------------");
				}
				System.out.println("Enter The Product id which you wants to buy :- ");
				int selectedproduct4=sc.nextInt();
				System.out.println("Enter the Quantity:-");
				int quantity111=sc.nextInt();
				
				for(Products p1:Electronicgadgets)
				{
					if(p1.getProductid()==selectedproduct4 && (p1.getNumberofproduct()-quantity111)>0)
					{
						if(Selected.contains(p1))
						{
							flag4=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity111);
						}
						else
						{
							flag4=1;
							p1.setNumberofproduct(p1.getNumberofproduct()-quantity111);
							Selected.add(p1);
						}
						System.out.println("\n----Product is sucessfully added to cart----\n");
						break;
					}
					else {
						flag4=0;
					}
				}
				if(flag4==0)
				{
					System.err.println("sorry you have entered wrong input or the sellected product is empty ");
				}
				break;
			default:
				System.err.println("Wrong choice");
			}
			}catch(Exception e)
			{
				System.err.println("!!!!!-------Illegal argument, Enter a valid Argument ----------!!!!");
			}
		System.out.println("Do you Wants to continue (y/n):- ");
		sc.nextLine();
		str=sc.nextLine();
			
		}while(str.equals("y"));
		
		return Selected;
	}
}