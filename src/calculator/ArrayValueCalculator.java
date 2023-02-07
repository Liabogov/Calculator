package calculator;

import exception.ArrayDataException;
import exception.ArraySizeException;

public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) throw new ArraySizeException("length is not equal to four");

        int totalSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String temp = array[i][j];
                try {
                    totalSum += Integer.parseInt(temp);
                } catch (NumberFormatException exception) {
                    throw new ArrayDataException("Not valid input data: " + "Index i = " + i + " Index j = " + j);
                }

            }
        }
        return totalSum;
    }

}
