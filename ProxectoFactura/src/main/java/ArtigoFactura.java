/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a21saralt
 */
public class ArtigoFactura {
    
    private String string;

    private String descripcion;

    private int cantidade;

    private double prezoUnitario;

    public ArtigoFactura(String string, String descripcion, int cantidade, double prezoUnitario) {
        this.string = string;
        this.descripcion = descripcion;
        this.cantidade = cantidade;
        this.prezoUnitario = prezoUnitario;
    }

    /**
     * Get the value of prezoUnitario
     *
     * @return the value of prezoUnitario
     */
    public double getPrezoUnitario() {
        return prezoUnitario;
    }

    /**
     * Set the value of prezoUnitario
     *
     * @param prezoUnitario new value of prezoUnitario
     */
    public void setPrezoUnitario(double prezoUnitario) {
        this.prezoUnitario = prezoUnitario;
    }

    /**
     * Get the value of cantidade
     *
     * @return the value of cantidade
     */
    public int getCantidade() {
        return cantidade;
    }

    /**
     * Set the value of cantidade
     *
     * @param cantidade new value of cantidade
     */
    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of descripcion
     *
     * @param descripcion new value of descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "ArtigoFactura{" + "string=" + string + ", descripcion=" + descripcion + ", cantidade=" + cantidade + ", prezoUnitario=" + prezoUnitario + '}';
    }
    
    public double obterPrezoTotal (){
        return this.prezoUnitario*this.cantidade;
    }
}
