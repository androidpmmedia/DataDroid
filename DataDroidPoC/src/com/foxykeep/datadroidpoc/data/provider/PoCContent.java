package com.foxykeep.datadroidpoc.data.provider;

import com.foxykeep.datadroidpoc.data.provider.util.ColumnMetadata;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;

/**
 * This class was generated by the ContentProviderCodeGenerator project made by Foxykeep
 * <p>
 * (More information available https://github.com/foxykeep/ContentProviderCodeGenerator)
 */
public abstract class PoCContent {

  public static final Uri CONTENT_URI = Uri.parse("content://" + PoCProvider.AUTHORITY);

  private PoCContent() {
  }

  /**
   * Created in version 1
   */
  public static final class DbPerson extends PoCContent {

    private static final String LOG_TAG = DbPerson.class.getSimpleName();

    public static final String TABLE_NAME = "dbPerson";
    public static final String TYPE_ELEM_TYPE = "vnd.android.cursor.item/poc-dbperson";
    public static final String TYPE_DIR_TYPE = "vnd.android.cursor.dir/poc-dbperson";

    public static final Uri CONTENT_URI = Uri.parse(PoCContent.CONTENT_URI + "/" + TABLE_NAME);

    public static enum Columns implements ColumnMetadata {
      ID(BaseColumns._ID, "integer"),
      FIRST_NAME("firstName", "text"),
      LAST_NAME("lastName", "text"),
      EMAIL("email", "text"),
      CITY("city", "text"),
      POSTAL_CODE("postalCode", "integer"),
      AGE("age", "integer"),
      IS_WORKING("isWorking", "integer");

      private final String mName;
      private final String mType;

      private Columns(String name, String type) {
        mName = name;
        mType = type;
      }

      @Override
      public int getIndex() {
        return ordinal();
      }

      @Override
      public String getName() {
        return mName;
      }

      @Override
      public String getType() {
        return mType;
      }
    }

    public static final String[] PROJECTION = new String[] {
        Columns.ID.getName(), Columns.FIRST_NAME.getName(), Columns.LAST_NAME.getName(),
        Columns.EMAIL.getName(), Columns.CITY.getName(), Columns.POSTAL_CODE.getName(),
        Columns.AGE.getName(), Columns.IS_WORKING.getName()
    };

    private DbPerson() {
      // No private constructor
    }

    public static void createTable(SQLiteDatabase db) {
      db.execSQL("CREATE TABLE "
          + TABLE_NAME
          + " ("
          + Columns.ID.getName()
          + " "
          + Columns.ID.getType()
          + ", "
          + Columns.FIRST_NAME.getName()
          + " "
          + Columns.FIRST_NAME.getType()
          + ", "
          + Columns.LAST_NAME.getName()
          + " "
          + Columns.LAST_NAME.getType()
          + ", "
          + Columns.EMAIL.getName()
          + " "
          + Columns.EMAIL.getType()
          + ", "
          + Columns.CITY.getName()
          + " "
          + Columns.CITY.getType()
          + ", "
          + Columns.POSTAL_CODE.getName()
          + " "
          + Columns.POSTAL_CODE.getType()
          + ", "
          + Columns.AGE.getName()
          + " "
          + Columns.AGE.getType()
          + ", "
          + Columns.IS_WORKING.getName()
          + " "
          + Columns.IS_WORKING.getType()
          + ", PRIMARY KEY ("
          + Columns.ID.getName()
          + ")"
          + ");");

      db.execSQL("CREATE INDEX dbPerson_lastName on "
          + TABLE_NAME
          + "("
          + Columns.LAST_NAME.getName()
          + ");");
    }

    // Version 1 : Creation of the table
    public static void upgradeTable(SQLiteDatabase db, int oldVersion, int newVersion) {

      if (oldVersion < 1) {
        Log.i(LOG_TAG,
            "Upgrading from version " + oldVersion + " to " + newVersion + ", data will be lost!");

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME + ";");
        createTable(db);
        return;
      }

      if (oldVersion != newVersion) {
        throw new IllegalStateException("Error upgrading the database to version " + newVersion);
      }
    }

    static String getBulkInsertString() {
      return new StringBuilder("INSERT INTO ").append(TABLE_NAME)
          .append(" ( ")
          .append(Columns.ID.getName())
          .append(", ")
          .append(Columns.FIRST_NAME.getName())
          .append(", ")
          .append(Columns.LAST_NAME.getName())
          .append(", ")
          .append(Columns.EMAIL.getName())
          .append(", ")
          .append(Columns.CITY.getName())
          .append(", ")
          .append(Columns.POSTAL_CODE.getName())
          .append(", ")
          .append(Columns.AGE.getName())
          .append(", ")
          .append(Columns.IS_WORKING.getName())
          .append(" ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")
          .toString();
    }

    static void bindValuesInBulkInsert(SQLiteStatement stmt, ContentValues values) {
      int i = 1;
      String value;
      stmt.bindLong(i++, values.getAsLong(Columns.ID.getName()));
      value = values.getAsString(Columns.FIRST_NAME.getName());
      stmt.bindString(i++, value != null ? value : "");
      value = values.getAsString(Columns.LAST_NAME.getName());
      stmt.bindString(i++, value != null ? value : "");
      value = values.getAsString(Columns.EMAIL.getName());
      stmt.bindString(i++, value != null ? value : "");
      value = values.getAsString(Columns.CITY.getName());
      stmt.bindString(i++, value != null ? value : "");
      stmt.bindLong(i++, values.getAsLong(Columns.POSTAL_CODE.getName()));
      stmt.bindLong(i++, values.getAsLong(Columns.AGE.getName()));
      stmt.bindLong(i++, values.getAsLong(Columns.IS_WORKING.getName()));
    }
  }
}

