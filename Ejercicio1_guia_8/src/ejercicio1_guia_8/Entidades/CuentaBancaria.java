
package ejercicio1_guia_8.Entidades;


public class CuentaBancaria {

    private int numCuenta;
    private long dniCliente;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCuenta, long dniCliente, double saldo) {
        this.numCuenta = numCuenta;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", dniCliente=" + dniCliente + ", saldo=" + saldo + '}';
    }

    
}
