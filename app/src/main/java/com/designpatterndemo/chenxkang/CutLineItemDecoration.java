package com.designpatterndemo.chenxkang;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * author: xiaokang
 * time  : 17/3/29
 * desc  : 自定义分割线
 */

public class CutLineItemDecoration extends RecyclerView.ItemDecoration {

    private Drawable mDivider;// 分割线
    private int mDividerHeight;// 分割线高度

    /**
     * 分割线自定义高度，默认使用line_divider
     *
     * @param context
     * @param mDividerHeight
     */
    public CutLineItemDecoration(Context context, int mDividerHeight) {
        mDivider = ContextCompat.getDrawable(context,R.drawable.line_divider);
        this.mDividerHeight = mDividerHeight;
    }

    /**
     * 自定义分割线
     *
     * @param context
     * @param divider
     * @param mDividerHeight
     */
    public CutLineItemDecoration(Context context, Drawable divider, int mDividerHeight) {
        if (null == divider){
            mDivider = ContextCompat.getDrawable(context,R.drawable.line_divider);
        } else {
            mDivider = divider;
        }
        this.mDividerHeight = mDividerHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(0,0,0,mDividerHeight);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + mDividerHeight;
            mDivider.setBounds(left,top,right,bottom);
            mDivider.draw(c);
        }
    }
}
