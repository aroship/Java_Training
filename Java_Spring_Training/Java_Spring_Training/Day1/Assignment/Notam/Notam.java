class Notam {
    private final String obstacle;
    private final String latLong;
    private final String message;

    public Notam(String obstacle, String latLong, String message) {
        this.obstacle = obstacle;
        this.latLong = latLong;
        this.message = message;
    }

    public String getObstacle() {
        return obstacle;
    }

    public String getLatLong() {
        return latLong;
    }

    public String getMessage() {
        return message;
    }
}