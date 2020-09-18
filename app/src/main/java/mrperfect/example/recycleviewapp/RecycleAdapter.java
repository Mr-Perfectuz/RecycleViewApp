package mrperfect.example.recycleviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

class RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<RecycleModel> list = new ArrayList<>();


    void  setList(List<RecycleModel> newList) {
        list= newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,
                parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecycleModel model = list.get(position);
        ((MyViewHolder)holder).bind(model);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myTitle;
        TextView myDescribtion;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myTitle = itemView.findViewById(R.id.title);
            myDescribtion =  itemView.findViewById(R.id.describtion);
        }

        void bind(RecycleModel model) {
            myTitle.setText(model.title);
            myDescribtion.setText(model.description);
        }
    }
}


/**
 *
 *
 *
 * **/