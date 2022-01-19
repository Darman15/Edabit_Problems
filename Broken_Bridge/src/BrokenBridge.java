public class BrokenBridge {


    public static boolean isSafeBridge(String bridge) {
        if (bridge.contains(" ")) {
            return false;
        } else {
            return true;
        }
    }
}
