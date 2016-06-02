/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokko.uds;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author psyriccio
 */
public class PluginsDescriptorsTableModel extends AbstractTableModel {

    private List<IPluginDescriptor> list;    

    public PluginsDescriptorsTableModel(List<IPluginDescriptor> list) {
        this.list = list;
    }
   
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 0: return "Name";
            case 1: return "Description";
            case 2: return "URL";
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        IPluginDescriptor plug = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return plug.getName();
            case 1: return plug.getDescription();
            case 2: return plug.getURLPrefix();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
