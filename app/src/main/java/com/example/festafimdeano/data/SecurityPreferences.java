package com.example.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {

    private SharedPreferences mSharedPref;

    // Construtor
    public SecurityPreferences(Context mContext) {
        this.mSharedPref = mContext.getSharedPreferences("FestaFimdeAno", Context.MODE_PRIVATE);
    }

    public void storeString(String key, String value) {
        this.mSharedPref.edit().putString(key, value).apply();
    }

    public String getStoredString(String key) {
        return this.mSharedPref.getString(key, "");
    }
}
