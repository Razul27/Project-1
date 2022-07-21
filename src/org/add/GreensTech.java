package org.add;

public class GreensTech {
	//Datatype Order
	
	private void greensOmr(String name,int year) {
		System.out.println("The Name of the Institution is "+name);
		System.out.println("The Institute start in the year "+year);
	}
	//Datatype
	private void greensOmr(char logo) {
		System.out.println("The Institution logo is "+logo);
	}
	//Datatype number or count
		private void greensOmr(int pinCode,String address) {
			System.out.println("The Institution pincode is "+pinCode);
			System.out.println("The address of the Institution is "+address);
		}
		public static void main(String[] args) {
			GreensTech g=new GreensTech();
			g.greensOmr("GreensTech", 2010);
			g.greensOmr('G');
			g.greensOmr(600092, "Opposite to Sankeetha hotel, Thoraipakkam");
			g.greensOmr(600092, "Opposite to Sankeetha hotel, Thoraipakkam");
			g.greensOmr(600092, "Opposite to Sankeetha hotel, Thoraipakkam");
		
		System.out.println("hIIIII");
		}
}

