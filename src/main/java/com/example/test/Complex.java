package com.example.test;
/**
 * This is an example of JavaDoc.
 * Class Complex
 * <p>Nothing special.<br>Just a simple Complex unit.</p>
 * You can use <strong>STRONG</strong> if you need to.
 * <h2>Big Title</h2>
 * <h3>Title</h3>
 * There is actually a lot of html tags you can use.
 *
 * @author Mario
 * @version 1.0.1
 */
public class Complex {
    /**
     * real part of Complex
     */
    private final int real;
    /**
     * imaginary part of Complex
     */
    private final int imaginary;

    /**
     * Initialize Complex with input values
     * @param real real part of Complex
     * @param imaginary imaginary part of Complex
     */
    public Complex(int real, int imaginary){
        // noice
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Initialize with 0
     */
    public Complex(){
        this(0, 0);
    }

    /**
     * Print message to say hello
     */
    public void greetings(){
        System.out.println("Hello there");
    }

    /**
     * Add two Complex and return a new Complex object
     * @param target another Complex you want to add
     * @return new Complex object with result
     */
    public Complex add(Complex target){
        return new Complex(this.real + target.real, this.imaginary + target.imaginary);
    }

    /**
     * Sub two Complex and return a new Complex object
     * @param target another Complex you want to sub
     * @return new Complex object with result
     */
    public Complex sub(Complex target){
        return new Complex(this.real - target.real, this.imaginary - target.imaginary);
    }

    /**
     * Override toString method
     * @return print Complex object like this: (0, 0)
     */
    public String toString(){
        return String.format("(%2d, %2d)", real, imaginary);
    }
}
