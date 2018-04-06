package com.vanh1200.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private List<String> mNames = new ArrayList<>();
    private List<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");
        initImageBitmaps();
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: preparing recyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");
        mNames.add("Nguyễn Thu Thảo 1");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t1.0-9/29542326_1268784649932268_9017166559145128533_n.jpg?_nc_cat=0&oh=d723e4ad9628962c9ee41ca2d7fa8803&oe=5B2D04D6");
        mNames.add("Nguyễn Thu Thảo 2");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t1.0-9/26804430_1219544048189662_190458053975944910_n.jpg?_nc_cat=0&oh=11cd80d99f88ca3e8c921b497c161c54&oe=5B677A5F");
        mNames.add("Nguyễn Thu Thảo 3");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t31.0-8/26220578_1219483201529080_8846165227561792419_o.jpg?_nc_cat=0&oh=12df654e21445c24d631a297bbb8b889&oe=5B2AC666");
        mNames.add("Nguyễn Thu Thảo 4");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t31.0-8/26232317_1219483051529095_7525091473673076753_o.jpg?_nc_cat=0&oh=8a3fb92db9ae277686311b52edf1f6ac&oe=5B3631DE");
        mNames.add("Nguyễn Thu Thảo 5");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t31.0-8/25438798_1207618402715560_7964754801206468118_o.jpg?_nc_cat=0&oh=8315cefb00da173e752b6dc9ceea85f5&oe=5B380865");
        mNames.add("Nguyễn Thu Thảo 6");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t1.0-9/24909958_1202819463195454_1683578021762512552_n.jpg?_nc_cat=0&oh=96ef88fd33a617e303e52f94b1c3b664&oe=5B742518");
        mNames.add("Nguyễn Thu Thảo 7");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t31.0-8/25074829_1201652283312172_6274722733978592465_o.jpg?_nc_cat=0&oh=83d3f63210fd65c57da03a14793d8105&oe=5B2B804C");
        mNames.add("Nguyễn Thu Thảo 8");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t31.0-8/24883639_1201106970033370_5410835225551729677_o.jpg?_nc_cat=0&oh=cb6509e1f9d2d0e44738284b7d6eab85&oe=5B745B09");
        mNames.add("Nguyễn Thu Thảo 9");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t31.0-8/23737674_1189760704501330_5104126402207826247_o.jpg?_nc_cat=0&oh=071766e9aa5251a81c8176c49aaf7ee1&oe=5B2AA24F");
        mNames.add("Nguyễn Thu Thảo 10");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t1.0-9/23472904_1186423674835033_2760066061155580359_n.jpg?_nc_cat=0&oh=3c9284bd1e16e89e0c8948b0572e2dee&oe=5B285FE0");
        mNames.add("Nguyễn Thu Thảo 11");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t1.0-9/21765111_1158307450979989_102986505015140526_n.jpg?_nc_cat=0&oh=3c22632e5fa87ba4bd1b31762af0ec9e&oe=5B3060A5");
        mNames.add("Nguyễn Thu Thảo 12");
        mImageUrls.add("https://scontent.fhan4-1.fna.fbcdn.net/v/t31.0-8/21318946_1149438661866868_8189292869414340481_o.jpg?_nc_cat=0&oh=bd15b74f005717c68a4245752f54e38a&oe=5B2CDE88");
    }
    
}
