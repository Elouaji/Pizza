package ma.emsi.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {


        private ImageView logo;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);

            logo = findViewById(R.id.logo);

            //Appliquer une animation de rotation sur le logo
            //res->anim->anim.xml

            Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
            logo.startAnimation(aniRotate);




        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent intent = new Intent(SplashScreen.this, PastaListActivity.class);
                    startActivity(intent);
                    SplashScreen.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();


    }
}