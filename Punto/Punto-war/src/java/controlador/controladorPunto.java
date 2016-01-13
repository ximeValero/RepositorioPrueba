package controlador;

import entidades.Punto;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import logica.AdministrarPersistencia;
import logica.AdministrarPersistenciaLocal;

@ManagedBean
@ApplicationScoped
public class controladorPunto {

    @EJB
    AdministrarPersistenciaLocal administrarPersistencia;
    private String coorXA;
    private String coorYA;
    private String coorXB;
    private String coorYB;
    private Punto aux;
    private Punto c;

    public controladorPunto() {
        administrarPersistencia = new AdministrarPersistencia();
        administrarPersistencia.crearPuntos();
        c = new Punto();
        c.setX(0);
        c.setY(0);
    }

    public void asignarCoordenada() {

        aux = new Punto();
        aux.setX(Integer.valueOf(coorXA));
        aux.setY(Integer.valueOf(coorYA));
        administrarPersistencia.setA(aux);
        System.out.println("COORDENADA AX: " + coorXA + " COORDENADA AY: " + coorYA);

        aux = new Punto();
        aux.setX(Integer.valueOf(coorXB));
        aux.setY(Integer.valueOf(coorYB));
        administrarPersistencia.setB(aux);
        System.out.println("COORDENADA BX: " + coorXB + " COORDENADA BY: " + coorYB);

    }

    public void calcularC() {

        c = administrarPersistencia.definirPuntoC();
        c.setX(-1);
        c.setY(-1);
        System.out.println("CX: " + c.getX() + " CY: " + c.getY());
    }
    
    public Punto getC() {
        return c;
    }

    public void setC(Punto c) {
        this.c = c;
    }

    public String getCoorXA() {
        return coorXA;
    }

    public void setCoorXA(String coorXA) {
        this.coorXA = coorXA;
    }

    public String getCoorXB() {
        return coorXB;
    }

    public void setCoorXB(String coorXB) {
        this.coorXB = coorXB;
    }

    public String getCoorYA() {
        return coorYA;
    }

    public void setCoorYA(String coorYA) {
        this.coorYA = coorYA;
    }

    public String getCoorYB() {
        return coorYB;
    }

    public void setCoorYB(String coorYB) {
        this.coorYB = coorYB;
    }
}
