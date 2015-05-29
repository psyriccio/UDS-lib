/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokko.uds;

/**
 *
 * @author psyriccio
 */
public interface IServer {

    public String getHelo();
    public String getVersion();
    
    public boolean isMessageAvailable(String sessionKey);
    public Object popMessage(String sessionKey);
    public Object[] popAllMessages(String sessionKey);
    public void sendMessage(String sesionKey, String recipient, Object message);
    
}
