package com.vanh1200.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ArtGalleryActivity extends AppCompatActivity {
    private static final String TAG = "ArtGalleryActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_gallery);
        getIncommingItent();
    }
    
    private void getIncommingItent() {
        Log.d(TAG, "getIncommingItent: checking for incoming intents");
        if(getIntent().hasExtra("mImageURL") && getIntent().hasExtra("mImageName")){
            Log.d(TAG, "getIncommingItent: found intent extras");
            String imageURL = getIntent().getStringExtra("mImageURL");
            String imageName = getIntent().getStringExtra("mImageName");
            setImage(imageURL, imageName);
        }
    }

    private void setImage(String mImageURL, String mImageName){
        Log.d(TAG, "setImage: setting to the image");
        TextView textView = findViewById(R.id.description);
        textView.setText(mImageName);
        ImageView imageView = findViewById(R.id.detail_image);
        Glide.with(this)
                .asBitmap()
                .load(mImageURL)
                .into(imageView);
    }
}
