public class Main {
    public static void main(String[] args) {
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; //Automatic casting: int to double
        // Narrow casting
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble; // Manual casting: Double to int

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myInt1);
        System.out.println(myDouble1);
    }
}


