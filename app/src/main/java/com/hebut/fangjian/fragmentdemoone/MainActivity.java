package com.hebut.fangjian.fragmentdemoone;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView text_topbar;
    private TextView text_channel;
    private TextView text_message;
    private TextView text_better;
    private TextView text_setting;
    private MyFragment fg1, fg2, fg3, fg4;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
        initView();
    }

    private void initView() {
        text_topbar = (TextView) findViewById(R.id.ly_top_bar);
        text_channel = (TextView) findViewById(R.id.text_channel);
        text_message = (TextView) findViewById(R.id.text_message);
        text_better = (TextView) findViewById(R.id.text_better);
        text_setting = (TextView) findViewById(R.id.text_setting);
        text_better.setOnClickListener(this);
        text_setting.setOnClickListener(this);
        text_message.setOnClickListener(this);
        text_channel.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideAllFragment(fragmentTransaction);
        switch (v.getId()) {
            case R.id.text_channel:
                setSelected();
                text_channel.setSelected(true);
                if (fg1 == null) {
                    fg1 = new MyFragment("第一个Fragment");
                    fragmentTransaction.add(R.id.ly_content, fg1);
                } else {
                    fragmentTransaction.show(fg1);
                }
                break;
            case R.id.text_message:
                setSelected();
                text_message.setSelected(true);
                if (fg2 == null) {
                    fg2 = new MyFragment("第二个Fragment");
                    fragmentTransaction.add(R.id.ly_content, fg2);
                } else {
                    fragmentTransaction.show(fg2);
                }
                break;
            case R.id.text_setting:
                setSelected();
                text_setting.setSelected(true);
                if (fg3 == null) {
                    fg3 = new MyFragment("第三个Fragment");
                    fragmentTransaction.add(R.id.ly_content, fg3);
                } else {
                    fragmentTransaction.show(fg3);
                }
                break;
            case R.id.text_better:
                setSelected();
                text_better.setSelected(true);
                if (fg4 == null) {
                    fg4 = new MyFragment("第四个Fragment");
                    fragmentTransaction.add(R.id.ly_content, fg4);
                } else {
                    fragmentTransaction.show(fg4);
                }
                break;
        }
    }

    private void setSelected() {

    }

    private void hideAllFragment(FragmentTransaction fragmentTransaction) {
        if (fg1 != null) {
            fragmentTransaction.hide(fg1);
        }
        if (fg2 != null) {
            fragmentTransaction.hide(fg2);
        }
        if (fg3 != null) {
            fragmentTransaction.hide(fg3);
        }
        if (fg4 != null) {
            fragmentTransaction.hide(fg4);
        }
    }
}
