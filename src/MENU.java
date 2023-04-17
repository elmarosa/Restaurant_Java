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

