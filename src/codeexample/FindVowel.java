package codeexample;

public class FindVowel {
    public static void main(String[] args) {
        String str = "iLoveyOu";
        int count = 0;
        for(int i=0; i< str.length();i++)
        {
            char ch = str.charAt(i);
            if(isVowel(ch)){
               // System.out.println(ch+" ");
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
