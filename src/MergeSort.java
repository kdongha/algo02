import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeSort {
    static int cnt=0;

    public static void mergeSort(int[] data, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);
            merge(data,left,mid,right);
        }
    }

    public static void merge(int[] data, int left, int mid, int right) {
        int[] temp=new int[right-left+1];
        int tempCnt=0;
        int p=left;
        int q=mid+1;
        while(p<=mid && q<=right){
            if(p>mid){
                temp[tempCnt++]=data[q++];
            }else if(q>right){
                temp[tempCnt++]=data[p++];
            }else if(data[p]>data[q]){
                temp[tempCnt++]=data[q++];
            }else{
                temp[tempCnt++]=data[p++];
            }
        }
        for(int )
    }

    public static void main(String[] args) throws IOException {
        int[] data = new int[10000000];
        long startTime, endTime;
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter fileWriter = new FileWriter(new File("201202141_output.txt"));
        while (scanner.hasNext()) {
            data[cnt++] = scanner.nextInt();
        }
        startTime = System.nanoTime();


        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        fileWriter.write("" + data[0]);
        for (int i = 1; i < cnt; i++) {
            fileWriter.write(" " + data[i]);
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
