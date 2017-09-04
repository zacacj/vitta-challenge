package vitta.challenge.query.application.routes

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.router
import vitta.challenge.query.application.handlers.QuerySquareHandler


@Configuration
class QuerySquareRoutes(val querySquareHandler: QuerySquareHandler) {

    @Bean
    fun querySquareRouterFunction(): RouterFunction<*> {
        return router {
            GET("/squares/{x}/{y}") { querySquareHandler.handleGetSquareById(it) }
        }

    }

}