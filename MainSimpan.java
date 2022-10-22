import java.util.ArrayList;
import java.util.Scanner;
 
public class MainSimpan {
 
    public static void main(String[] args) {
        ArrayList<Simpan> s = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
 
       do{
            System.out.println("----------------------------");
            System.out.println("--- Koperasi Bang Jek ----");
            System.out.println("----------------------------");
            System.out.println("  1. Simpanan");
            System.out.println("  2. List Data");
            System.out.println("  3. Keluar sistem");
            System.out.println("----------------------------");
            System.out.print("  Pilihanmu: ");
            pilihan = sc.nextInt();
 
           if(pilihan == 1 ){
               s = simpan(s);
           }else if(pilihan == 2){
                s = list_data(s);
           }
       }while (pilihan != 3);
 
    }
 
    private static ArrayList<Simpan> simpan( ArrayList<Simpan> s ){ 
        Scanner sc = new Scanner(System.in);
        String no_anggota, nama, keterangan;
        Integer saldo;
        boolean ok;
        
        System.out.println("--- Selamat Datang Di Koperasi Simpanan Bang Jek ----");
        System.out.println("----------------------------");
        System.out.print("No Anggota: ");
        no_anggota = sc.nextLine();
        
        System.out.print("Nama: ");
        nama = sc.nextLine();
        
        System.out.print("Keterangan: ");
        keterangan = sc.nextLine();
        
        do {
            System.out.print("Saldo : ");
            saldo = sc.nextInt();            
            ok = cekSaldo(saldo);
        }while(ok == false);
        
        s.add(new Simpan( no_anggota, nama, saldo, keterangan));
        return s;
    }
 
    private static ArrayList<Simpan> list_data( ArrayList<Simpan> s ){
        Scanner sc = new Scanner(System.in);
        Integer saldo;
        boolean ok;
 
        //tampilkan data 
        System.out.println("Jumlah data: "+ s.size());
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %-3s | %-10s | %-10s | %-5s | %-7s |", 
                "No",
                "No Anggota",
                "Nama",
                "Saldo",
                "Keterangan");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
 
        int total_saldo = 0;
        for(int i = 0; i < s.size(); i++ ){
            System.out.printf("| %-3s | %-10s | %-10s | %-5s | %-7s |", 
                i + 1,
                s.get(i).getNoAnggota(),
                s.get(i).getNama(),
                s.get(i).getKeterangan(),
                saldo = s.get(i).getSaldo());
                
                total_saldo += saldo;
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
 
        }

        System.out.println("Total Saldo : " + total_saldo);
        
        System.out.println("--------------------------------------------------------------------");
         
        return s;
    }
    
    public static boolean cekSaldo(int s) {
        boolean ok = false;
        
        if(s > 0) {
            ok = true;
        }else {
            System.out.println("Saldo Harus lebih dari 0");
        }
        
        return ok;
    }
}