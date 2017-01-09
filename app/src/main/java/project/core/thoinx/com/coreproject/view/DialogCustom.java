package project.core.thoinx.com.coreproject.view;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import project.core.thoinx.com.coreproject.R;

/**
 * Created by thoinx on 1/9/2017.
 */

public class DialogCustom extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;
    private OnClickDialog onClickDialog;

    public DialogCustom(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        onClickDialog = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_custom);
        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                dismiss();
                if (null != onClickDialog) {
                    onClickDialog.onClickButtonYes();
                }
                break;
            case R.id.btn_no:
                if (null != onClickDialog) {
                    onClickDialog.onClickButtonNo();
                }
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }

    public void setOnClickDialogCustom(OnClickDialog onClickDialog) {
        this.onClickDialog = onClickDialog;
    }

    public interface OnClickDialog {

        public void onClickButtonYes();

        public void onClickButtonNo();
    }
}