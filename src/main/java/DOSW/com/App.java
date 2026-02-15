package DOSW.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    //Clase interna para poder crear el menu de toppings
    static class ToppingInfo {
        int id;
        String nombre;
        double precio;

        public ToppingInfo(int id, String nombre, double precio) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<ToppingInfo> toppings = List.of(
                new ToppingInfo(1, "Leche", 1000),
                new ToppingInfo(2, "Chocolate", 1500),
                new ToppingInfo(3, "Caramelo", 1200),
                new ToppingInfo(4, "Crema Batida", 2000),
                new ToppingInfo(5, "Menta", 1300),
                new ToppingInfo(6, "Topping Nuevo", 2000)
        );

        // Mostrar menú
        System.out.println("\n===== TOPPINGS DISPONIBLES =====");
        System.out.printf("%-5s %-15s %-10s%n", "No", "Nombre", "Precio");

        toppings.forEach(t ->
                System.out.printf("%-5d %-15s $%.0f%n", t.id, t.nombre, t.precio)
        );

        System.out.print("\n¿Cuántos cafés desea comprar?: ");
        int cantidadCafes = Integer.parseInt(scanner.nextLine());

        List<Cafe> cafes = new ArrayList<>();

        for (int i = 1; i <= cantidadCafes; i++) {

            System.out.println("\nCafé #" + i);
            System.out.println("Ingrese toppings separados por coma (ej: 1,3,5): ");

            String input = scanner.nextLine();

            List<Integer> seleccion = Arrays.stream(input.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            Cafe cafe = new CafeBase();

            for (Integer id : seleccion) {
                switch (id) {
                    case 1 -> cafe = new Leche(cafe);
                    case 2 -> cafe = new Chocolate(cafe);
                    case 3 -> cafe = new Caramelo(cafe);
                    case 4 -> cafe = new CremaBatida(cafe);
                    case 5 -> cafe = new Menta(cafe);
                    case 6 -> cafe = new ToppingPersonalizado(cafe);
                }
            }

            cafes.add(cafe);
        }

        System.out.println("\n===== RESUMEN =====");

        cafes.forEach(c ->
                System.out.println(c.getDescripcion() + " -> $" + c.getPrecio())
        );

        double totalGeneral = cafes.stream()
                .mapToDouble(Cafe::getPrecio)
                .sum();

        System.out.println("\nTOTAL GENERAL: $" + totalGeneral);
    }
}
