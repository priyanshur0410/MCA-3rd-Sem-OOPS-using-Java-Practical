import java.util.*;

public class AllInOnePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Java Practice Programs Menu ====");
            System.out.println("1. Display Name, Age, and College");
            System.out.println("2. Arithmetic Operations");
            System.out.println("3. Relational Operators");
            System.out.println("4. Float to Integer Conversion");
            System.out.println("5. ASCII Value of Character");
            System.out.println("6. Even or Odd");
            System.out.println("7. Divisible by 3 and 5");
            System.out.println("8. Vowel or Consonant");
            System.out.println("9. Total, Percentage, and Pass/Fail");
            System.out.println("10. Greatest of Two Numbers");
            System.out.println("11. Largest of Three Numbers");
            System.out.println("12. Leap Year Check");
            System.out.println("13. Positive, Negative, or Zero");
            System.out.println("14. Character Classification");
            System.out.println("15. Armstrong Number");
            System.out.println("16. Tax Calculation");
            System.out.println("17. Palindrome Number");
            System.out.println("18. Prime Number Check");
            System.out.println("19. Operator-based Calculation");
            System.out.println("20. Marriage Eligibility");
            System.out.println("21. Valid Triangle Check");
            System.out.println("22. Square or Rectangle");
            System.out.println("23. Celsius to Fahrenheit");
            System.out.println("24. Perfect Number Check");
            System.out.println("25. Logical Operation");
            System.out.println("26. First and Last Digit Check");
            System.out.println("27. Profit or Loss");
            System.out.println("28. Count Digits");
            System.out.println("29. Height Classification");
            System.out.println("30. Simple Calculator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    String name = "Priyanshu Kumar";
                    int age = 21;
                    String college = "COER University";
                    System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
                }
                case 2 -> {
                    System.out.print("Enter two integers: ");
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println("Addition = " + (a + b));
                    System.out.println("Subtraction = " + (a - b));
                    System.out.println("Multiplication = " + (a * b));
                    System.out.println("Division = " + (a / b));
                    System.out.println("Modulus = " + (a % b));
                }
                case 3 -> {
                    System.out.print("Enter two numbers: ");
                    int x = sc.nextInt(), y = sc.nextInt();
                    System.out.println("x > y: " + (x > y));
                    System.out.println("x < y: " + (x < y));
                    System.out.println("x == y: " + (x == y));
                }
                case 4 -> {
                    System.out.print("Enter a floating number: ");
                    float f = sc.nextFloat();
                    int i = (int) f;
                    System.out.println("Original: " + f + ", Converted: " + i);
                }
                case 5 -> {
                    System.out.print("Enter a character: ");
                    char ch = sc.next().charAt(0);
                    System.out.println("ASCII value: " + (int) ch);
                }
                case 6 -> {
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    System.out.println(n % 2 == 0 ? "Even" : "Odd");
                }
                case 7 -> {
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println((num % 3 == 0 && num % 5 == 0) ? "Divisible by both" : "Not divisible by both");
                }
                case 8 -> {
                    System.out.print("Enter a character: ");
                    char v = Character.toLowerCase(sc.next().charAt(0));
                    if ("aeiou".indexOf(v) != -1) System.out.println("Vowel");
                    else System.out.println("Consonant");
                }
                case 9 -> {
                    System.out.print("Enter marks of 3 subjects: ");
                    int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
                    int total = m1 + m2 + m3;
                    float perc = total / 3f;
                    System.out.println("Total: " + total + ", Percentage: " + perc);
                    if (m1 >= 40 && m2 >= 40 && m3 >= 40 && perc >= 40) System.out.println("Pass");
                    else System.out.println("Fail");
                }
                case 10 -> {
                    System.out.print("Enter two numbers: ");
                    int a1 = sc.nextInt(), b1 = sc.nextInt();
                    System.out.println("Greatest: " + (a1 > b1 ? a1 : b1));
                }
                case 11 -> {
                    System.out.print("Enter three numbers: ");
                    int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
                    if (n1 >= n2 && n1 >= n3) System.out.println(n1 + " is largest");
                    else if (n2 >= n1 && n2 >= n3) System.out.println(n2 + " is largest");
                    else System.out.println(n3 + " is largest");
                }
                case 12 -> {
                    System.out.print("Enter a year: ");
                    int year = sc.nextInt();
                    System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap Year" : "Not Leap Year");
                }
                case 13 -> {
                    System.out.print("Enter a number: ");
                    int num3 = sc.nextInt();
                    if (num3 > 0) System.out.println("Positive");
                    else if (num3 < 0) System.out.println("Negative");
                    else System.out.println("Zero");
                }
                case 14 -> {
                    System.out.print("Enter a character: ");
                    char c = sc.next().charAt(0);
                    if (Character.isDigit(c)) System.out.println("Digit");
                    else if (Character.isUpperCase(c)) System.out.println("Uppercase Letter");
                    else if (Character.isLowerCase(c)) System.out.println("Lowercase Letter");
                    else System.out.println("Special Character");
                }
                case 15 -> {
                    System.out.print("Enter a 3-digit number: ");
                    int arm = sc.nextInt(), t = arm;
                    int sum = 0;
                    while (t != 0) {
                        int d = t % 10;
                        sum += d * d * d;
                        t /= 10;
                    }
                    System.out.println(sum == arm ? "Armstrong" : "Not Armstrong");
                }
                case 16 -> {
                    System.out.print("Enter salary: ");
                    double sal = sc.nextDouble(), tax;
                    if (sal <= 250000) tax = 0;
                    else if (sal <= 500000) tax = 0.05 * sal;
                    else if (sal <= 1000000) tax = 0.2 * sal;
                    else tax = 0.3 * sal;
                    System.out.println("Tax: " + tax);
                }
                case 17 -> {
                    System.out.print("Enter a number: ");
                    int pal = sc.nextInt(), rev = 0, temp = pal;
                    while (temp != 0) {
                        rev = rev * 10 + temp % 10;
                        temp /= 10;
                    }
                    System.out.println(rev == pal ? "Palindrome" : "Not Palindrome");
                }
                case 18 -> {
                    System.out.print("Enter a number: ");
                    int prime = sc.nextInt();
                    boolean isPrime = prime > 1;
                    for (int j = 2; j <= Math.sqrt(prime); j++)
                        if (prime % j == 0) isPrime = false;
                    System.out.println(isPrime ? "Prime" : "Not Prime");
                }
                case 19 -> {
                    System.out.print("Enter operator (+,-,*,/): ");
                    char op = sc.next().charAt(0);
                    System.out.print("Enter two numbers: ");
                    double nA = sc.nextDouble(), nB = sc.nextDouble();
                    switch (op) {
                        case '+' -> System.out.println("Result: " + (nA + nB));
                        case '-' -> System.out.println("Result: " + (nA - nB));
                        case '*' -> System.out.println("Result: " + (nA * nB));
                        case '/' -> System.out.println("Result: " + (nA / nB));
                        default -> System.out.println("Invalid Operator");
                    }
                }
                case 20 -> {
                    System.out.print("Enter gender (M/F): ");
                    char g = Character.toUpperCase(sc.next().charAt(0));
                    System.out.print("Enter age: ");
                    int ag = sc.nextInt();
                    if (g == 'M' && ag >= 21) System.out.println("Eligible for marriage");
                    else if (g == 'F' && ag >= 18) System.out.println("Eligible for marriage");
                    else System.out.println("Not eligible");
                }
                case 21 -> {
                    System.out.print("Enter three angles: ");
                    int aA = sc.nextInt(), aB = sc.nextInt(), aC = sc.nextInt();
                    System.out.println((aA + aB + aC == 180) ? "Valid Triangle" : "Invalid Triangle");
                }
                case 22 -> {
                    System.out.print("Enter length and breadth: ");
                    int l = sc.nextInt(), b = sc.nextInt();
                    System.out.println(l == b ? "Square" : "Rectangle");
                }
                case 23 -> {
                    System.out.print("Enter temperature in Celsius: ");
                    float c = sc.nextFloat();
                    float f = (c * 9 / 5) + 32;
                    System.out.println("Fahrenheit: " + f);
                }
                case 24 -> {
                    System.out.print("Enter a number: ");
                    int p = sc.nextInt(), s = 0;
                    for (int j = 1; j < p; j++)
                        if (p % j == 0) s += j;
                    System.out.println(s == p ? "Perfect Number" : "Not Perfect");
                }
                case 25 -> {
                    System.out.print("Enter two numbers: ");
                    boolean b1 = sc.nextInt() != 0, b2 = sc.nextInt() != 0;
                    System.out.print("Enter logical operator (&, |, ^): ");
                    char lop = sc.next().charAt(0);
                    boolean result = switch (lop) {
                        case '&' -> b1 && b2;
                        case '|' -> b1 || b2;
                        case '^' -> b1 ^ b2;
                        default -> false;
                    };
                    System.out.println("Result: " + result);
                }
                case 26 -> {
                    System.out.print("Enter a 5-digit number: ");
                    int num5 = sc.nextInt();
                    int first = num5 / 10000, last = num5 % 10;
                    System.out.println(first == last ? "Same" : "Different");
                }
                case 27 -> {
                    System.out.print("Enter cost price and selling price: ");
                    double cp = sc.nextDouble(), sp = sc.nextDouble();
                    if (sp > cp) System.out.println("Profit: " + (sp - cp));
                    else if (cp > sp) System.out.println("Loss: " + (cp - sp));
                    else System.out.println("No Profit No Loss");
                }
                case 28 -> {
                    System.out.print("Enter a number: ");
                    int numD = sc.nextInt(), count = 0;
                    int t2 = numD;
                    while (t2 != 0) {
                        count++;
                        t2 /= 10;
                    }
                    System.out.println("Digits: " + count);
                }
                case 29 -> {
                    System.out.print("Enter height (in cm): ");
                    int h = sc.nextInt();
                    if (h < 150) System.out.println("Short");
                    else if (h <= 170) System.out.println("Average");
                    else System.out.println("Tall");
                }
                case 30 -> {
                    System.out.print("Enter two numbers: ");
                    double x1 = sc.nextDouble(), x2 = sc.nextDouble();
                    System.out.print("Enter operator (+,-,*,/): ");
                    char op2 = sc.next().charAt(0);
                    switch (op2) {
                        case '+' -> System.out.println("Result: " + (x1 + x2));
                        case '-' -> System.out.println("Result: " + (x1 - x2));
                        case '*' -> System.out.println("Result: " + (x1 * x2));
                        case '/' -> System.out.println("Result: " + (x1 / x2));
                        default -> System.out.println("Invalid Operator");
                    }
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid Choice!");
            }
        } while (choice != 0);
        sc.close();
    }
}
