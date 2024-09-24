// sum of even num
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ar[]=new int[N];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        sumofevennum(ar);
}
    public static void sumofevennum(int[] ar){
        int sum = 0;
        for(int i=0;i<ar.length;i++){
         if(ar[i]%2==0){
             sum = sum + ar[i];
         }
        }
        System.out.println(sum);
    }
    }
