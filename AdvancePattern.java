public class AdvancePattern {
    // Hollow Rectangle
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner - columns
            for (int j = 1; j <= totCols; j++) {
                // cell -(i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Inverted rotated half pyramid
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 0; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Inverted half-pyramid with numbers
    public static void inverted_half_pyramid_with_num(int n) {
        for (int i = 0; i <= n; i++) {

            // num
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(j + " ");
            }

            // spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    // Floyd's triangle
    public static void floyds_triangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // 0 - 1 triangle
    public static void zero_1_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // Butterfly pattern
    public static void butterfly_pattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces -2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces -2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Solid Rhombus
    public static void solid_rhombus(int n) {
         for(int i =1;i<=n;i++){
            //spaces
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }

    //Hollow rhombus
    public static void hollow_rhombus(int n){
        for(int i =1;i<=n;i++){
            //spaces
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle - stars
            for(int j=1;j<=n;j++){
                if(i==1 || i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //Diamond Pattern
    public static void diamond(int n){
        //1st half
        for(int i =1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i =n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4, 5);
        inverted_rotated_half_pyramid(5);
        inverted_half_pyramid_with_num(8);
        floyds_triangle(5);
        zero_1_triangle(6);
        butterfly_pattern(4);
        solid_rhombus(5);
        hollow_rhombus(7);
        diamond(5);
    }
}
