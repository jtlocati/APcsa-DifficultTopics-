//introduction to mutator methods
/*mutator methods
 * Allow for the cange of values for instance variables outside of the class
 * somtimes called a "set" or "setter" methods
 * must be public
 * retuns void
 * parameter type must match the type of the instance variable
 */
public class APT5_5_1 {
    private String name;
private int calories;

public  APT5_5_1(){
    name = "";
    calories = 0;
}

public APT5_5_1(String n, int cal){
    name = n;
    calories = cal;
}
public int GetCal(){     //Accessor method
    return calories;
}
public String GetName(){    //Accessor method
    return name;
}
public void setname(String n){ //mutator method
    name = n;
}
public void setcalories(int c){ //mutator method
    calories = c;
}
public static void main(String[]args){
    APT5_4_1 player = new APT5_4_1("Cheetos", 120); //Assighns variables to instance var
    System.out.println(player.GetCal()+ "\n" + player.GetName());   //prints function
    
}
}