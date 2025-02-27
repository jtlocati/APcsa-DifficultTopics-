public class Tester2 {
    public String Type;
    public int Milkings;
    public String cownoise;

    public void cow(String Typee, String s){
        Type = Typee;
        cownoise = s;
        Milkings = 0;
    }

    private void GetNoise(String n){
        n = cownoise;
    }
    private void GetNumMilk(){
        Milkings++;
    }
    private void GetType(String Ty){
        Ty = Type;
    }
    public static void main(String[]arsg){
        Tester2 player = new Tester2();
        player.GetNoise("moo");
        player.GetType("holsrein");
        for(int i = 0; i < 3; i++){
            System.out.println("moo");
        }
    }
}
