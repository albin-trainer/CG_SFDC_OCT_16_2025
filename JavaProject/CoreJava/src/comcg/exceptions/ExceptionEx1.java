package comcg.exceptions;

public class ExceptionEx1 {
    public static void main(String[] args) {
        // String str1="9999";
        // String str2="1";
        // int x=Integer.parseInt(str1);
        // int y=Integer.parseInt(str2);
        // int sum=x+y;
        // System.out.println("sum is "+sum);
        System.out.println("Test");
        try{
        int x=10;
        int y=5;
        int result=x/(y*2-x);
        System.out.println(result);
        }
        catch(Exception e){
            System.out.println("In Catch "+e.getMessage());
        }
        System.out.println("**********END*************");
    }
}
