package amrobot.apigateway.discord.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@JsonSerialize(as = Role.class)
@JsonDeserialize(as = Role.class)
@Value.Immutable
public interface RoleWsDto {

  Long id();

  String name();

  boolean mentionable();

  boolean everyone();
}
