package more.lambda;

import java.util.Comparator;

public class LambdaExp {
    public static void main(String[] args) {
        Compositional calculate;
        calculate = (int x, int y) -> x + y;

        int sum = calculate.calculate(30, 44);

        System.out.println(sum);

        String str = "Archil";
        String str2 = "Temuka";
    }
}

interface Compositional{
    int calculate(int x, int y);
}