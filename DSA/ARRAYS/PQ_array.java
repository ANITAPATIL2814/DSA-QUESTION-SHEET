package DSA.ARRAYS;

public class PQ_array {
    public static void main(String[] args) {
        int row=2,column=3;
        int matrix[][]={{1,2,3},{4,5,5}};
        //display original matrix
        print_matrix(matrix);
        //transpose the matrix
        int transpose[][]=new int[column][row];
        for(int i=0; i < row; i++){
            for(int j=0; j < column; j++){
                transpose[j][i]=matrix[i][j];
            }
        }    
        //print transpose of matrix
        print_matrix(transpose);
    }  
    public static void print_matrix(int matrix[][]){
        System.out.println("the matrix is :");
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    } 
}

   
        /*
         * //Q2 Print out the sum of the numbers inthe second row of the “nums” array.
        int num[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=0;i<num[0].length;i++){
            sum+=num[1][i];

        }
        System.out.println(sum);
         */
        /*
         * //Print the number of 7’s that are inthe 2d array
         int[][] array = { {4,7,8},{8,8,7} };
         int count=0;
         for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == 7){
                    count++;
                }
            }
            
         }
         System.out.println(count);
         */
        