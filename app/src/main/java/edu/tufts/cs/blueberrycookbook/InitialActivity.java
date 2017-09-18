package edu.tufts.cs.blueberrycookbook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_initial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View firstImage = findViewById(R.id.firstimage);
        ImageView imv = (ImageView)(firstImage);
        imv.setImageResource(R.drawable.pancakesintro);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_initial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void viewRecipes(View v) {
        /*Intent intentMain = new Intent(InitialActivity.this ,
                RecipeActivity.class);
        InitialActivity.this.startActivity(intentMain);*/
        setContentView(R.layout.activity_recipe);
        TextView recipeTextView = (TextView) findViewById(R.id.recipeText);
        recipeTextView.setText("In a large bowl, sift together flour, salt, baking powder and sugar. " +
                "In a small bowl, beat together egg and milk. Stir milk and egg into flour mixture. " +
                "Mix in the butter and fold in the blueberries. Set aside for 1 hour.\n" +
                "Heat a lightly oiled griddle or frying pan over medium high heat. " +
                "Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. " +
                "Brown on both sides and serve hot.");
    }

    public void viewSources(View v){
        setContentView(R.layout.activity_credit);
        TextView recipeTextView = (TextView) findViewById(R.id.creditText);
        recipeTextView.setText("http://allrecipes.com/recipe/20177/todds-famous-blueberry-pancakes/?clickId=right%20rail%200&internalSource=rr_feed_recipe&referringId=17611&referringContentType=recipe" +
                " http://sweetfrog.com/yogurt/flavor/nsa-blueberry");

    }
}
