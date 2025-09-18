 package learning;

// public class functions {

//     public static void main(String[] args){
//         greet();  // ✅ Now this works
//     }

//     public static void greet() {
//         System.out.println("hello ayush");
//     }
// }


public class functions {
    public static void main(String[] args) {
        int rows = 1;
        while (rows <= 4) {
            int i = 1;
            while (i <= rows) {
                System.out.print("*");
                i++;
            }
            System.out.println(); // Next line
            rows++;
        }
    }



    public static void greet() {
        System.out.println("hello ayush");
    }
 }
