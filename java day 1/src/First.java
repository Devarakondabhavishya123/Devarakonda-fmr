import java.util.Scanner;
//average
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ar[]=new int[N];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        averagearray(ar);
    }
    public static void averagearray(int[] ar){
        float sum = 0;
        for(int i=0;i<ar.length;i++){
            sum = sum + ar[i];
        }
        System.out.println(sum/ar.length);
    }
}
