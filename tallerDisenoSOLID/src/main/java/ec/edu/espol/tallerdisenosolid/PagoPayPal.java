/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.tallerdisenosolid;

/**
 *
 * @author USER
 */
public class PagoPayPal implements PagoGeneral{
    private boolean loggedIn;

    @Override
    public void realizarCobro(double monto) {
        
        if(!loggedIn){
            //SE LOGEA
        }
        //Carga el monto de compra
    }

}
