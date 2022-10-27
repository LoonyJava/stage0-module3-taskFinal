package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int input_int = number;
        while (input_int != 0) {
            sum += (input_int % 10);
            input_int = input_int / 10;
        }
        System.out.println(sum);
    }
}
