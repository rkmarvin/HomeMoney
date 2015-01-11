package money.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by marvin on 11.01.15.
 */
@DatabaseTable(tableName = "account_details")
public class AccountDetail {

    @DatabaseField(columnName = "time_stamp")
    private Date timestamp;

    @DatabaseField(columnName = "amount")
    private Float amount;

    @DatabaseField(canBeNull = true, foreign = true)
    private Account account;
}
