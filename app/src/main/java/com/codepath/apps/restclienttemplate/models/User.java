package com.codepath.apps.restclienttemplate.models;

import android.util.JsonReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static com.codepath.apps.restclienttemplate.models.Tweet.fromJson;

public class User {

    public String name;
    public String screenName;
    public String prousfileImageUrl;

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.prousfileImageUrl = jsonObject.getString("profile_image_url_https");
        return user;

    }




}
