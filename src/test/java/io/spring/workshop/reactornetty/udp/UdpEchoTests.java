package io.spring.workshop.reactornetty.udp;

import org.junit.jupiter.api.Test;
import reactor.netty.Connection;
import reactor.netty.resources.LoopResources;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Learn how to create UDP server and client
 *
 * @author Violeta Georgieva
 * @see <a href="https://projectreactor.io/docs/netty/release/api/reactor/netty/udp/UdpServer.html">UdpServer javadoc</a>
 * @see <a href="https://projectreactor.io/docs/netty/release/api/reactor/netty/udp/UdpClient.html">UdpClient javadoc</a>
 */
public class UdpEchoTests {

    @Test
    public void echoTest() {
        // TODO
        // Task 1:
        // 1.1. Prepare the UDP server
        // 1.2. Configure the port to which this server should bind
        // 1.3. Bind the server
        // 1.4. Subscribe to the returned Mono<Connection> and block
        //
        // Task 3:
        // 3.1. Create a new simple LoopResources
        // 3.2. Configure the UDP server to run on this newly created LoopResources
        // 3.3. Apply a wire logger configuration
        LoopResources loopResources = null;
        Connection server = null;

        assertNotNull(server);

        // TODO
        // Task 2:
        // 2.1. Close the underlying channel opened by the UDP server
    }
}