package Jobsheet1;
import java.util.Scanner;

public class ArrayIPSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 2, 2, 3, 2, 4, 1, 2};

        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobotNilai = new double[mk.length];
        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        double ip = totalBobot / totalSKS;

        System.out.println("=====================");
        System.out.println("hasil Konversi Nilai=");
        System.out.println("=====================");
        System.out.printf("%-40s %-12s %-12s %-12s%n",
        "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f%n",
            mk[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("=====================");
        System.out.printf("IP : %.2f%n", ip);
    }
}
