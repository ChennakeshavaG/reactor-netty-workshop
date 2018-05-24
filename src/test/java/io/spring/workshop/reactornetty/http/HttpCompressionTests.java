package io.spring.workshop.reactornetty.http;

import org.junit.jupiter.api.Test;
import reactor.netty.DisposableServer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Learn how to create HTTP server and client
 *
 * @author Violeta Georgieva
 * @see <a href="https://projectreactor.io/docs/netty/release/api/reactor/netty/http/server/HttpServer.html">HttpServer javadoc</a>
 * @see <a href="https://projectreactor.io/docs/netty/release/api/reactor/netty/http/client/HttpClient.html">HttpClient javadoc</a>
 */
public class HttpCompressionTests {

    @Test
    public void httpCompressionTest() {
        // TODO
        // Task 1:
        // 1.1. Prepare the HTTP server
        // 1.2. Configure the port to which this server should bind
        // 1.3. Start the server in a blocking fashion and wait for it
        //      to finish initializing
        //
        // Task 3:
        // 3.3. Apply a wire logger configuration
        // 3.4. Enable compression
        //
        // Task 4:
        // 4.1. Attach an IO handler to react on connected client
        // 4.2. As a response send some string
        DisposableServer server = null;

        assertNotNull(server);

        // TODO
        // Task 2:
        // 2.1. Close the underlying channel opened by the HTTP server
    }
}
