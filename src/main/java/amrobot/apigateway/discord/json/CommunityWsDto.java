package amrobot.apigateway.discord.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Locale;
import java.util.Optional;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = Community.class)
@JsonDeserialize(as = Community.class)
public interface CommunityWsDto {

  Long id();

  String name();

  @JsonProperty("icon_url")
  Optional<String> iconUrl();

  @JsonProperty("preferred_time_zone")
  String preferredTimeZone();

  @JsonProperty("preferred_locale")
  Locale preferredLocale();
}
