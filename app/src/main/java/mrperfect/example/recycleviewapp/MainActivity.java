package mrperfect.example.recycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<RecycleModel> models = new ArrayList<>();
        models.add(new RecycleModel("Title1", "Description1"));
        models.add(new RecycleModel("Title2", "Description2"));
        models.add(new RecycleModel("Title3", "Description3"));
        models.add(new RecycleModel("Title4", "Description4"));
        models.add(new RecycleModel("Title5", "Description5"));
        models.add(new RecycleModel("Title6", "Description6"));
        models.add(new RecycleModel("Title7", "Description7"));
        models.add(new RecycleModel("Title8", "Description8"));
        models.add(new RecycleModel("Title9", "Description9"));
        models.add(new RecycleModel("Title10", "Description10"));
        models.add(new RecycleModel("Title11", "Description11"));
        models.add(new RecycleModel("Title12", "Description12"));
        models.add(new RecycleModel("Title13", "Description13"));
        models.add(new RecycleModel("Title14", "Description14"));
        models.add(new RecycleModel("Title15", "Description15"));
        models.add(new RecycleModel("Title16", "Description16"));

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecycleAdapter adapter = new RecycleAdapter();
        adapter.setList(models);

        LinearLayoutManager lm = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(lm);
    }
}