/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor.action;

import editor.Document;
import editor.Editor;
import java.awt.event.ActionEvent;

/**
 *
 * @author evenal
 */
public class DelPrev extends EditorAction {

    public DelPrev(String name, Editor ed) {
        super(name, ed);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Document doc = editor.getDocument();
        doc.deletePrev();
        doc.print();
    }
}
