import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        boolean a = N%2!= 0;
        boolean b = N%2 == 0 && N >= 6 && N <= 20;
        boolean c = N%2 == 0 && N>=2 && N <= 5;
        boolean d = N%2==0 && N >20;

        if(a){
            System.out.println("Weird");
        }
        else if(b){
        	System.out.println("Weird");
        }
        else if(c){
            System.out.println("Not Weird");
        }
        else if(d){
        	System.out.println("Not Weird");
        }
        scanner.close();
    }
}

