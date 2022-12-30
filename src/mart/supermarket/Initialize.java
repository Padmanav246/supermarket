package mart.supermarket;
import java.io.Serializable;
import java.util.*;

public class Initialize extends Thread implements Serializable
{
	public void run()
	{
		clothinitialize();
		foodinInitialize();
		homeappliance();
		electronics();
		star();
	}
	ArrayList<Products> Cloth = new ArrayList<Products>();
	ArrayList<Products> Food = new ArrayList<Products>();
	ArrayList<Products> Homeappliances = new ArrayList<Products>();
	ArrayList<Products> Electronicgadgets = new ArrayList<Products>();
	public void clothinitialize() {
		Products c1 = new Products(101, "cloth", "Cotten shirt", 5, 500);
		Products c2 = new Products(102, "cloth", "Cotton Pant", 5, 1200);
		Products c3 = new Products(103, "cloth", "T-shirt.", 5, 300);
		Products c4 = new Products(104, "cloth", "sweater", 5, 3000);
		Products c5 = new Products(105, "cloth", "jacket", 5, 2000);
		Products c6 = new Products(106, "cloth", "coat", 5, 5000);
		Products c7 = new Products(107, "cloth", "jeans", 5, 2500);
		Products c8 = new Products(108, "cloth", "socks", 5, 200);
		Products c9 = new Products(109, "cloth", "shorts", 5, 400);
		Products c10 = new Products(110, "cloth", "tracksuit", 5, 500);
		Cloth.add(c1);
		Cloth.add(c2);
		Cloth.add(c3);
		Cloth.add(c4);
		Cloth.add(c5);
		Cloth.add(c6);
		Cloth.add(c7);
		Cloth.add(c8);
		Cloth.add(c9);
		Cloth.add(c10);
	}

	public void foodinInitialize() {
		Products f1 = new Products(201, "food", "Breads", 5, 50);
		Products f2 = new Products(202, "food", "Rice", 5, 120);
		Products f3 = new Products(203, "food", "Condiments.", 5, 30);
		Products f4 = new Products(204, "food", "Seafood", 5, 300);
		Products f5 = new Products(205, "food", "Desserts", 5, 200);
		Products f6 = new Products(206, "food", "Eggs", 5, 50);
		Products f7 = new Products(207, "food", "Fast food", 5, 250);
		Products f8 = new Products(208, "food", "Noodles", 5, 20);
		Products f9 = new Products(209, "food", "Sandwiches", 5, 40);
		Products f10 = new Products(210, "food", "Sauces", 5, 50);
		Food.add(f1);
		Food.add(f2);
		Food.add(f3);
		Food.add(f4);
		Food.add(f5);
		Food.add(f6);
		Food.add(f7);
		Food.add(f8);
		Food.add(f9);
		Food.add(f10);
		
	}

	public void homeappliance() {
		Products h1 = new Products(301, "Homeappliances", "conditioners", 5, 50);
		Products h2 = new Products(302, "Homeappliances", "dishwashers", 5, 120);
		Products h3 = new Products(303, "Homeappliances", "clothes dryers.", 5, 1500);
		Products h4 = new Products(304, "Homeappliances", "freezers", 5, 3000);
		Products h5 = new Products(305, "Homeappliances", "microwave ovens", 5, 5000);
		Products h6 = new Products(306, "Homeappliances", "induction cookers", 5, 3000);
		Products h7 = new Products(307, "Homeappliances", " kitchen stoves", 5, 2050);
		Products h8 = new Products(308, "Homeappliances", "water heaters", 5, 200);
		Products h9 = new Products(309, "Homeappliances", "washing machines", 5, 8000);
		Products h10 = new Products(310, "Homeappliances", "Bulbs", 5,250);
		Homeappliances.add(h1);
		Homeappliances.add(h2);
		Homeappliances.add(h3);
		Homeappliances.add(h4);
		Homeappliances.add(h5);
		Homeappliances.add(h6);
		Homeappliances.add(h7);
		Homeappliances.add(h8);
		Homeappliances.add(h9);
		Homeappliances.add(h10);
	}

	public void electronics() {
		Products e1 = new Products(401, "Electronics", "Air purifier.", 5, 5000);
		Products e2 = new Products(402, "Electronics", "Air conditioner", 5, 30000);
		Products e3 = new Products(403, "Electronics", "Alarm clock..", 5, 1000);
		Products e4 = new Products(404, "Electronics", "Backup charger.", 5, 900);
		Products e5 = new Products(405, "Electronics", "Bread maker.", 5, 1200);
		Products e6 = new Products(406, "Electronics", "Banknote counter", 5, 400);
		Products e7 = new Products(407, "Electronics", "Blender.", 5, 250);
		Products e8 = new Products(408, "Electronics", "Bluetooth speaker.", 5, 1000);
		Products e9 = new Products(409, "Electronics", "Dvd player", 5, 1500);
		Products e10 = new Products(410, "Electronics", "Earphones", 5, 250);
		Electronicgadgets.add(e1);
		Electronicgadgets.add(e2);
		Electronicgadgets.add(e3);
		Electronicgadgets.add(e4);
		Electronicgadgets.add(e5);
		Electronicgadgets.add(e6);
		Electronicgadgets.add(e7);
		Electronicgadgets.add(e8);
		Electronicgadgets.add(e9);
		Electronicgadgets.add(e10);
	}
	public void star()
	{
		Avalability av=new Avalability();
		ArrayList<Products> selected=av.avalableproducts(Cloth, Food, Homeappliances,Electronicgadgets );
		BillGeneration bill=new BillGeneration();
		bill.generetion(selected);
		
	}
}