package app.neostream.backend;

import app.neostream.backend.http.HTTPServer;

public final class NeostreamApplication {
    private final HTTPServer httpServer = new HTTPServer();

    void start() {
        httpServer.start();
    }

    void stop() {
        httpServer.stop();
    }
}
