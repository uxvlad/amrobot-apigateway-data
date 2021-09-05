package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
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
   * @return primary Destiny membership display name e.g. displayName#displayCode
   */
  String uid();

  /**
   * @return all Destiny memberships of the account
   */
  List<DestinyMembershipData> destinyMemberships();

  default DestinyMembershipData getPrimaryDestinyMembership() {
    return destinyMemberships().stream()
        .filter(destinyMembership -> id().equals(destinyMembership.id())).findFirst()
        .orElseThrow(() -> new IllegalStateException("At least one Destiny membership required"));
  }

  static ImmutableMembershipData.Builder builder() {
    return ImmutableMembershipData.builder();
  }
}
