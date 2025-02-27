public class APT5_4_2 {
    //Accsesor methods
        //toString Method - a method that is an overriddeen method that is included in classes to provide a description of a specific object. includes what value is stored in a the instace variable
        //if a System.Out.Print is passes an object, its toString method is called and return String is printed
    private String SportName;
    private int NumAtheltes;
    public APT5_4_2(String n, int ply){
        SportName = n;
        NumAtheltes = ply;
    }
    public String GetName(){
        return SportName;
    }
    public int GetNumAth(){
        return NumAtheltes;
    }
    public String toString(){
        return("name: " + SportName + "\nnumber of athelates: " + NumAtheltes);
    }
    public static void main(String [] argds){
    APT5_4_2 player = new APT5_4_2("football", 11);
    System.out.println(player);
            //  without to String would print the paramter that holds "football" (SportName), along with a Hexidecemal value simmalar to what you would see when printing a pointer
    
    }
}
