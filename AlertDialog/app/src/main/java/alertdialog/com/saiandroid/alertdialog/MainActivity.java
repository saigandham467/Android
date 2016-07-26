package alertdialog.com.saiandroid.alertdialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button showDialog;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog=(Button) findViewById(R.id.dialogbutton);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            dialog= new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle(getResources().getString(R.string.Dialog_Title));
                dialog.setMessage(getResources().getString(R.string.Dialog_message));
                dialog.setCancelable(false);
                dialog.setPositiveButton(getResources().getString(R.string.Positive_Button),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {

                                MainActivity.this.finish();
                            }
                        });
                dialog.setNegativeButton(getResources().getString(R.string.Negative_Button),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog alertD=dialog.create();
                alertD.show();

            }
        });
    }
}
