import java.util.Scanner;

public abstract class App {
    private String nama, nik;
    public int kasAwal = 20000000;
    Scanner input = new Scanner(System.in);

    public abstract String list();
    public abstract String Data();
    

    public String getNama() {
        return nama;
    }

    public void SetNama(String nama) {
        this.nama = nama;

    }

    public String getNik() {
        return nik;
    }

    public void SetNik(String nama) {
        this.nik = nik;

    }

}

interface Hitung {
    void hitung();
}

class Pemasukan extends App implements Hitung {
    int pilihBayar, Jumlah, totalBayar, hargaBayar, totalPembayaran;
    int[] Harga = { 0, 45000, 50000, 40000, 38000, 32000 };

    @Override
    public String list() {
        System.out.println("* Pendataan Barang Masuk PT.Garuda Abadi Group *");
        System.out.println("=====================================================");
        System.out.println("|| Jenis Barang || Nama Barang || Jumlah || Harga  ||");
        System.out.println("=====================================================");
        System.out.println("||1. Buku       || Buku Tulis  || 1 Pax  || 45.000 ||");
        System.out.println("||2. Buku       || Buku Gambar || 1 pax  || 50.000 ||");
        System.out.println("||3. Kertas     || Kertas A4   || 1 rim  || 40.000 ||");
        System.out.println("||4. Pulpen     || Pulpen Biru || 1 pax  || 38.000 ||");
        System.out.println("||5. Pensil     || Pensil Raut || 1 pax  || 32.000 ||");
        System.out.println("=====================================================");
        return null;
    }

    @Override
    public String Data() {
        System.out.print("Nama Admin :");
        SetNama(input.nextLine());
        System.out.print("Nik Admin : ");
        SetNik(input.nextLine());

        System.out.println();

        return null;
    }

    void PilihPembayaran() {
        totalBayar = 0;
        while (getNama().equals(getNama())) {
            System.out.println("=====================================================");
            System.out.print("Pilihan Anda : ");
            pilihBayar = input.nextInt();
            System.out.print("Banyaknya Barang yang Masuk : ");
            Jumlah = input.nextInt();

            if (pilihBayar == 0) {
                hitung();
                System.out.println("Selesai");
                System.out.println("Total Pemasukan => Rp." + totalPembayaran);

                System.out.println("Total Kas => Rp." + kasAwal);
                System.out.println();
                System.out.println();

                break;
            }

            hargaBayar = Harga[pilihBayar] * Jumlah;
            totalBayar = totalBayar + hargaBayar;

            System.out.println("Data Tersimpan");
            System.out.println("Harga Sebesar : Rp." + hargaBayar + ",00");

        }
    }

    @Override
    public void hitung() {
        totalPembayaran = totalBayar;
        kasAwal = kasAwal + totalPembayaran;
    }

}



class Pengeluaran extends App implements Hitung {
    int pilihBayar, jumlah, totalBayar, hargaBayar, totalPembayaran;
    int[] Harga = { 0, 45000, 50000, 40000, 38000, 32000 };
    String nama = "admin123";

    @Override
    public String list() {
        System.out.println("* Pendataan Barang Keluar PT.Garuda Abadi Group *");
        System.out.println("=====================================================");
        System.out.println("|| Jenis Barang || Nama Barang || Jumlah || Harga  ||");
        System.out.println("=====================================================");
        System.out.println("||1. Buku       || Buku Tulis  || 1 Pax  || 45.000 ||");
        System.out.println("||2. Buku       || Buku Gambar || 1 pax  || 50.000 ||");
        System.out.println("||3. Kertas     || Kertas A4   || 1 rim  || 40.000 ||");
        System.out.println("||4. Pulpen     || Pulpen Biru || 1 pax  || 38.000 ||");
        System.out.println("||5. Pensil     || Pensil Raut || 1 pax  || 32.000 ||");
        System.out.println("=====================================================");
        return null;

    }


    void PilihPembayaran() {
        totalBayar = 0;
        while (this.nama.equals("admin123")) {
            System.out.println("=====================================================");
            System.out.print("Pilihan Anda : ");
            pilihBayar = input.nextInt();
            System.out.print("Banyaknya Barang yang Keluar : ");
            jumlah = input.nextInt();

            if (pilihBayar == 0) {
                hitung();
                System.out.println("Selesai");
                System.out.println("Total Keluar => Rp." + totalPembayaran);
                System.out.println();
                System.out.println();


                break;
            }

            hargaBayar = Harga[pilihBayar] * jumlah;
            totalBayar = totalBayar + hargaBayar;

            System.out.println("Data Tersimpan");
            System.out.println("Harga Sebesar : Rp." + hargaBayar + ",00");

        }
    }

    @Override
    public void hitung() {
        totalPembayaran = totalBayar;

    }

    @Override
    public String Data() {
        // TODO Auto-generated method stub
        return nama;
    }

 

}

class Login {
    private String id;

    public void setId(String id) {
        this.id = id;

    }

    Scanner input = new Scanner(System.in);

    void CobaLogin() {
        System.out.println("Silahkan Masukan ID Anda :");
        System.out.println("==========================");
        System.out.print("ID : ");
        setId(input.nextLine());
        System.out.println();

    }

    public String getId() {
        return id;
    }
}

class main {

    public static void main(String[] args) {
        int pilih;
        String id;
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        Pemasukan PemasukanBarang = new Pemasukan();
        Pengeluaran PengeluaranBarang = new Pengeluaran();
        System.out.println("--- Distributor PT. Garuda Abadi Group ---");
        System.out.println("==============================================");

        login.CobaLogin();

        if (login.getId().equalsIgnoreCase("admin123")) {
            System.out.println("Pilih Check data Barang : ");
            System.out.println("1. Barang Masuk");
            System.out.println("2. Barang Keluar");
            System.out.println();

            System.out.print("Masukan Pilihan Data : ");
            pilih = input.nextInt();
            System.out.println("============================");
            System.out.println();

            if (pilih == 1) {
                PemasukanBarang.Data();
                PemasukanBarang.list();

                PemasukanBarang.PilihPembayaran();
                PengeluaranBarang.Data();
                PengeluaranBarang.list();
                PengeluaranBarang.PilihPembayaran();

            } else if (pilih == 2) {
                PengeluaranBarang.list();
                PengeluaranBarang.Data();

            }

            int sisaKas = PemasukanBarang.kasAwal-PengeluaranBarang.totalBayar;
            System.out.println("Sisa Kas dari total pengeluaran : Rp." + sisaKas);
            System.out.println();

        } else {
            System.out.println("ID Anda Salah -> " +login.getId());
        }
        System.out.println("Administrasi Persedian barang distributor PT.Garuda Abadi Group");
        System.out.println("Check,Data dan Antar, Ketelitian anda dalam Administrasi di Utamakan (_)");
    }
}