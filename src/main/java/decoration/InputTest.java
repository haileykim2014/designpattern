package decoration;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try {
            in =new LowerCaseInputStream(
                            new BufferedInputStream(
//                                    new FileInputStream("src/main/java/decoration/test.txt")));
                                    new FileInputStream("/Users/autowini/Downloads/designpattern/src/test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) { in.close(); }
        }
        System.out.println();
        try (InputStream in2 =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("/Users/autowini/Downloads/designpattern/src/test.txt"))))
        {
            while((c = in2.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    javac -classpath .. InputTest.java
    java % java -cp . decoration/InputTest
    i know the decorator pattern therefore i rule !
    i know the decorator pattern therefore i rule !%
     */
}
