import java.util.ArrayList;
import data.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    // private static final int okok = 0;

public class App extends menuSistem{
    public static void main(String[] args) throws IOException {
        ArrayList<Rokok> rokok = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            menuSistem menuSistem = new menuSistem();
            menuSistem.msg();
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    tampilkanRokok(rokok);
                    break;
                case 2:
                    tambahRokok(rokok);
                    break;
                case 3:
                    updateRokok(rokok);
                    break;
                case 4:
                    hapusRokok(rokok);
                    break;
                case 0:
                    System.out.println("Terimakasih Karena Anda Telah Menggunakan Program Ini");
                    System.exit(0);
                default:
                    break;
            }
        }

    }

    static void tampilkanRokok(ArrayList<Rokok> Rokok) {
        if (Rokok.isEmpty()) {
            System.out.println("Data Rokok Masih Kosong");
        } else {
            System.out.println("====================================================================================");
            System.out.printf("|%-4s| %-25s| %-15s| %-15s| %-15s| %n", "No", "Nama Rokok", "Nikotin Rokok", "Tar Rokok", "Harga Rokok" );
            for (int i = 0; i < Rokok.size(); i++) {
                Rokok rkk = Rokok.get(i);
                String namaRokok = rkk.getNamaRokok();
                int nikotinRokok = rkk.getnikotinRokok();
                int tarRokok = rkk.gettarRokok();
                int hargaRokok = rkk.gethargaRokok();
                System.out.println("====================================================================================");
                System.out.printf("|%-4d| %-25s| %-15s| %-15d| %-15s| %n", i + 1, namaRokok, nikotinRokok, tarRokok, hargaRokok);
            }
            System.out.println("====================================================================================");
        }
    }

    public static void tambahRokok(ArrayList<Rokok> rokok) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan Nama Rokok : ");
        String namaRokok = br.readLine();
        System.out.print("Masukkan Nikotin Rokok : ");
        int nikotinRokok = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tar Rokok : ");
        int tarRokok = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Harga Rokok : ");
        int hargaRokok = Integer.parseInt(br.readLine());
    

        Rokok rkk = new Rokok(namaRokok, nikotinRokok, tarRokok, hargaRokok);
        rokok.add(rkk);
    }

    public static void updateRokok(ArrayList<Rokok> rokok) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Update Data Rokok");
        tampilkanRokok(rokok);
        System.out.print("Data Nomor Ke Berapa Yang Ingin Di Update? : ");
        int cari = Integer.parseInt(br.readLine()) - 1;
        for (int i = 0; i < rokok.size(); i++ ) {
            if (cari == i) {
                Rokok newRokok = rokok.get(i);
                System.out.print("Masukkan Nama Rokok Baru  : ");
                String newNamaRokok = br.readLine();
                newRokok.setNamaRokok(newNamaRokok);
                System.out.print("Masukkan Nikotin Rokok Baru    : ");
                int newnikotinRokok = Integer.parseInt(br.readLine());
                newRokok.setnikotinRokok(newnikotinRokok);
                System.out.print("Masukkan Tar Baru : ");
                int newtarRokok = Integer.parseInt(br.readLine());
                newRokok.settarRokok(newtarRokok);
                System.out.print("Masukkan Harga Baru : ");
                int newhargaRokok = Integer.parseInt(br.readLine());
                newRokok.sethargaRokok(newhargaRokok);
            }
        }
    }
    
    public static void hapusRokok(ArrayList<Rokok> rokok) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Hapus Data Rokok");
        tampilkanRokok(rokok);
        System.out.print("Data Nomor Ke Berapa Yang Ingin Di Hapus? : ");
        int hapus = Integer.parseInt(br.readLine()) - 1;
        rokok.remove(hapus);
    }
}