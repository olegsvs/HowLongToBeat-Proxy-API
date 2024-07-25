package io.github.darefox.hltbproxy

import io.github.darefox.hltbproxy.proxy.serverRoutes
import org.http4k.server.Jetty
import org.http4k.server.asServer


fun main(args: Array<String>) {
    val port = System.getenv("HLTB_PORT")?.toIntOrNull() ?: 8444
    serverRoutes.asServer(Jetty(port)).start()
}