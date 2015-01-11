package money.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by marvin on 11.01.15.
 */
@DatabaseTable(tableName = "accounts")
public class Account {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "name")
    private String name;

    @DatabaseField(columnName = "current_balance")
    private Float currentBalance;

    Account() {}
}
