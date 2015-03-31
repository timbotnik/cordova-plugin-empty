package com.percolatestudio.cordova.empty;

import org.apache.cordova.Config;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.util.Log;

public class PSEmpty extends CordovaPlugin {

    protected static final String LOG_TAG = "PSSafeReload";

    public Object onMessage(String id, Object data) {
        if (id.equals("onPageFinished")) {
            String currentUrl = (String)data;
            Log.d(LOG_TAG, "PSEmpty pageDidLoad " + currentUrl);
        }
        return null;
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("doNothing")) {
            doNothing();
            callbackContext.success();
            return true;
        }
        return false;
    }

    protected void doNothing() {
        Log.d(LOG_TAG, "Empty plugin did absolutely nothing");
    }
}
