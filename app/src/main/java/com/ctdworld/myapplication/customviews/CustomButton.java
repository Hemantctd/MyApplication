package com.ctdworld.myapplication.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.ctdworld.myapplication.FontCache;
import com.ctdworld.myapplication.R;


public class CustomButton extends AppCompatButton {

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        Typeface myTypeface;
        if (attrs != null) {
            @SuppressLint("CustomViewStyleable") TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomView);
            String fontName = a.getString(R.styleable.CustomView_fontName);
            myTypeface = selectTypeface(getContext(), fontName);
            if (myTypeface != null)
                setTypeface(myTypeface);

            setAllCaps(true);
            a.recycle();
        }
    }

    private Typeface selectTypeface(Context context, String fontName) {
        return FontCache.getTypeface(fontName, context);
    }
}

