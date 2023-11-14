package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {
    Document d = new Document();

    public void test1() {
        assertEquals(d.getTexte(), "");
        d.ajouter("Hello World!");
        assertEquals(d.getTexte(), "Hello World!");
        d.clear();
        assertEquals(d.getTexte(), "");
    }
}
