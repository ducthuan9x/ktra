import java.util.Scanner;

public class xoa {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =6;
        arr[4]=8;
        int a;
        int b[]=new int[4];
        Scanner scanner= new Scanner(System.in);
        System.out.println(" nhập số a");
        a=scanner.nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==a){
                for(int j=arr[i];j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                for (int j=0;j<b.length;j++){
                    b[j]=arr[j];
                    System.out.println(b[j]);
                }
            }
        }
    }
}