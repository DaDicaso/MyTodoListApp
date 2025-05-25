package com.example.mytodolistapp;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {
    public static class TodoViewHolder extends RecyclerView.ViewHolder{
        public CheckBox taskCheckBox;
        public TextView taskTextView;

        public TodoViewHolder(@NonNull View itemView){
            super(itemView);
            //Initialize the views from the item layout.
            taskCheckBox = itemView.findViewById(R.id.taskCheckBox);
            taskTextView = itemView.findViewById(R.id.taskTextView);
        }
    }
    private List<TodoItem> todoList; //The list of TodoItems to Display
    private OnItemClickListener listener; // Listener for item clicks

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public TodoAdapter(List<TodoItem> todoList){
        this.todoList = todoList;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todo, parent, false);
        return new TodoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position)
}
