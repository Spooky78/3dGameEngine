package org.spooky.test;

import org.lwjgl.Version;
import org.spooky.core.EngineManager;
import org.spooky.core.WindowManager;
import org.spooky.core.util.Constants;

public class Launcher {

    private static WindowManager window;
    private static TestGame game;
    public static void main(String[] args) {
        System.out.println(Version.getVersion());
        window = new WindowManager(Constants.TITLE, 0, 0, false);
        game = new TestGame();

        EngineManager engine = new EngineManager();
        try {
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow() {
        return window;
    }

    public static TestGame getGame() {
        return game;
    }
}
