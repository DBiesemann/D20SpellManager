/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Character;

import java.awt.*;

/**
 *
 * @author Dave
 */
public class Caster {
    
    //Variablen
    
    private string className;
    private int casterlvl;
    private Spellbook spellbooks;
    private Spellbook  activespells;
    
    Caster (){
        className = "unkown Class";
        casterlvl = 1;
        spellbooks = new Spellbook();
        activespells = new Spellbook();
    }
}
