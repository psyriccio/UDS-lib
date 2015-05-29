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
public interface IServerPlugin {

    public String getName();
    public String getDescription();
    
    public void init(IServer server, String sessionKey);
    public void done(IServer server);
    
    public ServerResponce get(String Uri);
    public ServerResponce post(String Uri);
    
}
