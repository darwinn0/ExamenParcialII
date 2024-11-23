/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenParicialIII;

/**
 *
 * @author darwin Guzman
 */
public class MedicoDG extends PersonaDG
{
    private String especialidadDG;
    private Integer anosExperienciaDG;

    public MedicoDG(String especialidadDG, Integer anosExperienciaDG, String nombreDG, Integer edadDG, String direccionDG) {
        super(nombreDG, edadDG, direccionDG);
        this.especialidadDG = especialidadDG;
        this.anosExperienciaDG = anosExperienciaDG;
    }

    public String getEspecialidadDG() {
        return especialidadDG;
    }

    public void setEspecialidadDG(String especialidadDG) {
        this.especialidadDG = especialidadDG;
    }

    public Integer getAnosExperienciaDG() {
        return anosExperienciaDG;
    }

    public void setAnosExperienciaDG(Integer anosExperienciaDG) {
        this.anosExperienciaDG = anosExperienciaDG;
    }
       
    @Override
     public void mostrarInformacionDG()
    {
        
    }
}
