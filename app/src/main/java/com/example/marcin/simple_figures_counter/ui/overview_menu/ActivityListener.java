package com.example.marcin.simple_figures_counter.ui.overview_menu;

import android.support.v4.app.Fragment;

/**
 * Created by MARCIN on 2017-07-15.
 */

public interface ActivityListener {
  /**
   * Set current fragment.
   *
   * @param fragment **this is fragment send from OverviewFragment**
   */
  void onFigureFragmentSelected(Fragment fragment);
}
