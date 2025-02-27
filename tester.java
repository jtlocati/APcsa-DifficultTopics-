public class tester{
    private String name;
    private String TypeOfPet;
    private int age;

    public void getname(String n){
        name = n;
    } public void getType(String T){
        TypeOfPet = T;
    }
    public void getAge(int A){
        age =A;
    }
    public static void main(String[]args){
    // mutator methods on Skibitty...
     tester player = new tester();
     player.getname("jake");
     player.getType("Springer");
     player.getAge(7);   
        }
}

