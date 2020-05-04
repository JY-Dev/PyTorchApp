package com.example.newopencvtestapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CustomImageView extends View {
    private TextView tv;
    private Context context;

    public CustomImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    public CustomImageView(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint MyPaint = new Paint();
        MyPaint.setStrokeWidth(10f);
        MyPaint.setStyle(Paint.Style.STROKE);
        MyPaint.setColor(Color.WHITE);
        tv = new TextView(context);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP,25);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        tv.setLayoutParams(lp);
        tv.setX(200);
        tv.setY(300);
        ((RelativeLayout) this.getParent()).addView(tv);

        Path path = new Path();
        path.moveTo(450,500);
        path.lineTo(450,500);
        path.lineTo(400,600);
        path.lineTo(300,600);
        path.lineTo(400,700);
        path.lineTo(350,800);
        path.lineTo(450,700);
        path.lineTo(550,800);
        path.lineTo(500,700);
        path.lineTo(600,600);
        path.lineTo(500,600);
        path.close();
        canvas.drawPath(path,MyPaint);
    }

    public void setTv(String text){
        tv.setText(text);
    }
}
