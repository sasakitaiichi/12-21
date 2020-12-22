import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        java.lang.String message = "Welcome to Java";
        message.length();
        System.out.println(message.length());

        System.out.println(message.charAt(6));

        java.lang.String s1 = "Java";
        java.lang.String s2 = "Programming";
        java.lang.String s3 = s1.concat(s2);
        System.out.println(s3);

        java.lang.String s4 = s1+s2;
        System.out.println(s4);

        java.lang.String s6 = "   Java   ";
        System.out.println(s6.trim());

        Scanner input = new Scanner(System.in);
        //空白符分割
        System.out.println("Enter three words separated by space:");
        java.lang.String a1 = input.next();
        java.lang.String a2 = input.next();
        System.out.println("a1 is" + a1);
        System.out.println("a2 is" + a2);

        //回车输入
        java.lang.String a3 = input.nextLine();
        System.out.println(a3);
        
        //截取字符串
        System.out.println(message.substring(11));
        System.out.println(message.substring(0,11));

        //字符串数字转换
        java.lang.String a = "123";
        int b1 = Integer.parseInt(a);
        System.out.println(b1+1);

        java.lang.String c = 1+"";




    }
}
