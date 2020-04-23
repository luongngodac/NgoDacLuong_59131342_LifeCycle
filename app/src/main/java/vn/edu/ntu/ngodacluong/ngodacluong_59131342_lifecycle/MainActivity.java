package vn.edu.ntu.ngodacluong.ngodacluong_59131342_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;// khong bat buoc phai giong ben activity_main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate called");
        // Log duoc su dung khi ghi mot so bien can theo doi
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        txtTG.setText(strDate);
    }
//tai sao khong dc

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResum called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart called");
    }
 ,.
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();//
        Log.d("LifeCycle", "onDetroy called");
    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

}