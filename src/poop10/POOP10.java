/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Asus
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hla mundo");
        String mensajes [] = {"primero", "segundo", "tercero"};
        
        try{//ùsimos el try y todo esto para que el proigrama no se rompa y siga corriendo a esar del error
            
        for(int i=0; i<=3; i++)
            
        System.out.println(mensajes[i]);
        
        } catch (ArrayIndexOutOfBoundsException e){
            
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        
        try{
        
        System.out.println("Hola mundo 2");
        double x;
        x = 0/0; //ponemos la f para que el programa sepa que es un flotante
        System.out.println(x);
        
        } catch(ArithmeticException e){
            System.out.println("Error division entre cero");
        }
        
        /////////////
        try{
        
        System.out.println("Hola mundo 2");
        double x;
        x = 0/0; //ponemos la f para que el programa sepa que es un flotante
        System.out.println(x);
        
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error division entre cero");
       
            
            
        } catch( ArithmeticException e){
            System.out.println("Error division entre cero");
            
        } catch( Exception e){
            System.out.println("Error division entre cero");
        }
        
        System.out.println("*********Hola mundo 3**********");
        
         try{
        
        double x;
        x = 0/0; //ponemos la f para que el programa sepa que es un flotante
        System.out.println(x);
        
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error division entre cero");
             System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        //aui havia otro hola mundo
        double divicion;
        divicion = metodoDivicion(4f,6.0);

    }

    private static double metodoDivicion(float f, double d) throws ArithmeticException{
        return f/d;
    }
    
}
