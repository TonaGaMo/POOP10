/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Asus
 */
public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(){
        saldo = 0;
    }
    
    public void depositar(double monto){
        System.out.println("DepositDO" + monto);
        saldo += monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando" + monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}
