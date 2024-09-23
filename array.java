import java.util.*;
public class array {

    public static void result(int numbers[]){
        Scanner sc= new Scanner(System.in);
     int number[] = new int[50];
     number[0]=sc.nextInt();
     number[1]=sc.nextInt();
     number[2]=sc.nextInt();
     number[2]= 100;
     System.out.println("phy =" + number[0]);
        System.out.println("math" + number[1]);
        System.out.println("chem" + number[2]);
        number[2]= 100;
     System.out.println("math=" + number[2]);


    }
    public static int linearSerch(int arr[] , int key){
       for(int i=0; i<arr.length; i++){
        if(arr[i]==key){
            return  i;
        }
       }
       return -1;
    }
    public static int find(int num[]){
        int largest= Integer.MIN_VALUE;
        for(int i =0; i<num.length; i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
       return largest;
    }
    public static int binarysearch(int numbers[] , int key){
        int start = 0; int end= numbers.length-1;
        while(start<= end){
            int mid =  (start + end)/2;
            if(numbers[mid]==key){
                return mid;

            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end= mid-1;
            }
             
            }
           return -1;
        }
        public static void reverse(int number[]){
          int start=0; int end= number.length-1;
          while (start<end) {
          int temp=number[end];
          number[end]=number[start];
          number[start]=temp;
          start++;
          end--;
          }
        }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
       reverse(number);
       for(int i=0; i<number.length; i++){
        System.out.print(number[i] + " ");
       }
       System.out.println();

        
    }
}