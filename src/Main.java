import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sıfırdan büyük bir sayı giriniz. çıkış için '0' tuşuna  basınız. ");
        while(true){
            num=scan.nextInt();
            if(num==0){
                System.out.println("Exit from program");
                break;
            }

            int result =0;
            for(int i=1; i <num ; i++){
                if(num%i==0){
                    result+=i;
                }
            }
            if(result==num){
                System.out.println(num+ " sayısı mükemmel sayıdır.");
            }
            else{
                System.out.println(num+ " sayısı mükemmel sayı değildir");
            }
        }

    }
}
