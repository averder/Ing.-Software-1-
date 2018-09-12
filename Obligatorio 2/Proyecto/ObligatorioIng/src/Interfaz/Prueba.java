package Interfaz;


import Dominio.Sistema;
import Persistencia.Persistencia;


public class Prueba {
    
    public static void main(String[] args) {
        
         Persistencia per = new Persistencia();
         Sistema sis = per.cargarSistema();
         VentanaInicio v = new VentanaInicio (sis);
        
         v.setLocationRelativeTo(null);
         v.setVisible(true);

    }
    
}
