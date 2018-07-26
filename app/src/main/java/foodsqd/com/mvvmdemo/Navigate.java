package foodsqd.com.mvvmdemo;

/**
 * Created by andriod on 25/7/18.
 */

public interface Navigate  {

    void handleError(Throwable throwable);

    void login();

    void openMainActivity();
}
