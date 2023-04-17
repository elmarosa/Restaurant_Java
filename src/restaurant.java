import java.util.ArrayList;

public class restaurant {
    private int id;
    private String nama;
    private String alamat;
    private ArrayList<menu> makanan;
    private ArrayList<menu> minuman;

    public restaurant(){
        //default constructor
        this.makanan = new ArrayList<>();
        this.minuman = new ArrayList<>();
    }

    public restaurant(int id, String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.makanan = new ArrayList<>();
        this.minuman = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<menu> getMakanan() {
        return makanan;
    }

    public void setMakanan(ArrayList<menu> makanan) {
        this.makanan = makanan;
    }

    public void addMakanan(menu makanan) {
        this.makanan.add(makanan);
    }

    public ArrayList<menu> getMinuman() {
        return minuman;
    }

    public void setMinuman(ArrayList<menu> minuman) {
        this.minuman = minuman;
    }

    public void addMinuman(menu minuman) {
        this.minuman.add(minuman);
    }
}
