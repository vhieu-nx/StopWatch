import java.util.Scanner;

public class test {
    final static int MAX = 50;
    final static  int MIN = -50;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soDong = nhapN(scan);
        int soCot = nhapN(scan);
        int a[][] = taoMang(soDong, soCot, scan);
        xuatMang(a, soDong, soCot);
        int y;
        do {
            System.out.println("Nhập vào số cột thứ  Y cần tính: ");
            y = Integer.parseInt(scan.nextLine());
            if (y < 0||y > soCot - 1) {
                System.out.println("Chỉ số cột không hợp lệ. Vui lòng kiểm tra lại! ");
            }
        } while (y<0 || y> soCot -1);
        float tongGTLeCot = tongGTLeCot(a, soDong, y);
        System.out.println("Tổng các giá trị lẻ của  cột thứ : " + y + " bằng :" + tongGTLeCot);

    }
    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.println("Nhập vào giá trị >1");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }
    public static int[][] taoMang(int soDong, int soCot, Scanner scan) {
        int a[][] = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
            }
        }
        return a;
    }

    public static void xuatMang(int a[][], int soDong, int soCot) {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\t");
        }
    }
    public static float tongGTLeCot(int a[][], int soDong, int y) {
        float tongGTLeCot = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i][y] % 2 != 0) {
                tongGTLeCot += a[i][y];
            }
        }
        return tongGTLeCot;
    }
}
