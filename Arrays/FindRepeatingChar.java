package array.array;

public class FindRepeatingChar {
    public static void main(String[] args) {
        String input = "programming";
        char[] arr = input.toCharArray();
        boolean[] b = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    b[j] = true; // mark duplicate
                }
            }

            if (count > 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


