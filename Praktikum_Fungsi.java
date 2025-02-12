public class Praktikum_Fungsi {
    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        hitungPendapatan(stockBunga, hargaBunga);

        int[] bungaMati = {-1, -2, 0, -5};
        stokSetelahBungaMati(stockBunga[3], bungaMati);
    }

    public static void hitungPendapatan(int[][] stockBunga, int[] hargaBunga) {
        System.out.println("Pendapatan jika semua bunga terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.printf("RoyalGarden %d: Rp %,d\n", i + 1, totalPendapatan);
        }
        System.out.println();
    }

    public static void stokSetelahBungaMati(int[] stock, int[] bungaMati) {
        System.out.println("Stok bunga di RoyalGarden 4 setelah beberapa bunga mati:");
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stock.length; i++) {
            int stokBaru = stock[i] + bungaMati[i];
            System.out.printf("%-10s: %d\n", namaBunga[i], stokBaru);
        }
    }
}

