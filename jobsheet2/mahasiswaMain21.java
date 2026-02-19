package jobsheet2;

public class mahasiswaMain21 {
    public static void main(String[] args) {

        mahasiswa21 mhs1 = new mahasiswa21();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa21 mhs2 = new mahasiswa21("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();  

        mahasiswa21 mhs = new mahasiswa21("Nizar Ramzy", "254107020112", 3.70, "TI 1D");
        mhs.tampilkanInformasi();
    }
}
