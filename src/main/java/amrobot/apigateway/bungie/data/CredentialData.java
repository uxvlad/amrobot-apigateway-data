package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableCredentialData.class)
@JsonDeserialize(as = ImmutableCredentialData.class)
public interface CredentialData {

  String id();

  /**
   * Credential type.
   */
  int type();

  static ImmutableCredentialData.Builder builder() {
    return ImmutableCredentialData.builder();
  }
}
