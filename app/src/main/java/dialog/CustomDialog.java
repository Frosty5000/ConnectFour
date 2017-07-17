package dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.CompoundButton;

import com.example.brandellpetty.connectfour.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by brandellpetty on 6/21/17.
 */

public class CustomDialog extends Dialog {

    private final ICustomDialogListener listener;


    public interface ICustomDialogListener{
        public void onOKClicked(String msg);
       // public void onCanceledClick();
    }


    @OnClick(R.id.dialog_custom_ok)
    public void ok(View view){
        listener.onOKClicked("Now let's play!");
        cancel();
    }

    public CustomDialog(@NonNull Context context, ICustomDialogListener listener){
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_custom);
        ButterKnife.bind(this);
        this.listener = listener;
    }
}
