/*

   Ce programme est pour l' exercice 1 question 1

*/

public class Exercice1_Question1 {
    


	public static void printIntArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
	
	
	public static void printStringArray(String[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
	
	public static void printInt2DArray(int[][] a) {
        for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
        }
        System.out.println();
    }
	
	public static void printString2DArray(String[][] a) {
        for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
        }
        System.out.println();
    }





    // Le point d'entrée du programme.
    // pour tester la réponse
    public static void main (String[] args) {
	
    }


}
