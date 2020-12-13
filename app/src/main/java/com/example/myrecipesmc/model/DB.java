package com.example.myrecipesmc.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DB {

    // database name and version
    public static final String DB_NAME = "recipe.db";
    public static final int DB_VERSION = 1;

    // Recipes table
    public static final String RECIPE_TABLE = "recipes";

    public static final String RECIPE_ID = "recipe_id";
    public static final int RECIPE_ID_COL = 0;

    public static final String NAME = "name";
    public static final int NAME_COL = 1;

    public static final String DESCRIPTION = "description";
    public static final int DESCRIPTION_COL = 2;

    public static final String CATEGORY = "category";
    public static final int CATEGORY_COL = 3;

    public static final String PREP_TIME = "prep_time";
    public static final int PREP_TIME_COL = 4;

    public static final String COOK_TIME = "cook_time";
    public static final int COOK_TIME_COL = 5;

    public static final String DIFFICULTY = "difficulty";
    public static final int DIFFICULTY_COL = 6;

    public static final String SERVING = "serving";
    public static final int SERVING_COL = 7;

    /**
     * Database SQL
     **/
    public static final String CREATE_CITY_TABLE =
            "CREATE TABLE " + RECIPE_TABLE + " (" +
                    RECIPE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME + " TEXT, " +
                    DESCRIPTION + " TEXT, " +
                    CATEGORY + " TEXT, " +
                    PREP_TIME + " INTEGER, " +
                    COOK_TIME + " INTEGER, " +
                    DIFFICULTY + " TEXT, " +
                    SERVING + " TEXT)";

    private static class DBHelper extends SQLiteOpenHelper {

        public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DB.CREATE_CITY_TABLE);

            // Insert default values into the table
            ContentValues cv = new ContentValues();

            cv.put(NAME, "Big-batch bolognese");
            cv.put(DESCRIPTION, "Whip up a huge batch of bolognese that's fit to feed a hungry crowd, or freeze half for a speedy midweek meal");
            cv.put(CATEGORY, "Batch cooking recipes");
            cv.put(PREP_TIME, 25);
            cv.put(COOK_TIME, 90);
            cv.put(DIFFICULTY, "Easy");
            cv.put(SERVING, "12 servings");
            db.insert(RECIPE_TABLE, null, cv);

            cv.put(NAME, "Balsamic steaks with peppercorn wedges");
            cv.put(DESCRIPTION, "Freeze single portions of sirloin steak and chips so you have a home-cooked meal within minutes of getting home");
            cv.put(CATEGORY, "Batch cooking recipes");
            cv.put(PREP_TIME, 10);
            cv.put(COOK_TIME, 25);
            cv.put(DIFFICULTY, "Easy");
            cv.put(SERVING, "6 servings");
            db.insert(RECIPE_TABLE, null, cv);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }

    }
    private SQLiteDatabase db;
    private DBHelper dbHelper;

    public DB(Context context) {
        dbHelper = new DBHelper(context, DB_NAME, null, DB_VERSION);
    }

    private void openReadableDB() {
        db = dbHelper.getReadableDatabase();
    }

    private void openWriteableDB() {
        db = dbHelper.getWritableDatabase();
    }

    public List<Recipe> getRecipes() {
        this.openReadableDB();
        Cursor cursor = db.query(RECIPE_TABLE,
                null, null, null, null, null, null);

        List<Recipe> recipeList = new ArrayList<Recipe>();

        while (cursor.moveToNext()) {
            String recipeName = cursor.getString(NAME_COL);
            String recipeDescription = cursor.getString(DESCRIPTION_COL);
            String recipeCategory = cursor.getString(CATEGORY_COL);

            Recipe recipe = new Recipe(recipeName, recipeDescription, recipeCategory);
            recipeList.add(recipe);
        }
        if (cursor != null){
            cursor.close();
        }
        this.close();
        return recipeList;
    }

    public void close() {
        if (db != null){
            db.close();
        }
    }
}
