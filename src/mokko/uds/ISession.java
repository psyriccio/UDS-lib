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
public interface ISession {

    public String getId();
    public void clear();
    public void close();
    public Object get(String key);
    public void put(String key, Object obj);
    
}
