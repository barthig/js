public record Color(int red, int green, int blue, int alpha) {
    public Color {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255 || alpha < 0 || alpha > 255) {
            throw new IllegalArgumentException("Wartości muszą być w zakresie od 0 do 255.");
        }
    }

    public Color(int red, int green, int blue) {
        this(red, green, blue, 0); // Domyślny kanał alfa 0
    }
}
