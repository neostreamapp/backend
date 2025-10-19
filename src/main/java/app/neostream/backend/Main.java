package app.neostream.backend;

public final class Main {
    public static void main(String[] args) {
        final NeostreamApplication app = new NeostreamApplication();
        app.start();
        Runtime.getRuntime().addShutdownHook(new Thread(app::stop));
    }
}
