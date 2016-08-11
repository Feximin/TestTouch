package com.feximin.demotouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Neo on 16/8/11.
 */

public class LinearLayoutB extends LinearLayout {

    public LinearLayoutB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayoutB(Context context) {
        super(context);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean b = super.onInterceptTouchEvent(event);
        b = true;
        Log.e("LLB--> ", "onInterceptTouchEvent--" + b);
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("LLB--> ", "start dispatchTouchEvent");
        boolean b =  super.dispatchTouchEvent(ev);
        Log.e("LLB--> ", "after dispatchTouchEvent--" + b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean b =  super.onTouchEvent(event);
        Log.e("LLB--> ", "onTouchEvent--" + b);
        return b;
    }
}
