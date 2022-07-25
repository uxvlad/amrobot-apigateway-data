package amrobot.apigateway.discord;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.annotation.Nullable;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Style;

@Immutable
@JsonSerialize(as = ImmutableUserData.class)
@JsonDeserialize(as = ImmutableUserData.class)
@Style(jdkOnly = true)
public interface UserData {

  String uid();

  @Nullable
  String username();

  @JsonProperty("destiny2_id")
  Long destiny2id();

  @JsonProperty("destiny2_uid")
  @Nullable
  String destiny2uid();

  static ImmutableUserData.Builder builder() {
    return ImmutableUserData.builder();
  }
}
