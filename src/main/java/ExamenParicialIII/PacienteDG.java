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
   private Integer NumeroHistorial;
   private String Enfermedad;

    public PacienteDG(Integer NumeroHistorial, String Enfermedad, String nombreDG, Integer edadDG, String direccionDG) {
        super(nombreDG, edadDG, direccionDG);
        this.NumeroHistorial = NumeroHistorial;
        this.Enfermedad = Enfermedad;
    }

    public Integer getNumeroHistorial() {
        return NumeroHistorial;
    }

    public void setNumeroHistorial(Integer NumeroHistorial) {
        this.NumeroHistorial = NumeroHistorial;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }
   
    @Override
    public void mostrarInformacionDG()
    {
        
    }
    
}
