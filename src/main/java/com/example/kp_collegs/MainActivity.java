package com.example.kp_collegs;




import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView uploadNotice,addGalleryImage,addebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uploadNotice=findViewById(R.id.addnotice);
        addGalleryImage=findViewById(R.id.addGalleryImage);
        addebook=findViewById(R.id.addEbook);
        addGalleryImage.setOnClickListener(this);
        addebook.setOnClickListener(this);
        uploadNotice.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.addnotice:
              intent=new Intent(MainActivity.this,upload_notice.class);
                startActivity(intent);
                break;
            case R.id.addGalleryImage:
                intent=new Intent(MainActivity.this,upload_image.class);
                startActivity(intent);
                break;
            case R.id.addEbook:
                intent=new Intent(MainActivity.this,update_ebook.class);
                startActivity(intent);
                break;

        }
    }
}