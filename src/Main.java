import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//class Result {
//
//    /*
//     * Complete the 'reverseArray' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts INTEGER_ARRAY a as parameter.
//     */
//
//    public static List<Integer> reverseArray(List<Integer> a) {
//        // Write your code here
//
//    }
//}
public class Main{
    public static void main(String[] args) {
        System.out.println("Write the marks of each sub. Total marks of each subject is 100");
        Scanner sc = new Scanner(System.in);
        int Num_subjects = 5;
        String[] Sub = {"Eng", "Maths", "Science", "Hindi", "Sans"};
        float sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Marks of " + Sub[i] + " : ");
            float marks = sc.nextFloat();
            sum += marks;
        }
        float percentage = sum/Num_subjects;
        System.out.println("Your total percentage is " +percentage+ " %");
    }}


