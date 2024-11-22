import java.util.Scanner;

public class P5 {
    public static String printMatrix(int matrix[][])
    {
        String s="";
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                s=s+matrix[i][j]+" ";
            }
            s=s+"\n";
        }
        return s;
    }
    public static int[][] addition(int matrix1[][],int matrix2[][])
    {
        int result[][]=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[i].length;j++)
            {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] substraction(int matrix1[][],int matrix2[][])
    {
        int result[][]=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[i].length;j++)
            {
                result[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplication(int matrix1[][],int matrix2[][])
    {
        int result[][]=new int[matrix1.length][matrix2[0].length];
        for(int i=0;i<matrix1.length;i++)
        {
             for(int j=0;j<matrix2[0].length;j++)
             {
                 for(int k=0;k<matrix2.length;k++)
                 {
                    result[i][j]=result[i][j]+(matrix1[i][k]*matrix2[k][j]);
                 }
             }
        }
        return result;
    }
    public static void main(String[] args) {
        int col,row,col2,row2;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number of column and row Of the First Matrix");
        col=s1.nextInt();
        row=s1.nextInt();
        System.out.println("Enter number of column and row Of the Second Matrix");
        col2=s1.nextInt();
        row2=s1.nextInt();
        
        int matrix1[][]=new int[row][col];
        int matrix2[][]=new int[row2][col2];
        int result[][];
        int x=1;
        System.out.println("\nMatrix 1 : "+row+" "+col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
               { 
                 matrix1[i][j]=x;
                 x++;
               }
               System.out.println();
        }
        System.out.println(printMatrix(matrix1));
        System.out.println("\nMatrix 2 : ");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
               { 
                 matrix2[i][j]=x;
                 x++;
               }
               System.out.println();
        }
        System.out.println(printMatrix(matrix2));
        while(true)
        {
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multplication");
        System.out.println("4.exit");
        System.out.println("\nEnter your choice");
        int choice= s1.nextInt();
        switch(choice)
        {
             case 1:if(col==col2 && row==row2)
                    {
                        result=addition(matrix1,matrix2);
                        System.out.println("\nAddition : \n");
                        System.out.println(printMatrix(result));
                    }
                    else
                      System.out.println("Matrix Addition is not possible");
                      break;
             case 2:if(col==col2 && row==row2)
             {
                 result=substraction(matrix1,matrix2);
                 System.out.println("\nSubstraction : \n");
                 System.out.println(printMatrix(result));
             }
             else
               System.out.println("Matrix Addition is not possible");  
               break;
            case 3:
               if(col==row2)
               {
                  result=multiplication(matrix1,matrix2);
                  System.out.println("\nMultiplication : \n");
                  System.out.println(printMatrix(result));
               }
               else
                  System.out.println("Multiplication is not possible");
            break;
            case 4:System.exit(0);
            default:System.out.println("please,enter valid choice");
            
        }
    }
    }
}
