import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public void describedrawingshape(Shape shape) {
        logger.info(shape.getName() + ":");

        logger.info("Pole: " + shape.getArea());

        logger.info("Obwód: " + shape.getPerimeter());

        logger.info("Kolor: " + shape.getColorDescription());
    }
}
