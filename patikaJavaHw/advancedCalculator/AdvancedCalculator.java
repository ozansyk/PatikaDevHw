package patikaJavaHw.advancedCalculator;

import java.util.Scanner;

public class AdvancedCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Ýþlemi\n"
                + "2- Çýkarma Ýþlemi\n"
                + "3- Çarpma Ýþlemi\n"
                + "4- Bölme iþlemi\n"
                + "5- Üslü Sayý Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen'in Alan Hesabý\n"
                + "9- Dikdörtgen'in Çevre Hesabý\n"
                + "0- Çýkýþ Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir iþlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleArea();
                    break;
                case 9:
                    rectanglePerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


	}

	public static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayý :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    public static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayý :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    public static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayý :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    public static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayý :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    public static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban deðeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs deðeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayý giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    
    public static void mod() {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Mod alýnacak sayýyý giriniz: ");
        int n = scan.nextInt();
        System.out.print("Mod'u giriniz: ");
        int m = scan.nextInt();
        
        int mod = n%m;
        
        System.out.println(n + "'in " + m + "'e göre modu: " + mod);
    }
    
    public static void rectangleArea() {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin bir kenar uzunluðunu giriniz: ");
        int n = scan.nextInt();
        
        System.out.print("Dikdörtgenin ikinci kenar uzunluðunu giriniz: ");
        int m = scan.nextInt();
        
        int area = n*m;
        
        System.out.println("Dikdörgenin alaný: " + area);
    }
    
    public static void rectanglePerimeter() {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Dikdörtgenin bir kenar uzunluðunu giriniz: ");
        int n = scan.nextInt();
        
        System.out.print("Dikdörtgenin ikinci kenar uzunluðunu giriniz: ");
        int m = scan.nextInt();
        
        int perimeter = 2*(m+n);
        
        System.out.println("Dikdörgenin çevresi: " + perimeter);
    }

}
