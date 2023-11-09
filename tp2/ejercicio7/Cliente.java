package tp2.ejercicio7;

public class Cliente {
    private String nombre;
    private int[] carroCompra;// carro de compras

    public Cliente(String nombre, int[] carrito) {
        carroCompra = new int[carrito.length];// cantidad de compras
        for (int i = 0; i < carrito.length; i++) {
            this.carroCompra[i] = carrito[i];
        }
        this.nombre = nombre;
    }
}
