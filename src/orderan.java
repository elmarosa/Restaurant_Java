import java.util.ArrayList;
public class orderan {
    private int idRestaurant;
    private ArrayList<menu> menuMakanan;
    private ArrayList<Integer> qtyMenuMakanan;
    private ArrayList<menu> menuMinuman;
    private ArrayList<Integer> qtyMenuMinuman;
    private float jarak;
    private long total;

    public Orderan(){
        //Default constructor
        menuMakanan = new ArrayList<>();
        qtyMenuMakanan = new ArrayList<>();
        menuMinuman = new ArrayList<>();
        qtyMenuMinuman = new ArrayList<>();
    }

    public int getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(int idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public ArrayList<menu> getMenuMakanan(){
        return menuMakanan;
    }

    public void addMenuMakanan(menu makanan){
        this.menuMakanan.add(makanan);
    }

    public ArrayList<Integer> getQtyMenuMakanan() {
        return qtyMenuMakanan;
    }

    public void addQtyMenuMakanan(int qty) {
        this.qtyMenuMakanan.add(qty);
    }

    public ArrayList<menu> getMenuMinuman(){
        return menuMinuman;
    }

    public void addMenuMinuman(menu minuman){
        this.menuMinuman.add(minuman);
    }

    public ArrayList<Integer> getQtyMenuMinuman() {
        return qtyMenuMinuman;
    }

    public void addQtyMenuMinuman(int qty) {
        this.qtyMenuMinuman.add(qty);
    }

    public float getJarak() {
        return jarak;
    }

    public void setJarak(float jarak) {
        this.jarak = jarak;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
