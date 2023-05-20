/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.nailgun;

import oop.gun.Gun;

/**
 *
 * @author Student
 */
public class NailGun extends Gun{
    
    private char type;

    public NailGun( char type,int ammoCount, int maxAmmo) {
        super(ammoCount, maxAmmo);
        this.type = type;
    }

    public char getType() {
        return type;
    }
   
    @Override
    public String shoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return NailGun;
        
    }
    
    
}
