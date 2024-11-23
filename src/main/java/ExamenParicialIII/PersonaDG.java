/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenParicialIII;

/**
 *
 * @author darwi
 */
public class PersonaDG 
{
    private String nombreDG;
    private Integer edadDG;
    private String direccionDG;

    public PersonaDG(String nombreDG, Integer edadDG, String direccionDG) {
        this.nombreDG = nombreDG;
        this.edadDG = edadDG;
        this.direccionDG = direccionDG;
    }

    public String getNombreDG() {
        return nombreDG;
    }

    public void setNombreDG(String nombreDG) {
        this.nombreDG = nombreDG;
    }

    public Integer getEdadDG() {
        return edadDG;
    }

    public void setEdadDG(Integer edadDG) {
        this.edadDG = edadDG;
    }

    public String getDireccionDG() {
        return direccionDG;
    }

    public void setDireccionDG(String direccionDG) {
        this.direccionDG = direccionDG;
    }
    
    public void mostrarInformacionDG()
    {
        
    }
    
}
