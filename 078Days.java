import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.println("=== SA'AKAD 1.2 ===");
        System.out.println("\nSilahkan Login ke Akun Anda");
        System.out.println("Pastikan Nama dan Password anda benar!");
        
        String nama;
        String NIM;
        int i = 1;
        
        do {
            System.out.print("\n\n== Percobaan ke"+i+" ==");
            
            System.out.print("\nMasukkan Username: ");
            nama = hi.nextLine();
            System.out.print("Masukkan Password: ");
            NIM = hi.nextLine();
            
            if (nama.equals("mnoor") && NIM.equals("3")){
                System.out.println("Anda login sebagai mahasiswa");
                break;
            }else if (nama.equals("admin") && NIM.equals("admin")){
                System.out.println("Anda login sebagai admin");
                break;
            }else{
                System.out.println("Akun anda tidak ditemukan ");
            }
            
            i++;
        } while (i<=10);
        
        if (i>=10) System.out.println("\nMohon Maaf Coba lagi tahun depan");
        
    }
}
