public class ParameterMystery {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 3;
        int three = a;
        int one = b + 1;
        
        equation(a, b, c);
        equation(c, three, 10);
        equation(b + c, one + three, a + one);
        a--;
        b = 0;
        equation(three, 2, one);
        equation(a, b, c);
    }
    
    public static void equation(int c, int a, int b) {
        System.out.println(a + " + " + b + " = " + c);
    }

}


