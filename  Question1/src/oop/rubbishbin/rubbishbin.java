/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.rubbishbin;

/**
 *
 * @author Student
 */
public abstract  class rubbishbin {
    
    private String type;
    private double capacity;

    public rubbishbin(String type, double capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }
    
    
   
    
    
    
}
