import java.math.BigInteger;

public class Cuenta {
    /**
     * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
     *      * numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
     */

    private int nroCuenta;
    private BigInteger dni;
    private int saldo;

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    private int interes;

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public BigInteger getDni() {
        return dni;
    }

    public void setDni(BigInteger dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nroCuenta=" + nroCuenta +
                ", dni=" + dni +
                ", saldo=" + saldo +
                '}';
    }

    public Cuenta(int nroCuenta, BigInteger dni, int saldo, int interes) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public Cuenta(int nroCuenta, BigInteger dni, int saldo) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }
}
