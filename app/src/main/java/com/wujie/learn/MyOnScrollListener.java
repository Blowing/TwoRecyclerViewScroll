package com.wujie.learn;

import android.support.v7.widget.RecyclerView;
import android.widget.HorizontalScrollView;

/**
 * Created by Troy on 2017-7-15.
 */

public class MyOnScrollListener extends RecyclerView.OnScrollListener {

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == RecyclerView.SCROLL_STATE_IDLE) {
            recyclerView.removeOnScrollListener(this);
        }
    }
}
