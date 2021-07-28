package mineSweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sat�r say�s�n� giriniz: ");
		int row = input.nextInt();
		System.out.print("S�tun say�s�n� giriniz: ");
		int col = input.nextInt();
		
		MineSweeper mine = new MineSweeper(row, col);
		mine.run();
		
		input.close();
	}

}
