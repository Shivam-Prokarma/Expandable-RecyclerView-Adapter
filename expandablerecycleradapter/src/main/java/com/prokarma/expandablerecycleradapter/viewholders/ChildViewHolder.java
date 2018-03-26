package com.prokarma.expandablerecycleradapter.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.prokarma.expandablerecycleradapter.listeners.OnChildClickListener;


/**
 * ViewHolder for {@link com.prokarma.expandablerecycleradapter.model.ExpandableGroup#items}
 */
public class ChildViewHolder extends RecyclerView.ViewHolder {

    private OnChildClickListener onChildClickListener;

    public ChildViewHolder(View itemView) {
        super(itemView);
    }

    public void setOnChildClickListener(OnChildClickListener onChildClickListener) {
        this.onChildClickListener = onChildClickListener;
    }

    /**
     * Method take click event of @{@link ChildViewHolder}
     */
    public void onClick() {
        if (onChildClickListener != null) {
            onChildClickListener.onChildClick();
        }
    }
}
