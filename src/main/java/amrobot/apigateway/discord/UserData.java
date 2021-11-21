package amrobot.apigateway.discord;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value.Immutable;

@Immutable
public interface UserData {

  String uid();

  @JsonProperty("destiny2_id")
  Long destiny2id();

  @JsonProperty("destiny2_uid")
  String destiny2uid();

  static ImmutableUserData.Builder builder() {
    return ImmutableUserData.builder();
  }
}
