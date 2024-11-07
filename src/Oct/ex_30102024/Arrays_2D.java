package Oct.ex_30102024;

public class Arrays_2D {
    public static void main(String[] args) {
        int [][] a_2d = new int[3][3];
        a_2d[0][0] = 90;
        a_2d[0][1] = 91;
        a_2d[0][2] = 92;
        a_2d[1][0] = 45;
        a_2d[1][1] = 89;
        a_2d[1][2] = 12;

        int[][] matrix = {{1,2,3}, {4,6, 5}, {7,8,9}};
        int[][] matrix_3_2 = {{11,12}, {33,24}, {15,56}};
        int[][] matrix_2_2 ={{1,2}, {3,4}};

        //Rows
        System.out.println("Values of Matrix_3_2:");
        for(int i=0; i<matrix_3_2.length; i++)
        {
            //Columns in each row
            for(int j=0; j<matrix_3_2[i].length; j++)
            {
                System.out.print(matrix_3_2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Values of Matrix:");
        for(int i=0; i<matrix.length; i++)
        {
            //Columns
            for(int j=0; j<matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Values of Matrix_2_2:");
        for(int i=0; i<matrix_2_2.length; i++)
        {
            //Columns
            for(int j=0; j<matrix_2_2[i].length; j++)
            {
                System.out.print(matrix_2_2[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
