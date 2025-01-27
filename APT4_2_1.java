import java.util.Scanner;
// Finding a substring within a string
public class APT4_2_1 {
    public static void main(String[] args){
        // For this exsample word = sunflower. sub = low
    Scanner sc = new Scanner(System.in);   //initalizeing scanner (optonal)
        System.out.println("what is the word?" );
              String word = sc.next();
        System.out.println("what is the sub");
               String sub = sc.next();
        boolean IsFound = false;            //This bool checks if the substring is found (line 13) and returns the input on line 18
    for (int i = 0; i <= word.length(); i++){
        String letter = word.substring(i, i + sub.length());            // i, says that we start at point i (0 origonaly). sub.length is saying that our substring is spanning sub.length (3 char's). while i makes sure that our sub.length keps moving down the substring
            if (letter.equals(sub)){            //checks that sub == letter
                IsFound = true;             //changes bool to true if found
                break;          //this makes the "<=" sighn on line 12 non-essencal bud does no thurt if it is inculded
                } 
        }
        if (IsFound){           // if true print
            System.out.println("substring found");
        }
        else{           //if not true print
            System.out.println("substring not included");
        }
        sc.close();
    }
}