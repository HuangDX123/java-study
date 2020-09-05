package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从控制台读取字符串
 * 从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
 *
 * 它的一般格式是：
 *
 * String readLine( ) throws IOException
 */
public class BRReadLines {

    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));

    }
}
