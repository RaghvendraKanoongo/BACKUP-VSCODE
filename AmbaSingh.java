// package com.AmbaSingh;
public class AmbaSingh {
    static {
        x = 98;
    }
    static int x = 99;

    public static void main(String[] args) {

        System.out.println("hola");


    }
    
    public static void solve(){
        System.out.println("inside static solve");
    }
    
}
/**
 * InnerAmbaSingh
 */
 class InnerAmbaSingh extends AmbaSingh {

    public static void main(String[] arr){
        System.out.println("inside Inner's main");
    }
}
