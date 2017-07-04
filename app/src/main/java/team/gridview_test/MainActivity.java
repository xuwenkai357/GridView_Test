package team.gridview_test;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static team.gridview_test.R.drawable.yanglaoban;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.image1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello");
                img.setImageResource(R.drawable.yanglaoban);
            }
        });

        img.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                System.out.println("你好");
                img.setImageResource(R.drawable.yujinxiang);

                return false;

            }
        });


    }

}
