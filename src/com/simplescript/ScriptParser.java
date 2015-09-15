package ttttteeeesssttt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//CODED BY ADITYA/LOADEDBOY
public class TTTTTEEEESSSTTT {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("hoba.txt"));

        

        int line = 0;
        while (sc.hasNextLine()) {
            line++;

            String words[] = null;

            words = sc.nextLine().trim().split("\\s+");
            System.out.println(Arrays.asList(words));

            if (Arrays.asList(words).contains("")) {
                System.out.println("Line " + line + " Empty Line Detected");                  //Empty Line

            }
            
            
            

// FOR VARIABLES 
            int l = words.length;
            if (Arrays.asList(words).contains("var")) {

                TTTTTEEEESSSTTT.vars(words, line);
            }

//PRINT
            if (Arrays.asList(words).contains("print()")) {

                System.out.println("Line " + line + " Print is a Function call");                                      //IDENTIFYS PRINT

            }

//OPERATORS
            try {
                if (Arrays.asList(words[1]).contains("+") || Arrays.asList(words[1]).contains("-") || Arrays.asList(words[1]).contains("/") || Arrays.asList(words[1]).contains("*")) {
                    TTTTTEEEESSSTTT.op(words, line);
                }
            } catch (ArrayIndexOutOfBoundsException exception) {

            }

//FUNC
            if (Arrays.asList(words[0]).contains("func")) {
                System.out.println("Line " + line + " Function found called " + words[1] + " This Function Consists of the following code: ");

                String funcline;
                while (sc.hasNextLine()) {
                    funcline=sc.nextLine();
                    
                    System.out.println("Line " + line + " " + funcline);
                   if (funcline.contentEquals(""))
                   {
                   break;
                   }
                    
                }

            }

        }

    }

    public static void op(String[] words, int line) {
        try {
            if (Arrays.asList(words).contains("+")) {

                System.out.println("Line " + line + " Expression " + words[0] + " + " + words[2] + " , Simple subtraction found");       // num2 - 5
            }

            if (Arrays.asList(words).contains("-")) {

                System.out.println("Line " + line + " Expression " + words[0] + " - " + words[2] + " , Simple subtraction found");       // num2 - 5
            }

            if (Arrays.asList(words).contains("*")) {                                                                                               

                System.out.println("Line " + line + " Expression " + words[0] + " * " + words[2] + " , Simple multiplication found");    //  num2 * 5
            }

            if (Arrays.asList(words).contains("/")) {                                                                                

                System.out.println("Line " + line + " Expression " + words[0] + " / " + words[2] + " , Simple division found");   // num2 / 5
            }

        } catch (ArrayIndexOutOfBoundsException exception) {

        }

    }

    public static void vars(String[] words, int line) {

        try {

            if (words[0].contains("var")) {
                System.out.println("Line " + line + ", Expression var " + words[1] + " is a Variable declaration"); //var num1
            }

            if (words[1].contains(",")) {

                if (words[1].contains(",")) {
                    System.out.println("Line " + line + ", Expression var " + words[2] + " is a Variable declaration"); // var num, num2
                }

                if (words[2].contains(",")) {
                    int i;

                    for (i = 3; i < 30; i++) {

                        System.out.println("Line " + line + ", Expression var " + words[i] + " is a Variable declaration"); //var num, num2,num3......
                        if (!words[i].contains(",")) {   
                            break;
                        }
                    }

                }

            }

            if (Arrays.asList(words).contains("=")) {
              
                if(words[2].contains("=")){
                System.out.println("Line " + line + ", Expression var " + words[1] + " = " + words[3] + " is a Variable declaration and initialization "); // var num1=1
                }
                
                
                if (words[3].contains(",")) {
                    int i;
                    for (i = 4; i < 30; i++) {

                        System.out.println("Line " + line + ", Expression var " + words[i] + " = " + words[i + 2] + " is a Variable declaration and initialization ");  // var num1 = 1, var num2 = 1, var num3 = 1......
                        i = i + 2;
                        if (!words[i].contains(",")) {
                            break;
                        }
                    }

                }
            }

            if (Arrays.asList(words[2]).contains("+")) {

                System.out.println("Line " + line + " Expression " + words[1] + " + " + words[3] + " , Simple addition found");          // var num1 + num2

            }

            if (Arrays.asList(words[2]).contains("-")) {

                System.out.println("Line " + line + " Expression " + words[1] + " - " + words[3] + " , Simple subtraction found");        // var num1 - num2

            }

            if (Arrays.asList(words[2]).contains("*")) {

                System.out.println("Line " + line + " Expression " + words[1] + " * " + words[3] + " , Simple multiplication found");       // var num1 * num2

            }
            if (Arrays.asList(words[2]).contains("/")) {

                System.out.println("Line " + line + " Expression " + words[1] + " / " + words[3] + " , Simple division found");        // var num1 / num2

            }

        } catch (ArrayIndexOutOfBoundsException exception) {

        }

             
    }
}

/*Detects the following 
var a, b, c
var a = 10
var a = 10, b=40, d=2
var a + b
var a
var a - a

var a + b

var a * c

var a / s
a + b

func helloworlds():
var a
var b
var c 

var k
*/
