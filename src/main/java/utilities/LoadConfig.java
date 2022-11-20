package utilities;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class LoadConfig {
    private final Config config;
    public static final LoadConfig CONFIG = getInstance();

    private LoadConfig() {
        this.config = ConfigFactory.load("app.conf");
    }

    public String getProperty(String key) {
        String enviroment = System.getProperty("env");
        Config conf = this.config.getConfig(enviroment);
        return conf.getString(key);
    }

    public String getProperty(AppProperty key) {
        return getProperty(key.getKey());
    }

    public static LoadConfig getInstance(){
        return new LoadConfig();
    }


}
