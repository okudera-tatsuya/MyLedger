package jp.ac.hal.tokyo.mymanage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class PagerAdapter extends android.support.v4.view.PagerAdapter {

	// �y�[�W�����w��
	static final int NUM_VIEW = 3;
	LayoutInflater Inflater;

	public PagerAdapter(Context context) {
		// ���C�A�E�g�t�@�C���̃C���X�^���X���pLayoutInflater�C���X�^���X���擾
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

	// �e�y�[�W�������ɌĂяo�����
	@Override
	public Object instantiateItem(View collection, int position) {
		// ViewPager�C���X�^���X���擾
		ViewPager pager = (ViewPager) collection;

		if (position == 0) {
			// 1�y�[�W�ڐ���

			// ���C�A�E�g�t�@�C���u�v���C���X�^���X������
			View view = Inflater.inflate(R.layout.page1, pager, false);

			// �����Ń��X�i�[��ݒ肷��ȂǕK�v�ȏ������ǉ�����

			// 0�Ԗڂ̃y�[�W���[�ɃC���X�^���X�������r���[��ǉ�
			pager.addView(view, 0);

			return view;
		} else if (position == 1) {
			// 2�y�[�W�ڐ���

			// ���C�A�E�g�t�@�C���u�v�𐶐�
			View view = Inflater.inflate(R.layout.page2, pager, false);

			// 1�Ԗڂ̃y�[�W���[�ɃC���X�^���X�������r���[��ǉ�
			pager.addView(view, 1);

			return view;
		} else {
			// 3�y�[�W�ڐ���

			// ���C�A�E�g�t�@�C���u�v�𐶐�
			View view = Inflater.inflate(R.layout.page3, pager, false);

			// 1�Ԗڂ̃y�[�W���[�ɃC���X�^���X�������r���[��ǉ�
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
