package com.joysistvi.day18.methodsday2;

public class Scope {

    static String name = "Ash"; // Static that outside th method / Class variable
    int age = 18; // wala sa loob ng method, walang static word - instance variable

    public static void main(String[] args) {
        int num =0; // Local Variable

        Scope obj = new Scope ();
        System.out.println(obj);
        System.out.println(name);
    }
    public static void scope() {
        // block scope

        while (true) {
            int count = 0;
        }
    }

    // static method
    //access modifier - nonaccess modifier
    public static int sum (int a, int b){
        return a + b;
    }

    // instance method
  /*  public int product (int a, int b ) {
        return a + b;
        System.out.println(num );
        a();

    }

   */




    static int num =0;

    public static void a(){
    }

    public static void b() {
        Scope obj = new Scope();
        System.out.println(num);
        obj.a();
    }



    //Easy memory trick
    /*
    Static to static - direct
    static to instance - direct
    instance to static - instantiate
    instance to instance - direct
     */

    // static - belongs to the class
    // instance - belongs to instance/object

}




// Block Scope - because of curly brackets
       /* while (true) {
            int count = 0;
        }

        */
/*
 public static void greet (){
        System.out.println(num);
    }
 */