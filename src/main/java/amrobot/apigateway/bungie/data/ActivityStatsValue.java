package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableActivityStatsValue.class)
@JsonDeserialize(as = ImmutableActivityStatsValue.class)
public interface ActivityStatsValue {

  double value();

  String displayValue();
}
