package guia9ejerciciosextras2.Entidades;

public class Ahorcado {
  private String[] letrasPalabraABuscar;
  private int cantidadLetrasEncontradas;
  private int cantidadTurnosMaximos;

  
  public Ahorcado() {
  }

  public Ahorcado(String[] letrasPalabraABuscar, int cantidadLetrasEncontradas, int cantidadTurnosMaximos) {
    this.letrasPalabraABuscar = letrasPalabraABuscar;
    this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    this.cantidadTurnosMaximos = cantidadTurnosMaximos;
  }

  
  public String[] getLetrasPalabraABuscar() {
    return letrasPalabraABuscar;
  }

  public void setLetrasPalabraABuscar(String[] letrasPalabraABuscar) {
    this.letrasPalabraABuscar = letrasPalabraABuscar;
  }

  public int getCantidadLetrasEncontradas() {
    return cantidadLetrasEncontradas;
  }

  public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
    this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
  }

  public int getCantidadTurnosMaximos() {
    return cantidadTurnosMaximos;
  }

  public void setCantidadTurnosMaximos(int cantidadTurnosMaximos) {
    this.cantidadTurnosMaximos = cantidadTurnosMaximos;
  }


}
