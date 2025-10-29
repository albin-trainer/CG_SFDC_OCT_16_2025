package comcg.exceptions;

public class FinallyDemo1 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=new int[5];
        try{
            System.out.println("In try");
            if(arr1[1]>arr2[1]){
                System.out.println(arr1[5]);
            }
            else
            return;
        }
        finally{
            System.out.println("In finally");
        }
        System.out.println("*****END *****");
    }
}
