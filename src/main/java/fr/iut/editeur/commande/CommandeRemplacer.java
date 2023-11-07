package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;0;5;banane");
            return;
        }
        int beginIndex = Integer.parseInt(parameters[1]);
        int endIndex = Integer.parseInt(parameters[2]);
        String texte = parameters[3];
        this.document.remplacer(beginIndex, endIndex, texte);
        super.executer();
    }
}
