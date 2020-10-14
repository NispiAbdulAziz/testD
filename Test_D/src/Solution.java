import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int[] data) {
        int largeNegativeNumber = -1;
        data = sortData(data);
        for (int a = 0; a < data.length; a++) {
            while (largeNegativeNumber == data[a]) {
                largeNegativeNumber--;
            }
        }
        return largeNegativeNumber;
    }

    public int[] sortData(int[] data) {
        for (int a = 0; a < data.length - 1; a++) {
            for (int b = 0; b < data.length - a - 1; b++) {
                if (data[b] < data[b + 1]) {
                    int tamp = data[b];
                    data[b] = data[b + 1];
                    data[b + 1] = tamp;
                }
            }
        }
        return data;
    }

    public Solution() {
        System.out.println(solution(new int[]{3, 2, -5, 0}));
        System.out.println(solution(new int[]{10, -1, -2, -3}));
        System.out
            .println(solution(new int[]{100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5}));
        System.out.println(solution(new int[]{0, 2, 4, -1, -3, -4}));
        System.out.println(solution(new int[]{3, 2, -5, -1, -2, 0}));
        System.out.println(solution(new int[]{0, 2, 4, -1, -3, -4}));
    }

    public static void main(String[] args) {
        new Solution();
    }
}
