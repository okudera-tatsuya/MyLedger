package jp.ac.hal.tokyo.mymanage;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SlidingDrawer;

public class MainActivity extends ActionBarActivity {

	ViewPager viewPager;
	PagerAdapter padapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ViewPagerのインスタンスを取得
		viewPager = (ViewPager) findViewById(R.id.viewpager);

		// PagerAdapterにインスタンス生成
		padapter = new jp.ac.hal.tokyo.mymanage.PagerAdapter(this);

		// ViewPagerに生成したアダプタをセットする
		viewPager.setAdapter(padapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
