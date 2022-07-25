package amrobot.apigateway.discord;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.immutables.value.Value;

@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.CLASS)
@Value.Style(
    typeAbstract = "*WsDto",
    typeImmutable = "*",
    deepImmutablesDetection = true,
    generateSuppressAllWarnings = false,
    jdkOnly = true
)
public @interface DataStyle {

}
