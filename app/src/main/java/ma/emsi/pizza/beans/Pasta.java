package ma.emsi.pizza.beans;

public class Pasta {

    private  int id;
    private String nom;
    private int quantite;
    private int photo;
    private String desc;

    private static int comp;

    public Pasta() {
    }

    public Pasta(String nom, int quantite, int photo, String desc) {
        this.id = ++comp;
        this.nom = nom;
        this.quantite = quantite;
        this.photo = photo;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
