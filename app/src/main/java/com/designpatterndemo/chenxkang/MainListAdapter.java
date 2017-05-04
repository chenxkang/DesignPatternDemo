package com.designpatterndemo.chenxkang;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * author: xiaokang
 * time  : 17/3/29
 * desc  :
 */

public class MainListAdapter extends BaseQuickAdapter<ItemEntity,BaseViewHolder> {

    public MainListAdapter() {
        super(R.layout.view_list_item);
    }

    @Override
    protected void convert(BaseViewHolder helper, ItemEntity item) {
        helper.setText(R.id.pattern_name_tv,item.getPattern());
    }
}
