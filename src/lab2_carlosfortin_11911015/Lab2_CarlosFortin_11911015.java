
package lab2_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Lab2_CarlosFortin_11911015 {

    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList universidades=new ArrayList();
        int opcion=0,contra=0;
        String usuario="";
        String nombre,rector,sucursal;
        int año,maestros,estudiantes,nivel;
        
        while(opcion!=9)
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
                               "***********Menu***********",
                               "1. Crear universidades",
                               "2. Eliminar universidades",
                               "3. Log In",
                               "4. Ascender Universidad",
                               "5. Listar universidades y su sucursal",
                               "6. Modificar universidad",
                               "7. Descender universidad",
                               "8. RANDOM",
                               "9. Salir",
                               "Opcion ingresada: ");
            opcion=leer.nextInt();
            
            switch(opcion)
            {
                case 1:
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el log in");
                    else
                    {
                        System.out.print("Ingrese el nombre de la universidad: ");
                        //leer.nextLine();
                        nombre=leer.nextLine();
                        leer.nextLine();
                        System.out.print("Ingrese el nombre del rector: ");
                        //leer.nextLine();
                        rector=leer.nextLine();
                        System.out.print("Ingrese la sucursal: ");
                        //leer.nextLine();
                        sucursal=leer.nextLine();
                        System.out.print("Ingrese el año de fundacion: ");
                        año=leer.nextInt();
                        System.out.print("Ingrese el numero de maestros: ");
                        maestros=leer.nextInt();
                        System.out.print("Ingrese el numero de estudiantes: ");
                        estudiantes=leer.nextInt();
                        System.out.print("Ingrese el nivel de la universidad, 1 para publica y 2 para privada: ");
                        nivel=leer.nextInt();
                        while(nivel!=1 && nivel!=2)
                        {
                            System.out.print("Solo se pueden ingresar dos tipos de niveles. Ingrese un nivel: ");
                            nivel=leer.nextInt();
                        }
                        
                        Universidad u=new Universidad(nombre,rector,sucursal,año,maestros,estudiantes,nivel);
                        universidades.add(u);
                        
                    }
                    break;
                    
                case 2:
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el log in");
                    else
                    {
                        System.out.println("Ingrese la posicion a eliminar: ");
                        int pos=leer.nextInt();
                        
                        if(pos>universidades.size()-1)
                            System.out.println("La posicion seleccionada no existe");
                        else
                            universidades.remove(pos);
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese el usuario: ");
                    usuario=leer.next();
                    System.out.print("Ingrese la contraseña: ");
                    contra=leer.nextInt();
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                  
                case 6:
                    
                    break;
                    
                case 7:
                    
                    break;
                    
                case 8:
                    
                    break;
                    
                case 9:
                    
                    break;
                    
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
            }
                                                               
        }
        
    }
    
}
