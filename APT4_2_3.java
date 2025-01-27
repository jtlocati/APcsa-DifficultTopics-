import java.util.Scanner;
//Reverseing letters within a string
public class APT4_2_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //Scanner is not essencal.
        System.out.println("what is the word? ");
        String word = sc.next();
        String rev = "";    //rev must be empty because it is being loaded with new info from 'word'
        for (int i = 0; i < word.length(); i++){
            String letter = word.substring(i, 1+i);     //again: "(i, 1+i)" will alwayss select one char
            rev = letter+ rev;      //This is placeing each letter infront of the other
        }
        System.out.println("original: " + word);
        System.out.println("reversed: " + rev);
        sc.close();
    }
}
