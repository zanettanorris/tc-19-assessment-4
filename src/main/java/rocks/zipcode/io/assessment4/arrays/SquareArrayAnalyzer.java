package rocks.zipcode.io.assessment4.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        List<Integer> intList1 = Arrays.asList(inputArray);
        List<Integer> intList2 = Arrays.asList(squaredValues);

        Collections.sort(intList1);
        Collections.sort(intList2);

        inputArray = intList1.toArray(new Integer[intList1.size()]);
        squaredValues = intList2.toArray(new Integer[intList2.size()]);

        boolean compare = false;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < squaredValues.length; j++) {
                if (squaredValues[j] == inputArray[i] * inputArray[i])
                    compare = true;
                else
                    compare = false;
            }}
        return compare;}}

