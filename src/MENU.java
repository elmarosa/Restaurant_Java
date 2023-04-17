import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int pil, id, index, kuantitas, countRestaurant = 0;
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        char loop;

        do{
            System.out.println("====== MENU UTAMA ======");
            System.out.println("=== 1. Login         ===");
            System.out.println("=== 2. Keluar        ===");
            System.out.println("========================");
            System.out.print("pilih : ");
            pil = Integer.parseInt(input.nextLine());

            System.out.println();
            switch(pil){
                case 1:{
                    System.out.println("Masukkan Data ! ");
                    System.out.print("1. Username : ");
                    username = input.nextLine();

                    System.out.print("2. Password : ");
                    password = input.nextLine();

                    if(username.equals("admin") && password.equals("haiadmin")){
                        do{
                            System.out.println("\n========= MENU ADMIN =========");
                            System.out.println("=== 1. Pantau Restaurant   ===");
                            System.out.println("=== 2. Tambah Restaurant   ===");
                            System.out.println("=== 3. Delete Restaurant   ===");
                            System.out.println("=== 4. Back to Login       ===");
                            System.out.println("==============================");
                            System.out.print("pilih : ");
                            pil = Integer.parseInt(input.nextLine());

                            System.out.print("\n");
                            switch(pil){
                                case 1:{
                                    if(restaurants.size() > 0){
                                        System.out.print("======== DATA RESTAURANT ========");
                                        for(Restaurant restaurant : restaurants){
                                            System.out.println("\nID      : " + restaurant.getId());
                                            System.out.println("Nama    : " + restaurant.getNama());
                                            System.out.println("Alamat  : " + restaurant.getAlamat());
                                            if(restaurant.getMakanan().size() > 0){
                                                System.out.println("MENU MAKANAN :");
                                                for(int i=0; i < restaurant.getMakanan().size(); i++){
                                                    System.out.println((i+1) + ". " + restaurant.getMakanan().get(i).getNama() + " ( " + restaurant.getMakanan().get(i).getHarga() + " )");
                                                }
                                            }else{
                                                System.out.println("[!] Tidak Terdapat Menu Makanan");
                                            }
