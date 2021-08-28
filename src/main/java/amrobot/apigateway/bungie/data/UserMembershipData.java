package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.annotation.Nullable;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableUserMembershipData.class)
@JsonDeserialize(as = ImmutableUserMembershipData.class)
public interface UserMembershipData {

  long id();

  /**
   * @return Bungie.NET User
   */
  @Nullable
  @Deprecated
  UserData user();

  CredentialData credential();

  static ImmutableUserMembershipData.Builder builder() {
    return ImmutableUserMembershipData.builder();
  }
}
