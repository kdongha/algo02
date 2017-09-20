import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) throws FileNotFoundException {
        int[] data = new int[10000000];
        int cnt = 0;
        int key;
        long startTime, endTime;
        Scanner scanner = new Scanner(new File("input.txt"));
        while (scanner.hasNext()) {
            data[cnt++] = scanner.nextInt();
        }

        startTime = System.nanoTime();
        for (int i = 1; i < cnt; i++) {
            key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j -= 1;
            }
            data[j + 1] = key;
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        for (int i = 0; i < cnt; i++) {
            System.out.println(data[i]);
        }
    }
}
