/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character;

import java.lang.*;

/**
 *
 * @author Dave
 */
public class Chara {
    
    //Variablen
    
    private String heroName,memo;
    private int st,de,co,in,wi,ch,ap,chakLvl;
    private Caster caster;
    
    //Konstruktoren
    
    Chara () {
    heroName = "default";
    st=de=co=in=wi=ch=ap=10;
    chakLvl=1;
    }
    
    Chara (String hero){
    heroName = hero;
    st=de=co=in=wi=ch=ap=10;
    chakLvl=1;
        
    }
    //Methoden
    
    void addCasterClass(){
        caster = new Caster();
    }
    //getter
    int getChakLvl(){
        return chakLvl;
    }
 int getSt(){
     return st;
 }
 
 int getDe(){
     return de;
 }
 int getCo(){
     return co;
 }
 int getIn(){
     return in;
 }
 int getWi(){
     return wi;
 }
 int getCh(){
     return ch;
 }
int getAp(){
    return ap;
}
String getHeroName(){
    return heroName;
}
String getMemo(){
    return memo;
}
//setter
void setChakLvl(int x){
    chakLvl = x;
}
void setSt(int x){
    st = x;
}
void setDe(int x){
    de = x;
}
void setCo(int x){
    co = x;
}
void setIn(int x){
    in = x;
}
void setWi(int x){
    wi = x;
}
void setCh(int x){
    ch = x;
}
void setAp(int x){
    ap = x;
}
void setHeroName(String hero){
    heroName = hero;
}
void setMemo(String z){
    memo = z;
}
}



