//ackage Lab03;
import java.util.Scanner;
import java.util.Arrays;
public class Lab03 {
    static float mean(int[] arr){
        int len = arr.length;
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum = sum + arr[i];
            
        }

        float result = sum / len;
        return result;
    }
    static float median(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);
        float mid= 0;
        if(len / 2 != 0){
            mid = arr[len/2];
        }
        else{
            mid = (arr[(len-1)/2] + arr[(len)/2]) / 2;
        }
        return mid;
    }
    static int mode(int[] arr){
        int len = arr.length;
        int maxCount = 0 , maxValue = 0;
        for(int i = 0; i < len; i++){
            int count = 0;
            for(int j = 0; j< len; j++){
                if(arr[j] == arr[i]){
                    count++ ; 
                }
            }
            if(count > maxCount){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter the len of your array: ");
        int n = Integer.parseInt(obj.nextLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter one of the "+ n +" elements of your your array : ");
            arr[i] = Integer.parseInt(obj.nextLine());
        }
        System.out.println("Your array of length "+n+" is : ");
        for(int j = 0; j < n; j++){
            if(j != n){
                System.out.println(arr[j]+ " ");
            }else{
                System.out.print(arr[j]+ " ");
            }
        }
        System.out.println("---MENU--- \n 1.Mean \n 2.Median \n 3.Mode ");
        int ch = Integer.parseInt(obj.nextLine());
        switch(ch){
            case 1 : 
                float output = mean(arr);
                System.out.println("Mean of every element of your array is : "+ output);
                break;
            case 2 :
                float median = median(arr);
                System.out.println("median of your array is : "+ median);
                break;
            case 3 :
                float mode = mode(arr);
                System.out.println("Mode of your array is : "+ mode);
                break;
            default :
                System.out.println("Invalid Choice !");
        }

    }
    
}
