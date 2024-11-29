import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private final String name;
    private final int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;
        return score == that.score && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = other.name.compareTo(this.name); // Orden descendente por nombre
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(other.score, this.score); // Orden descendente por puntuación
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " | Score: " + score;
    }
}

