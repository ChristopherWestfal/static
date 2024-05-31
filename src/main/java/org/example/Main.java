package org.example;

public class Main {
    public static void main(String[] args) {
        StaticXmpl xmpl1 = new StaticXmpl();
        StaticXmpl xmpl2 = new StaticXmpl();
        StaticXmpl xmpl3 = new StaticXmpl();
        StaticXmpl xmpl4 = new StaticXmpl();

        xmpl1.incrementInstanceCount();
        StaticXmpl.incrementTotalCount();
        System.out.println(xmpl1.toString());

        xmpl2.incrementInstanceCount();
        StaticXmpl.incrementTotalCount();
        System.out.println(xmpl2.toString());

        xmpl3.incrementInstanceCount();
        StaticXmpl.incrementTotalCount();
        System.out.println(xmpl3.toString());

        xmpl4.incrementInstanceCount();
        StaticXmpl.incrementTotalCount();
        System.out.println(xmpl4.toString());

        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.subtract(2,3));
        System.out.println(Calculator.multiply(2,3));
        System.out.println(Calculator.divide(6,3));
    }
}