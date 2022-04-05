import java.util.Scanner;

public class nhapa {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =6;
        arr[4]=8;
        int a;
        Scanner scanner= new Scanner(System.in);
        System.out.println(" nhập số a");
        a=scanner.nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==a){
                arr[i]=a;
                System.out.println("tìm thấy a trong mảng "+"vị trí " +i);
            }
        }
    }
}
