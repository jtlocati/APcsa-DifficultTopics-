import java.util.Scanner;
public class APT4_3_2{
    // Nested Iteration practice (worm)
    //more of the same from topic 4.3 video #1 this is just a bit more advaced and including a scanner  
    //topic 4.3 video #3 is not included due to it adding nothing new.

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the length? ");
            int dec = sc.nextInt();
        System.out.println("how thick? ");
            int wit = sc.nextInt();
    for (int big = 0; big < dec; big++ ){
        for(int i = wit; i >= 0; i--){
            for(int o = 0; o <= i; o++){
                System.out.print("*");
            }
            if (i == 0) {
                break;
            }
            else{
            System.out.println("");}
        }
        for (int a = 0; a <= wit; a++){
            for (int b = 0; b < a; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    sc.close();
    }

}