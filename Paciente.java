
/**
 * Esta clase permite la mantencion de pacientes
 * 
 * @author Paulette 
 * @version 06-02-2021
 */
public class Paciente{
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private boolean enfermedad;

    public Paciente(
        String nombre,
        String apellidoPaterno,
        String apellidoMaterno,
        int edad,
        boolean enfermedad){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.enfermedad = enfermedad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }
    
    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public boolean getEnfermedad(){
        return this.enfermedad;
    }
    
    public void setEnfermedad(boolean enfermedad){
        this.enfermedad = enfermedad;
    }
    
    public void getReporte(){
        System.out.println("-----Inicio-----");
        System.out.println("Nombre Completo: " + this.nombre + " " + this.apellidoPaterno + " " + this.apellidoMaterno);
        
        if(this.enfermedad){
            System.out.println("Enfermedad: " + "si tiene enfermedad");
        } else {
            System.out.println("Enfermedad: " + "no tiene enfermedad");
        }
        
        System.out.println("-----Fin-----");
    }
}
