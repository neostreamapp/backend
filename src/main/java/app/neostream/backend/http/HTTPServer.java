package app.neostream.backend.http;

import app.neostream.backend.http.request.VoteRequest;
import app.neostream.backend.http.response.ErrorResponse;
import org.eclipse.jetty.http.HttpStatus;
import spark.Spark;

import static spark.Spark.*;

public class HTTPServer {
    private boolean isRunning = false;

    public void start() {
        if (isRunning) return;

        port(3000);
        get("/", (request, response) -> "Neostream is currently under development! Look for us on the App Store.");

        final JsonTransformer jsonTransformer = new JsonTransformer();

        get("/api/search", "application/json", (request, response) -> {
            final String query = request.queryParams("query");



            return new ErrorResponse("This endpoint has not been fully implemented yet.");
        }, jsonTransformer);

        post("/api/vote", "application/json", (request, response) -> {
            final VoteRequest voteRequest;

            try {
                voteRequest = jsonTransformer.getGson().fromJson(request.body(), VoteRequest.class);
            } catch (Exception ignored) {
                response.status(HttpStatus.BAD_REQUEST_400);
                return new ErrorResponse("JSON could not be parsed.");
            }

            return new ErrorResponse("This endpoint has not been fully implemented yet.");
        }, jsonTransformer);

        isRunning = true;
    }

    public void stop() {
        if (!isRunning) return;

        Spark.stop();

        isRunning = false;
    }
}
