/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entidades.Linea;
import entidades.Punto;
import java.sql.Connection;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author PC
 */
@Stateless
@LocalBean
public class AdministrarPersistencia implements AdministrarPersistenciaLocal {
/*
    private Connection connection;
    @Resource(name = "jdbc/RepositorioDB")
    DataSource ds;

    @PostConstruct
    private void inicializar() {
        try {
            connection = ds.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    @PreDestroy
    private void limpiar() {
        try {
            connection.close();
            connection = null;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    */
    private Punto a;
    private Punto b;
    private Punto c;
    
    private Linea linea;
    
    @Override
    public void crearPuntos() {
      //  System.out.println("Creacion de puntos.");
        a = new Punto();
        b = new Punto();
        c = new Punto();
    }

    @Override
    public Punto definirPuntoC() {
        c = a;
        return c;
    }

    @Override
    public Punto getA() {
        return a;
    }

    @Override
    public void setA(Punto a) {
        this.a = a;
    }

    @Override
    public Punto getB() {
        return b;
    }

    @Override
    public void setB(Punto b) {
        this.b = b;
    }

    @Override
    public Punto getC() {
        return c;
    }

    @Override
    public void setC(Punto c) {
        this.c = c;
    }

    @Override
    public Linea crearLinea(Punto p, int l, double dir) {
       System.out.println("Creacion de linea.");
       linea = new Linea();
       linea.setLongitud(l);
       linea.setDireccion(dir);
       linea.setPuntoInicial(p);
       return linea;
    }
}
