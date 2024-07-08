package mundopc;

import arg.com.gm.mundopc.*; 

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 14);
        Teclado tecladoHP = new Teclado("bluetooh", "HP");
        Raton ratonHP = new Raton("bluetooh", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorLG = new Monitor("LG", 15);
        Teclado tecladoPERFORMANCE = new Teclado("usb", "PERFORMANCE");
        Raton ratonGENIUS = new Raton("usb", "GENIUS");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoPERFORMANCE, ratonGENIUS);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLG);
        
        orden1.mostrarOrden();
        
    
    }
}
