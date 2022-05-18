
package com.sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Info2Replica extends AbstractTableModel {

    private ArrayList<Info1> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public Info2Replica(ArrayList<Info1> lines) {
        this.lines = lines;
    }

    public ArrayList<Info1> getLines() {
        return lines;
    }
    
@Override
    public String getColumnName(int x) {
        return columns[x];
    }    

    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Info1 line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getNum();
            case 1: return line.getItem();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getLineTotal();
            default : return "";
        }
    }
    
}

