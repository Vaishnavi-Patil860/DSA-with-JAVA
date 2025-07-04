package array.array;
public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String input = "programming";
        char[] arr = input.toCharArray();
        boolean[] b = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (b[i]) continue;

            System.out.print(arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    b[j] = true; // Mark duplicate
                }
            }
        }
    }
}


