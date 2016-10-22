package com.example.user.huay;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import com.example.user.huay.model.huay;

public class MainActivity extends AppCompatActivity  {

    private huay huay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        huay = new huay();
        Button btn1 = (Button)findViewById(R.id.button_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity_Detail.class);
                intent.putExtra("text","เลขท้าย 2 ตัว");
                intent.putExtra("huay",huay.getRandomTwoDigits());
                startActivity(intent);
            }
        });
        Button btn2 = (Button)findViewById(R.id.button_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity_Detail.class);
                intent.putExtra("text","เลขท้าย 3 ตัว");
                intent.putExtra("huay",huay.getRandomThreeDigits());
                startActivity(intent);
            }
        });
    }
}



