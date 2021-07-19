package amrobot.apigateway.data.bungie;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableAggregateStatsData.class)
@JsonDeserialize(as = ImmutableAggregateStatsData.class)
public interface AggregateActivityStatsData {

  int id();

  Map<String, ActivityStatsValue> values();
}
