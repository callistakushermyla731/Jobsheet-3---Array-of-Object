import java.util.Scanner;
public class mataKuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mataKuliah04[] arrayOfMataKuliah04 = new mataKuliah04[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah Ke-" + (i + 1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            System.out.print("SKS          : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam   : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");

            arrayOfMataKuliah04[i] = new mataKuliah04(kode, nama, sks, jumlahJam);
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i+1));
            System.out.println("Kode        : " + arrayOfMataKuliah04[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah04[i].nama);
            System.out.println("SKS         : " + arrayOfMataKuliah04[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMataKuliah04[i].jumlahJam);
            System.out.println("----------------------------------------");
        }
    }
}
