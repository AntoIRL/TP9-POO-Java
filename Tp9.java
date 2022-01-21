package tp_algo_base_java;

public class Tp9 {
	public static void affichage(int m[][], int lignes, int colonnes) {
		for(int i=0; i<lignes; i++) {
			for(int j=0; j<colonnes; j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
		System.out.println("-----------------");
	}

	public static void affichage(double m[][], int lignes, int colonnes) {
		for(int i=0; i<lignes; i++) {
			for(int j=0; j<colonnes; j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
		System.out.println("-----------------");
	}

	public static void affichage(char m[][], int lignes, int colonnes) {
		for(int i=0; i<lignes; i++) {
			for(int j=0; j<colonnes; j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
		System.out.println("-----------------");
	}

	public static boolean estNulle(int m[][], int lignes, int colonnes) {
		for(int i=0; i<lignes; i++)
			for(int j=0; j<colonnes; j++)
				if (m[i][j] != 0) return false;
		return true;
	}

	public static boolean queDesX(int m[][], int lignes, int colonnes, int x) {
		for(int i=0; i<lignes; i++)
			for(int j=0; j<colonnes; j++)
				if (m[i][j] != x) return false;
		return true;
	}

	public static int[][] multScalaire(int m[][], int lignes, int colonnes, int k) {
		int res[][] = new int[lignes][colonnes];
		for(int i=0; i<lignes; i++)
			for(int j=0; j<colonnes; j++)
				res[i][j] = m[i][j]*k;
		return res;
	}

	public static double[][] 
			addition(double m1[][], double m2[][], int lignes, int colonnes) {
		double res[][] = new double[lignes][colonnes];
		for(int i=0; i<lignes; i++)
			for(int j=0; j<colonnes; j++)
				res[i][j] = m1[i][j]+m2[i][j];
		return res;
	}

	public static boolean estDiagonale(int m[][], int n) {
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				if (i!=j) 
					if (m[i][j] != 0) return false;
		return true;
	}

	public static boolean estSymetrique(int m[][], int n) {
		for(int i=0; i<n; i++)
			for(int j=0; j<i; j++)
				if (i!=j && m[i][j] != m[j][i]) return false;
		return true;
	}

	public static int occurrences(char m[][], int lignes, int colonnes, char x) {
		int res=0;
		for(int i=0; i<lignes; i++)
			for(int j=0; j<colonnes; j++)
				if (m[i][j] == x)
					res++;
		return res;
	}

	public static void main(String[] args) {
		int m1[][] = {{1,2}, {3,4}, {5,6}};
		affichage(m1, 3, 2);

		int m2[][] = {{0,0}, {0,0}, {0,0}};
		System.out.println(estNulle(m1, 3, 2));
		System.out.println(estNulle(m2, 3, 2));
		System.out.println(queDesX(m2, 3, 2, 0));

		affichage(multScalaire(m1, 3, 2, 2), 3, 2);

		double m3[][] = {{1.0, 2.3}, {2.0, 1.7}};
		double m4[][] = {{10.3, 8.7}, {12.1, 1.3}};
		affichage(addition(m3, m4, 2, 2), 2, 2);

		int m5[][] = {{1,1,1}, {1,1,1}, {1,2,2}};
		int m6[][] = {{1,0,0}, {0,2,0}, {0,0,1}};
		System.out.println(estDiagonale(m5, 3));
		System.out.println(estDiagonale(m6, 3));

		System.out.println(estSymetrique(m5, 3));
		System.out.println(estSymetrique(m6, 3));
		int m7[][] = {{1,3,4}, {3,2,0}, {4,0,1}};
		affichage(m7, 3, 3);
		System.out.println(estSymetrique(m7, 3));

		char m8[][] = {{'b','a','c'}, {'a','b','c'}, {'a','b','a'}};
		affichage(m8, 3, 3);
		System.out.println(occurrences(m8, 3, 3, 'a'));
	}
}
