import java.util.*;
public class Method {
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
    public static void  function(int a, int b){
       
        int sum= a+b;
        System.out.println(sum);

    }
    public static void swap(int a, int b){
          int temp =a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static boolean isTrue(int n){
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            
            }
           
        }
        return true;
    }
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isTrue(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //binary to decimal
    public static void binarytodeci(int biNum){
        
        int pow=0;
        int deci=0;
        
        while(biNum>0){
            int lastdigit= biNum%10;
             deci= deci + (lastdigit*(int)Math.pow(2 , pow));
             pow++;
             biNum=biNum/10;
            

        }
       
        System.out.println(deci);
        System.out.println(biNum);

    }
    public static void dectobin(int n){
        int myNumber=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int remn=n%2;
            binNum = binNum + (remn * (int)Math.pow(10 , pow));
            pow++;
            n=n/2;
        }
        System.out.println(binNum +" is  binum of" +"=" +myNumber);
    }
    //claculate a faractonal of a n number
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        System.out.println(f);
        return f;
    }
    //binomial cofficient 
    public static int bincoff(int n , int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);
        int formulla= fact_n /(fact_r *fact_nmr);
        return formulla;

    }
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //prime in range
    public static void Pnum(int n){
        for(int i=2; i<=n; i++){
            if(prime(i)){
                System.out.print(i  +" ");
            }
        }
        System.out.println();
    }
    //binary to decimal
    public static void BtoD(int n){
        int Dec=0;
        int power=0;
        while(n>0){
            int lastD=n%10;
            Dec=Dec + (lastD*(int)Math.pow(2 , power));
            power++;
            n=n/10;
        }
        System.out.println(Dec + "is binary nuber of" + n);
    }
    //decimal to binARY
    public static void Decimaltobinary(int z){
        int pow=0;
        int bin=0;
        while(z>0){
            int rem=z%2;
        bin = bin + (rem*(int)Math.pow(10 , pow));
        pow++;
        z=z/2;

        }
        System.out.println(bin +" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first  number");
        int n= sc.nextInt();
    BtoD(n);
       
       

        
       
       
    }

    
}
