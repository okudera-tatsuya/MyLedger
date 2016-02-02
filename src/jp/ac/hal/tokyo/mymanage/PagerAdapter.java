package jp.ac.hal.tokyo.mymanage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class PagerAdapter extends android.support.v4.view.PagerAdapter {

	// ページ数を指定
	static final int NUM_VIEW = 3;
	LayoutInflater Inflater;

	public PagerAdapter(Context context) {
		// レイアウトファイルのインスタンス化用LayoutInflaterインスタンスを取得
		Inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public void destroyItem(View collection, int position, Object view) {
		((ViewPager) collection).removeView((View) view);
	}

	@Override
	public void finishUpdate(View collection) {
	}

	@Override
	public int getCount() {
		return NUM_VIEW;
	}

	// 各ページ生成時に呼び出される
	@Override
	public Object instantiateItem(View collection, int position) {
		// ViewPagerインスタンスを取得
		ViewPager pager = (ViewPager) collection;

		if (position == 0) {
			// 1ページ目生成

			// レイアウトファイル「」をインスタンス化する
			View view = Inflater.inflate(R.layout.page1, pager, false);

			// ここでリスナーを設定するなど必要な処理も追加する

			// 0番目のページャーにインスタンス化したビューを追加
			pager.addView(view, 0);

			return view;
		} else if (position == 1) {
			// 2ページ目生成

			// レイアウトファイル「」を生成
			View view = Inflater.inflate(R.layout.page2, pager, false);

			// 1番目のページャーにインスタンス化したビューを追加
			pager.addView(view, 1);

			return view;
		} else {
			// 3ページ目生成

			// レイアウトファイル「」を生成
			View view = Inflater.inflate(R.layout.page3, pager, false);

			// 1番目のページャーにインスタンス化したビューを追加
			pager.addView(view, 2);

			return view;
		}
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == (View) object;
	}

	@Override
	public void restoreState(Parcelable parcel, ClassLoader classLoader) {
	}

	@Override
	public Parcelable saveState() {
		return null;
	}

	@Override
	public void startUpdate(View collection) {
	}
}
