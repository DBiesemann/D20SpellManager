/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jawa.awt.*
package Character;

/**
 *
 * @author Dave
 */
public class Spellbook {

    //Variable
   
    private string spellbookName,spellbookNotes;
    private Spell spells;
    
    
    public Spellbook() {
    spellbookName = "default";
    spellbookNotes = "nothing of interest";
    spells = new Spell();
    }
    
}
