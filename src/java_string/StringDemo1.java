package java_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name, age, Salary");
        String string = br.readLine();
        StringTokenizer st = new StringTokenizer(string, ",");
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();
        String name = s1;
        int age = Integer.parseInt(s2);
        int salary = Integer.parseInt(s3);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Salary: " + salary);


    }
}
