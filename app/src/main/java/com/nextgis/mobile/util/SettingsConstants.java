/*
 * Project:  NextGIS Mobile
 * Purpose:  Mobile GIS for Android.
 * Author:   Dmitry Baryshnikov (aka Bishop), bishop.dev@gmail.com
 * Author:   NikitaFeodonit, nfeodonit@yandex.com
 * Author:   Stanislav Petriakov, becomeglory@gmail.com
 * *****************************************************************************
 * Copyright (c) 2012-2015. NextGIS, info@nextgis.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nextgis.mobile.util;

public interface SettingsConstants
{
    String AUTHORITY             = "com.nextgis.mobile.provider";

    /**
     * Preference key - not UI
     */
    String KEY_PREF_SCROLL_X      = "map_scroll_x";
    String KEY_PREF_SCROLL_Y      = "map_scroll_y";
    String KEY_PREF_ZOOM_LEVEL    = "map_zoom_level";
    String KEY_PREF_SHOW_LOCATION = "map_show_loc";
    String KEY_PREF_SHOW_COMPASS  = "map_show_compass";
    String KEY_PREF_SHOW_INFO     = "map_show_info";
    String KEY_PREF_APP_VERSION   = "app_version";

    /**
     * Preference keys - in UI
     */
    String KEY_PREF_STORAGE_SITE        = "storage_site";
    String KEY_PREF_USER_ID             = "user_id";
    String KEY_PREF_MIN_DIST_CHNG_UPD   = "min_dist_change_for_update";
    String KEY_PREF_MIN_TIME_UPD        = "min_time_beetwen_updates";
    String KEY_PREF_SW_TRACK_SRV        = "sw_track_service";
    String KEY_PREF_SW_TRACKGPX_SRV     = "sw_trackgpx_service";
    String KEY_PREF_SHOW_LAYES_LIST     = "show_layers_list";
    String KEY_PREF_SW_SENDPOS_SRV      = "sw_sendpos_service";
    String KEY_PREF_SW_ENERGY_ECO       = "sw_energy_economy";
    String KEY_PREF_TIME_DATASEND       = "time_between_datasend";
    String KEY_PREF_ACCURATE_LOC        = "accurate_coordinates_pick";
    String KEY_PREF_ACCURATE_GPSCOUNT   = "accurate_coordinates_pick_count";
    String KEY_PREF_ACCURATE_CE         = "accurate_type";
    String KEY_PREF_TILE_SIZE           = "map_tile_size";
    String KEY_PREF_COMPASS_VIBRO       = "compass_vibration";
    String KEY_PREF_COMPASS_TRUE_NORTH  = "compass_true_north";
    String KEY_PREF_COMPASS_SHOW_MAGNET = "compass_show_magnetic";
    String KEY_PREF_COMPASS_WAKE_LOCK   = "compass_wake_lock";
    String KEY_PREF_SHOW_ZOOM_CONTROLS  = "show_zoom_controls";

    int FIRSTSTART_DOWNLOADZOOM = 5;
}
