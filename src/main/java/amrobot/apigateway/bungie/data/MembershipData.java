package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ImmutableMembershipData.class)
@JsonDeserialize(as = ImmutableMembershipData.class)
public interface MembershipData {

  /**
   * @return primary Destiny membership ID
   */
  Long id();

  /**
   * @return primary Destiny membership display name
   */
  String uid();
}
