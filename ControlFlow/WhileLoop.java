package ControlFlow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int num = 10;
        int sum = num + i;

        while (i<=10){
            sum = num + i;
            i++;
        }
        System.out.println("Sum=" + sum);
    }
}

class CountEvenNumbers{
    public static void main(String[] args) {
        int i= 1;
        int Even = 0;

        while (i<=10){
            if (i %2 ==0){
                Even++;
            }
            i++;
        }

        System.out.println("Even count =" + Even);
    }
}

class CounterControlledWhileLoop1{
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10){
            System.out.println(count);
            count++;
        }
    }
}

class CounterControlledWhileLoop2{
    public static void main(String[] args) {
        int count = 20;

        while (count >= 1){
            System.out.println(count);
            count--;
        }
    }
}

class CounterControlledWhileLoop3{
    public static void main(String[] args) {
        int count = 2;

       while (count <= 20){
           System.out.println(count);
           count+=2;
       }
    }
}

class CounterControlledWhileLoop4{
    public static void main(String[] args) {
        int count = 5;

        while (count <= 50){
            System.out.println(count);
            count +=5;
        }
    }
}

class CounterControlledWhileLoop5{
    public static void main(String[] args) {
        int count = 3;

        while(count < 30){
            System.out.println(count);
            count += 4;
        }
    }
}

class AccumulatorWhileLoop1{
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 10){
            sum = sum + count;
            count ++;
        }
        System.out.println("Sum = " + sum);
    }
}

class AccumulatorWithConditionsWhileLoop2{
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 10){
            if (count %2 == 0){
                sum = sum +count;
            }
            count ++;
        }
        System.out.println("Sum = " + sum);
    }
}

class AccumulatorToComputeAnAverageWhileLoop3{
    public static void main(String[] args) {
        int count = 1;     // Loop control
        int sum = 0;       // Accumulator
        int numbersAdded = 0; //Quantity counter

        while (count <=10){
            sum = sum + count;    // Add value
            numbersAdded ++;      // Record that ONE value was added
            count ++;             // Move loop forward
        }
        float Avr = (float) sum / numbersAdded;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + Avr);
    }
}

class SentinelControlledWhileLoop1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.print("Enter a number(-1 to stop):");
        num = scanner.nextInt();

        while (num != -1){
            sum = sum + num;

            System.out.print("Enter a number(-1 to stop):");
            num = scanner.nextInt();
        }
        System.out.println("Total = " + sum);
    }
}

class SentinelControlledWhileLoop2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.print("Enter a number (0 to stop):");
        num = scanner.nextInt();

        while (num != 0){
            if(num > 0) {
                sum = sum + num;
            }

            System.out.print("Enter a number (0 to stop):");
            num = scanner.nextInt();
        }
        System.out.println("Total = " + sum);
    }
}

class SentinelControlledWhileLoop3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.print("Enter a number (-1 to stop):");
        num = scanner.nextInt();

        while (num != -1){
            if (num <= 100 && num >= 0){
                sum = num + sum;
            }
            System.out.print("Enter a number (-1 to stop):");
            num = scanner.nextInt();
        }
        System.out.println("Total = " + sum);
    }
}

class SentinelControlledWhileLoop4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;
        int totalEven = 0;

        System.out.print("Enter a number (999 to stop):");
        num = scanner.nextInt();

        while (num != 999){
            if (num %2 == 0 ) {
                sum = sum + num;
                totalEven ++;
            }
            System.out.print("Enter a number (999 to stop):");
            num = scanner.nextInt();
        }
        System.out.println("The sum of all valid even numbers:" + sum);
        System.out.println("The count of valid even numbers:" + totalEven);
    }
}

class SentinelControlledWhileLoop5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;
        int sum = 0;
        int Total = 0;

        System.out.print("Enter any positive number (0 to stop):");
        count = scanner.nextInt();

        while (count != 0){
            if (count > 0){
                sum = sum + count;
                Total ++;
            }
            System.out.print("Enter any positive number (0 to stop):");
            count = scanner.nextInt();
        }
        if (Total >     0){
            float Avr = (float) sum / Total;
            System.out.println("Sum = " + sum);
            System.out.println("Count " + Total);
            System.out.println("Average = " + Avr);
        }
        else {
            System.out.println("No valid numbers entered");
        }
    }
}

class MenuDrivenWhileLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("1.Say Hello\n2.Say Bye\n0.Exit\nEnter a number:");
        num = scanner.nextInt();

        while (num != 0) {
            if (num == 1) {
                System.out.println("Hello");
            } else if (num == 2) {
                System.out.println("Bye");
            } else {
                System.out.println("Invalid number, try again");
            }
            System.out.print("1.Say Hello\n2.Say Bye\n0.Exit\nEnter a number:");
            num = scanner.nextInt();
        }
    }
}

class BreakAndContinueWhileLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        while (true){
            System.out.print("Enter a number(-1 to stop):");
            num = scanner.nextInt();

            if (num == -1){
                break;
            }
            if (num <= 0){
                continue;
            }
            System.out.println("Accepted: " + num);
        }
    }
}

class NestedWhileLoop{
    public static void main(String[] args) {
        int row = 1;

        while (row <=3){
            int col = 1;
            while (col <= 3){
                System.out.print(col + "");
                col++;
            }
          System.out.println();
            row++;
        }
    }
}

class NestedWhileLoop2{
    public static void main(String[] args) {
        int row = 1;

        while (row <= 4) {
            int col = 1;
            while (col <= row) {
                System.out.print(col + "");
                col ++;
            }
            System.out.println();
            row++;
        }
    }
}

class NestedWhileLoop3{
    public static void main(String[] args) {
        int row = 4;

        while (row >= 1){
            int col = 1;
            while (col <= row){
                System.out.print(col + "");
                col ++;
            }
            System.out.println();
            row --;
        }
    }
}

class NestedWhileLoop4{
    public static void main(String[] args) {
        int row = 1;

        while (row <= 4){
            int col = 1;
            while (col <= row){
                System.out.print(row + "");
                col ++ ;
            }
            System.out.println();
            row ++;
        }
    }
}

class NestedWhileLoop5{
    public static void main(String[] args) {
        int row = 1;

        while (row <= 4) {
            int col = 1;
            while (col <= row) {
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}

class AttendanceTracker{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Day = 1;

        while (Day <= 4){

            int StudentCount = 0;

            while (true) {
                System.out.print("Enter Student ID for day" + Day + "(0 to stop): ");
                int id = scanner.nextInt();

                if (id == 0) {
                    break;
                }

                if (id < 0) {
                    continue;
                }

                StudentCount++;
            }

            System.out.println("Day " + Day + "attendance: " + StudentCount + "students");
            Day ++;
            }

        scanner.close();

    }
}



class GuessTheSecretNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int num;

       System.out.print("Enter a number:");
       num = scanner.nextInt();

        while (num != 36) {
            System.out.println("Try again");

            if (num < 36){
                System.out.println("Number is too low try again");
            }

            else if (num > 36) {
                System.out.println("Number is too high");
            }
            System.out.print("Enter a number:");
            num = scanner.nextInt();
        }
        System.out.println("Correct 😁✨");
    }
}
