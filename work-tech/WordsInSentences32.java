import java.util.Scanner;

public class WordsInSentences32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Count = ");
        int count = sc.nextInt();
        sc.nextLine();
        

        for(int i = 0; i<count; i++){
            int word = 0;
            System.out.print("Enter Your sentence = ");
            String sentence = sc.nextLine();
            // System.out.println(sentence.split(" ").length);
            for(int j=0; j<=sentence.length(); j++) {
                if(sentence.charAt(j) == ' ') word++;
            }
            System.out.println(word + 1);
        }
        
    }
    
}
