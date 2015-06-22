/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokko.uds;

import java.util.List;

/**
 *
 * @author psyriccio
 */
public interface IServerManager {
    
    public List<IPluginDescriptor> getPluginsDescriptors();
    
}
