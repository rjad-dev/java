// program to find second minimum and second maximum number from the array.

public class SecondMinMax {

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 7 };

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second Minimum: " + secondMin);
        System.out.println("Second Maximum: " + secondMax);
    }
}