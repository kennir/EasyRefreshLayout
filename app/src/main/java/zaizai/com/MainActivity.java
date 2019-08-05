package zaizai.com;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.ajguan.R;

import zaizai.com.View.AdavnceModelActivity;
import zaizai.com.View.OnlyLoadingActivity;
import zaizai.com.View.OnlyRefreshActivity;
import zaizai.com.View.RefreshLoadingActivity;
import zaizai.com.View.ViewPagerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        findViewById(R.id.loading).setOnClickListener(this);
        findViewById(R.id.refresh).setOnClickListener(this);
        findViewById(R.id.refresh_loding).setOnClickListener(this);
        findViewById(R.id.m_view_pager).setOnClickListener(this);
        findViewById(R.id.m_adavence_model).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.refresh:
                startActivity(new Intent(MainActivity.this, OnlyRefreshActivity.class));
                break;
            case R.id.loading:
                startActivity(new Intent(MainActivity.this, OnlyLoadingActivity.class));
                break;
            case R.id.refresh_loding:
                startActivity(new Intent(MainActivity.this, RefreshLoadingActivity.class));
                break;
            case R.id.m_view_pager:
                startActivity(new Intent(MainActivity.this, ViewPagerActivity.class));
                break;
            case R.id.m_adavence_model:
                startActivity(new Intent(MainActivity.this, AdavnceModelActivity.class));
                break;
        }

    }
}
