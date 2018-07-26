package foodsqd.com.mvvmdemo;

import android.util.Log;

import com.stfalcon.androidmvvmhelper.mvvm.activities.ActivityViewModel;

import static android.content.ContentValues.TAG;

/**
 * Created by andriod on 24/7/18.
 */

public class ProductActivityVM extends ActivityViewModel<ProductActivity> {


    public ProductActivityVM(ProductActivity activity) {
        super(activity);
    }

    public void onServerLoginClick(){
        Log.e(TAG, "onServerLoginClick: "+"ProductActivityVM" );

    }


}