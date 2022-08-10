package amrobot.apigateway.discord.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import org.immutables.value.Value;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = SmartMessage.class)
@JsonDeserialize(as = SmartMessage.class)
public interface SmartMessageWsDto {

  String id();

  Optional<PublicationEmbed> publication();

  /**
   * A Discord message content.
   */
  Optional<String> content();

  int type();

  /**
   * A Discord embedded rich content.
   */
  @Value.Default
  default Collection<SmartMessageEmbedEmbeddedWsDto> embeds() {
    return Collections.emptyList();
  }

  @Value.Default
  default Collection<ComponentEmbeddedWsDto> components() { return Collections.emptyList(); }

  @Immutable
  @JsonSerialize(as = PublicationEmbed.class)
  @JsonDeserialize(as = PublicationEmbed.class)
  interface PublicationEmbed {

    Long community();

    Long channel();

    Optional<Long> message();
  }
}
