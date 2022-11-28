package com.example.coursefeedback;

import android.content.Context;
import android.widget.Toast;

import java.net.ContentHandler;

public class showMsg {
    public static void message(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
