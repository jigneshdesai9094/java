import java.util.*;

public class P5 {
	static Scanner s1 = new Scanner(System.in);

	public static void add(int arr1[][], int arr2[][]) {
		System.out.println("\nAddition Of Above Two Matrix");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print((arr1[i][j] + arr2[i][j]) + " ");
			}
			System.out.println();
		}
	}

	public static void sub(int arr1[][], int arr2[][]) {
		System.out.println("\nSubstraction Of Above Two Matrix");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print((arr1[i][j] - arr2[i][j]) + " ");
			}
			System.out.println();
		}
	}

	public static void mul(int arr1[][], int arr2[][],int row,int col) {

		System.out.println("\nMultiplication Of Above Two Matrix");
		if(row==col)
		{
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				int m = 0;
				for (int k = 0; k < arr1[i].length; k++) {
					m = m + (arr1[i][k] * arr2[k][j]);
				}
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
	else
	{
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print((arr1[i][j]*arr2[i][j])+"  ");
			}
			System.out.println();
		}
	}
	}

	public static void initialize_default(int arr1[][], int arr2[][], int row, int col) {
		int v = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = v;
				v++;
				arr2[i][j] = v;
				v++;
			}
		}
	}

	public static void initialize_user(int arr1[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter arr[" + i + "][" + j + "] value : ");
				int v1 = s1.nextInt();
				arr1[i][j] = v1;
			}
		}
	}

	public static void main(String args[]) {

		int row, col;
		System.out.println("\nEnter Matrix row and column  : ");
		row = s1.nextInt();
		col = s1.nextInt();

		int arr1[][] = new int[row][col], arr2[][] = new int[row][col];
		initialize_default(arr1, arr2, row, col);
		System.out.println(" Two Matrix Follows");
		System.out.println("Matrix - 1");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix - 2");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		while (true) {
			System.out.println("\n1.Own Intialize Matrix");
			System.out.println("2.Addition");
			System.out.println("3.Substration");
			System.out.println("4.Multiplication");
			System.out.println("5.Exit");
			System.out.println("\nEnter your choice : ");
			int choice = s1.nextInt();
			switch (choice) {
				case 1:
					System.out.println("\n1.Intialize Matrix 1");
					System.out.println("2.Intialize Matrix 2");
					System.out.println("Enter your choice");
					int c = s1.nextInt();
					switch (c) {
						case 1:
							initialize_user(arr1, row, col);
							System.out.println("Matrix - 1");
							for (int i = 0; i < arr1.length; i++) {
								for (int j = 0; j < arr1[i].length; j++) {
									System.out.print(arr1[i][j] + " ");
								}
								System.out.println();
							}
							break;
						case 2:
							initialize_user(arr2, row, col);
							System.out.println("\nMatrix - 2");
							for (int i = 0; i < arr2.length; i++) {
								for (int j = 0; j < arr2[i].length; j++) {
									System.out.print(arr2[i][j] + " ");
								}
								System.out.println();
							}
							break;
						default:
							System.out.println("\nPlease,enter valid choice ");
					}
					break;
				case 2:
					add(arr1, arr2);
					break;
				case 3:
					sub(arr1, arr2);
					break;
				case 4:
					mul(arr1, arr2,row,col);
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("\nPlease,enter valid choice ");

			}
		}
		/*
		
		
		*/
	}
}
