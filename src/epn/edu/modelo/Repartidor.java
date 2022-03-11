package epn.edu.modelo;

public class Repartidor extends Persona implements AccionRepartidor{
    public double costoEnvio;
    public double tiempoEnvio;


    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public double getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(double tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }


    @Override
    public String enviar() {
        return "\n::::::::::::::::ORDEN ENTREGADA............!"
                +"\n:::::::::::::::::::::::::::::::::::::::::::\n\n";
    }
}
