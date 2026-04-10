public class InchToCm {
    public static void main(String[] args) {
        double inch = 10.0; 
        double cm = inchToCm(inch);
        System.out.println(inch + " inches is equal to " + cm + " centimeters.");
    }

    public static double inchToCm(double inch) {
        return inch * 2.54; 
    }
    
}
