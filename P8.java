class Matrix
{
    private int row,col;
    private double m1[][];
    private static int v;
    Matrix()
    {
        row=2;
        col=2;
        m1=new double[row][col];
        intilize(row, col, m1);
    }
    Matrix(int row,int col)
    {
        this.row=row;
        this.col=col;
        m1=new double[row][col];
        intilize(row, col, m1);
    }
    public void intilize(int row,int col,double m1[][])
    {
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                  m1[i][j]=v;
                  v++;
            }
        }
    }
    public String toString() {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(this)
            }
        }
    }
}
public class P8 {
    public static void main(String[] args) {
        
    }
}
