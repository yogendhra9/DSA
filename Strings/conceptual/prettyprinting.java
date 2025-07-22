package Strings.conceptual;

import java.util.ArrayList;
import java.util.HashMap;

public class prettyprinting {
    public static void main(String[] args) {
        float a = 3.12345432f;
        System.out.printf("formatted number is %.3f",a);
        System.out.println(" ");
        System.out.printf("Pie : %f",Math.PI);

        System.out.println("a"+1);
        //This prints  a1 how this happens under the hood?
        //1 is passed into toString method as an object and that further will be converted from integer to Integer(Wrapper class) and then
        //this class calls the toString method and passes this value as on object...

        System.out.println("a"+new ArrayList<>());
        //System.out.println(new ArrayList<>() + new HashMap<>()); //This line always gives error because
        //concatenation operator only works for primitives and


    }
}
