package server;

/**
 * Enum représentant les différents services
 */
public enum Service {
    LIST,
    CHOOSE,
    ADD,
    STOP;

    @Override
    public String toString(){
        return super.toString().toLowerCase();
    }
}
