public class Egret {
   private String color;
   public Egret() {
         this("white");
         }public Egret(String color) {
         color = color; //itt van valami
         }
 public static void main(String[] args) {
         Egret e = new Egret();
         System.out.println("Color:" + e.color);
         }
         //color:null
 }
