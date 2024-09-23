import java.util.Scanner;
public class income{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        int amount= sc.nextInt();
        int tax;
        System.out.println("your tax is");
        if(amount<500000){
            tax= 0;
        }
            else if(amount>=500000 && amount<1000000){
                tax= (int)(amount*0.2);
            }
            else {
                tax=(int)(amount*0.3);
            }
          System.out.println(tax);  
        
    }
}