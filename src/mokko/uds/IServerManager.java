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
    public void unloadPlugin(String urlPrefix);
    
    //OS MXBean
    public String getArch();
    public int getAvailableProcessors();
    public String getOSName();
    public double getSystemLoadAverage();
    public String getOSVersion();
    
    //Runtime MXBean
    public String getVMName();
    public String getVMSpecName();
    public String getVMSpecVendor();
    public String getVMSpecVersion();
    public String getVMImplName();
    public String getVMImplVendor();
    public String getVMImplVersion();
    
}
