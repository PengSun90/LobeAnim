package com.goach.love;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.goach.love.view.LoveAnimView;

public class MainActivity extends AppCompatActivity {
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    private RelativeLayout mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRootView = (RelativeLayout) findViewById(R.id.id_root_view);

        //测试动态创建TextView直接设置VectorDrawable
        TextView textView = new TextView(this);
        textView.setText("我是代码创建的TextView");
        textView.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable.love_drawable), null, null, null);
        mRootView.addView(textView);
    }

    public void startAnim(View view) {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        LoveAnimView loveAnimView = new LoveAnimView(this);
        loveAnimView.setLayoutParams(params);
        loveAnimView.setStartPosition(new Point(530, 712));
        loveAnimView.setEndPosition(new Point(530 - (int) (Math.random() * 200), 712 - ((int) (Math.random() * 500) + 200)));
        loveAnimView.startLoveAnimation();
        mRootView.addView(loveAnimView);
    }
}
