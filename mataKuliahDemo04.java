import java.util.Scanner;

public class mataKuliahDemo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        mataKuliah04[] arrayOfMataKuliah04 = new mataKuliah04[jumlah];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < jumlah; i++) {

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

            arrayOfMataKuliah04[i] = new mataKuliah04();
            arrayOfMataKuliah04[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n===== DATA MATA KULIAH =====");
        for(mataKuliah04 mk : arrayOfMataKuliah04) {
            mk.cetakInfo();
        }

        sc.close();
    }
}