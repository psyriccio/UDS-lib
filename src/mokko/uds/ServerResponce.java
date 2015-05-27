/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokko.uds;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author psyriccio
 */
public class ServerResponce implements Serializable {

    private byte[] data;

    public ServerResponce() {
        data = null;
    }

    public ServerResponce(byte[] data) {
        this.data = data;
    }

    public ServerResponce(String data) {
        try {
            this.data = data.getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            this.data = ex.getMessage().getBytes();
        }
    }

    public byte[] getData() {
        return data;
    }
    
}
