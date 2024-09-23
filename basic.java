import java.util.*;
public class basic {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your first number");
        int numberNum1=sc.nextInt();
        System.out.println("enter your secound number");
        int numberNum2=sc.nextInt();
        System.out.println("enter your operator");
        char operator=sc.next().charAt(0);
        switch (operator) {
            case'+': System.out.println(numberNum1+numberNum2);
                   break;

            case'-': System.out.println(numberNum1-numberNum2) ;

                     break;
             case'*' : System.out.println(numberNum1*numberNum2);
                           break;
             case'/': System.out.println(numberNum1/numberNum2) ;
                           break;
             default: System.out.println("wrong operand");                            
         
        }
        
     
    }

    
}
