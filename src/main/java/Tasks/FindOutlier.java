package Tasks;

import java.util.Arrays;

public class FindOutlier{

    public static void main(String[] args) {
        System.out.println(find(new int[]{11, 12, 13}));
    }
    static int find(int[] integers){
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).filter(n -> Math.abs(n) % 2 == mod).findFirst().orElse(0);
    }
}