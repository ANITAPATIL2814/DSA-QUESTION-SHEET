public class sudoko {
    public static boolean sudokusolver(int sudoku[][],int row, int col){
        //base case
        if(row == 9 ){
            return true;
        }
        //recursion
        int nextRow=row,nextCol=col+1;//calculate nextrow
        if(col+1==9) {
            nextRow=row+1;
            nextCol=0;
        }
        //we only place element when already not exist
        if(sudoku[row][col] !=0){
            return sudokusolver(sudoku, nextRow, nextCol); //call next level becz element already present
        }
        //condition for placing element 1 to 9
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit; //place digit
                if(sudokusolver(sudoku, nextRow, nextCol)){ //it it return true then solution exist
                    return true;
                }
                sudoku[row][col]=0; //not place here element
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        //column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        //grid =3*3
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int i=startRow;i<startRow+3;i++){//traverse row wise
            for(int j=startCol;j<startCol+3;j++){//traverse col wise
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printsudoko(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={
        {0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3},
    };
    if(sudokusolver(sudoku, 0, 0)){
        System.out.println("solution exist");
        printsudoko(sudoku);
    }
    else{
        System.out.println("solution does not exist");
    }
}
}
