package modele;

public interface Systeme {
    boolean isDispositifTransport();

    void setDispositifTransport(boolean dispositifTransport);

    boolean isDispositifEvacuation();

    void setDispositifEvacuation(boolean dispositifEvacuation);

    SystemeImpl.Orientation getOrientationDispositifTransport();

    void setOrientationDispositifTransport(SystemeImpl.Orientation orientationDispositifTransport);

    void charger();

    void decharger();

    void evacuer();

    void pivoter();
}
