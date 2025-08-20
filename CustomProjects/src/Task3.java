import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3 {
    public void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("numberOne");
        double number = scanner.nextDouble();

        System.out.println("numberTwo");
        double number2 = scanner.nextDouble();

        double c = number / number2;
        System.out.println(Math.round(c * 100.0) / 100.0);
        System.out.println(Math.ceil(c));
        System.out.println(Math.floor(c)); // ceil and floor return dobule but math.round retrun long Data type

        BigDecimal roundedNumber = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);
        System.out.println(roundedNumber.doubleValue());

        DecimalFormat decimalFormat =  new DecimalFormat("###.##");
        System.out.println(decimalFormat.format(c));

        String formatted = String.format("%.2f", c);
        System.out.println(formatted);

    }
}
