package blockingio

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

/**
 * @author huantt on 2019-09-21
 */
@CompileStatic
@Slf4j
class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient.Builder().build()
        for (int i = 0; i < 500; i++) {
            int j = i

            Request.Builder requestBuilder = new Request.Builder()
                    .url("http://github.com/${j}")

            Request request = requestBuilder.build()
            client.newCall(request).enqueue(
                    new Callback() {
                        @Override
                        void onFailure(Call call, IOException e) {
                            log.warn("${new Date()} - Failed to get http://github.com/${j}")
                        }

                        @Override
                        void onResponse(Call call, Response response) throws IOException {
                            log.info("${new Date()} - Page ${j}")
                            response.close()
                        }
                    })

        }

        Thread.sleep(1000000)
    }
}
