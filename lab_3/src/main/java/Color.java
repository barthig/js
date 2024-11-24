public record Color(int red, int green, int blue, float alpha) {
    public Color {
        if (red < 0 || red > 255) {
            throw new java.lang.IllegalArgumentException(
                    String.format("Invalid dimensions: red"));
        }
        if (green < 0 || green > 255) {
            throw new java.lang.IllegalArgumentException(
                    String.format("Invalid dimensions: green"));
        }
        if (blue < 0 || blue > 255) {
            throw new java.lang.IllegalArgumentException(
                    String.format("Invalid dimensions: blue"));
        }
        if (alpha < 0 || alpha > 1) {
            throw new java.lang.IllegalArgumentException(
                    String.format("Invalid dimensions: alpha"));
        }
    }

    public Color(int red, int green, int blue) {
        this(red, green, blue, 0.0f);
    }
}
