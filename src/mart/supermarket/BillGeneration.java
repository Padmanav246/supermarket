package mart.supermarket;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class BillGeneration {
	Scanner sc = new Scanner(System.in);

	public void generetion(ArrayList<Products> selected) {
		String name = null;
		String mob = null;
		try {
			System.out.println("Enter Your name :- ");
			name = sc.nextLine();
			while(!name.matches("[A-Za-z]+")) {
				System.out.println("Please Enter a correct name :- ");
				name = sc.nextLine();
			}
			System.out.println("Enter Your Mobile number :- ");
			mob = sc.nextLine();
			
			while(10 != mob.length() || !(mob.matches("[0-9]{10}"))) {
				System.out.println("Please Enter a correct Number :- ");
				mob = sc.next();
			}

			double totalprice = 0;
			int i = 1;
			int totalproducts=0;
			System.out.println("\t\t\tBIL GENERATE FOR ");
			System.out.println("\t\t-------------------------------------------------");
			System.out.println("\t\t\tName  :" + name);
			System.out.println("\t\t\tMobno :" + mob);
			System.out.println("\t\t-------------------------------------------------\n");
			for (Products p : selected) {
				int numberofproduct=5-p.getNumberofproduct();
				System.out.println("------------------------------------------------------------------------");
				System.out.println(
						i + "\t" + p.getProductid() + "\t\t" + p.getProductdescription() + "\t" + p.getPrice()+"\t\t"+numberofproduct+"\t\t"+(numberofproduct*p.getPrice()));
				totalprice += (numberofproduct*p.getPrice());
				i++;
				totalproducts +=(5-p.getNumberofproduct());
			}
			
			System.out.println("--------------------------------------------_______________--------------___________________");
			System.out.println("    			                  Total products: "+totalproducts+"        Total:-" + totalprice);
			
			
			
			
			try {
				File bill = new File("Bill.txt");
				bill.createNewFile();
				FileWriter fw = new FileWriter("Bill.txt");
				fw.write("\t\t\tBIL GENERATE FOR ");
				fw.append("\n\t\t-------------------------------------------------\n");
				fw.append("\t\t\tName  :" + name);
				fw.append("\n\t\t\tMobno :" + mob+"\n");
				i = 1;
				for (Products p : selected) {
					int numberofproduct=5-p.getNumberofproduct();
					fw.append("\n------------------------------------------------------------------------\n");
					fw.append(i + "\t" + p.getProductid() + "\t\t" + p.getProductdescription() + "\t" + p.getPrice()+"\t\t"+numberofproduct+"\t"+(numberofproduct*p.getPrice()));
					totalprice += (numberofproduct*p.getPrice());
					i++;
				}
				fw.append("\n--------------------------------------------_______________--------------___________________\n");
				fw.append("    			                  Total products: "+totalproducts+"        Total:-" + totalprice);
				fw.close();
			} catch (Exception e) {
				System.err.println("File generetion failure");
			}
		} catch (Exception e) {
			System.err.println("!!!-------Plese Enter in write format------!!!! ");
		}

	}
}
