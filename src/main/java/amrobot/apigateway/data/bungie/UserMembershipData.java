package amrobot.apigateway.data.bungie;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableUserMembershipData.class)
@JsonDeserialize(as = ImmutableUserMembershipData.class)
public interface UserMembershipData {

  long id();

  CredentialData credential();
}
