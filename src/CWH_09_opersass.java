public class CWH_09_opersass {
    public static void main (String args[]){
      //  int a=6*5-34/2;
      //  System.out.println(a);
        /*
        highest precedece goes to * and / they are then evaluated on the basid of l to r associativity

       = 30-34/2
       = 30-17
       = 13
        */
      //  int b=60/5-34*2;
          /*
        highest precedece goes to * and / they are then evaluated on the basid of l to r associativity

       = 12-34*2
       = 12-68
       = -52
        */

     //   System.out.println(b); */

        //quick quiz
        int x=5;
        int y=1;
        int k=x-y/2;
        System.out.println(k);
        int j=(x-y)/2;
        System.out.println(j);
        // b2-4ac
        int a=1;
        int b=2;
        int c=3;
        int d=(b*b-4*a*c)/(2*a);
        System.out.println(d);


    }
}
