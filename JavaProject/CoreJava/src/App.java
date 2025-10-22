public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Good morning");
        System.out.println("hello");

        byte rollNo=-128; //range -128 to 127
        System.out.println("roll is  "+rollNo);
       final int x=127; //4 bytes 
        byte x2=x; //1 byte
        System.out.println(x2);
        byte b1=10,b2=50,b3;
        b3=    (byte) (b1+b2);
        System.out.println("Sum  is "+b3);
        float price=100;
        System.out.println(price); //100.0
        float fare=100.0f; //f of F
        System.out.println(fare);
        boolean s=true;
        char ch='A';
        System.out.println(s);
        System.out.println(ch);
    }
}
