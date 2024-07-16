public class subset {
    public static void substring(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() ==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);

            }
            return;
        }
        //recursion step
        //yes choice
        substring(str, ans+str.charAt(i), i+1); //i th index char add in our string 
        //no choice
        substring(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        substring(str, "", 0);
        
    }
}
    