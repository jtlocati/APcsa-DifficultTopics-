import java.util.Scanner;
//Finding a vowel within a string
public class APT4_2_2 {
    public static void main(String [] args){
            Scanner sc = new Scanner(System.in); //initalizeing a scanner (optonal)
        System.out.println("what is the word?");
            String word = sc.next();
        int count = 0;      //keeps track of # of vowels
        for(int i = 0; i < word.length(); i++ ){        //i must be: i < word.lenght() because if not it will trigger an overflow Acception
            String letter = word.substring(i, 1+i);     //1+i is making sure the letter is always one away from the previous starting point (i)
            if(letter.equals("a") ||letter.equals("e") ||letter.equals("i") ||letter.equals("o") ||letter.equals("u")){     //checks if letter == vowels, add one to count if true
                count++;
            }
        }
        System.out.println("this word contains: " + count + " vowels!");
        sc.close();
    }
}
