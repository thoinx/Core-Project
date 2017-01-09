package project.core.thoinx.com.coreproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import project.core.thoinx.com.coreproject.utils.L;
import project.core.thoinx.com.coreproject.view.DialogCustom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnShow = (Button) findViewById(R.id.btn_show);
        btnShow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                DialogCustom dialogCustom = new DialogCustom(MainActivity.this);
                dialogCustom.setOnClickDialogCustom(new DialogCustom.OnClickDialog() {
                    @Override
                    public void onClickButtonYes() {
                        finish();
                    }

                    @Override
                    public void onClickButtonNo() {
                        L.e("cancel");
                    }
                });
                dialogCustom.show();
            }
        });
    }
}
