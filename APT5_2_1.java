import java.util.Scanner;
public class APT5_2_1 {
        //Constructors
            //has-a relationship
                //each instance of a class (object) "has a " private instance variable.
                    //ie: a snack (object) "has a" name and anumber of calories 
        private String title;
        private int Calories; 
    
    public APT5_2_1(){  //Default constructors
        title = "";
        Calories = 0;
    }
    public APT5_2_1(String a, int b){   //overloaded constructor
        title = a;
        Calories = b;
    }
    public static void main(String [] args){
    }
}