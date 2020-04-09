import java.util.Scanner;

public class IllegalException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input side 1 : ");
        float side1 = scn.nextFloat();
        System.out.print("Input side 1 : ");
        float side2 = scn.nextFloat();
        System.out.print("Input side 1 : ");
        float side3 = scn.nextFloat();
        try {
            checkTriangle(side1, side2, side3);
            System.out.println("Its a triangle!");
        } catch (Exception e) {
            System.out.println("Wrong input " + e.getMessage());
//            System.out.println("Wrong input " + e.getLocalizedMessage());
//            System.out.println("Wrong input " + e.getCause());
//            System.out.println("Wrong input " + e.getStackTrace());
//            System.out.println("Wrong input " + e.getSuppressed());
//            System.out.println("Wrong input " + e.getClass());

        }


    }

    static void checkTriangle(float side1, float side2, float side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0
                || (side1 + side2 < side3) || (side1 + side3 < side2) || (side2 + side3 < side1)
        ) throw new IllegalTriangleException(" valid ");
    }
    static class IllegalTriangleException  extends Exception {
        IllegalTriangleException (String s) {
            super(s);
        }
    }
}
