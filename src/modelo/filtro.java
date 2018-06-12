/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class filtro {
    private int id;
    private String codigo;
    private String marca;
    private int stock;
    private boolean excistencia;
    
    public filtro(){}

    public filtro(int id, String codigo, String marca, int stock, boolean excistencia) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.excistencia = excistencia;
    }

    public filtro(String codigo, String marca, int stock, boolean excistencia) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.excistencia = excistencia;
    }

    public filtro(String marca, int stock, boolean excistencia) {
        this.marca = marca;
        this.stock = stock;
        this.excistencia = excistencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isExcistencia() {
        return excistencia;
    }

    public void setExcistencia(boolean excistencia) {
        this.excistencia = excistencia;
    }
    
    
    
}
