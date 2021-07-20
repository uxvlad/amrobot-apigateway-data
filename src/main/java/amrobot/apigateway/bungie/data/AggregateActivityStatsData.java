package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableAggregateActivityStatsData.class)
@JsonDeserialize(as = ImmutableAggregateActivityStatsData.class)
public interface AggregateActivityStatsData {

  int id();

  /**
   * @return the map where key is metric (e.g. activityCompletions)
   */
  Map<String, ActivityStatsValue> values();

  static ImmutableAggregateActivityStatsData.Builder builder() {
    return ImmutableAggregateActivityStatsData.builder();
  }
}
