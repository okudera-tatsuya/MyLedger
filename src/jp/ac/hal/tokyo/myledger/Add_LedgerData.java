package jp.ac.hal.tokyo.myledger;

import jp.ac.hal.tokyo.io.CheckVal;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add_LedgerData extends Activity {

	private EditText etProductName;
	private EditText etProductPrice;
	private Boolean nameFlg;
	private Boolean priceFlg;

	protected void onCreate(Bundle savedInstanceState, PagerAdapter view) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page1);

		// �x�o�f�[�^�o�^�{�^��
		Button addBtn = (Button) findViewById(R.id.addLedgerBtn);

		addBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// ���i���A���z�A�J�e�S���[�A�R�����g�i�����j�擾
				etProductName = (EditText) findViewById(R.id.etProductName);
				etProductPrice = (EditText) findViewById(R.id.etProductPrice);

				String ProductName = etProductName.getText().toString();
				int ProductPrice = Integer.parseInt(etProductPrice.getText()
						.toString());
				nameFlg = CheckVal.lengthEmptiy(ProductName);
			}
		});
		Msg();

	}

	public void successMsg() {
		Toast.makeText(this, "�x�o�f�[�^�o�^���܂���", Toast.LENGTH_SHORT).show();

	}

	public void Msg() {
		Toast.makeText(this, "Add_LedgerData", Toast.LENGTH_SHORT).show();
	}

}
