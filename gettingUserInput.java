import java.util.Scanner;

/**
 * gettingUserInput
 */
public class gettingUserInput {

    public static void main(String[] args) {
        System.out.println("Taking Input From the user: ");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number1");
        // int a= sc.nextInt();
        // System.out.println("Enter number2");
        // int b=sc.nextInt();
        // int sum = a+b;
        // System.out.println("the sum of these numbers is "+sum);

        // writing only one word;
            // String str = sc.next();
            // System.out.println(str);
        //writing line 

        // String line = sc.nextLine();
        // System.out.println(line);


        String name;
        name = new String("Ehsan");
        System.out.println(name);

        String line = sc.nextLine();
        System.out.println(line);
        sc.close();


    }
}