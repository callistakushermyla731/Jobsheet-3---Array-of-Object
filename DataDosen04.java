public class DataDosen04 {
    void dataSemuaDosen(Dosen04[] arrayOfDosen) {
        for (Dosen04 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Laki-laki" : "Perempuan";

            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("----------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen04 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki : " + pria);
        System.out.println("Jumlah Dosen Perempuan : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen04 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0)
            System.out.println("Rata-rata Usia Laki-laki : " + (totalPria / jumlahPria));

        if (jumlahWanita > 0)
            System.out.println("Rata-rata Usia Perempuan : " + (totalWanita / jumlahWanita));
    }

    void infoDosenPalingTua(Dosen04[] arrayOfDosen) {
        Dosen04 tertua = arrayOfDosen[0];

        for (Dosen04 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Nama : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);
    }

     void infoDosenPalingMuda(Dosen04[] arrayOfDosen) {
        Dosen04 termuda = arrayOfDosen[0];

        for (Dosen04 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
    }
}
