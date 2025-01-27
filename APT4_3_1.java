public class APT4_3_1 {
    //Nested Iteration Practice
    //NOTE the "AP daily" video shows a simple nested iteration practice of just counting to 2, showing a makeshift stopwatch demostrates a nested loop in a better way 
    public static void main(String [] args){
        for (int i = 0; i <= 2; i++){
            System.out.println(i);      //i starts as 0, making the bool false and moving into the second loop
            for (int o = 0; o < 60; o++){
                System.out.println(i+" : "+o);    //once 'o' = 60 we exit the loop moving back to the 'i'(i++) and the code moves back down to the 'o' loop essencally reseting 'o'
            }
        }
    }
    
}
