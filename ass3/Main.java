public class Main {
    public static void main(String[] args) {
        ThreeDGameEngiene threeDGame = new three_D_Game();
        Game game = new Game();
        TwoDGameEngiene twoDGame = new GameAdapter(threeDGame);
        game.makeGame(twoDGame);
    }
}