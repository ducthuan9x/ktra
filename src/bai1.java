import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int arr[]=new int[5];
         arr[0]=1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =6;
        arr[4]=8;
        int s=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                s=s+arr[i];
                System.out.println("các phần tử chẵn là :"+arr[i]);
            }
            System.out.println("tổng các pt chẵn : "+s);
        }
    }
}
