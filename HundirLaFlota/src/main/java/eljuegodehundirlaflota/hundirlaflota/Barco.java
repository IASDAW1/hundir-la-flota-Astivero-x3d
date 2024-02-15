package eljuegodehundirlaflota.hundirlaflota;

/**
 *
 * @author Ismael Astillero
 * @version 1.0
 */
public class Barco {
    //Estos son los atributos que vamos a crear
    private int longitud;
    private String nombre;
    private boolean partes;
        

    //Estos serian los metodos que vamos a crear    
    private Barco(int longitud, String nombre){
        this.nombre = nombre;
        this.longitud = longitud;
        this.partes = new boolean (partes);
    }     
    
    public boolean haSidoHundido{
        for (boolean partes:partes){
            if (partes){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public void hundirParte(int parte){
        partes[partes] = true;
    }
}
