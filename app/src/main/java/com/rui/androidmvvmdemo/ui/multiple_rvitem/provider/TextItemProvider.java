package com.rui.androidmvvmdemo.ui.multiple_rvitem.provider;


import com.rui.androidmvvmdemo.R;
import com.rui.androidmvvmdemo.model.MultipleRvItemModel;
import com.rui.androidmvvmdemo.ui.multiple_rvitem.MultipleRvItemAdapter;
import com.rui.common.adapter.BaseMultipleItemProvider;
import com.rui.common.adapter.BaseRvViewHolder;

public class TextItemProvider extends BaseMultipleItemProvider<MultipleRvItemModel> {

    @Override
    public int viewType() {
        return MultipleRvItemAdapter.TYPE_TEXT;
    }

    @Override
    public int layout() {
        return R.layout.item_text_view;
    }

    @Override
    public void convert(BaseRvViewHolder helper, MultipleRvItemModel data, int position) {
        super.convert(helper, data, position);
        helper
                .addOnClickListener(R.id.tv_text);
    }

}
