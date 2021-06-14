package com.liang.mookmusic.mvp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.InputType;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.liang.mookmusic.R;

/**
 * 自定义控件的方式很多，这是使用继承Layout的方式
 */
public class InputView extends FrameLayout {

    private final String TAG = this.getClass().getSimpleName();

    private int mInputIcon;
    private String mInputHind;
    private boolean mIsPassword;

    private View mView;
    private ImageView mImageView;
    private EditText mEditText;

    public InputView(@NonNull Context context) {
        super(context);
        init(context, null);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }


    /**
     * 初始化组件方法
     * @param context
     * @param attributeSet
     */
    private void init(Context context, AttributeSet attributeSet){

        if(attributeSet == null){
            Log.i(TAG, "attributeSet == null");
            return ;
        }
        Log.i(TAG, "attributeSet != null");
        //获取自定义属性
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.inputView);
        mInputIcon = typedArray.getResourceId(R.styleable.inputView_input_icon, R.mipmap.ic_launcher);
        mInputHind = typedArray.getString(R.styleable.inputView_input_hint);
        mIsPassword = typedArray.getBoolean(R.styleable.inputView_is_password, false);
        typedArray.recycle();

        //绑定布局
        mView = LayoutInflater.from(context).inflate(R.layout.input_view, this, false);
        mImageView = mView.findViewById(R.id.iv_input_icon);
        mEditText = mView.findViewById(R.id.et_input_text);

        addView(mView);
        mImageView.setImageResource(mInputIcon);
        mEditText.setHint(mInputHind);
        mEditText.setInputType(mIsPassword ?
                InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT
                : InputType.TYPE_CLASS_PHONE);

    }

    public String getInputString() {
        return mEditText.getText().toString().trim();
    }
}
