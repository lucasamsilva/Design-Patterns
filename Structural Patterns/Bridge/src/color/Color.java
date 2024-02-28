package color;

public interface Color {

    String getPrimaryColor();

    String getSecondaryColor();

    default String printColors() {
        return String.format("Primary Color: %s | Secondary Color: %s", getPrimaryColor(), getSecondaryColor());
    }

}
