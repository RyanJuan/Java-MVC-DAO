/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rayan.latihanmvcjdbc.main;

import java.sql.SQLException;
import javax.swing.SwingUtilities;
import rayan.latihanmvcjdbc.entity.Pelanggan;
import rayan.latihanmvcjdbc.error.PelangganException;
import rayan.latihanmvcjdbc.service.PelangganDao;
import rayan.latihanmvcjdbc.view.MainViewPelanggan;

/**
 *
 * @author RyanJuan
 * NIM      : 10115557
 * NAMA     : RAYAN
 * KELAS    : PBOULG
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws rayan.latihanmvcjdbc.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
               @Override
                public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }
                
                }
        });

        /**
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("RAYAN");
        pelanggan.setAlamat("Jl. TamanSari Bawah");
        pelanggan.setTelepon("081213410895");
        pelanggan.setEmail("10115557rayan@gmail.com");
        
        dao.insertPelanggan(pelanggan);
        
        
    }
    
}
*/

    }
}