/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entidades.Punto;
import entidades.Linea;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface AdministrarPersistenciaLocal {
    
    public void crearPuntos();

    public Punto getA();

    public void setA(Punto a);

    public Punto getB();

    public void setB(Punto b);

    public Punto getC();

    public void setC(Punto c);

    public Punto definirPuntoC();
    
    public Linea crearLinea(Punto p, int l, double dir);
    //public voidcrearLinea();
    
}
