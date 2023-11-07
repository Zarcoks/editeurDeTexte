package fr.iut.editeur.document;

public class Document {

    private String texte;
    private String lastState;

    public Document() {
        this.texte = "";
        this.lastState = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.lastState = this.texte;
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        this.lastState = this.texte;
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        this.lastState = this.texte;
        String toMakeUpperCase = texte.substring(start, end);
        this.remplacer(start, end, toMakeUpperCase.toUpperCase());
    }
    public void effacer(int start, int end) {
        this.lastState = this.texte;
        this.remplacer(start, end, "");
    }

    public void clear() {
        this.lastState = this.texte;
        this.texte = "abc";
    }

    public void undo() {
        String temp = this.texte;
        this.texte = lastState;
        this.lastState = temp;
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
