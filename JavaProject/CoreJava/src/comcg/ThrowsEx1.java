package comcg;
public class ThrowsEx1 {
    public static void main(String[] args) {
        try {
            f1(100);
        } catch (Exception e) {
            System.out.println("In catch ....");
            e.printStackTrace();
        }
    }
    static void f1(int x) throws Exception{
        f2(x);
    }
    //throw -> to throw a exception explicitly
    //throws -> to delegates the exception to caller method
    static void f2(int x) throws Exception  {
        if(x<=100){
            throw new Exception();
        }
        System.out.println("Valid number");
    }
}
