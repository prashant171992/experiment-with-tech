package com.matlb;

import com.google.gson.Gson;
import com.matlb.domain.Notification;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by prassingh on 9/25/16.
 */
public class NetworkCall {
    static HttpClient httpClient = HttpClientBuilder.create().build();;

    private static void makeGetRequest(String url) throws IOException {
        HttpGet request = new HttpGet(url);

        HttpResponse response = httpClient.execute(request);

        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());

    }

    public static void makePostRequest(Notification notification) throws IOException {

        String url = "https://fcm.googleapis.com/fcm/send";

        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("Content-Type", "application/json");
        post.setHeader("Authorization", "key=AIzaSyDrD04ovojUL2dr8hayRmkcnrqMG2VzdGs");

//        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
//        urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
//        urlParameters.add(new BasicNameValuePair("cn", ""));
//        urlParameters.add(new BasicNameValuePair("locale", ""));
//        urlParameters.add(new BasicNameValuePair("caller", ""));
//        urlParameters.add(new BasicNameValuePair("num", "12345"));

        Gson gson = new Gson();
        String urlParameters = gson.toJson(notification);

        post.setEntity(new StringEntity(urlParameters));

        HttpResponse response = httpClient.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        int responseCode = response.getStatusLine().getStatusCode();
        System.out.println("Response Code : " + String.valueOf(responseCode));

//        if (responseCode == 200) {
//            return true;
//
////        BufferedReader rd = new BufferedReader(
////                new InputStreamReader(response.getEntity().getContent()));
////
////        StringBuffer result = new StringBuffer();
////        String line = "";
////        while ((line = rd.readLine()) != null) {
////            result.append(line);
////        }
////
////        System.out.println(result.toString());
//
//        }
        return;
    }



}