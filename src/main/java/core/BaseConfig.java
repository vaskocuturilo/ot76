package core;


import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.aeonbits.owner.Reloadable;

/**
 * The interface Base config.
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("classpath:test.properties")
public interface BaseConfig extends Config, Reloadable {

    /**
     * The constant BASE_CONFIG.
     */
    BaseConfig BASE_CONFIG = ConfigFactory.create(BaseConfig.class, System.getenv(), System.getProperties());

    /**
     * Method Url string.
     *
     * @return the string
     */
    @Key("url")
    @DefaultValue("http://localhost")
    String url();
}
