/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatProtocol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Chat {
    private List<String> mensajes;
    private String idEmisor;
    private String idReceptor;

    public Chat(ArrayList<String> mensajes, String idEmisor, String idReceptor) {
        this.mensajes = mensajes;
        this.idEmisor = idEmisor;
        this.idReceptor = idReceptor;
    }

    

    public List<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensaje) {
        this.mensajes = mensajes;
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
