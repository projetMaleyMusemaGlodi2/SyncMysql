package isig.example.glodi.syncmysql;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Contact> arrayList=new ArrayList<>();
    public  RecyclerAdapter(ArrayList<Contact> arrayList)
    {
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.Name.setText(arrayList.get(position).getName());
        int sync_status=arrayList.get(position).getSync_status();
        if(sync_status==DbContract.SYNC_STATUS_OK)
        {
          holder.Sync_Status.setImageResource(R.drawable.ok);
        }
        else{
            holder.Sync_Status.setImageResource(R.drawable.sync);
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public  class  MyViewHolder extends  RecyclerView.ViewHolder{

        ImageView Sync_Status;
        TextView Name;
        public MyViewHolder(View itemView) {
            super(itemView);
            Sync_Status=(ImageView)itemView.findViewById(R.id.imgSync);
            Name=(TextView)itemView.findViewById(R.id.txtName);
        }
    }
}
