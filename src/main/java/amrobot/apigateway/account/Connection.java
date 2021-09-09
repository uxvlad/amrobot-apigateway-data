package amrobot.apigateway.account;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableConnection.class)
@JsonDeserialize(as = ImmutableConnection.class)
public interface Connection {

  /**
   * @return a unique identifier
   */
  String id();

  /**
   * @return a username
   */
  String username();

  /**
   * @return a provider of the given connection
   */
  ConnectionProvider provider();

  static ImmutableConnection.Builder builder() {
    return ImmutableConnection.builder();
  }
}
