/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Swift 3x
 */
public class Posttest3 {
 static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Tembakau> list = new ArrayList<>();
    
    static ArrayList<kretek> listKretek = new ArrayList<>();
    static ArrayList<filter> listFilter = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        while(true){
        System.out.println("Manajemen Toko Bacco");
        System.out.println(" 1. Tambah Data bacco \n 2. Lihat Data Bacco \n 3. update Data Bacco \n 4. Hapus Data Bacco \n 5. exit \n masukkan pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        
       
        switch (pilihan){
            case 1 -> tambah();
            case 2 -> tampil();
            case 3 -> ubah();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("Input Menu Salah");
        }
            System.out.println("\n\n");
    }
   }
    
    static void tambah()throws IOException{
//        System.out.println("Masukkan Nama Tembakau : ");
//        String nama = br.readLine();
//        
//        System.out.println("Masukkan rasa  : ");
//        String rasa = br.readLine();
//        
//        System.out.println("Masukkan Harga per gram : ");
//        float harga = Float.parseFloat(br.readLine());
//        
//        Tembakau tbk = new Tembakau(nama, rasa, harga);
//        list.add(tbk);
 System.out.println("kretek / filter : /\n 1. tambah tembakau kretek \n 2. tambah tembakau filter \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        switch (pil) {
         case 1:
             {
                 System.out.println("Masukkan Nama : ");
                 String nama = br.readLine();
                 System.out.println("Masukkan Rasa : ");
                 String rasa = br.readLine();
                 System.out.println("Masukkan harga : ");
                 float harga = Float.parseFloat(br.readLine());
                 System.out.println("Masukkan gram : ");
                 int gram = Integer.parseInt(br.readLine());
                 kretek krt = new kretek(nama, rasa, harga, gram);
                 listKretek.add(krt);
                 break;
             }
         case 2:
             {
                 System.out.println("Masukkan Nama : ");
                 String nama = br.readLine();
                 System.out.println("Masukkan Rasa : ");
                 String rasa = br.readLine();
                 System.out.println("Masukkan Harga : ");
                 float harga = Float.parseFloat(br.readLine());
                 System.out.println("Masukkan gram : ");
                 int gram = Integer.parseInt(br.readLine());
                 filter flt = new filter(nama, rasa, harga, gram);
                 listFilter.add(flt);
                 break;
             }
         default:
             System.out.println("salah wal");
             break;
     }
    }
         
  public static void tampil() {
        if (listKretek.isEmpty() && listFilter.isEmpty()) {
            System.out.println("List Masih Kosong Wal...");
        } else {
            System.out.println("\n");
            System.out.println("kretek");
            for (int i = 0; i < listKretek.size(); i++) {
                System.out.print(i + 1 + "\t");
                System.out.print(listKretek.get(i).getNama() + "\t");
                System.out.print(listKretek.get(i).getRasa() + "\t");
                System.out.print(listKretek.get(i).getHarga() + "\t");
                System.out.print(listKretek.get(i).getGram() + "\t");
            }
            System.out.println("\n\n");
            
            System.out.println("Filter");
            for (int i = 0; i < listFilter.size(); i++) {
                System.out.print(i + 1 + "\t");
                System.out.print(listFilter.get(i).getNama() + "\t");
                System.out.print(listFilter.get(i).getRasa() + "\t");
                System.out.print(listFilter.get(i).getHarga() + "\t");
                System.out.print(listFilter.get(i).getGram() + "\t");
              
            }
        }
    }

    static void ubah()throws IOException{
        }
    System.out.println("kretek / filter : /\n 1. kretek \n 2. filter \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.rea1dLine()); 
        switch (pil) {
         case 1:
             {
                 System.out.println("mau diubah index berapa : ");
                 int pilihan = Integer.parseInt(br.readLine());
                 for(i = 0; i < lisKretek.size();i++){
                   kretek kretek = ListKretek.get(i);
                   if(listKretek.getname().equals(pilihan)){
                 System.out.println("nama : ");
                  listKretek.get(pilihan).setNama(br.readLine());
                  System.out.println("rasa : ");
                  listKretek.get(pilihan).setRasa(br.readLine());
                  System.out.println("Harga : "); 
                  listKretek.get(pilihan).setHarga(Float.parseFloat(br.readLine()));
                  System.out.println("Gram : "); 
                  listKretek.get(pilihan).setGram(Integer.parseInt(br.readLine()));
                   }
                 }
                 break;
             }
         case 2:
             {
                 System.out.println("mau diubah index berapa : ");
                    int pilihan = Integer.parseInt(br.readLine());
                    pilihan -=1;
                 System.out.println("nama : ");
                  listFilter.get(pilihan).setNama(br.readLine());
                  System.out.println("rasa : ");
                  listFilter.get(pilihan).setRasa(br.readLine());
                  System.out.println("Harga : "); 
                  listFilter.get(pilihan).setHarga(Float.parseFloat(br.readLine()));
                  System.out.println("Gram : "); 
                 listKretek.get(pilihan).setGram(Integer.parseInt(br.readLine()));
                 break;
             }
            
       
        
    }
    public static void hapus()throws IOException{
        System.out.println("kretek / filter : /\n 1. kretek \n 2. filter \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine()); 
        switch (pil) {
         case 1:
             {
                System.out.println("mau hapus index berapa : ");
                int pilihan = Integer.parseInt(br.readLine());
                pilihan -=1;
                list.remove(pilihan);
                System.out.println("data berhasil dihapus");
                 break;
             }
             case 2:
             {
                System.out.println("mau hapus index berapa : ");
                int pilihan = Integer.parseInt(br.readLine());
                pilihan -=1;
                list.remove(pilihan);
                System.out.println("data berhasil dihapus");
                 break;
             }
        }
    }
    


