package examenjava;

/**
 *
 * @author chanp
 */
class Distrito {
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;
    private int listado;
    private int votantes;

    // Métodos Get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public int getListado() {
        return listado;
    }

    public int getVotantes() {
        return votantes;
    }

    // Métodos Set
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setListado(int listado) {
        this.listado = listado;
    }

    public void setVotantes(int votantes) {
        this.votantes = votantes;
    }
}
