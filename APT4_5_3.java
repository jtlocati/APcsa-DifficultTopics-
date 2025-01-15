import java.util.Scanner;
public class APT4_5_3 {
    //sytatment execution count + Nested Itteration
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("what loop would you like to run?\nouter seperate from inner loop(1)\nouter loop dependant on inner loop(2)");
                int confirm = sc.nextInt();
        int check = 0;
        int count = 0;
        if (confirm < 2){
        for (int i = 0; i < 3; i++){
            count++;
            System.out.println("outter loop iterates " + count + " times");
            System.out.println("inner loop itereates " + count + " times");
            for (int c = 0; c < 0; c++){
                check++;
                System.out.println("inner statment runs " + check + " times");
                }
            }
            int full = (check + count);
            System.out.println("total itterations: " + full);
        }  
        else{
            for(int i = 5; i > 0; i++){
            check++;
            System.out.println("outer has iterated "+ check + " times");
                for (int c = 0; c < i; c++){
                    count++;
                    System.out.println("inner has iterated " + count + " times");
                }
            }
            int full = (check + count);
            System.out.println("total itterations: " + full);
        } 
        sc.close();
    }
}
