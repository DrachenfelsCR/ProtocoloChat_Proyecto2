/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatProtocol;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class PaqueteDatos implements Serializable {
    
    private String mensaje;
    private String idEmisor;
    private String idReceptor;

    public PaqueteDatos(String mensaje, String idEmisor, String idReceptor) {
        this.mensaje = mensaje;
        this.idEmisor = idEmisor;
        this.idReceptor = idReceptor;
    }
   
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(String idEmisor) {
        this.idEmisor = idEmisor;
    }

    public String getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(String idReceptor) {
        this.idReceptor = idReceptor;
    }
    
    
    
}
