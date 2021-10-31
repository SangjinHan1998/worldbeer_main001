package com.cookandroid.worldbeer_main001;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MenuAdapter extends FragmentStateAdapter {
    public MenuAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)    {

        switch (position)
        {
            case 1:
                return new MenuFragment2();
            case 2:
                return new MenuFragment3();
            case 3:
                return new MenuFragment4();
        }

        return new MenuFragment1();
    }
    @Override

    public int getItemCount()   {
        return 4;
    }
}
