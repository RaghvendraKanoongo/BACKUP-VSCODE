import java.io.*;
import java.util.Scanner;
class Polygon   {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arrX = {3, 0, 3, 3, 0};;
        int[] arrY = {1, 0, 0, 3, 3};
        for (int i = 0; i < n; i++) {
            // arrX[i] = sc.nextInt();
            // arrY[i] = sc.nextInt();
            // arrX = 
            // arr
        }

		System.out.println(polygonArea(arrX, arrY, n));
	}
	public static int polygonArea(int X[], int Y[], int n) {
		int area = 0;
		int j = n - 1;
		for (int i = 0; i < n; i++) {
			area += (X[j] + X[i]) * (Y[j] - Y[i]);
			j = i;
		}
		return (int) Math.abs(area);
	}
	
}

