package amrobot.apigateway.bungie.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;


@Immutable
@JsonSerialize(as = ImmutableDestinyMembershipData.class)
@JsonDeserialize(as = ImmutableDestinyMembershipData.class)
public interface DestinyMembershipData {

  /**
   * @return Destiny membership ID
   */
  Long id();

  /**
   * @return Destiny membership type
   */
  MembershipType type();

  /**
   * @return Destiny unique identifier e.g. displayName#displayCode
   */
  String uid();

  static ImmutableDestinyMembershipData.Builder builder() {
    return ImmutableDestinyMembershipData.builder();
  }
}
