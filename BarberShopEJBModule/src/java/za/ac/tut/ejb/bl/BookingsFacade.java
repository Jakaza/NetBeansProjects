/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Bookings;

/**
 *
 * @author Magamula
 */
@Stateless
public class BookingsFacade extends AbstractFacade<Bookings> implements BookingsFacadeLocal {

    @PersistenceContext(unitName = "BarberShopEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookingsFacade() {
        super(Bookings.class);
    }
    
}
