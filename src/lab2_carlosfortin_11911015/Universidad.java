
package lab2_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
public class Universidad {
    
    //Atributos
    private String nombre;
    private String rector;
    private String sucursal;
    private int año;
    private int n_maestros;
    private int n_estudiantes;
    private double costo;
    private String nivel;
    private int nacional=0;
    private int nivelint;
    
    //Constructores
    public Universidad(){
        
    }
    
    public Universidad(String nombre, String rector, String sucursal, int año, int maestros, int alumnos, int nivel){
        this.nombre=nombre;
        this.rector=rector;
        this.sucursal=sucursal;
        this.año=año;
        n_maestros=maestros;
        n_estudiantes=alumnos;
        
        if(nivel==1)
        {
            this.nivel="Publica";
            costo=0;
            nivelint=nivel;
        }
        else if(nivel==2)
        {
            this.nivel="Privada";
            costo=6000;
            nivelint=nivel;
        }
    }
    
    //Mutadores
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setRector(String rector){
        this.rector=rector;
    }
    
    public void setSucursal(String sucursal){
        this.sucursal=sucursal;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public void setMaestros(int maestros){
        n_maestros=maestros;
    }
    
    public void setEstudiantes(int alumnos){
        n_estudiantes=alumnos;
    }
    
    public void setCosto(double costo){
        this.costo=costo;
    }
    
    public void setNivel(int nivel){
        switch(nivel)
        {
            case 1:
                this.nivel="Publica";
                this.costo=0;
                this.nivelint=nivel;
                break;
                
            case 2:
                this.nivel="Privada";
                this.costo=6000;
                this.nivelint=nivel;
                break;
                
            case 3:
                this.nivel="Publica Prestigiosa";
                this.costo=200;
                this.nivelint=nivel;
                break;
                
            case 4:
                this.nivel="Privada Prestigiosa";
                this.costo=12000;
                this.nivelint=nivel;
                break;
                
            case 5:
                this.nivel="Nacional";
                this.costo=500;
                this.nivelint=nivel;
                break;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getRector(){
        return rector;
    }
    
    public String getSucursal(){
        return sucursal;
    }
    
    public int getAño(){
        return año;
    }
    
    public int getMaestros(){
        return n_maestros;
    }
    
    public int getEstudiantes(){
        return n_estudiantes;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public String getNivel(){
        return nivel;
    }
    
    public int getNivelInt(){
        return nivelint;
    }
    
    //Metodos Administrativos
    @Override
    public String toString(){
        return "************************* \n"+"Nombre: "+nombre+"\n"+"Rector: "+rector+"\n"+"Sucursal: "+sucursal+"\n"+"Año de fundacion: "+año+"\n"+"No. maestros: "+n_maestros+"\n"+"No. alumnos: "+n_estudiantes+"\n"+"Costo: "+costo+"\n"+"Nivel: "+nivel+"\n";
    }
    
}
