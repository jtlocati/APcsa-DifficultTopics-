public class APT5_2_2 {
    //Constructors
        //Define instance varibles for the atrobutes to be initalized through the constuctors of a class
        // if a constructor is not given parameters or a constructor, java will provide a default constructr(could possibly throuw null pointer exseptions, so be carefull when decideing when or when not to incude a constructor)
    private String name;
    private int numplayers;

    public APT5_2_2(){  //Defaoult constructor
        name = "";
        numplayers = 0;
    }
    public APT5_2_2(String n, int num){ //Overflow1
        name = n;
        numplayers = num;
    }
    public APT5_2_2(String n){  //Overflow2
        //when createing a constructor with a lesser # var than the top case, it must contain default cases of the others included (line 18 in this case)
        name = n;
        numplayers = 0;

    }
    public static void main(String [] args){
        APT5_2_2 playerOne = new APT5_2_2(); // calls Default constructor
        APT5_2_2 playerTwo = new APT5_2_2("Water polo", 14); //calls Overflow1
        APT5_2_2 playerThree = new APT5_2_2("Football"); //calls  
    }
    
}
