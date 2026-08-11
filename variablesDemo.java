public class variablesDemo{
    int instanceVar = 10;
    static String staticVar ="i am static";
    public void showvariables()
    {
        int localVar =5;
        System.out.println("instance variable:" + instanceVar);
        System.out.println("static variable:" + staticVar);
        System.out.println("local variable:" + localVar);
    }
    public static void main(String[]args)
    {
        variablesDemo obj1 = new variablesDemo();
        obj1.showvariables();
        System.out.println(
            "Accessing static variable via class:"
            +variablesDemo.staticVar);
    
    }
}