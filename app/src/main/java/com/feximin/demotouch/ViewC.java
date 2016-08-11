package com.feximin.demotouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Neo on 16/8/11.
 */

public class ViewC extends View {
    public ViewC(Context context) {
        super(context);
    }

    public ViewC(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean b = super.dispatchTouchEvent(event);
        Log.e("ViewC--> ", "dispatchTouchEvent--" + b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean b = super.onTouchEvent(event);
        Log.e("ViewC--> ", "onTouchEvent--" + b);
        return b;
    }
}
