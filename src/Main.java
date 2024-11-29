import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("Restaurante A", 5));
        restaurants.add(new Restaurant("Restaurante A", 5)); // Duplicado
        restaurants.add(new Restaurant("Restaurante B", 7));
        restaurants.add(new Restaurant("Restaurante C", 8));
        restaurants.add(new Restaurant("Restaurante B", 7)); // Duplicado
        restaurants.add(new Restaurant("Restaurante A", 7));
        restaurants.add(new Restaurant("Restaurante C", 9));

        // Imprimir restaurantes ordenados y sin duplicados
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }
}
