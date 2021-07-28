package mineSweeper;

import java.util.Scanner;

public class MineSweeper {
	private String[][] mine;
	private String[][] copyMine;
	private boolean isWin;
	
	public MineSweeper(int row, int col) {
		this.mine = new String[row][col];
		this.copyMine = new String[row][col];
		
	}
	
	
	public void run() {
		for(int i=0; i<mine.length; i++) {
			for(int j=0; j<mine[i].length; j++) {
				if(((int)(Math.random()*101))>75) {
					mine[i][j] = "*";
				} else {
					mine[i][j] = "-";
				}
				
				copyMine[i][j] = "-";
			}
		}
		
		System.out.println("Mayýnlarýn konumu");
		for(String[] i : mine) {
			for(String j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("===========================");
		
		System.out.println("Mayýn Tarlasý Oyuna Hoþgeldiniz");
		Scanner input = new Scanner(System.in);
		
		for(String[] i : copyMine) {
			for(String j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.print("Satýr giriniz: ");
		int c = input.nextInt();
		System.out.print("Sütun giriniz: ");
		int r = input.nextInt();
		
		int spaceCount = 0;
		while(true) {
			if(mine[c][r].equals("-")) {
				int number = calculateNumber(c,r, mine);
				copyMine[c][r] = "" + number;
				
				spaceCount++;
				if(spaceCount == calculateSpace(mine)) {
					isWin = true;
					break;
				}
				
			} else {
				isWin = false;
				break;
			}
			
			for(String[] i : copyMine) {
				for(String j : i) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			
			System.out.print("Satýr giriniz: ");
			c = input.nextInt();
			System.out.print("Sütun giriniz: ");
			r = input.nextInt();
		}
		
		if(isWin) {
			System.out.println("Tebrikler, oyunu kazandýnýz! Mayýnlý bölge:");
			for(String[] i : mine) {
				for(String j : i) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Mayýna bastýnýz, kaybettiniz! Mayýnlý bölge:");
			for(String[] i : mine) {
				for(String j : i) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		
		input.close();
	}
	
	public int calculateSpace(String[][] mine) {
		int count = 0;
		for(String[] i : mine) {
			for(String j : i) {
				if(j.equals("-")) {
					count++;
				}
			}
		}
		return count;
	}


	public int calculateNumber(int c, int r, String[][] mine) {
		int count = 0;
		
		if((c>=0 && c<mine.length) && (r+1>=0 && r+1<mine.length)) {
			if(mine[c][r+1].equals("*")) {
			count++;
			}
		}
		
		if((c>=0 && c<mine.length) && (r-1>=0 && r-1<mine.length)) {
			if(mine[c][r-1].equals("*")) {
			count++;
			}
		}
		
		if((c+1>=0 && c+1<mine.length) && (r>=0 && r<mine.length)) {
			if(mine[c+1][r].equals("*")) {
			count++;
			}
		}
		
		if((c-1>=0 && c-1<mine.length) && (r>=0 && r<mine.length)) {
			if(mine[c-1][r].equals("*")) {
			count++;
			}
		}
		
		if((c+1>=0 && c+1<mine.length) && (r+1>=0 && r+1<mine.length)) {
			if(mine[c+1][r+1].equals("*")) {
			count++;
			}
		}
		
		if((c-1>=0 && c-1<mine.length) && (r-1>=0 && r-1<mine.length)) {
			if(mine[c-1][r-1].equals("*")) {
			count++;
			}
		}
		
		if((c+1>=0 && c+1<mine.length) && (r-1>=0 && r-1<mine.length)) {
			if(mine[c+1][r-1].equals("*")) {
			count++;
			}
		}
		
		if((c-1>=0 && c-1<mine.length) && (r+1>=0 && r+1<mine.length)) {
			if(mine[c-1][r+1].equals("*")) {
			count++;
			}
		}
		
		
		
		return count;
	}
	
}
