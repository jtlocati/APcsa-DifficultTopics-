public class APT5_4_1 {
    //Accssor methods
        //Define behavors of an object through non-void methods without parameters in a class
        //Accsessor method - allows other objectsto obtain the value of instance varibles (static variables)
            //also known as "get" or "getters"
            //Allow safe accses to instance varibles
        //must be public
        //return the same variable type as in the header
        //no parameters
                //if there is any need for a different class to accses the instance varibles, accsesor methods are needed
        //non-void methid returns a single value. its header includes a return type instead of void
private String name;
private int calories;

public  APT5_4_1(){
    name = "";
    calories = 0;
}

public APT5_4_1(String n, int cal){
    name = n;
    calories = cal;
}
public int GetCal(){     //Accessor method
    return calories;
}
public String GetName(){    //Accessor method
    return name;
}
public static void main(String[]args){
    APT5_4_1 player = new APT5_4_1("Cheetos", 120); //Assighns variables to instance var
    System.out.println(player.GetCal()+ "\n" + player.GetName());   //prints function
}

}
