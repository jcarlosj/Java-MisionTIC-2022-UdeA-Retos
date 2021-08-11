package co.edu.udea.jcarlosj.reto_1;
public class SIMCard {
  private String empresaTelefonia = "HI";
  private double saldo;
  private String numeroTelefono;
  private boolean celularApagado = true;
  private boolean modoAvionActivado = false;
  private boolean datosActivados = false;
  private int saldoDatos;
  
  
  public SIMCard (String numeroTelefono){
    this.numeroTelefono = numeroTelefono;
    
    
  }


  public String getEmpresaTelefonia() {
    return this.empresaTelefonia; 
  }


  public void setEmpresaTelefonia(String empresaTelefonia) {
    this.empresaTelefonia = empresaTelefonia;
  }


  public double getSaldo() {
    return this.saldo;
  }


  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }


  public String getNumeroTelefono() {
    return this.numeroTelefono;
  }


  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }


  public boolean isCelularApagado() {
    return this.celularApagado;
  }


  public void setCelularApagado(boolean celularApagado) {
    this.celularApagado = celularApagado;
  }


  public boolean isModoAvionActivado() {
    return this.modoAvionActivado;
  }


  public void setModoAvionActivado(boolean modoAvionActivado) {
    this.modoAvionActivado = modoAvionActivado;
  }


  public boolean isDatosActivados() {
    return this.datosActivados;
  }


  public void setDatosActivados(boolean datosActivados) {
    this.datosActivados = datosActivados;
  }


  public int getSaldoDatos() {
    return this.saldoDatos;
  }


  public void setSaldoDatos(int saldoDatos) {
    this.saldoDatos = saldoDatos;
  }

  //Métodos
  
  public void comprarDatos(int c){
    int cSinPromo, costoRecarga;
    if (c >= 0 && c < 11){
      costoRecarga = c * 3000;
      if (this.saldo > costoRecarga){
        this.saldo = this.saldo - costoRecarga;
        this.saldoDatos = this.saldoDatos + c;
        } 
        
      }else if (c < 31){
        cSinPromo = c -10;
        costoRecarga = cSinPromo * 2500 + 10 *3000;
        if (this.saldo > costoRecarga){
          this.saldo = this.saldo - costoRecarga;
          this.saldoDatos = this.saldoDatos + c;
        }
      }else{
        cSinPromo = c -20;
        costoRecarga = cSinPromo * 1500 + 20 *3000;
        if (this.saldo > costoRecarga){
          this.saldo = this.saldo - costoRecarga;
          this.saldoDatos = this.saldoDatos + c;
        }
      }
    
    
    
  }
  
  public void consumirDatos(int c){
    if (! this.celularApagado && ! this.modoAvionActivado){
      if (this.datosActivados){
        this.saldoDatos = this.saldoDatos - c;  
        
      } 
      
    }
    
  }
  
  public void llamar (int s){
    int valorSegundo = 1;
    int costoInicial, costoLlamada;
    
    if (! this.celularApagado){
      if (s > 0 && s < 61){
        this.saldo = this.saldo - s;
      }else{
        costoInicial = s - 60;
        costoLlamada = 60 * valorSegundo + costoInicial / 2;
        this.saldo = this.saldo - costoLlamada;
      }
      
    }
    
  }
  
  public void recargarSaldo (double s){
    if (s > 0){
      this.saldo = this.saldo + s;
      
    }
    
    
  }
  
  public void gestionarEncendioCelular (){
    this.celularApagado = ! this.celularApagado;
    if (this.celularApagado){
      this.datosActivados = false;
      this.modoAvionActivado = false;
      
    }
    
  }
  
  public void gestionarModoAvion (){
    if (! this.celularApagado){
      this.modoAvionActivado = ! this.modoAvionActivado;
      if (! this.modoAvionActivado){
        this.datosActivados = false;
        
        
      }
      
    }
    
    
  }
  
  public void gestionarDatos (){
    if (! this.celularApagado && ! this.modoAvionActivado){
      this.datosActivados = ! this.datosActivados;
    }
    
    
  }