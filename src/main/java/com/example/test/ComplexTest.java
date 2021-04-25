package com.example.test;
/**
 * Class ComplexTest
 * <br>
 * some javaDoc description
 * <p>
 *     Test class of Class {@link com.example.test.Complex}
 * </p>
 * @see com.example.test.Complex
 */
public class ComplexTest {
    /**
     * Test Class entrance
     *      * <p>
     *      *     test method in Class Complex
     *      * </p>
     *      * Declare Complex a and b for add() and sub() testing
     *      * <br>
     *      * Declare Complex c for Constructor testing
     * @param args init parameter, unused
     */
    public static void main(String[] args){
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex c = new Complex();

        System.out.println(a.add(b));
        System.out.println(a.sub(b));
    }
}
