/*
 * ContentDownloader.java
 */
package src.lab2.url_http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class created by @author Mihai HULEA at Feb 25, 2005.
 * 
 * This class is part of the laborator2_net project.
 * 
 * Aplicatia prezinta un alt mod prin care se pot downloada resurse. Este
 * folosita
 * metoda getContent() din cadrul clasei URL.
 */
public class ContentDownloader {
    public static void main(String[] args) {
        String url = "http://utcluj.ro/index.html";

        try {
            URL u = new URL(url);
            try {
                Object o = u.getContent();
                System.out.println("I got a " + o.getClass().getName());
            }
            catch (IOException e) {
                System.err.println(e);
            }
        }

        catch (MalformedURLException e) {
            System.err.println(url + " is not a parseable URL");
        }
    } 
}
