package amrobot.apigateway.account;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableDestinyConnection.class)
@JsonDeserialize(as = ImmutableDestinyConnection.class)
public interface DestinyConnection {

  /**
   * @return a membership identifier
   */
  String id();

  /**
   * @return a global name
   */
  String name();

  /**
   * @return a membership type
   */
  Integer type();

  static ImmutableDestinyConnection.Builder builder() {
    return ImmutableDestinyConnection.builder();
  }
}
