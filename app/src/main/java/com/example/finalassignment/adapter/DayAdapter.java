package com.example.finalassignment.adapter;

//public class DayAdapter {
//}

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.finalassignment.R;
import com.example.finalassignment.modal.EventModal;
import com.squareup.picasso.Picasso;
import java.util.List;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.MyViewHolder>{

    Context context;
    List<EventModal> EventModals;

    public DayAdapter(Context context, List<EventModal> EventModals) {
        this.context = context;
        this.EventModals = EventModals;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_routine,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //// getting data according to position
        final EventModal EventModal = EventModals.get(position);

        holder.txt_course_name.setText(EventModal.getEvent_name());
        holder.txt_course_code.setText(EventModal.getEvent_desc());
    }

    @Override
    public int getItemCount() {
        return EventModals.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txt_course_name,txt_course_code, txt_time, txt_batch;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_course_name = itemView.findViewById(R.id.coursename);
            txt_course_code = itemView.findViewById(R.id.coursecode);
            txt_time = itemView.findViewById(R.id.time);
            txt_batch =itemView.findViewById(R.id.batch);
        }
    }
}