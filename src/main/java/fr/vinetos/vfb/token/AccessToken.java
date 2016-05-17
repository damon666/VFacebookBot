package fr.vinetos.vfb.token;


import facebook4j.conf.ConfigurationBuilder;

/**
 * The MIT License (MIT)
 * Created on 15/05/2016.
 * Copyright (c) 2016 @author Vinetos
 */
public class AccessToken {

    private ConfigurationBuilder cb;

    public AccessToken() {
        this.cb = new ConfigurationBuilder()
                .setDebugEnabled(true)
                .setOAuthAppId(OAuthInfo.APP_ID)
                .setOAuthAppSecret(OAuthInfo.SECRET_KEY)
                .setOAuthAccessToken(OAuthInfo.ACCESS_TOKEN);
    }

    public ConfigurationBuilder getConfigurationBuilder() {
        return this.cb;
    }

}
