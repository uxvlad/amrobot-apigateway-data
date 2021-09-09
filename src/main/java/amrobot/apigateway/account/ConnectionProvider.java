package amrobot.apigateway.account;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectionProvider {

  BUNGIE("bungie");

  private final String code;

  ConnectionProvider(String code) {
    this.code = code;
  }

  @JsonValue
  public String getCode() {
    return code;
  }
}
