package com.generation;

public class Main {

    public static void main(String[] args) {

        //declarar string
        String name = "Diego Ortega";

        // declarar variables numericas
        // (datos primitivos númericos)

        //byte num1 = 10;
        //short num2 = 10;
        int num3 = 10;
        //long num4 = 10;
        // notece la f/d al final del num (datos primitivos decimales)
        //float num5 = 10.5f;
        //double num6 = 10.123456789d;

        // datos primitivos caracter
        //char char1 = 'z';

        // dato primitivo boolean
        //boolean answer = true;

        //conversion jerarquica
        //short num7 = num1;
        //int num8 = num7;
        // conversion antijerarquica
        short num9 = (short) num3;

        byte num10 = 100;
        byte num11 = 110;
        short num12 = (short) (num10 + num11);

        //operadores aritmeticas en java
        // + suma
        // - resta
        // * multiplicación
        // / dividción
        // % residuo
        int numA = 7;
        byte numB = 3;
        byte sum = (byte)(numA + numB);
        byte rest = (byte)(numA - numB);
        byte mult = (byte)(numA * numB);
        float div = (float) numA / numB;
        float res = (float) numA % numB;

        System.out.println(sum);
        System.out.println(rest);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(res);

        System.out.println(name);
        //System.out.println(num7);
        System.out.println(num9);
        System.out.println(num12);

    }
}
