package tema10.ejercicios.ej15;
/**
 * Implementamos la interfaz Comparable para poder
 * comparar objetos por uno de sus atributos (sueldo)
 * y ordenar la lista de empleados que contiene cada 
 * objeto de la clase Empresa.
 * 
 * @author d3stroya
 */
class Empleado implements Comparable<Empleado> {
    // ATRIBUTOS
    private String nombre;
    private int sueldo;

    // CONSTRUCTORES
    public Empleado() {
        this.nombre = "";
        this.sueldo = 0;
    }
    
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Compara dos valores utilizando el método estático
     * compare de la clase Integer.
     * Comparamos el sueldo de 2 empleados
     * @param e
     * @return 1 si this.sueldo es mayor, 0 si es igual y -1 si es menor que 
     * el sueldo del Empleado pasado por parámetro
     */
    @Override
    public int compareTo(Empleado e) {
        return Integer.compare(e.getSueldo(), this.sueldo);
    }    
    
    // Otra forma de hacer lo mismo
//    @Override
//    public int compareTo(Empleado e) {
//        if(e.getSueldo() > sueldo) {
//            return 1; 
//        } else if(e.getSueldo() == sueldo) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    @Override
    public String toString() {
        return " · " + nombre + ": " + sueldo + "€";
    }        

}