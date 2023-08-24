import java.util.ArrayList;

public class Administrador {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarAuto(String marca, String modelo) {
        vehiculos.add(new Auto(marca, modelo));
    }

    public void agregarMotocicleta(String marca, String modelo) {
        vehiculos.add(new Motocicleta(marca, modelo));
    }

    public String obtenerInfoVehiculos() {
        StringBuilder info = new StringBuilder();
        for (Vehiculo vehiculo : vehiculos) {
            info.append("Marca: ").append(vehiculo.getMarca()).append(", Modelo: ").append(vehiculo.getModelo()).append("\n");
        }
        return info.toString();
    }
}
