package chapterOne;

public class RotateMatrix {

    public static void performRotation(int[][] matrix)
    {
        //transpose the matrix
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = i+1; j < matrix[i].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++)
        {
            int j1 = 0;
            int j2 = matrix[i].length-1;
            while(j1 < j2)
            {
                int temp = matrix[i][j1];
                matrix[i][j1] = matrix[i][j2];
                matrix[i][j2] = temp;
                j1++;
                j2--;
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] matrix = new int[3][3];
        int input = 1;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = input++;
            }
        }
        performRotation(matrix);
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
