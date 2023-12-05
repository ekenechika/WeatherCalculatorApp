public class WindVelocity {
    private final Speed speed;
    private final Direction direction;

    public WindVelocity(Speed speed, Direction direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public Speed getSpeed() {
        return speed;
    }

    public Direction getDirection() {
        return direction;
    }
}