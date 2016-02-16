package jp.ac.hal.tokyo.Bean;

public class Spending {
	private int spending_id;
	private String spending_name;
	private int spending_money;
	private int category_id;
	private String add_date;
	private String memo;

	public Spending(String spending_name, int spending_money,
			int category_id, String memo) {
		super();
		this.spending_name = spending_name;
		this.spending_money = spending_money;
		this.category_id = category_id;
		this.memo = memo;
	}

	public int getSpending_id() {
		return spending_id;
	}

	public void setSpending_id(int spending_id) {
		this.spending_id = spending_id;
	}

	public String getSpending_name() {
		return spending_name;
	}

	public void setSpending_name(String spending_name) {
		this.spending_name = spending_name;
	}

	public int getSpending_money() {
		return spending_money;
	}

	public void setSpending_money(int spending_money) {
		this.spending_money = spending_money;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getAdd_date() {
		return add_date;
	}

	public void setAdd_date(String add_date) {
		this.add_date = add_date;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
