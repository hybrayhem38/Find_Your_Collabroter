package software.ilhan.com.realtimemangalaoyunu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class levhaListAdapter extends ArrayAdapter<Levha> {

    private static final String TAG = "levhaListAdapter";
    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView baslik;
        TextView gereksinim;
        TextView username;
    }

    /**
     * Default constructor for the PersonListAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public levhaListAdapter(Context context, int resource, ArrayList<Levha> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the persons information
        String baslik = getItem(position).getBaslik();
        String gereksinim = getItem(position).getGereksinim();
        String username = getItem(position).getUsername();

        //Create the person object with the information
        Levha person = new Levha(baslik,gereksinim,username);

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.baslik = (TextView) convertView.findViewById(R.id.txtBaslik);
            holder.gereksinim = (TextView) convertView.findViewById(R.id.txtGereksinim);
            holder.username = (TextView) convertView.findViewById(R.id.txtUsername);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        /*Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;*/

        holder.baslik.setText(person.getBaslik());
        holder.gereksinim.setText(person.getGereksinim());
        holder.username.setText(person.getUsername());


        return convertView;
    }
}



