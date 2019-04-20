package software.ilhan.com.realtimemangalaoyunu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

//    private String[] ulkeler =
//            {"Türkiye", "Almanya", "Avusturya", "Amerika","İngiltere",
//                    "Macaristan", "Yunanistan", "Rusya", "Suriye", "İran", "Irak",
//                    "Şili", "Brezilya", "Japonya", "Portekiz", "İspanya",
//                    "Makedonya", "Ukrayna", "İsviçre"};

    Levha levha1 = new Levha("başlık1","gereksinim1","username1");
    Levha levha2 = new Levha("başlık2","gereksinim2","username2");
    Levha levha3 = new Levha("başlık3","gereksinim3","username3");
    ArrayList<Levha> levhaList = new ArrayList<>();

    //private String[] levhalar = {levha1,levha2,levha3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
/*
        ListView listemiz=(ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler);
        listemiz.setAdapter(veriAdaptoru);*/

        levhaList.add(levha1);
        levhaList.add(levha2);
        levhaList.add(levha3);
        levhaListAdapter adapter = new levhaListAdapter(this, R.layout.project_box, levhaList);
        mListView.setAdapter(adapter);
    }
}
