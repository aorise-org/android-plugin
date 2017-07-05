package cn.aorise.plugin.ui.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import cn.aorise.common.core.ui.view.recyclerview.BindingRecyclerViewAdapter;
import cn.aorise.plugin.BR;
import cn.aorise.plugin.R;
import cn.aorise.plugin.db.entity.SampleNote;


/**
 * Created by tangjy on 2016-8-23.
 */
public class BindingNoteAdapter extends BindingRecyclerViewAdapter<SampleNote> {
    public BindingNoteAdapter(Context context, List<SampleNote> list) {
        super(context, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return super.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.sample_list_item_note;
    }

    @Override
    protected int getVariableId() {
        return BR.sampleNote;
    }
}
