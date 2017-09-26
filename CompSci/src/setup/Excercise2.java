package setup;

//Ryan
//Knowledge is Power
public class Excercise2{
 public static void main(String[] args){
     a();
     System.out.println("");
     System.out.println("");
     System.out.println("");
     b();
     System.out.println("");
     System.out.println("");
     System.out.println("");
     c();
 }
 public static void a(){
     System.out.println("Knowledge is Power");
 }
 public static void b(){
     System.out.println("Knowledge");
     System.out.println("   is");
     System.out.println("  Power");
 }
 public static void c(){
     for(int i = 0; i < 5; i++){
         if(i == 0 || i == 4){
             for(int n = 0; n < 22; n++){
                 System.out.print("=");
             }
         }
         else if(i == 2){
             System.out.print("| Knowledge is Power |");
         }
         else{
             System.out.print("|                    |");
         }
         System.out.println("");
     }
 }
}
