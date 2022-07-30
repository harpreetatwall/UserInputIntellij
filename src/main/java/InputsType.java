import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputsType {
    public static void main(String[] args) throws IOException {

        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number : ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter second number : ");
        b = Integer.parseInt(br.readLine());

        c = a + b;
        System.out.print("Sum numbers : " + c);


    }
}
