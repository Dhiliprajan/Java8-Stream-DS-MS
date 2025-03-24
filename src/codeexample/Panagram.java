package codeexample;

public class Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        if(findPanagram(s)){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not a panagram");
        }
    }

    private static boolean findPanagram(String s) {
        s = s.toLowerCase();
        boolean[] found = new boolean[26];
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                found[ch - 'a'] = true;
            }
        }
        for(boolean letterFound : found){
            if(!letterFound){
                return false;
            }
        }
        return true;
    }
}
