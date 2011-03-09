package com.fsck.example.splitview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import com.fsck.splitview.SplitView;

public class Home extends Activity
{
    private Button mMaximizePrimaryContent;
    private Button mMaximizeSecondaryContent;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mMaximizePrimaryContent = (Button)findViewById(R.id.maximize_primary);  
        mMaximizePrimaryContent.setOnClickListener( new OnClickListener() {
            @Override public void onClick(View v) {
                ((SplitView)findViewById(R.id.split_view)).maximizePrimaryContent();
            }

        });

        mMaximizeSecondaryContent = (Button)findViewById(R.id.maximize_secondary);  
        mMaximizeSecondaryContent.setOnClickListener( new OnClickListener() {
            @Override public void onClick(View v) {
                ((SplitView)findViewById(R.id.split_view)).maximizeSecondaryContent();
            }

        });


    }
}
