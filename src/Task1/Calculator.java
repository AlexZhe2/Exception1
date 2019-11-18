package Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {


    public void calc() {

        int n;
        int m;
        String st;
        String stN;
        String stSing;
        String stM;
        String stDoubleCheck;

        Scanner in = new Scanner(System.in);
        System.out.println("для завершения введите \"exit\"");

        while (true) {
            stN = "";
            stM = "";
            stSing = "";
            stDoubleCheck = "";
            System.out.println("введите одно из выражений \"n+m / n-m / nХm / n/m, где n и m - целые числа\"");
            st = in.nextLine();
            if (st.equals("exit")) {
                break;
            }

            Pattern p = Pattern.compile("(\\d{1,})([+,\\-,x,/]{1})(\\d{1,})");
            Matcher ma = p.matcher(st);

            Pattern p2 = Pattern.compile("(.{1,})([+,\\-,x,/]{1})(.{1,})");
            Matcher ma2 = p2.matcher(st);

            Pattern p3 = Pattern.compile("(\\d{1,})");
            Matcher ma3 = p3.matcher(st);

            Pattern p4 = Pattern.compile("([+,\\-,x,/]{1})");
            Matcher ma4 = p4.matcher(st);

            Pattern p5 = Pattern.compile("([0-9]{1,}[.]{1})[0-9]{1,}");
            Matcher ma5 = p5.matcher(st);

            while (ma3.find()) {
                if (!stN.equals("")) stM = ma3.group();
                if (stN.equals("")) stN = ma3.group();
            }
            while (ma4.find()) {
                if (stSing.equals("")) stSing = ma4.group();
            }
            while (ma5.find()) {
                if (stDoubleCheck.equals("")) stDoubleCheck = ma5.group();
            }

            if (!ma2.matches()) try {
                throw new SecondException("указан не тот оператор");
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (stM.equals("0") && stSing.equals("/") || !stDoubleCheck.equals("")) {
                try {
                    throw new ThirdException("Ошибка!!! Произошло деление на ноль либо  \"n\" и \"m\" не целые числа");
                } catch (ThirdException e) {
                    e.printStackTrace();
                }
            }

            if (!ma.matches()) {
                {
                    try {
                        throw new FirstException("отсутствуют n или m");
                    } catch (Exception e) {
                          e.printStackTrace();
                    }
                }
            } else {
                n = Integer.parseInt(stN);
                m = Integer.parseInt(stM);

                if (stSing.equals("+")) System.out.println(n + " " + stSing + " " + m + " = " + (n + m));
                if (stSing.equals("-")) System.out.println(n + " " + stSing + " " + m + " = " + (n - m));
                if (stSing.equals("x")) System.out.println(n + " " + stSing + " " + m + " = " + (n * m));
                if (stSing.equals("/")) System.out.println(n + " " + stSing + " " + m + " = " + (n / m));
            }
        }
    }
}