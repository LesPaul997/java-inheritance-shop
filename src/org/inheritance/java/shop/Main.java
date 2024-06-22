package org.inheritance.java.shop;

public class Main {

	public static void main(String[] args) {
		
		//Creazione di un prodotto generico
		Prodotto prodottoGenerico = new Prodotto(123,"ProdottoWow", "Pear", 100, 22);
		System.out.println("ProdottoWow");
		System.out.println("Codice: " + prodottoGenerico.getCode());
		System.out.println("Nome: " + prodottoGenerico.getName());
		System.out.println("Prezzo con IVA: " + prodottoGenerico.getPriceWithTax());
		
		//Creazione del Prodotto in Smartphone
		 Smartphone smartphone = new Smartphone(456, "iTelephone", "Sansung", 500.0, 22.0, "123456789012345", 256);
	     System.out.println("\nSmartphone:");
	     System.out.println("Codice: " + smartphone.getCode());
	     System.out.println("Nome: " + smartphone.getName());
	     System.out.println("IMEI: " + smartphone.getImei());
	     System.out.println("Memoria: " + smartphone.getMemory() + "GB");
	     
	     //Creazione del Prodotto in Televisori
	     Televisore televisore = new Televisore(789, "Televisore", "MG", 800.0, 22.0, 55, true);
	     System.out.println("\nTelevisore:");
	     System.out.println("Codice: " + televisore.getCode());
	     System.out.println("Nome: " + televisore.getName());
	     System.out.println("Dimensioni: " + televisore.getDimensions() + " pollici");
	     System.out.println("Smart: " + (televisore.isSmart() ? "Sì" : "No"));
	     
	     //Creazione del Prodotto in Cuffie
	     Cuffie cuffie = new Cuffie(1122, "PodsAir", "MadeTech", 150.0, 22.0, "White", true);
	     System.out.println("\nCuffie:");
	     System.out.println("Codice: " + cuffie.getCode());
	     System.out.println("Nome: " + cuffie.getName());
	     System.out.println("Colore: " + cuffie.getColor());
	     System.out.println("Wireless: " + (cuffie.isWireless() ? "Sì" : "No"));
	}

}
