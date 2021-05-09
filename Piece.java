public class Piece {

    private String id;
    private String couleur;
    private String type;
    private boolean etat;

    public String toString() {
        return "Id= " + this.getId() + ", couleur= " + this.getCouleur() + ", type= " + this.getType() + ", etat= "
                + this.isEtat();
    }

    public Piece() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String value) {
        this.couleur = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public boolean isEtat() {
        return this.etat;
    }

    public void setEtat(boolean value) {
        this.etat = value;
    }
}