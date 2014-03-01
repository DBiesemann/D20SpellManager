/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d20References;

/**
 * 
 *
 * @author Dave
 */

public class Spell {

private String spellName, spellSchool, spellComponents, spellCastingTime, spellRange, spellTarget, spellDuration, spellSavingThrow, spellResistance, spellDescription, spellOrigin;
int spellLevel;
public Spell(){
    spellName = "enter spell name";
    spellSchool = "enter spell school";
    spellComponents = "enter spell components and foci";
    spellCastingTime = "enter casting time";
    spellRange = "enter range";
    spellTarget = "enter target";
    spellDuration = "enter duration";
    spellSavingThrow = "enter saving throw";
    spellResistance = "enter spellresistance";
    spellLevel = 0;
    spellDescription = "enter description";
    spellOrigin = "enter sourcebook";
}
//Methoden
//Getter
    public String getSpellCastingTime() {
        return spellCastingTime;
    }

    public String getSpellComponents() {
        return spellComponents;
    }

    public String getSpellDescription() {
        return spellDescription;
    }

    public String getSpellDuration() {
        return spellDuration;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public String getSpellName() {
        return spellName;
    }

    public String getSpellOrigin() {
        return spellOrigin;
    }

    public String getSpellRange() {
        return spellRange;
    }

    public String getSpellResistance() {
        return spellResistance;
    }

    public String getSpellSavingThrow() {
        return spellSavingThrow;
    }

    public String getSpellSchool() {
        return spellSchool;
    }

    public String getSpellTarget() {
        return spellTarget;
    }
//Setter
    public void setSpellCastingTime(String spellCastingTime) {
        this.spellCastingTime = spellCastingTime;
    }

    public void setSpellComponents(String spellComponents) {
        this.spellComponents = spellComponents;
    }

    public void setSpellDescription(String spellDescription) {
        this.spellDescription = spellDescription;
    }

    public void setSpellDuration(String spellDuration) {
        this.spellDuration = spellDuration;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public void setSpellOrigin(String spellOrigin) {
        this.spellOrigin = spellOrigin;
    }

    public void setSpellRange(String spellRange) {
        this.spellRange = spellRange;
    }

    public void setSpellResistance(String spellResistance) {
        this.spellResistance = spellResistance;
    }

    public void setSpellSavingThrow(String spellSavingThrow) {
        this.spellSavingThrow = spellSavingThrow;
    }

    public void setSpellSchool(String spellSchool) {
        this.spellSchool = spellSchool;
    }

    public void setSpellTarget(String spellTarget) {
        this.spellTarget = spellTarget;
    }
    
    
}
;