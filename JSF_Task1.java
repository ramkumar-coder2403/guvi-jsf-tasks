import java.util.Scanner;

public class JSF_Task1 {
    public static void main(String[] args) {
        //1. Print 10 to 50
        printNumbers();
        //2. Find a given number is negative or positive
        negativeOrPositive();
        //3. Reverse a number
        reverseNumber();
        //4. Find the smallest among 3 numbers
        smallNumber();
        //5. Calculate final payable amount
        percentageOnPurchase();
        //6. print numbers pattern
        pattern();
    }

    //1. Print 10 to 50
    public static void printNumbers() {
        for (int i = 10; i <= 50; i++) {
            System.out.println(i);
        }
    }

    //2. Find a given number is negative or positive
    public static void negativeOrPositive() {
        System.out.println("Negative or Positive");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n > 0 ? "Positive" : "Negative");
    }

    //3. Reverse a number
    public static void reverseNumber() {
        System.out.println("Reverse a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;
        while (n > 0) {
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println(reverse);
    }

    //4. Find the smallest among 3 numbers
    public static void smallNumber() {
        System.out.println("Find small number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("The small number is : " + a);
        } else if (b < a && b < c) {
            System.out.println("The small number is : " + b);
        } else {
            System.out.println("The small number is : " + c);
        }
    }

    //5. Calculate final payable amount
    public static void percentageOnPurchase() {
        System.out.println("Percentage on purchase:");
        Scanner sc = new Scanner(System.in);
        int purchaseAmount = sc.nextInt();
        if (purchaseAmount < 500) {
            System.out.println("Final payable: " + purchaseAmount);
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            double finalAmt = purchaseAmount - ((double) 10 / 100 * purchaseAmount);
            System.out.println("Final payable: " + String.format("%.2f", finalAmt));
        } else {
            double finalAmt = purchaseAmount - ((double) 20 / 100 * purchaseAmount);
            System.out.println("Final payable: " + String.format("%.2f", finalAmt));
        }
    }

    //6. print numbers pattern
    public static void pattern() {
        System.out.println("Pattern:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
