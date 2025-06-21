public class CWH_ch2_operators {
    public static void main(String[]args){
        //arithmatic operator
        int a=9;
        int b=4+a;
        System.out.println(b);
        float c=5/2;//returns quotient
        System.out.println(c);
        float d=5%2;
        System.out.println(d);//returns remainder
        //assignment operator
        int e=9;
        System.out.println(e+=3);//e=e+3
        //logical operator
        System.out.println(3>5 && 4>6);
        System.out.println(3>5 && 4<6);
        System.out.println(3<5 && 4<6);// only returns true when both cond are true
        System.out.println(3>5 || 4>6);
        System.out.println(3>5 || 4<6);// returns true if any of the condition is true
        //bitwise
        System.out.println(2&3);
      //  10
      //  11 &
      //---------
      //   10 the binary value is 2 so returns 2
        System.out.println(3 |4);
//        011
//        100 |
//     ----------
//        111




    }
}
