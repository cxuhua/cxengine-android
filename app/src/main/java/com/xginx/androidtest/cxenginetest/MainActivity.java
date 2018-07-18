package com.xginx.androidtest.cxenginetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.cxengine.EngineActivity;

public class MainActivity extends EngineActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("game");
    }
}
