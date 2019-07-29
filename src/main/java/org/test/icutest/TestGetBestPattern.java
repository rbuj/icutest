/*
 * Copyright (C) 2019 Robert Buj <rbuj@gedoraproject.org>
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

package org.test.icutest;

import com.ibm.icu.text.DateTimePatternGenerator;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ULocale;

public class TestGetBestPattern {

    public static void main(String[] args) {
        ULocale[] locales = ULocale.getAvailableLocales();
        Calendar cal = Calendar.getInstance();
        for (ULocale locale : locales) {
            String pattern = DateTimePatternGenerator.getInstance(locale).getBestPattern("EEEEMMMd");
            SimpleDateFormat formatter = new SimpleDateFormat(pattern, locale);
            String formatted = formatter.format(cal);
            System.out.printf("%-15s %-20s %s\n", locale, pattern, formatted);
        }
    }
}