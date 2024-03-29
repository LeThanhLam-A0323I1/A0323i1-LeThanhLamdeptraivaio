package ss4;

import java.util.Scanner;
import java.util.Random;
public class B2_StopWatch {
    private long startTime;
    private long endTime;

    public B2_StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thoi gian do: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000);
        }

        B2_StopWatch stopwatch = new B2_StopWatch();

        selectionSort(arr);

        stopwatch.stop();

        System.out.println("Thoi gian troi qua: " + stopwatch.getElapsedTime() + " s");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
