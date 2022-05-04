
package taller;


public class Sede {
    String[] nombre;
    String[] direccion;
    String[] ciudad;
    Apertura[] titular = new Apertura[10]; 

    public Sede(String[] nombre, String[] direccion, String[] ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getDireccion() {
        return direccion;
    }

    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }

    public String[] getCiudad() {
        return ciudad;
    }

    public void setCiudad(String[] ciudad) {
        this.ciudad = ciudad;
    }

    public void setSedes() {
        nombre = new String[10];
        direccion = new String[10];
        ciudad = new String[10];
        
                
    }
    
}
