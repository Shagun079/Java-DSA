import java.util.Scanner;
public class fibonacciseries {
    public static  void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        System.out.println ("enter number till you want to find the fibonacci");
        int num= sc.nextInt ();
        int a =0;
        System.out.println (a);
        int b=1;
        System.out.println (b);
        for(int i=0;i<num;i++){
            int temp=a+b;
            System.out.println (temp);
            a=b;
            b=temp;
        }

    }

}
