public class n_queen {
    public static boolean is_Safe(char[][] board,int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static  void nqueens(char[][] board,int row){
        //base case
        if(row == board.length){
            printboard(board);
            count++;
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(is_Safe(board, row, j)){
                board[row][j]='Q';
                nqueens(board, row+1);//function call
                board[row][j]='X';//backtraking 
            }
        }
    }
    //print function 
    public static void printboard(char[][] board){
        System.out.println("---------------chess board -------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.err.println();
        }
    }
    static int count=0;

    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //intialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nqueens(board, 0);
        System.out.println("total ways "+count);
    }
}
