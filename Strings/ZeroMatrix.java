package chapterOne;

public class ZeroMatrix {

    public static void makeZero(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    for(int k = 0; k < matrix[i].length; k++)
                    {
                        matrix[i][k] = -1000;
                    }
                    for(int k = 0; k < matrix.length; k++)
                    {
                        matrix[k][j] = -1000;
                    }
                }
            }
        }

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == -1000)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 0;
        matrix[1][2] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;
        makeZero(matrix);
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
