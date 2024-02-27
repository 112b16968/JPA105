import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("請輸入您的姓名:");      
        String Your_name = input1.nextLine();
        System.out.println("Hi, "+Your_name+",請輸入您的銅板:");

        Scanner input2 = new Scanner(System.in);
        System.out.print("請輸入1元的數量:");
        int one =input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("請輸入5元的數量:");
        int five =input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.print("請輸入10元的數量:");
        int ten =input4.nextInt();

        Scanner input5 = new Scanner(System.in);
        System.out.print("請輸入50元的數量:");
        int fifty =input2.nextInt();

        int total = one + five*5 + ten*10 + fifty*50;
        System.out.println(total);
        int a = total /1000;
        System.out.println(a);
        int b = total %1000;
        int c = b/100;
        int d = b%100;
        int e = d/10;
        int f = d%10;
        int g = f/1;
        

        System.out.println(c);
        System.out.println(e);
        System.out.println(g);
        
        System.out.println("您的錢總共有:"+a+"千"+c+"百"+e+"十"+g+"元");
        input1.close();
        input2.close();
        input3.close();
        input4.close();
        input5.close();
    }
    
}