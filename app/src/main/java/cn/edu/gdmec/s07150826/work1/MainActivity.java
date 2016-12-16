package cn.edu.gdmec.s07150826.work1;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;



        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work1","qidongle");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work2","mabi,yourenjiasai");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("work2","我要现身");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","我要3");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work2","我要再现身");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}

