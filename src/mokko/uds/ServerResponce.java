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

    private String mediaType;
    private byte[] data;

    public ServerResponce() {
        data = null;
        mediaType = "";
    }

    public ServerResponce(byte[] data) {
        mediaType = "text/plain";
        this.data = data;
    }

    public ServerResponce(String mediaType, byte[] data) {
        this.mediaType = mediaType;
        this.data = data;
    }
    
    public ServerResponce(String data) {
        mediaType = "text/plain";
        try {
            this.data = data.getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            this.data = ex.getMessage().getBytes();
        }
    }

    public byte[] getData() {
        return data;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
    
}
