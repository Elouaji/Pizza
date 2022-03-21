package ma.emsi.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ma.emsi.pizza.beans.Pasta;
import ma.emsi.pizza.service.PastaService;

public class PastaDetailsActivity extends AppCompatActivity {
    private PastaService ps;
    private ImageView image;
    private TextView nom;
    private TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_details);

        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));
        ps = PastaService.getInstance();
        image = findViewById(R.id.photo);
        nom = findViewById(R.id.nom);
        desc = findViewById(R.id.Desc);

        Pasta c = ps.findById(id);
        image.setImageResource(c.getPhoto());
        desc.setText(c.getDesc());
        nom.setText(c.getNom());

    }
}