
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Character;

/**
 *
 * @author Dave
 */
public class Caster {
    
    //Variablen
    
    private String className;
    private int casterlvl;
    private Spellbook spellbooks;
    private Spellbook  activespells;
    
    Caster (){
        className = "unkown Class";
        casterlvl = 1;
        spellbooks = new Spellbook();
        activespells = new Spellbook();
    }
    
    //Methodenµ
    
    //Getter
    String getClassName(){
        return className;
    }
    int getCasterlvl(){
        return casterlvl;
    }
    Spellbook getSpellbooks(){
        return spellbooks;
    }
    Spellbook getActivespells(){
        return activespells;
    }
    
    //Setter
    void setClassName(String z){
        className = z;
        }
    void setCasterlvl(int x){
        casterlvl = x;
    }
    void setSpellbooks(Spellbook y){
        spellbooks = y;
    }
    void setActivespells(Spellbook y){
        activespells = y;
    }
}
