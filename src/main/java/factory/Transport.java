package factory;

public abstract class Transport {
    private Long id;
    private Integer numberOfWheels;
    private boolean isEcoTransport;
    private boolean isNeedLicense;

    public Transport(Long id, String color, Integer numberOfWheels, boolean isEcoTransport, boolean isNeedLicense) {
        this.id = id;
        this.numberOfWheels = numberOfWheels;
        this.isEcoTransport = isEcoTransport;
        this.isNeedLicense = isNeedLicense;
    }

    public Transport(Integer numberOfWheels, boolean isEcoTransport, boolean isNeedLicense) {
        this.numberOfWheels = numberOfWheels;
        this.isEcoTransport = isEcoTransport;
        this.isNeedLicense = isNeedLicense;
    }

    public Long getId() {
        return id;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isEcoTransport() {
        return isEcoTransport;
    }

    public void setEcoTransport(boolean ecoTransport) {
        isEcoTransport = ecoTransport;
    }

    public boolean isNeedLicense() {
        return isNeedLicense;
    }

    public void setNeedLicense(boolean needLicense) {
        isNeedLicense = needLicense;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Transport{" +
                "numberOfWheels=" + numberOfWheels +
                ", isEcoTransport=" + isEcoTransport +
                ", isNeedLicense=" + isNeedLicense +
                '}';
    }
}
