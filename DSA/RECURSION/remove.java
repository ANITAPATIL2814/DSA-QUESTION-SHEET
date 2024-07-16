package DSA.RECURSION;

public class remove {
    public static void removeele(String str, int idx, StringBuilder newstr, boolean map[]){
        //base class
        if(idx == str.length()){
            System.out.println(newstr);
        }
        //kaam
        char currchar= str.charAt(idx);
        if(map[currchar-'a'] == true){
            //duplicate
            removeele(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a'] = true;
            removeele(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        removeele(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
