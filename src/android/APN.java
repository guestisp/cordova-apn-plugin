package it.take2me.partnerapp;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class APN extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("add-apn")) {

            String name = data.getString(0);
            callbackContext.success("Added APN " + name);

            return true;

        } else {
            
            return false;

        }
    }
}