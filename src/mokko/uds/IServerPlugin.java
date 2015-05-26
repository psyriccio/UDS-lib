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
    
    public void init();
    public void done();
    
    public ServerResponce get(String Uri);
    public ServerResponce post(String Uri);
    
}
