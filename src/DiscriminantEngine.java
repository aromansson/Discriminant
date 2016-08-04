import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by roman on 7/5/16.
 */
public class DiscriminantEngine {

    double a = 0;
    double b = 0;
    double c = 0;
    public void addA() throws IOException {
        System.out.println("Please input A");
        char[] allowSymbols = {'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        ArrayList<Character> charArray = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int k = 0; k < allowSymbols.length; k++) {
                if (input.charAt(i) == allowSymbols[k]){
                        charArray.add(input.charAt(i));
                }
                else if (input.charAt(i) == '\n')
                    break;
            }

        }
        String output = "";
        for (Character c : charArray){
            output += c;
        }
        a = Double.parseDouble(output);
    }

    public void addB() throws IOException {
        System.out.println("Please input B");
        char[] allowSymbols = {'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        ArrayList<Character> charArray = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int k = 0; k < allowSymbols.length; k++) {
                if (input.charAt(i) == allowSymbols[k]) {
                    charArray.add(input.charAt(i));
                } else if (input.charAt(i) == '\n')
                    break;
            }

        }
        String output = "";
        for (Character c : charArray) {
            output += c;
        }
        b = Double.parseDouble(output);

    }

    public void addC() throws IOException {
        System.out.println("Please input C");
        char[] allowSymbols = {'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        ArrayList<Character> charArray = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int k = 0; k < allowSymbols.length; k++) {
                if (input.charAt(i) == allowSymbols[k]) {
                    charArray.add(input.charAt(i));
                } else if (input.charAt(i) == '\n')
                    break;
            }

        }
        String output = "";
        for (Character c : charArray) {
            output += c;
        }
        c = Double.parseDouble(output);
    }

    public void calculate(){
        System.out.println("Your equation is");
        System.out.println(a + "x2 + "+ b + "x + "+ c + " = 0");

        double discr = b*b - 4*a*c;
        double root1 = (-b + Math.sqrt(discr))/(2*a);
        double root2 = (-b - Math.sqrt(discr))/(2*a);
        System.out.println("root 1 = " + root1);
        System.out.println("root 2 = " + root2);
    }



//    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
//
//    List list = new List();
//
//
//
//    double a = Double.parseDouble(reader.readLine());
//    System.out.println("Please input B");
//    double b = Double.parseDouble(reader1.readLine());
//    System.out.println("Please input C");
//    double c = Double.parseDouble(reader2.readLine());

}
