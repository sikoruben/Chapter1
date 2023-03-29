import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class Main {
 private static int $;
 public static void main(String[] main) {
     //1
         String a_b;
         System.out.print("1:" + $ + "\n");
       //  System.out.print(a_b); --> itt a hiba
     //2
     String s1 = "Java";
     String s2 = "Java";
     StringBuilder sb1 = new StringBuilder();
     sb1.append("Ja").append("va");
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(sb1);
     System.out.println(s1 == s2);
     System.out.println(s1.equals(s2));
     System.out.println(sb1.toString() == s1); //== nagyon primitiv tipusu muvelet
     System.out.println(sb1.toString().equals(s1));//equals() fejlettebb tipusu muvelet
     //12 true helyes valasz 124 true

     /*

     //3
     interface HasTail { int getTailLength(); }
        abstract class Puma implements HasTail {
   protected int getTailLength() {return 4;} //itt a hiba a kodban
   }
        public class Cougar extends Puma {

                Puma puma = new Puma();
                System.out.println(puma.getTailLength());
                */
     //4

     boolean keepGoing = true;
     int count = 0;
     int x = 3;
     while(count++ < 3) {
            int y = (1 + 2 * count) % 3;
                switch(y) {
                            default:
                            case 0: x -= 1; break;
                            case 1: x += 5;
                }
     }
     System.out.println(x);
     //minden ok

     //5

     System.out.print("a");
      try {
          System.out.print("b");
          throw new IllegalArgumentException();
          } catch (RuntimeException e) {
          System.out.print("c");
          } finally {
          System.out.print("d");
          }
      System.out.print("e");
      //abcde valasz: abcde
     //6
     /*public class MathFunctions {
   public static void addToInt(int x, int amountToAdd) {
              x = x + amountToAdd;
              }
              int a = 15;
              int b = 10;
              MathFunctions.addToInt(a, b);
              System.out.println(a); } }*/
     //7
     int[] array = {6,9,8};
     List<Integer> list = new ArrayList<>();
     list.add(array[0]);
     list.add(array[2]);
     list.set(1, array[1]);
     list.remove(0);
     System.out.println(list);
     //9 es lessz kiirva
     //8
     Deer deer = new Reindeer(5);
     System.out.println(","+ ((Reindeer) deer).hasHorns());
     //B a helyes valasz
     //10
     /*Grasshopper one = new Grasshopper("g1");
      Grasshopper two = new Grasshopper("g2");
      one = two;
      two = null;
      one = null;

    private String name;*/
     //does not compile
     //11
     //12
     //13
     //14
     //15 A
     //16 DFG
     //17 AF
     //18 B


     System.out.println("Valid erteke: "+ valid());
     findAnswer(false);
 }

    public static int valid() {
        double y = 10.1;
        double x; // x is declared here
        x = 3.1; // and initialized here
        int reply = (int) (x + y);
        return reply;
    }

    public static void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        onlyOneBranch = 1;
        if (check) {
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}




