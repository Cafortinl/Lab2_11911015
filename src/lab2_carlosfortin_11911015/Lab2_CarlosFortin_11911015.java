
package lab2_carlosfortin_11911015;

/**
 *
 * @author Carlos Fortin
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;
public class Lab2_CarlosFortin_11911015 {

    public static Random rand=new Random();
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
            System.out.println();
            
            switch(opcion)
            {
                case 1:
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el log in");
                    else
                    {
                        System.out.print("Ingrese el nombre de la universidad: ");
                        leer.nextLine();
                        nombre=leer.nextLine();                       
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
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el log in");
                    else
                    {
                        System.out.println("Ingrese la posicion a modificar: ");
                        int pos2=leer.nextInt();
                        
                        if(pos2>universidades.size()-1)
                            System.out.println("La posicion seleccionada no existe");
                        else
                        {
                            int niv=((Universidad)(universidades.get(pos2))).getNivelInt();
                            
                            switch(niv)
                            {
                                case 1:
                                    niv=3;
                                    ((Universidad)(universidades.get(pos2))).setNivel(niv);
                                    break;
                                    
                                case 2:
                                    niv=4;
                                    ((Universidad)(universidades.get(pos2))).setNivel(niv);
                                    break;
                                   
                                case 3:
                                    niv=5;
                                    for (Object y : universidades) {
                                        if(((Universidad)y).getNivelInt()==5)
                                            ((Universidad)y).setNivel(3);
                                    }
                                    ((Universidad)(universidades.get(pos2))).setNivel(niv);
                                    break;
                                    
                                case 4:
                                    System.out.println("La universidad ya esta en el nivel mas alto");
                                    break;
                                    
                                case 5:
                                    System.out.println("La universidad ya esta en el nivel mas alto");
                                    break;
                            }
                        }
                    }
                    break;
                    
                case 5:
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el LogIn");
                    else
                    {
                        String salida="";
                        for (Object t : universidades) {
                            salida+=universidades.indexOf(t)+"- "+t+"\n";
                        }
                        System.out.println(salida);
                    }
                    break;
                  
                case 6:
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el log in");
                    else
                    {
                        System.out.println("Ingrese la posicion a modificar: ");
                        int pos3=leer.nextInt();
                        
                        if(pos3>universidades.size()-1)
                            System.out.println("La posicion seleccionada no existe");
                        else
                        {
                            System.out.print("Ingrese el nombre: ");
                            leer.nextLine();
                            nombre=leer.nextLine();
                            ((Universidad)(universidades.get(pos3))).setNombre(nombre);
                            System.out.print("Ingrese el nombre del rector: ");
                            rector=leer.nextLine();
                            ((Universidad)(universidades.get(pos3))).setRector(rector);
                            System.out.print("Ingrese la sucursal: ");
                            sucursal=leer.nextLine();
                            ((Universidad)(universidades.get(pos3))).setSucursal(sucursal);
                            System.out.print("Ingrese el año de fundacion: ");
                            año=leer.nextInt();
                            ((Universidad)(universidades.get(pos3))).setAño(año);
                            System.out.print("Ingrese el numero de maestros: ");
                            maestros=leer.nextInt();
                            ((Universidad)(universidades.get(pos3))).setMaestros(maestros);
                            System.out.print("Ingrese el numero de estudiantes: ");
                            estudiantes=leer.nextInt();
                            ((Universidad)(universidades.get(pos3))).setEstudiantes(estudiantes);
                            System.out.print("Ingrese el nivel de la universidad, 1 para publica y 2 para privada: ");
                            nivel=leer.nextInt();
                            while(nivel!=1 && nivel!=2)
                            {
                                System.out.print("Solo se pueden ingresar dos tipos de niveles. Ingrese un nivel: ");
                                nivel=leer.nextInt();
                            }
                            ((Universidad)(universidades.get(pos3))).setNivel(nivel);
                            
                        }
                    }
                    break;
                    
                case 7:
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el log in");
                    else
                    {
                        System.out.println("Ingrese la posicion a modificar: ");
                        int pos3=leer.nextInt();
                        
                        if(pos3>universidades.size()-1)
                            System.out.println("La posicion seleccionada no existe");
                        else
                        {
                            int niv2=((Universidad)(universidades.get(pos3))).getNivelInt();
                            
                            switch(niv2)
                            {
                                case 1:
                                    universidades.remove(pos3);
                                    break;
                                    
                                case 2:
                                    universidades.remove(pos3);
                                    break;
                                   
                                case 3:
                                    niv2=1;
                                    ((Universidad)(universidades.get(pos3))).setNivel(niv2);
                                    break;
                                    
                                case 4:
                                    niv2=2;
                                    ((Universidad)(universidades.get(pos3))).setNivel(niv2);
                                    break;
                                    
                                case 5:
                                    niv2=3;
                                    ((Universidad)(universidades.get(pos3))).setNivel(niv2);
                                    break;
                            }
                        }
                    }
                    break;
                    
                case 8:
                    if(usuario!="leobanegas" && contra!=99)
                        System.out.println("Primero debe usar el log in");
                    else
                    {
                        int uni=rand.nextInt(universidades.size()-1);
                        for (Object z : universidades) {
                            if(((Universidad)z).getNivelInt()==5)
                                ((Universidad)z).setNivel(3);
                        }
                        ((Universidad)universidades.get(uni)).setNivel(5);
                        
                    }
                        
                    break;
                    
                case 9:
                    
                    break;
                    
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
                    
            }//fin switch
            
            System.out.println();
                                                               
        }//fin while
        
    }//fin main

    
}
