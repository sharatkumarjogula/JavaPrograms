import java.util.Scanner;
public class CWS_06_exercise_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("percentage of the candidate marks");
        System.out.print("enter the marks of s1: ");
        float s1=  sc.nextFloat();
        System.out.print("total marks of s1: ");
        float ts1=sc.nextFloat();

        System.out.print("enter the marks of s2: ");
        float s2= sc.nextFloat();
        System.out.print("total marks of s2: ");
        float ts2=sc.nextFloat();

        System.out.print("enter the marks of s3: ");
        float s3= sc.nextFloat();
        System.out.print("total marks of s3: ");
        float ts3=sc.nextFloat();

        System.out.print("enter the marks of s4: ");
        float s4= sc.nextFloat();
        System.out.print("total marks of s4: ");
        float ts4=sc.nextFloat();

        System.out.print("enter the marks of s5: ");
        float s5= sc.nextFloat();
        System.out.print("total marks of s5: ");
        float ts5=sc.nextFloat();

        float sum_marks=s1+s2+s3+s4+s5;
        System.out.println(sum_marks);
        float tsum_marks=ts1+ts2+ts3+ts4+ts5;
        System.out.println(tsum_marks);


        float per=(sum_marks/tsum_marks)*100;
        System.out.println(per);




    }
}
