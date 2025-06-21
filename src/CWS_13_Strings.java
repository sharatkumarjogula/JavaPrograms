import java.util.Scanner;
public class CWS_13_Strings {
    public static void main(String[] args) {
        String name = new String("harry");
        System.out.println(name);
        System.out.print("my name is : ");
        System.out.println(name);
        // different ways of print statemnts
        int a=4;
        float b=0.908f;
        System.out.printf( "the value of ais %d and valur of b is %f",a,b);
        Scanner sc=new Scanner(System.in);
       // String str= sc.next();
        String str= sc.nextLine();

        System.out.println(str);
    }
}

