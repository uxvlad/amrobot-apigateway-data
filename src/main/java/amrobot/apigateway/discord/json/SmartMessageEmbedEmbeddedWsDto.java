package amrobot.apigateway.discord.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import org.immutables.value.Value;
import org.immutables.value.Value.Immutable;

@Immutable
@JsonSerialize(as = SmartMessageEmbedEmbedded.class)
@JsonDeserialize(as = SmartMessageEmbedEmbedded.class)
public interface SmartMessageEmbedEmbeddedWsDto {

  Optional<String> title();

  Optional<String> url();

  Optional<String> description();

  Optional<String> thumbnail();

  Optional<String> image();

  Optional<Integer> color();

  @Value.Default
  default Collection<EmbedField> fields() {
    return Collections.emptyList();
  }

  @Immutable
  @JsonSerialize(as = EmbedField.class)
  @JsonDeserialize(as = EmbedField.class)
  interface EmbedField {

    String name();

    String value();

    @Value.Default
    default boolean inline() {
      return true;
    }
  }
}
