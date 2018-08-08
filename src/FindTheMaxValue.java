import java.util.Scanner;

public class FindTheMaxValue {
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        //kiem tra gia tri nhap vao
        int size;
        do {
            System.out.print("Nhap vao so ty phu:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("khong duoc nhap qua 20 nguoi!");
            }
        } while (size > 20);
        //nhap vao tung gia tri cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("\tGia tri tai san " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        //in ra danh sach mang
        System.out.print("Danh sach tai san:\n");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        //tim gia tri max cua mang da nhap
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Gia tri tai san lon nhat la " + max + " ,cua nguoi thu " + index);
    }
}
