package amrobot.apigateway.data.bungie;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.Instant;
import java.util.List;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableAggregateStatsData.class)
@JsonDeserialize(as = ImmutableAggregateStatsData.class)
public interface AggregateStatsData {

  List<AggregateActivityStatsData> activities();

  Instant expiration();
}
