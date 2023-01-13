import java.util.Scanner;

class Functions {
    public static int printHelloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return 3;
    }
    
    //SUm of Two numbers ..

    public static int calculateSum(int a, int b) {// parameters or formal parameters
        int sum = a + b;
        return sum;
    }

    //Swap of numbers ....

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    //product of numbers ...

    public static int printProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    //Factorial of numbers....

    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;// Factorial of n
    }

    //Binary coefficient of number ....

    public static int binCoeff(int n, int r) {
        int nFact = Factorial(n);
        int rFact = Factorial(r);
        int nmrFact = Factorial(n - r);
        return nFact / (rFact * nmrFact);
    }

    //sum of two n..
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum1(int a, int b, int c) {
        return a + b + c;
    }

    //check no is prime or not ??
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        boolean bool = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                // System.out.println(bool);
                bool = false;
                break;
            }
        }
        return bool;
    }

    // Optimize Method
    public static boolean isPrimeOp(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //range of prime numbers 

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                // true
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    //Binary to decimal conversion
    public static void binToDec(int n){
        int myNum =n;
        int pow=0;
        int dec=0;
        // int id=1;

        while(n>0){
            int lastDigit= n%10;
            dec = dec + (lastDigit *(int) Math.pow(2, pow));

            pow++;
            n=n/10;
        }
        System.out.println("Decimal of "+ myNum +" = "+ dec);

    }

    //Decimal tp Binary

    public static void decToBin(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0;

        while(decNum>0){
            int rem=decNum % 2;
            binNum=binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum=decNum/2;

        }
        System.out.println("Binary form of "+myNum +" is "+ binNum);
    }

    //Qs.1 Average of three numbers
    public static int printAverage(int a, int b,int c){
        return (a+b+c)/3;
    }
    //Qs.2 check isEven or not?
    public static boolean isEven(int num){
        boolean bool = false;
        if (num%2 == 0){
            bool=true;
        }
        return bool;
    }

    //Qs.3 Check weather Number is Palindrome.
    public static boolean isPalindrome(int n){
        int num =n;
        boolean bool = false;
        int rem =0;
        int sum =0;
        while (n>0){
            rem = n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if (num == sum){
            // System.out.println(num);
            bool =true;
        }
        return bool;

        
        
        
    }

    // print su of array element
    
    public static int printSum(int n){
        int sum =0;
        for (int i =0 ; i<=n;i++){
            int lastDigit = n % 10;
            sum=sum+lastDigit;
            n= n/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);// here a and b are arguments or actual
        // parameters

        // System.out.println(sum);
        // // body
        // printHelloWorld();

        // //swap
        // // swap(5, 10);

        // int res=printProduct(34,12 );
        // System.out.println(res);

        // //factorial
        // int n= Factorial(10);
        // System.out.println(n);

        // Binomial Coefficient
        // System.out.println(binCoeff(5, 2));

        // overloading with parameters

        // System.out.println(sum(3, 5));
        // System.out.println(sum1(5, 5, 6));

        // NUmber is Prime or not
        // System.out.println("is number is prime :"+ isPrime(13));

        // Optimize method
        // System.out.println("is number is prime :"+ isPrimeOp(13));

        // prime id range

        // primeInRange(30);

        // Convert from Binary to Decimal
        // binToDec(110111111 );

        //Convert Decimal to binary:

        // decToBin(999); 

        //Qs.1

        // System.out.println(printAverage(4, 5, 8));

        //Qs.2
        // System.out.println(isEven(90));

        //Qs.3 
        // int res = isPalindrome(129);
        // System.out.println(isPalindrome(349
        // ));

        //Qs.4
        // System.out.println(printSum(199992));

    }

}