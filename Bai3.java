import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap hai so nguyen: ");
        int so1 = sc.nextInt();
        int so2 = sc.nextInt();
        int tong = so1 + so2;
        int hieu = so1 - so2;
        int tich = so1 * so2;
        double thuong = so1/so2; 
        int phandu = so1 % so2;

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phan du: " + phandu);
        sc.close();
    }
}