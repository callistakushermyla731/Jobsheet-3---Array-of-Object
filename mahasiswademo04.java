import java.util.Scanner;
public class mahasiswademo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswa03[] arrayOfMahasiswa = new mahasiswa03[3];
        String dummy;

        for(int i = 0; i < 3; i++){
            arrayOfMahasiswa[i] = new mahasiswa03();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
            System.out.println("-----------------------------------");
        }
    }
}
