import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) throws IOException {
        int[] data = new int[10000000];
        int cnt = 0;
        int key;
        long startTime, endTime;
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter fileWriter=new FileWriter(new File("201202141_output.txt"));
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
        fileWriter.write(""+data[0]);
        for (int i = 1; i < cnt; i++) {
            fileWriter.write(" "+data[i]);
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
