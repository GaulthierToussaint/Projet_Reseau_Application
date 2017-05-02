package server;

/**
 * Enum représentant les différents services
 */
public enum Service {
    LIST,
    CHOOSE,
    ADD;

    @Override
    public String toString(){
        return super.toString().toLowerCase();
    }
}
