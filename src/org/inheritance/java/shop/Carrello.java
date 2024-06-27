package org.inheritance.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		//Array dei prodotti
		Prodotto[] prodotti = new Prodotto[0];
		
		String product = "";
		String name;
		String brand;
		double price;
		double tax;
		String imei;
		int memory;
		int dimensions = 0;
		boolean isSmart;
		String color;
		boolean isWireless;
		String answer;
		
	do {
		do {
			System.out.println("\nScegli il prodotto (1-smartphone, 2-televisore, 3-cuffie)");
		
				switch (sc.nextInt()) {
					case 1:
						product = "Smartphone";
						break;
					case 2:
						product ="Televisore";
						break;
					case 3: 
						product = "Cuffie";
			}
			sc.nextLine();
			
		}while (!product.equals("Smartphone") && !product.equals("Televisore") && !product.equals("Cuffie"));

        System.out.printf("\nInserire nome %s: \n", product);
        name = sc.nextLine();
        System.out.printf("\nInserire marca %s: \n", product);
        brand = sc.nextLine();
        System.out.printf("\nInserire prezzo %s: \n", product);
        price = sc.nextDouble();
        System.out.printf("\nInserire IVA %s: \n", product);
        tax = sc.nextDouble();
        sc.nextLine();
        
        switch (product) {
        case "Smartphone":
            System.out.println("\nInserire il codice IMEI dello smartphone");
            imei = sc.nextLine();
            System.out.println("\nInserire la memoria in GB dello smartphone");
            memory = sc.nextInt();
            sc.nextLine();
            prodotti = addProduct(prodotti, new Smartphone(dimensions, name, brand, price, tax, imei, memory));
            break;
        case "Televisore":
            System.out.println("\nInserire la dimensione in pollici del televisore:");
            dimensions = sc.nextInt();
            sc.nextLine();
            System.out.println("\nScegliere se il televisore è Smart (s/n)");
            answer = sc.nextLine();
            isSmart = answer.equalsIgnoreCase("s");
            prodotti = addProduct(prodotti, new Televisore(dimensions, name, brand, price, tax, dimensions, isSmart));
            break;  
        case "Cuffie":
            System.out.println("\nInserire il colore delle cuffie");
            color = sc.nextLine();
            System.out.println("\nScegliere se le cuffie sono Wireless (s/n)");
            answer = sc.nextLine();
            isWireless = answer.equalsIgnoreCase("s");
            prodotti = addProduct(prodotti, new Cuffie(dimensions, name, brand, price, tax, color, isWireless));
        }
        
        System.out.println("\nVuoi inserire un altro prodotto? (s/n)");  
        answer = sc.nextLine();
    	} while (answer.equalsIgnoreCase("s"));  
    
    	sc.close();
    	
    	 System.out.println("\n---- CARRELLO PRODOTTI ----\n");
         
         for (int i = 0; i < prodotti.length; i++) {
             System.out.printf("%d° prodotto del carrello: %s \n\n", i+1, prodotti[i].toString());
         }
	}
	
	public static Prodotto[] addProduct(Prodotto[] oldProdotti, Prodotto newProdotto) {
        Prodotto[] newProdotti = new Prodotto[oldProdotti.length + 1];
        for (int i = 0; i < newProdotti.length - 1; i++) {
            newProdotti[i] = oldProdotti[i];
        }
        
        newProdotti[oldProdotti.length] = newProdotto;
        return newProdotti;    
    }
}	
	
