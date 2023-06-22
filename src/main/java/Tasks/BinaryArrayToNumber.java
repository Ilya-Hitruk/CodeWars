package Tasks;

import java.util.*;

public class BinaryArrayToNumber {

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,0,0))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).orElse(0);
    }
}
