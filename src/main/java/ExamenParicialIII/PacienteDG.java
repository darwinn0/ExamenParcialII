/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenParicialIII;

/**
 *
 * @author darwi
 */
public class PacienteDG extends PersonaDG
{
   private Integer NumeroHistorialDG;
   private String EnfermedadDG;

    public PacienteDG(Integer NumeroHistorialDG, String EnfermedadDG, String nombreDG, Integer edadDG, String direccionDG) {
        super(nombreDG, edadDG, direccionDG);
        this.NumeroHistorialDG = NumeroHistorialDG;
        this.EnfermedadDG = EnfermedadDG;
    }

    public Integer getNumeroHistorialDG() {
        return NumeroHistorialDG;
    }

    public void setNumeroHistorialDG(Integer NumeroHistorialDG) {
        this.NumeroHistorialDG = NumeroHistorialDG;
    }

    public String getEnfermedadDG() {
        return EnfermedadDG;
    }

    public void setEnfermedadDG(String EnfermedadDG) {
        this.EnfermedadDG = EnfermedadDG;
    }

    
    @Override
    public void mostrarInformacionDG()
    {
        
    }
    
}
