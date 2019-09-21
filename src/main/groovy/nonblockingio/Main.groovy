package nonblockingio

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.vertx.core.Vertx
import io.vertx.ext.web.client.WebClient

/**
 * @author huantt on 2019-09-21
 */
@CompileStatic
@Slf4j
class Main {
    public static void main(String[] args) {
        WebClient client = WebClient.create(Vertx.vertx())
        for (int i = 0; i < 500; i++) {
            int j = i
            client.getAbs("http://github.com/${j}").send({ asyncResult ->
                if (asyncResult.succeeded()) {
                    log.info("${new Date()} - Page ${j}")
                }else {
                    log.warn("${new Date()} - Failed to get http://github.com/${j}")
                }
            })
        }

        Thread.sleep(1000000)
    }
}
