package com.fsck.splitview;

import com.fsck.splitview.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

class SplitView extends LinearLayout {
	
    private int mHandleId;
	private View mHandle;

    private int mPrimaryContentId;
    private View mPrimaryContent;

    private int mSecondaryContentId;
    private View mSecondaryContent;



    public SplitView(Context context, AttributeSet attrs) {
                super(context, attrs);
	
		TypedArray viewAttrs = context.obtainStyledAttributes(attrs, R.styleable.SplitView);
    
		RuntimeException e = null;
    mHandleId = viewAttrs.getResourceId(R.styleable.SplitView_handle, 0);
		if (mHandleId == 0) {
		e= new IllegalArgumentException(viewAttrs.getPositionDescription() +
					": The required attribute handle must refer to a valid child view.");
		}


    
    mPrimaryContentId = viewAttrs.getResourceId(R.styleable.SplitView_primaryContent, 0);
		if (mPrimaryContentId == 0) {
		e= new IllegalArgumentException(viewAttrs.getPositionDescription() +
					": The required attribute primaryContent must refer to a valid child view.");
		}

    
    mSecondaryContentId = viewAttrs.getResourceId(R.styleable.SplitView_secondaryContent, 0);
		if (mSecondaryContentId == 0) {
	    e = new IllegalArgumentException(viewAttrs.getPositionDescription() +
					": The required attribute secondaryContent must refer to a valid child view.");
		}

        
		viewAttrs.recycle();
		
		if (e != null) {
			throw e;
		}

    }
};
