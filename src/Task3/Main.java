package Task3;


import java.io.FileInputStream;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Exception> exceptionsList = new LinkedList<>();

        try {
            int[] arr = new int[5];
            arr[7] = 12;
        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            int[] arr = new int[-1];
        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            int a = 1 / 0;

        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            String st = "st";
            Integer.parseInt(st);

        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            Integer a = null;
            int b = a + 1;

        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            String string = "qwe";
            char charForException = string.charAt(9);
        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            Object i = Integer.valueOf(4);
            String s = (String) i;
        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            FileInputStream file = new FileInputStream("wp8.txt");
        } catch (Exception e) {
            exceptionsList.add(e);
        }
        try {
            Object[] o = new String[7];
            o[0] = 2;
        } catch (Exception e) {
            exceptionsList.add(e);
        }


        for (Exception i : exceptionsList) {
            System.out.println(i);
        }
    }
}
