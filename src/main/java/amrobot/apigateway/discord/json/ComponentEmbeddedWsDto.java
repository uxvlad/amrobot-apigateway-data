package amrobot.apigateway.discord.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Optional;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = ComponentEmbedded.class)
@JsonDeserialize(as = ComponentEmbedded.class)
public interface ComponentEmbeddedWsDto {

  String command();

  Optional<String> label();

  int style();

  Optional<EmojiEmbeddedWsDto> emoji();

  @Immutable
  @JsonSerialize(as = EmojiEmbedded.class)
  @JsonDeserialize(as = EmojiEmbedded.class)
  interface EmojiEmbeddedWsDto {

    Optional<Long> id();

    String name();
  }
}
