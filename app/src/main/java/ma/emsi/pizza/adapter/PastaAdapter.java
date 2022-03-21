package ma.emsi.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ma.emsi.pizza.R;
import ma.emsi.pizza.beans.Pasta;

public class PastaAdapter extends BaseAdapter {
    private List<Pasta> Pastas;
    private LayoutInflater inflater;

    public PastaAdapter(Activity activity, List<Pasta> Pastas) {
        this.Pastas = Pastas;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return Pastas.size();
    }

    @Override
    public Object getItem(int position) {
        return Pastas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.pasta_listitems, null);

        TextView idf = convertView.findViewById(R.id.idf);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView quantite = convertView.findViewById(R.id.quantite);
        ImageView photo = convertView.findViewById(R.id.photo);


        idf.setText(Pastas.get(position).getId()+"");
        nom.setText(Pastas.get(position).getNom());
        quantite.setText(Pastas.get(position).getQuantite()+" Plats");
        photo.setImageResource(Pastas.get(position).getPhoto());





        return convertView;
    }
}
