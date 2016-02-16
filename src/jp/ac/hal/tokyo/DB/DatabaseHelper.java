/**
 * @author okudera.tatsuya
 */
package jp.ac.hal.tokyo.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	// �f�[�^�x�[�X���A�o�[�W�����A�e�[�u����
	private final static String DB_NAME = "MyLegderDB";
	private final static int DB_VERSION = 1;
	// �x�o�A�����A�J�e�S���[�e�[�u��
	/**
	 * Spending�u�x�o�v
	 * spending_id�u�x�oID�v�i��L�[�j
	 * spending_name�u�x�o���v
	 * spending_money�u�x�o���z�v
	 * category_id�u�J�e�S���[ID�v�i�O���L�[�j
	 * add_date�u�ǉ����v
	 * memo�u�����v
	 */
	private final static String Spending_TABLE = "create table spending(" +
			"spending_id integer primary key autoincrement," +
			"spending_name text not null," +
			"spending_money integer not null," +
			"category_id integer," +
			"add_date TEXT not null," +
			"memo TEXT," +
			"FOREIGN KEY(category_id) REFERENCES category(category_id)" +
			");";
	/**
	 * Income�u�����v
	 */
	private final static String Income_TABLE = "";
	
	private final static String Category_TABLE = "create table category(" +
			"category_id Integer primary key," +
			"category_name TEXT not null);";

	public DatabaseHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(Category_TABLE);
		db.execSQL(Spending_TABLE);
		// db.execSQL(Income_TABLE);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
