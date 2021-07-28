package patikaJavaHw.transposeOfMatris;

public class TransposeOfMatris {

	public static void main(String[] args) {
		int[][] matris = new int[][] {{2,3,4},{5,6,4}};
		
		int[][] transpose = new int[matris[0].length][matris.length];
		
		transposeMatris(matris,transpose);
		
		System.out.println("Orjinal Matris: ");
		
		for(int[] i : matris) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose: ");
		
		for(int[] i : transpose) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

	public static void transposeMatris(int[][] matris, int[][] transpose) {
		for(int i=0; i<transpose.length; i++) {
			for(int j=0; j<transpose[0].length; j++) {
				transpose[i][j] = matris[j][i];
			}
		}
	}

}
