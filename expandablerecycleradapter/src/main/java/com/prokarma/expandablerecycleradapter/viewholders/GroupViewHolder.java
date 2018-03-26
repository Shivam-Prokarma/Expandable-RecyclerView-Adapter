package com.prokarma.expandablerecycleradapter.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;

import com.prokarma.expandablerecycleradapter.listeners.OnGroupClickListener;


/**
 * ViewHolder for the {@link com.prokarma.expandablerecycleradapter.model.ExpandableGroup#title} in a {@link com.prokarma.expandablerecycleradapter.model.ExpandableGroup}
 * <p>
 * The current implementation does now allow for sub {@link View} of the parent view to trigger
 * a collapse / expand. *Only* click events on the parent {@link View} will trigger a collapse or
 * expand
 */
public abstract class GroupViewHolder extends RecyclerView.ViewHolder {

    private OnGroupClickListener listener;

    public GroupViewHolder(View itemView) {
        super(itemView);
    }

    public void onClick(View v) {
        if (listener != null) {
            listener.onGroupClick(getAdapterPosition());
        }
    }

    public void setOnGroupClickListener(OnGroupClickListener listener) {
        this.listener = listener;
    }

    public void expand() {
    }

    public void collapse() {
    }
}
