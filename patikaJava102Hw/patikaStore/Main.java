package patikaJava102Hw.patikaStore;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Brand> brandSet = new TreeSet<>(new BrandComparator());
		brandSet.add(new Brand("Samsung"));
		brandSet.add(new Brand("Lenovo"));
		brandSet.add(new Brand("Apple"));
		brandSet.add(new Brand("Huawei"));
		brandSet.add(new Brand("Casper"));
		brandSet.add(new Brand("Asus"));
		brandSet.add(new Brand("HP"));
		brandSet.add(new Brand("Xiaomi"));
		brandSet.add(new Brand("Monster"));
		
		Set<MobilePhone> mobilePhones = new HashSet<>();
		mobilePhones.add(new MobilePhone(1, "SAMSUNG GALAXY A51", 3199, 20, 100, new Brand("Samsung"), "128 GB", "6.5 inches", "6 GB", 4000, "Siyah"));
		mobilePhones.add(new MobilePhone(2, "iPhone 11 64 GB", 7379, 25, 300, new Brand("Apple"), "64 GB", "6.1 inches", "6 GB", 3046, "Siyah"));
		mobilePhones.add(new MobilePhone(3, "Redmi Note 10 Pro 8GB", 4012, 30, 200, new Brand("Xiaomi"), "128 GB", "6.5 inches", "12 GB", 4000, "Siyah"));
		
		Set<Notebook> notebooks = new HashSet<>();
		notebooks.add(new Notebook(1, "HUAWEI Matebook 14", 7000, 15, 150, new Brand("Huawei"), "512 GB", "14 inches", "16 Gb"));
		notebooks.add(new Notebook(2, "LENOVO V14 IGL", 3699, 10, 100, new Brand("Lenovo"), "1024 GB", "14 inches", "8 Gb"));
		notebooks.add(new Notebook(3, "ASUS Tuf Gaming", 8199, 20, 150, new Brand("Asus"), "2048 GB", "15.6 inches", "32 Gb"));
		
		run(brandSet, mobilePhones, notebooks);
	}
	
	public static void run(Set<Brand> brandSet, Set<MobilePhone> mobilePhones, Set<Notebook> notebooks) {
		Scanner input = new Scanner(System.in);
		System.out.println("PatikaStore Ürün Yönetim Paneli !");
		System.out.println("1 - Notebook Ýþlemleri\r\n"
				+ "2 - Cep Telefonu Ýþlemleri\r\n"
				+ "3 - Marka Listele\r\n"
				+ "0 - Çýkýþ Yap");
		System.out.print("Tercihiniz: ");
		int key = input.nextInt();
		switch(key) {
			case 0: 
				break;
			case 1:
				System.out.println("Notebook Listesi\n");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------");
				System.out.println("| ID | Ürün Adý             	|Fiyat     		 | Marka		| Depolama		| Ekran		|RAM  ");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------");
				for(Notebook n : notebooks) {
					System.out.println("| " + n.getId() + " |" + n.getName() + "		| " + n.getPrice() + "		| " + n.getBrand() + "		" +
						"| " + n.getMemory() + "		| " + n.getScreenSize() + "		| " + n.getRam());
				}
				
				break;
			case 2:
				System.out.println("Cep Telefonu Listesi\n");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------");
				System.out.println("| ID | Ürün Adý             	|Fiyat     		 | Marka		| Depolama		| Ekran		|RAM  ");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------");
				for(MobilePhone n : mobilePhones) {
					System.out.println("| " + n.getId() + " |" + n.getName() + "		| " + n.getPrice() + "		| " + n.getBrand() + "		" +
						"| " + n.getMemory() + "		| " + n.getScreenSize() + "		| " + n.getRam());
				}
				break;
			case 3:
				System.out.println("Markalarýmýz\n --------");
				for(Brand b : brandSet) {
					System.out.println("- " + b.getName());
				}
				break;
			default:
				System.out.println("Hatalý giriþ yaptýnýz.");
		}
		
		System.out.println("\nÇýkýþ yapýldý.");
		
		input.close();
	}

}
