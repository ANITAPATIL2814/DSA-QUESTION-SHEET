package DSA.OOPS;

public class interface1 {
    public static void main(String[] args) {
        Queen q=new  Queen();
        q.moves();
        King k=new  King();
        k.moves();
    }
}
interface  chessPlayer {
    void moves();
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down");
    }
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("right,left");
    }
}

