package com.example.mytabs;
import android.os.Bundle;import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;import android.widget.TableRow;
import android.widget.TextView;


public class ThirdFragment extends Fragment {
    public ThirdFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TableLayout tableLayout = new TableLayout(getContext());
        tableLayout.setBackgroundColor(getResources().getColor(R.color.zelenka));
        // Создаем новые строки таблицы
        for (int i = 1; i < 15; i++) {
            TableRow row = new TableRow(getContext());
            TextView textView = new TextView(getContext()); // Создаем TextView для каждой ячейки и добавляем его в строку
            textView.setText("Это строка под номером - " + i + "\n");
            row.addView(textView);
            tableLayout.addView(row);
        }

        return tableLayout;
    }
}