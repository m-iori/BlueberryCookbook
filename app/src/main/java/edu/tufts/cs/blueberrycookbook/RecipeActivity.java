package edu.tufts.cs.blueberrycookbook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*TextView recipeTextView = (TextView) findViewById(R.id.recipeText);
        recipeTextView.setText("In a large bowl, sift together flour, salt, baking powder and sugar. " +
                "In a small bowl, beat together egg and milk. Stir milk and egg into flour mixture. " +
                "Mix in the butter and fold in the blueberries. Set aside for 1 hour.\n" +
                "Heat a lightly oiled griddle or frying pan over medium high heat. " +
                "Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. " +
                "Brown on both sides and serve hot.");*/
    }

}
