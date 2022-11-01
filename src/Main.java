import java.util.Scanner;

public class Main{
    static int decreasing(int n) {
        if(n>0){
            System.out.print(n+",");
            return decreasing(n-5);
        }
        return n;
    }
    static void increasing(int x,int n) {
        if(x<=n){
            System.out.print(x+",");
            increasing(x+5,n);
        }
    }
    public static void main (String[] args){
        int i=1;
        Scanner input= new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz: ");
        int n= input.nextInt();
        increasing(decreasing(n),n);
    }
}
