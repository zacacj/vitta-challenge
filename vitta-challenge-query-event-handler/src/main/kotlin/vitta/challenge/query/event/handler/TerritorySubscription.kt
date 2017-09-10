package vitta.challenge.query.event.handler

import br.com.zup.eventsourcing.eventstore.PersistentAggregateSubscriber
import org.springframework.stereotype.Service
import vitta.challenge.domain.Territory


@Service
class TerritorySubscription(eventHandler: TerritoryEventHandler) : PersistentAggregateSubscriber<Territory>(
        eventHandler = eventHandler
)