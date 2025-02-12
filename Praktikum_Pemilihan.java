import java.util.Scanner;

public class Praktikum_Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tugas, kuis, UTS, UAS;
        double nilaiAkhir = 0;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextInt();

        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        UTS = input.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        UAS = input.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("Nilai Tidak Valid");

            System.out.println("==============================");
            System.out.println("==============================");
        } else {
            nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (UTS * 0.3) + (UAS * 0.3);

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

            System.out.println("Nilai Akhir = " + nilaiAkhir);
            System.out.println("Nilai Huruf = " + nilaiHuruf);

            System.out.println("==============================");
            System.out.println("==============================");

            switch (nilaiHuruf) {
                case "A":
                case "B+":
                case "B":
                case "C+":
                case "C":
                    System.out.println("SELAMAT ANDA LULUS");
                    break;
                case "D":
                case "E":
                    System.out.println("ANDA TIDAK LULUS");
                    break;
                default:
                    System.out.println("Terjadi kesalahan dalam perhitungan.");
                    break;
            }
        }

        input.close();
    }
}
