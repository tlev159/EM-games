package euro2021;

import java.util.ArrayList;
import java.util.List;

public class GameRepository {

    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
    }

}
