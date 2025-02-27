public class APT5_1_1{      //APT5_5_1 is a declreing class
    // Anatomy of a class
    //Diifferenc of public and private
            //PRIVATE restricts restrics accsess to the declareing class
            //PUBLIC allows accses from classes outside the declareing class
            //in APcsa classes will always be PUBLIC, while instace varible will be PRIVATE
                        // ignore Syantax errors above main class, there is no output. this is just used to understand the anatomy of a class
    private String name;        // private instance constructor
    private int calories;       // private instabce constructor

    public void Snack(){     // default constructor (no parameters)
        name = "";
        calories = 0;
    }
    public void Snack(String n, int c) {        //Overloaded constructor (uses parameters to set instance variables)
        name = n;
        calories = c;
    }
    public String getName () {      //accsesor methods (gives acses to private variables)
        return name;
    }
    public int getCalories () {     //accsesor methods (gives acses to private variables)
        return calories;
    }
    public void setName (String n){     //mutator methods (allows to modify or cange values of instance variables)
        name = n;
    }
    public void setCalories (int c){        //mutator methods (allows to modify or cange values of instance variables)
        calories =c;
    }

 public static void main (String [] args){
    //what would provide Syantax errors
    APT5_1_3 choseOne = new APT5_1_3("cookies", 100); //no Syantax erroe (public)
    APT5_1_3 choseTwo = new APT5_1_3(); //no Syantax error (public => default constructor)
    System.out.println(choseOne.getName);   // reaches eccsesor method (public)
    System.out.println(choseOne.getcalories);   //no syantax erroe (public)
    choseTwo.setName("chips");  // No Syantax errors accseps string parameter n
    choseTwo.calories =150; //Syantax errors instance varible (private) 
    System.out.println(choseTwo.caneat);    // Syantax arreo caneat (private)
    }
}