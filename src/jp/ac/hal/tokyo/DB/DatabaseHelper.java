/**
 * @author okudera.tatsuya
 */
package jp.ac.hal.tokyo.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	// データベース名、バージョン、テーブル名
	private final static String DB_NAME = "MyLegderDB";
	private final static int DB_VERSION = 1;
	// 支出、収入、カテゴリーテーブル
	/**
	 * Spending「支出」
	 * spending_id「支出ID」（主キー）
	 * spending_name「支出名」
	 * spending_money「支出金額」
	 * category_id「カテゴリーID」（外部キー）
	 * add_date「追加日」
	 * memo「メモ」
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
	 * Income「収入」
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
