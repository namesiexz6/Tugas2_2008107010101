package id.ac.usk.android.imageview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.logoUSK);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            boolean isImage1 = true;

            @Override
            public void onClick(View v) {
                if (isImage1) {
                    imageView.setImageResource(R.drawable.logo_unsyiah);
                } else {
                    imageView.setImageResource(R.drawable.logo_unsyiah_2);
                }
                isImage1 = !isImage1;
            }
        });
    }
}
