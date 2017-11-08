package utils;

/**
 * Created by junhomax on 2017-11-08.
 */
public class Configurator {
    private static Configurator instance = new Configurator();
    private Configurator() {
    }

    public Configurator getInstance() {
        return instance;
    }

    public boolean initialize() {
        return true;
    }

}
