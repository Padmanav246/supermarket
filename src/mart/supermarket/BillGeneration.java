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
			while(!name.matches("^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$")) {
				System.out.println("Please Enter a correct name :- ");
				name = sc.nextLine();
			}
			System.out.println("Enter Your Mobile number :- ");
			mob = sc.nextLine();
			
			while(10 != mob.length()) {
				System.out.println("Please Enter a correct Number :- ");
				mob = sc.next();
			}

			double totalprice = 0;
			int i = 1;
			System.out.println("\t\tBIL GENERATE FOR ");
			System.out.println("\t-------------------------------------------------");
			System.out.println("\t\tName  :   " + name);
			System.out.println("\t\tMobno :" + mob);
			System.out.println("\t-------------------------------------------------\n");
			for (Products p : selected) {
				int numberofproduct=5-p.getNumberofproduct();
				System.out.println("------------------------------------------------------------------------");
				System.out.println(
						i + "\t" + p.getProductid() + "\t\t" + p.getProductdescription() + "\t" + p.getPrice()+"\t\t"+numberofproduct+"\t"+(numberofproduct*p.getPrice()));
				totalprice += (numberofproduct*p.getPrice());
				i++;
			}
			System.out.println("------------------------------------------------_________________________");
			System.out.println("                                              Total:-    " + totalprice);
			
			
			
			
			try {
				File bill = new File("Bill.txt");
				bill.createNewFile();
				FileWriter fw = new FileWriter("Bill.txt");
				fw.write("\t\tBIL GENERATE FOR ");
				fw.append("\n\t-------------------------------------------------\n");
				fw.append("\t\tName  :   " + name + "\n");
				fw.append("\t\tMobno :" + mob + "\n");
				i = 1;
				for (Products p : selected) {
					int numberofproduct=5-p.getNumberofproduct();
					fw.append("\n------------------------------------------------------------------------\n");
					fw.append(i + "\t" + p.getProductid() + "\t\t" + p.getProductdescription() + "\t" + p.getPrice()+"\t\t"+numberofproduct+"\t"+(numberofproduct*p.getPrice()));
					totalprice += (numberofproduct*p.getPrice());
					i++;
				}
				fw.append("\n------------------------------------------------_________________________\n");
				fw.append("                                              Total:-    " + totalprice);
				fw.close();
			} catch (Exception e) {
				System.err.println("File generetion failure");
			}
		} catch (Exception e) {
			System.err.println("!!!-------Plese Enter in write format------!!!! ");
		}

	}
}
