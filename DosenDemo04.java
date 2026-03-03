import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        Dosen04[] daftarDosen = new Dosen04[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            String jkInput = sc.nextLine();

            boolean jenisKelamin;
            if (jkInput.equalsIgnoreCase("L")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            daftarDosen[i] = new Dosen04(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== DATA DOSEN =====");

        for (Dosen04 d : daftarDosen) {

            String jk;
            if (d.jenisKelamin == true) {
                jk = "Laki-laki";
            } else {
                jk = "Perempuan";
            }

            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("----------------------------");
        }

        DataDosen04 data = new DataDosen04();

        System.out.println("\n===== DATA DOSEN =====");
        data.dataSemuaDosen(daftarDosen);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n===== RATA-RATA USIA PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n===== DOSEN PALING TUA =====");
        data.infoDosenPalingTua(daftarDosen);

        System.out.println("\n===== DOSEN PALING MUDA =====");
        data.infoDosenPalingMuda(daftarDosen);
    }
}