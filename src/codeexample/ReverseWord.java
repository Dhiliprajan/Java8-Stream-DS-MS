package codeexample;

// Reverse word in a string
// Iam a java developer
// developer java a Iam
public class ReverseWord {
    public static void main(String[] args) {
        String s = "Iam a java developer";
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
        sb.reverse();
        System.out.println(sb.toString());

    }
}
