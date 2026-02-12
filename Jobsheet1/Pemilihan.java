package Jobsheet1;
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=====================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas =sc.nextDouble();
        System.out.print("Masukkan nilai Kuis: ");
        double kuis =sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double UTS =sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double UAS =sc.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }
        
        double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (UTS * 0.3) + (UAS * 0.3);

        String nilaiHuruf;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
    
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C")) {
            
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("MAAF ANDA TIDAK LULUS");
        }

        


        
    }
    
}
