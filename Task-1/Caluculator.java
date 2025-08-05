import java.util.Scanner;
class Caluculator{
    static Scanner sc=new Scanner(System.in);
    public void addition(int a,int b ){
        System.out.println("Addition of "+ a+" and "+ b+ " is "+(a+b));
    }
    public void subtraction(int a,int b ){
        System.out.println("Subtraction of "+ a+" and "+ b+ " is "+(a-b));
    }
    public void multiply(int a,int b ){
        System.out.println("Mutiplication of "+ a+" and "+ b+ " is "+(a*b));
    }
     public void division(int a,int b ){
         try {
            System.out.println("Division of "+ a+" and "+ b+ " is "+(a/b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String [] args){
    Caluculator cal=new Caluculator();
    System.out.println("Welcome to caluculator");
    while(true){
    System.out.print("To Start Caluculator Enter '1' and to Quit Enter '2' " );
    int k=sc.nextInt();
    if(k==1){
        System.out.println("1: Addition   2: Subtraction   3: Multiplication   4: Division");
        System.out.println("Enter your choice to perform operation:-");
        int choice=sc.nextInt();
        System.out.println("Enter value a: ");
        int a=sc.nextInt();
        System.out.println("Enter value b: ");
        int b=sc.nextInt();
        switch(choice){ 
            case 1:
                cal.addition(a,b);
                break;
            case 2:
                cal.subtraction(a,b);
                break;
            case 3:
                cal.multiply(a,b);
                break;
            case 4:
                cal.division(a,b);
                break;
            default:
                System.out.println("You entered wrong choice");
            
        }
    }
    else{
        System.out.print("Thanks for using Caluculator");
        break;
    }
    }
    }
}
