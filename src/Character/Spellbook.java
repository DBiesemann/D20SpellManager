/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Character;

import d20References.Spell;

/**
 *
 * @author Dave
 */
public class Spellbook {

    //Variable
   
    private String spellbookName,spellbookNotes;
    private Spell spells;
    
    
    public Spellbook() {
    spellbookName = "default";
    spellbookNotes = "nothing of interest";
    spells = new Spell();
    }
//Methoden
    //Getter
    String getSpellbookName(){
        return spellbookName;
    }
    String getSpellbookNotes(){
        return spellbookNotes;
    }
    Spell getSpells(){
        return spells;
    }
    //Setter
    void setSpellbookName(String z){
        spellbookName = z;
    }
    void setSpellbookNotes(String z){
        spellbookNotes = z;
    }
    void setSpells(Spell y){
        spells = y;
    }
}
