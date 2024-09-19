import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tien gui (VND): ");
        double sotiengui = sc.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        double laisuat = sc.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int sothanggui = sc.nextInt();

        double lai = sotiengui * (laisuat / 100) * (sothanggui / 12.0);
        double sotiencuoiky = sotiengui + lai;

        System.out.printf("So tien lai: %.2f VND%n", lai);
        System.out.printf("So tien goc cuoi ky: %.2f VND%n", sotiencuoiky);

        sc.close();
    }
}