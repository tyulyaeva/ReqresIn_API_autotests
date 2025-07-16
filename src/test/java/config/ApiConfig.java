package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.properties")
public interface ApiConfig extends Config {

    @Key("baseUri")
    String baseApiUri();

    @Key("basePath")
    @DefaultValue("/api")
    String basePath();

    @Key("userLogin")
    String userLogin();

    @Key("userPath")
    String userPath();

    @Key("userRegister")
    String userRegister();

    @Key("apiKey")
    String apiKey();

    @Key("apiKeyName")
    String apiKeyName();

    @Key("userPass")
    String userPass();

    @Key("userEmail")
    String userEmail();

    @Key("userPassLogin")
    String userPassLogin();
}