/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Asus
 */
public class Cuenta {
    
    private double saldo;
    
    public Cuenta(){
        saldo = 0;
    }
    
    public void despositar(double monto){
        
        System.out.println("Depositando" + monto);
        saldo+=monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        
        System.out.println("Retirando" +monto);
        
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        
        else
        saldo-=monto;
        } 
    public double getSaldo(){
        return saldo;
    }

    void depositar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
