package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeUndo extends CommandeDocument {
    public CommandeUndo(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     *
     * Exécute la commande (sacrée surprise!)
     */
    @Override
    public void executer() {
        this.document.undo();
        super.executer();
    }
}
