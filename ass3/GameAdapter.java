public class GameAdapter implements TwoDGameEngiene{
    ThreeDGameEngiene threeDGameEngiene;

    public GameAdapter(ThreeDGameEngiene threeDGameEngiene) {
        this.threeDGameEngiene = threeDGameEngiene;
    }

    @Override
    public void make2DGameDisign() {
        threeDGameEngiene.make3DGameDisign();
    }
}
