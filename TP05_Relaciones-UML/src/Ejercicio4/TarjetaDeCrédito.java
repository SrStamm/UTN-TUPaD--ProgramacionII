public class TarjetaDeCrédito {
  private int numero;
  private String fechaVencimiento;
  private Banco banco;
  private Cliente cliente;

  public TarjetaDeCrédito(int numero, String fechaVencimiento) {
    this.numero = numero;
    this.fechaVencimiento = fechaVencimiento;
  }

  public int getNumero() {
    return numero;
  }

  public String getFechaVencimiento() {
    return fechaVencimiento;
  }

  public Banco getBanco() {
    return this.banco;
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public void setBanco(Banco banco) {
    this.banco = banco;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;

    if (cliente != null && cliente.getTarjeta() != this) {
      cliente.setTarjeta(this);
    }
  }
}
