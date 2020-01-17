/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rayan.latihanmvcjdbc.event;

import rayan.latihanmvcjdbc.entity.Pelanggan;
import rayan.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author RyanJuan
 * NIM      : 10115557
 * NAMA     : RAYAN
 * KELAS    : PBOULG
 */
public class PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
    
}

