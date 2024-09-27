import java.util.Scanner;

public class Maxvalueofbyte {
    public static void main(String[] args) {
        byte number ;
        Scanner input = new Scanner(System.in);
        number = input.nextByte();
       // if(  number>=-128 && number<=127)
        System.out.println("value of number:"+number);
        System.out.println("largest value stored in signed byte");
    }
}
