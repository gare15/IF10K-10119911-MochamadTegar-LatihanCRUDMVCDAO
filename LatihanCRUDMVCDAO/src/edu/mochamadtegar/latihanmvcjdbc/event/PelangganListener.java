/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mochamadtegar.latihanmvcjdbc.event;

import edu.mochamadtegar.latihanmvcjdbc.entity.Pelanggan;
import edu.mochamadtegar.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Administrator
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
    public void onInsert(Pelanggan pelanggan);
    
}
