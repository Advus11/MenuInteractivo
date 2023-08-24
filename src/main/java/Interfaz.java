import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private Administrador administrador = new Administrador();

    public void ejecutar() {
        JFrame frame = new JFrame("Administrador de Vehículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton agregarAutoButton = new JButton("Agregar Auto");
        JButton agregarMotocicletaButton = new JButton("Agregar Motocicleta");
        JButton verVehiculosButton = new JButton("Ver Vehículos");
        JButton salirButton = new JButton("Salir");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(agregarAutoButton);
        panel.add(agregarMotocicletaButton);
        panel.add(verVehiculosButton);
        panel.add(salirButton);

        agregarAutoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String marca = JOptionPane.showInputDialog("Ingrese la marca del auto:");
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo del auto:");
                administrador.agregarAuto(marca, modelo);
            }
        });

        agregarMotocicletaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String marca = JOptionPane.showInputDialog("Ingrese la marca de la motocicleta:");
                String modelo = JOptionPane.showInputDialog("Ingrese el modelo de la motocicleta:");
                administrador.agregarMotocicleta(marca, modelo);
            }
        });

        verVehiculosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vehiculosInfo = administrador.obtenerInfoVehiculos();
                JOptionPane.showMessageDialog(null, vehiculosInfo, "Vehículos Registrados", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        salirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.ejecutar();
    }
}
