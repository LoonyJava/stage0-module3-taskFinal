package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNum = 0;
        int input_int = number;
        while (input_int != 0) {
            reversedNum = reversedNum * 10 + input_int % 10;
            input_int = input_int / 10;
        }
        System.out.println(reversedNum);
    }
}
