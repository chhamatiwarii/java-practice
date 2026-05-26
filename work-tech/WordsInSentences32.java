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
            String[] senArray = new String[sentence.length()];
            for(int j = 0; j<senArray.length; j++){
                word =+ j;
            }
            System.out.println(word);
        }
        
    }
    
}
