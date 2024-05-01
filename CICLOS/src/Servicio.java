public class Servicio {
    private int id;
    private String nombre;
    private String tipo;
    private int horasTrabajo;
    private double precioPorHora;
    private double descuento;
    private boolean tieneDescuento;

    public Servicio(int id, String nombre, String tipo, int horasTrabajo, double precioPorHora, double descuento, boolean tieneDescuento) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.horasTrabajo = horasTrabajo;
        this.precioPorHora = precioPorHora;
        this.descuento = descuento;
        this.tieneDescuento = tieneDescuento;
        actualizarPrecio();
    }

    // Método para actualizar el precio del servicio
    private void actualizarPrecio() {
        double precioTotal = horasTrabajo * precioPorHora;
        if (tieneDescuento) {
            precioTotal -= precioTotal * descuento;
        }
        this.precio = precioTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
        actualizarPrecio();
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
        actualizarPrecio();
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
        actualizarPrecio();
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
        actualizarPrecio();
    }
}
