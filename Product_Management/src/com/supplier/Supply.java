package com.supplier;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.product.CarDeck;
import com.product.Desktop;
import com.product.Dimension;
import com.product.HomeTheater;
import com.product.Laptop;
import com.product.Microsoft;
import com.product.Product;
import com.product.Tally;

public class Supply {

	public static void main(String[] args) {
		
		
		Product[] arr = inputData();
		
		outputData(arr);
		
		}



	private static void outputData(Product[] arr) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		
		for(int i=0; i<arr.length; i++) {
			Product p=arr[i];
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(sdf.format(p.getMfd()));
		
			if(p instanceof Desktop) {
				Desktop dd1 = (Desktop) p;
				System.out.println(dd1.getServiceId());
				System.out.println(dd1.getComponents());
				System.out.println(dd1.getDimension().getLength() + " " + dd1.getDimension().getWidth() +
						" " + dd1.getDimension().getHeigth());
				System.out.println(dd1.getRAM());
				System.out.println(dd1.getHarddisk());
				System.out.println(dd1.getName());
			}
			
			else if(p instanceof Laptop) {
				Laptop ll1 = (Laptop) p;
				System.out.println(ll1.getServiceId());
				System.out.println(ll1.getComponents());
				System.out.println(ll1.getDimension().getLength() + " " + ll1.getDimension().getWidth() +
						" " + ll1.getDimension().getHeigth());
				System.out.println(ll1.getRAM());
				System.out.println(ll1.getHarddisk());
				System.out.println(ll1.getName());
			}
			
			else if(p instanceof HomeTheater) {
				HomeTheater hh1 = (HomeTheater) p;
				System.out.println(hh1.getServiceId());
				System.out.println(hh1.getComponents());
				System.out.println(hh1.getDimension().getLength() + " " + hh1.getDimension().getWidth() +
						" " + hh1.getDimension().getHeigth());
				System.out.println(hh1.getDecibles());
				System.out.println(hh1.getPowerAmpifier());
				System.out.println(hh1.getName());
			}
			
			else if(p instanceof CarDeck) {
				CarDeck cc1 = (CarDeck) p;
				System.out.println(cc1.getServiceId());
				System.out.println(cc1.getComponents());
				System.out.println(cc1.getDimension().getLength() + " " + cc1.getDimension().getWidth() +
						" " + cc1.getDimension().getHeigth());
				System.out.println(cc1.getDecibles());
				System.out.println(cc1.getPowerAmpifier());
				System.out.println(cc1.getName());
			}
			
			else if(p instanceof Tally) {
				Tally tt1 = (Tally) p;
				System.out.println(tt1.getLanguage());
				System.out.println(tt1.getPlatform());
				System.out.println(tt1.getPrice());
				System.out.println(tt1.getVersion());
			}
			
			else if(p instanceof Microsoft) {
				Microsoft mm1 = (Microsoft) p;
				System.out.println(mm1.getLanguage());
				System.out.println(mm1.getPlatform());
				System.out.println(mm1.getPrice());
				System.out.println(mm1.getVersion());
			}
			
			else {
				System.out.println("Invalid input");
			}
			
			System.out.println();
			
			}
	}
	


	private static Product[] inputData() {
		
	
		Dimension w1 = new Dimension (10, 20, 30);
		Dimension w2 = new Dimension(4, 7, 2);
		
		
		Desktop d1 =  new Desktop(111, "Dell", new Date(), 221, "wires", w1, 8, 500, "XP");
		Laptop l1= new Laptop (112,"Lenovo", new Date(), 222, "wires", w1, 4, 100,  "Laptop" );
		HomeTheater h1= new HomeTheater (115, "Bose", new Date(), 223, "speakers", w2, 1.2, 20.4, "Home Theater");
		CarDeck c1= new CarDeck (114, "JVC", new Date(), 224, "speakers",  w2, 0.7, 10.7, "Car deck");		
		Tally t1= new Tally (115, ".NET", new Date(), "Tally definition", "Tally", 8.1, 100);		
		Microsoft m1= new Microsoft (115, "Microsoft", new Date(), "C++", "Unix", 10.1, 250);
	
		int a1[] = new int[6];
		
		a1[0] = d1.getPid();
		a1[1] = l1.getPid();
		a1[2] = h1.getPid();
		a1[3] = c1.getPid();
		a1[4] = t1.getPid();
		a1[5] = m1.getPid();
		
		for(int i = 0; i < 6 ; i++) {
			System.out.println(a1[i]);
		}
		
		for(int i = 0; i < 6 ; i++) {
			for(int j = i + 1; j < 6; j++) {
				
				if(a1[i] == a1[j]) {
					//throw new DuplicateProductIdExcp("Duplicate Product ID");
					try {
						throw new DuplicateProductIdExcp("Duplicate Product ID");
					} catch (DuplicateProductIdExcp e) {
						e.printStackTrace();
						break;
					}
					
				}
				/*else {
					System.out.println("Different product ID");
					break;
				}*/
			}
		}
		
		System.out.println();
		
		Product arr[]= new Product[6];
		arr[0]=d1;
		arr[1]=l1;
		arr[2]=h1;
		arr[3]=c1;
		arr[4]=t1;
		arr[5]=m1;
		
 		return arr;
	}
	

}
