package com.feximin.demotouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Neo on 16/8/11.
 */

public class LinearLayoutA extends LinearLayout {

    public LinearLayoutA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayoutA(Context context) {
        super(context);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean b = super.onInterceptTouchEvent(event);
        Log.e("LLA--> ", "onInterceptTouchEvent--" + b);
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("LLA--> ", "start dispatchTouchEvent");
        boolean b =  super.dispatchTouchEvent(ev);
        Log.e("LLA--> ", "after dispatchTouchEvent--" + b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean b =  super.onTouchEvent(event);
        b = true;
        Log.e("LLA--> ", "onTouchEvent--" + b);
        return b;
    }
}
