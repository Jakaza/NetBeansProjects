/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Service;

/**
 *
 * @author Student
 */
public  interface Service {
    
    public abstract void start();
    
     public abstract void stop();
     
     public abstract boolean isRunning();
    
}
