public class Main {
    public static void main(String[] args) {
        //BOX PATTERN
//        for (int i=0;i<5;i++) {
//            for (int j=0;j<5;j++) {
//                System.out.print("$ ");
//
//            }
//            System.out.println(" ");
//        }
//        //RIGHT ANGLE PATTERN
//        for (int i=0;i<=5;i++) {
//            for (int j=0;j<i;j++) {
//                System.out.print("$ ");
//
//            }
//            System.out.println(" ");
//        }
//        System.out.println("");
//        //INVERTEFD RIGHT ANGLE PATTERN
//        for (int i=0;i<5;i++) {
//            for (int j=0;j<5-i;j++) {
//                System.out.print("$ ");
//
//            }
//            System.out.println(" ");
//        }

        //PYRAMID PATTERN
        for (int i=0;i<5;i++) {
            for (int j=0;j<5+i;j++) {
                if (j<5-i-1){
                    System.out.print(" ");
                }
            else{
            System.out.print("*");


            }
                System.out.print(" ");

            }
        }



    }
    }




