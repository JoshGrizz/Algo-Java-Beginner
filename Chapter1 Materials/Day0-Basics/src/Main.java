import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    //FIXME: methods are defined before the main (for part 8)
    public static void Foo1(){ // FIXME: return type is void
        System.out.println("This is a method.");
    }

    public static double Foo2(double a){ // FIXME: return type is double
        return Math.pow(a, 2.0);
    }

    public static void main(String[] args) {
        /**
         * 1.
         * Some basic outputs using the keyword "sout"
         */
        System.out.println("Hello world!");

        /**
         * 2.
         * Basic knowledge about data types
         * 这里只讨论数值type，之后reference type
         */
        int a = 6;
        double b = 10;
        int c = 10;
        System.out.println(a+b); // This is gives valid output, but the output is type double
        System.out.println(b/a); // This is gives valid output, but the output is type double
        System.out.println(c/a);
        // This is gives valid output, but the output is type int: note the division between two ints gives int

        // Type casting: 数据类型的硬转换
        double d = c;
        System.out.println(d/a);

        /**
         * 3. Scanner: 关于输入 (System.in)
         * 注意输入流可以不限于System.in, 其他形式的输入也可以，比如txt file
         */

        // FIXME: 基本syntax
        Scanner scnr = new Scanner(System.in); //FIXME: 本质上是创建了一个新的（new）object
        int a1;
        double a2;
        System.out.println("Please input integer value to a1: ");
        a1 = scnr.nextInt(); //FIXME: 输入一个整数来给a1赋值
        System.out.println("Please input double value to a2: ");
        a2 = scnr.nextDouble(); //FIXME: 输入一个double给a2赋值
        System.out.println("a1 is: " + a1 + ", a2 is: " + a2);

        /**
         * 4. 随机数， seeding
         * seed的作用：generate相同元素
         */

        Random rand_generator = new Random();
        rand_generator.setSeed(0);
        int a3;
        int a4;
        a3 = rand_generator.nextInt(10) + 1; //from 1 to 10
        a4 = rand_generator.nextInt(10) + 1;
        System.out.println("Value of a3 = " + a3 + ", Value of a4 = " + a4);

        /**
         * 5. logical operators，if/else if/else, switch
         * 使用switch是新手变成正常程序员的必经之路
         */

        char a5 = 'a';

        // FIXME: using if/else if/else at first
        // FIXME: 多个if可以执行多个分支， if/else if只执行一个分支

        // FIXME： example 1： if/else if
        if (a5 == 'a') { //FIXME: java的逻辑判定要写在括号里面
            System.out.println("Yes, equal");
        }

        else if (a5 != 'b') {
            System.out.println("This should bot be printed.");
        }

        else {
            System.out.println("This should not be printed either.");
        }

        //FIXME: example2: 关于多个并列的if statement

        char a6 = 'a';
        if (a6 != 'b') {
            System.out.println("It is not b.");
        }

        if (a6 != 'c') {
            System.out.println("It is not c.");
        }

        //FIXME: example3: how to use switch

        int a7 = 5;
        switch (a7) {
            case 6:
                System.out.println("It is 6.");
                break;

            case 7:
                System.out.println("It is 7.");
                break;

            default:
                System.out.println("It might be 5.");
        }

        /**
         * 6: Loops
         */

        // FIXME: example1: while loop

        char a8 = 'a';
        int a9 = 0;
        while (a8 < 'e'){ // Fixme: note that char is also measurable in distance
            a8++;
            a9++;
        }
        System.out.println("The distance from a8 to e is: " + a9);

        // FIXME: example2: for loop
        int a10 = 1;
        for (int i = 1; i <= 5; i++){
            a10 *= i;
        }
        System.out.println("The result is: " + a10);

        /**
         * 7. Array, vector) and Arraylist
         */

        // FIXME: example1: array, index starting from 0
        // FIXME: One important feature of array: it is not resizable
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++){
            arr1[i] = i;
        }
        System.out.println(arr1[arr1.length-1]);

        // FIXME: example2: vector, note that it could not have primitive types
        // FIXME: which is to say: int -> Integer, double -> Double
        Vector<Double> v = new Vector<Double>();
        v.add(1.0);
        v.add(2.1);
        System.out.println("The vector is: " + v); //FIXME: 可以直接输出整个vector
        v.addElement(5.567);
        System.out.println("The element is: " + v.get(2)); //FIXME: get method

        // FIXME: example3: Arraylist
        // FIXME: 注意Arraylist没有固定的size
        ArrayList<Integer> a11 = new ArrayList<>();
        a11.add(1);
        a11.add(2);
        a11.add(1,10);
        System.out.println("The Arraylist is: " + a11);

        /**
         * 8. Methods (functions)
         */

        // FIXME: method在main前定义

        Foo1();
        System.out.println(Foo2(2.5));

        /**
         * 9: Some basics about reference types and pointers: will be covered in OOP
         */
    }
}
