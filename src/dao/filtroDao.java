/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author LN710Q
 */
import conexion.Conexion;
import interfaces.metodos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.filtro;


public class filtroDao implements metodos<filtro> {
    private static final String SQL_INSERT="INSERT INTO filtros_aceite(codFiltro,marca,stock,existencia) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE filtros_aceite SET marca=?, stock=?, existencia=? WHERE codFiltro=?";
    private static final String SQL_DELETE="DELETE FROM filtros_aceite WHERE codFiltro=?";
    private static final String SQL_READ="SELECT*FROM filtros_aceite WHERE codFiltro=?";
    private static final String SQL_READALL="SELECT * FROM filtros_aceite";
    private static final Conexion con=Conexion.conectar();
    
    @Override
    public boolean create(filtro g) {
        PreparedStatement ps;
        try{
            ps=con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1,g.getCodigo());
            ps.setString(2,g.getMarca());
            ps.setInt(3,g.getStock());
            ps.setBoolean(4, true);
            if (ps.executeUpdate()>0){
                return true;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(filtroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(filtro c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public filtro read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<filtro> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
