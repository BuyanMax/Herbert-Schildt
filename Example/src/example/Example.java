package example;

/**
 *
 * @author Buyan M.D.
 */
public class Example {
    public static void main(String[] args) {
        System.out.println("Простая программма!\n");
        int num = 100;
        
        System.out.println("Это переменная num: " + num);
        num= num * 2;
        System.out.println("Значение переменной num * 2 равно " + num + "\n");
        
        double pi, r, a;
        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;
        System.out.println("Площадь круга равна " + a + "\n");
        
        char ch1;
        ch1 = 88;
        System.out.print("ch1 и ch2 ");
        System.out.println(ch1 + " " + (++ch1) + "\n");
        
        boolean b = false;
        System.out.println("b равно " + b);
        b = true;
        if(b){ System.out.println("Этот код выполниться");}
        System.out.println("10 > 9 равно " + (10>9) + "\n");
        
        int x = 0b1101_0101_0001_1010;
        byte byt = (byte) num;
        
    }
}
