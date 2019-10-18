
package lab2_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Lab2_CarlosFortin_11911015 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList universidades=new ArrayList();
        int opcion=0;
        
        while(opcion!=9)
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("***********Menu***********\n\n"
                                                                +"1. Crear universidades \n"
                                                                +"2. Eliminar universidades \n"
                                                                +"3. Log In \n"
                                                                +"4. Ascender Universidad \n"
                                                                +"5. Listar universidades y su sucursal \n"
                                                                +"6. Modificar universidad \n"
                                                                +"7. Descender universidad \n"
                                                                +"8. RANDOM \n"
                                                                +"9. Salir"));
            
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
                    JOptionPane.showMessageDialog(null, "La opcion ingresada no es valida");
                    break;
            }
                                                               
        }
        
    }
    
}
