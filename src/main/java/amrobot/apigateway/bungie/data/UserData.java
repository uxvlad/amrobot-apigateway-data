package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableUserData.class)
@JsonDeserialize(as = ImmutableUserData.class)
public interface UserData {

  /**
   * @return Bungie.NET User ID
   */
  long id();

  /**
   * @return Unique name
   */
  String uid();

  static ImmutableUserData.Builder builder() {
    return ImmutableUserData.builder();
  }
}
