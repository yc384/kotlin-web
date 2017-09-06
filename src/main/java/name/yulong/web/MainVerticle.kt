package name.yulong.web

import io.vertx.core.Vertx

fun main(args: Array<String>) {

    var server=Vertx.vertx().createHttpServer()
    server.requestHandler({ request ->
        request.response().end("<h1>hello world")
    })
    server.listen(8080, "127.0.0.1", { res ->
        if (res.succeeded()) {
            println("Server is now listening!")
        } else {
            println("Failed to bind!")
        }
    })
}