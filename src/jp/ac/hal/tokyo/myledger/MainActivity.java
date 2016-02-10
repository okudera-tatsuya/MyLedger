package jp.ac.hal.tokyo.myledger;

import jp.ac.hal.tokyo.DB.DatabaseHelper;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SlidingDrawer;

public class MainActivity extends ActionBarActivity {

	ViewPager viewPager;
	PagerAdapter padapter;

	// データベースヘルパーの生成
	private DatabaseHelper helper = new DatabaseHelper(this);
	public static SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ViewPagerのインスタンスを取得
		viewPager = (ViewPager) findViewById(R.id.viewpager);

		// PagerAdapterにインスタンス生成
		padapter = new jp.ac.hal.tokyo.myledger.PagerAdapter(this);

		// ViewPagerに生成したアダプタをセットする
		viewPager.setAdapter(padapter);

		// データベースオープン
		db = helper.getWritableDatabase();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		// クローズ処理
		helper.close();
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
