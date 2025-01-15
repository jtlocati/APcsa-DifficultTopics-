public class APT4_5_1 {
    // Informal Code analisis
    public static void main(String[]args){
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < 30; i++){       //non-efficant
            if (i % 2 == 0){        //Counts only even
                count++;
            }
        }
        for (int o = 0; o < 30; o+=2) {
            count2++;       ////optimal execution, removes need for "if" statment
        }  
        System.out.println(count);
        System.out.println(count2);
    }  
}
