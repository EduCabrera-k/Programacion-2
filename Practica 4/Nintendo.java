public class Nintendo extends DispositivoMovil{
    
    private int numjuegos;
    
    public Nintendo(float velocidadProcesador, int cargaBateria, int numjuegos){
    super(0);
    this.numjuegos=numjuegos;
    }
    
    public void mostrarDatos(float velocidadProcesador, int cargaBateria, int numjuegos){
        System.out.println("La velocidad del procesador es de " + velocidadProcesador);
        System.out.println("La bateria del nintedo es de " + cargaBateria +"%");
        System.out.println("La nintendo contiene " + numjuegos + " juegos");
        
    }
    
}