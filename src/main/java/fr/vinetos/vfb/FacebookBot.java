package fr.vinetos.vfb;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import fr.vinetos.vfb.token.AccessToken;

/**
 * The MIT License (MIT)
 * Created on 15/05/2016.
 * Copyright (c) 2016 @author Vinetos
 */
public class FacebookBot {

    private static FacebookBot instance;

    public static FacebookBot getInstance() {
        return instance == null ? instance = new FacebookBot() : instance;
    }

    private Facebook facebook;

    FacebookBot()  {

    }

    public void start() {
        System.out.println("Logging in...");
        facebook = new FacebookFactory(new AccessToken().getConfigurationBuilder().build()).getInstance();//Create connexion to Facebook's API
        System.out.println("Logged !");

        System.out.println("Posting status...");
        try {
            System.out.println(
                    facebook.postStatusMessage("Imaginez que je poste ce status depuis un logiciel que je viens " +
                            "de développé... Incroyable non? \n Hello from Java"));
        } catch (FacebookException e) {
            e.printStackTrace();
        }
        System.out.println("Exit...");
        System.exit(0);
    }

}
