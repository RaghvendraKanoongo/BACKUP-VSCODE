class Parent {
    public void mehtodOne(){
        System.out.println("A");
    }
}
class hola extends Parent{
    public void methodOne(){
        System.out.println("B");

    }
    public void methodTwo(){
        System.out.println("C");
    }
    public static void main(String[] args){
        hola c = new hola();
        c.methodOne();
        c.methodTwo();
        ((Parent)c).mehtodOne();
    }
}