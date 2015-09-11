package nl.welteninstituut.tel.la.chartobjects;

import org.codehaus.jettison.json.JSONObject;

import java.util.HashMap;

/**
 * ****************************************************************************
 * Copyright (C) 2013 Open Universiteit Nederland
 * <p/>
 * This library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 * <p/>
 * Contributors: Stefaan Ternier
 * ****************************************************************************
 */
public class BarChartObject extends ChartObject {

    private HashMap<String, Integer> peersMap = new HashMap();
    private HashMap<String, Integer> youMap = new HashMap();

    public BarChartObject() {
        addCol(0, "Average all learners in the course", STRING);
        addCol(1, "Peers", NUMBER);
        addCol(2, "You", NUMBER);
    }

    public void addRow(String title, int peers, int you) {
        peersMap.put(title, peers);
        youMap.put(title, you);
    }

    public JSONObject toJsonObject() {
        for (String learnerString : peersMap.keySet()) {
            addRow(learnerString, "" + peersMap.get(learnerString), "" + youMap.get(learnerString));
        }
        return super.toJsonObject();
    }
}
