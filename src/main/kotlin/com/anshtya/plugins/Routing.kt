package com.anshtya.plugins

import com.anshtya.routes.customerRouting
import com.anshtya.routes.getOrderRoute
import com.anshtya.routes.listOrdersRoute
import com.anshtya.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}