public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów Color
        Color color1 = new Color(255, 0, 0);
        Color color2 = new Color(0, 255, 0, 128);
        Color color3 = new Color(0, 0, 255, 255);

        // Wyświetlenie kolorów
        System.out.println("Kolor 1: " + color1);
        System.out.println("Kolor 2: " + color2);
        System.out.println("Kolor 3: " + color3);

        // Szczegółowe wyświetlanie
        System.out.printf("Kolor 1 - R: %d, G: %d, B: %d, A: %d%n", color1.red(), color1.green(), color1.blue(), color1.alpha());
        System.out.printf("Kolor 2 - R: %d, G: %d, B: %d, A: %d%n", color2.red(), color2.green(), color2.blue(), color2.alpha());
        System.out.printf("Kolor 3 - R: %d, G: %d, B: %d, A: %d%n", color3.red(), color3.green(), color3.blue(), color3.alpha());
    }
}
