package foodsqd.com.mvvmdemo;

import com.stfalcon.androidmvvmhelper.mvvm.activities.BindingActivity;

import foodsqd.com.mvvmdemo.databinding.ActivityProductBinding;


/**
 * Created by andriod on 24/7/18.
 */

public class ProductActivity extends BindingActivity<ActivityProductBinding, ProductActivityVM> {

    @Override
    public ProductActivityVM onCreate() {
        return new ProductActivityVM(this);
    }


    @Override
    public int getVariable() {
        return foodsqd.com.mvvmdemo.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_product;
    }

}