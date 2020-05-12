package com.example.trpgassistant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DicerLogAdapter extends RecyclerView.Adapter<DicerLogAdapter.DicerLogViewHolder> {
    private ArrayList<Dice> dices;

    public DicerLogAdapter (ArrayList<Dice> dices){
        this.dices = dices;
    }

    public class DicerLogViewHolder extends RecyclerView.ViewHolder{
        TextView diceHistoryText;
        TextView diceHistoryTime;
        public DicerLogViewHolder (View view) {
            super (view);
            diceHistoryText = view.findViewById(R.id.diceHistoryText);
            diceHistoryTime = view.findViewById(R.id.diceHistoryTime);
        }
    }

    @NonNull
    @Override
    public DicerLogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dicer_log_list_item, parent, false);
        return new DicerLogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DicerLogViewHolder holder, int position) {
        holder.diceHistoryText.setText(dices.get(position).getText());
        holder.diceHistoryTime.setText(dices.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return dices.size();
    }

    public void addDice(Dice dice) {
        this.dices.add(dice);
        notifyDataSetChanged();
    }
}