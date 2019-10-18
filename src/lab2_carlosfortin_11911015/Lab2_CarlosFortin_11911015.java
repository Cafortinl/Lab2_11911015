
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
        int opcion=0;
        
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
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
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
