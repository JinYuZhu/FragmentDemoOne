package com.hebut.fangjian.fragmentdemoone;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Lenovo on 2016/6/13.
 */
public class MyFragment extends Fragment {
    private String content;
    private TextView mTextView;

    public MyFragment(String content) {
        this.content=content;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fg_content, container, false);
        mTextView = (TextView) mTextView.findViewById(R.id.text_content);
        mTextView.setText(content);
        return mView;
    }
}
