import java.util.Scanner;
class vote {
    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your age please ? ");
        int age=sc.nextInt();

        if(age>=18) {
            System.out.println(" you are eligible to vote ");

        }else {
            System.out.println(" Ineligible to vote !! ");
        }
    }
}
