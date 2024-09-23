import java.util.*;
public class pattern{
    public static void Holloractangle(int rows , int column){
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop colum
            for(int j=1; j<=column; j++){
                if(i==1 || i==rows || j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
     

    }
    public static void decending(int n){
        for(int i=1; i<=5; i++){
            for(int number=1; number<=n-1+i; number++){
                System.out.print(number+ " ");
    
            }
            
        System.out.println();
        }
      
       
        
       
    }
    public static void tringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if
            System.out.print();
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
       decending(n);


    }
}