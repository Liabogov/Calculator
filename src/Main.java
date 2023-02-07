import calculator.ArrayValueCalculator;
import exception.ArrayDataException;
import exception.ArraySizeException;

public class Main {
    public static void main(String[] args) throws Exception {
        String[][] array = {{"1"}, {"3"}};
        String[][] array2 = {{"1"}, {"5"},{"q"}, {"4"}};
        String[][] array3 = {{"1"}, {"3"},{"1"}, {"3"},{"1"}, {"3"}};

        ArrayValueCalculator calculator = new ArrayValueCalculator();
        //calculator.doCalc(array3);

        System.out.println(calculator.doCalc(array2));
    }
}