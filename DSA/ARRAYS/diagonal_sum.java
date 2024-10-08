package DSA.ARRAYS;

public class diagonal_sum {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        /* TC:O(n^2)
         * for(int i=0; i<matrix.length ;i++){
            for(int j=0; j<matrix[0].length; j++){
                //primary digonal
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){ //secondary diagonal
                    sum += matrix[i][j];   
                }
            }
        }
        return sum;
         */
        //optimized solution : TC:O(n)
        for(int i=0; i<matrix.length ;i++){
            //primary digonal


            sum += matrix[i][i]; 
            //secondary diagonal
            if(i!= matrix.length-1-i)
            sum += matrix[i][matrix.length-1-i];  
        }
        return sum;
        
       
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(diagonalSum(matrix));
        }
}
