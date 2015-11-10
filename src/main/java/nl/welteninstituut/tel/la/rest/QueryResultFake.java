package nl.welteninstituut.tel.la.rest;

import nl.welteninstituut.tel.la.Configuration;
import nl.welteninstituut.tel.la.jdomanager.StatementManager;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
@Path("/query/result-fake")
public class QueryResultFake {

//    @GET
//    @Produces({MediaType.APPLICATION_JSON })
//    @Path("/allStatements/{token}")
//    public String getAllStatements(@PathParam("token") String token) throws IOException {
//        if ("".equals(token) || "null".equals(token)) token = null;
//        return StatementManager.getStatements(token);
//    }
//
//    @GET
//    @Produces({MediaType.APPLICATION_JSON })
//    @Path("/replicateStatements")
//    public void replicate(@HeaderParam("Authorization") String token) throws IOException {
//        String newCursor = null;
//        try {
//            URL url = new URL("http://xapi-proxy-dev.appspot.com/data-proxy/query/result-fake/allStatements/"+token);
//            System.out.println(url);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setDoOutput(true);
//            connection.setConnectTimeout(20000);
//            connection.setReadTimeout(20000);
//            connection.setRequestMethod("GET");
//            connection.setRequestProperty("X-Experience-API-Version", "1.0.0");
//            connection.setRequestProperty("Content-Type", "application/json");
//
//            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                String result = "";
//                String line = null;
//
//                while ((line = reader.readLine()) != null) {
//                    result += line;
//                }
//
//                JSONObject jsonall = new JSONObject(result);
//                if (!jsonall.has("array")) return;
//                for (int i = 0; i<jsonall.getJSONArray("array").length();i++){
//                    JSONObject object = jsonall.getJSONArray("array").getJSONObject(i);
//
//                    String uuid = object.getString("uuid");
//                    String payload = object.getString("payload");
//                    String origin = object.getString("origin");
//                    long lastmodificationDate = object.getLong("lastmodificationDate");
//                    System.out.println(uuid );
//                    StatementManager.addStatement(payload, origin, lastmodificationDate, uuid);
//                }
//                System.out.println();
//                long proxyId = 0l;
//                reader.close();
//                connection.disconnect();
//                if (jsonall.getJSONArray("array").length() != 0) {
//                    replicate(jsonall.getString("cursor"));
//                }
//            } else {
//                System.out.println(connection.getResponseCode()+" "+connection.getResponseMessage());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @GET
    @Produces({MediaType.APPLICATION_JSON })
    @Path("/calendar/user/")
    public String getResult(@HeaderParam("Authorization") String token) throws IOException {
        return "{\"cols\":[{\"id\":\"Date\",\"label\":\"Date\",\"type\":\"date\"},{\"id\":\"Logins\",\"label\":\"Logins\",\"type\":\"number\"}],\"rows\":[{\"c\":[{\"v\":\"Date(2015,4,20)\"},{\"v\":\"7\"}]},{\"c\":[{\"v\":\"Date(2015,7,21)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,3,10)\"},{\"v\":\"1\"}]}]}";
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON })
    @Path("/calendar/course/{courseId}")
    public String getCalendarCourse(@PathParam("courseId") String courseId) throws IOException {
        return "{\"cols\":[{\"id\":\"Date\",\"label\":\"Date\",\"type\":\"date\"},{\"id\":\"Logins\",\"label\":\"Logins\",\"type\":\"number\"}],\"rows\":[{\"c\":[{\"v\":\"Date(2015,8,27)\"},{\"v\":\"26\"}]},{\"c\":[{\"v\":\"Date(2015,5,9)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,8,10)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,6,21)\"},{\"v\":\"9\"}]},{\"c\":[{\"v\":\"Date(2015,5,30)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,6,17)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,9,1)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,8,19)\"},{\"v\":\"5\"}]},{\"c\":[{\"v\":\"Date(2015,9,19)\"},{\"v\":\"335\"}]},{\"c\":[{\"v\":\"Date(2015,9,9)\"},{\"v\":\"101\"}]},{\"c\":[{\"v\":\"Date(2015,8,7)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,6,4)\"},{\"v\":\"77\"}]},{\"c\":[{\"v\":\"Date(2015,2,28)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,5,1)\"},{\"v\":\"16\"}]},{\"c\":[{\"v\":\"Date(2015,8,28)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,3,9)\"},{\"v\":\"39\"}]},{\"c\":[{\"v\":\"Date(2015,2,14)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,8,26)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,6,20)\"},{\"v\":\"59\"}]},{\"c\":[{\"v\":\"Date(2015,9,11)\"},{\"v\":\"61\"}]},{\"c\":[{\"v\":\"Date(2015,5,27)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,9,2)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,6,5)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,2,27)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,2,13)\"},{\"v\":\"18\"}]},{\"c\":[{\"v\":\"Date(2015,6,29)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,8,25)\"},{\"v\":\"55\"}]},{\"c\":[{\"v\":\"Date(2015,6,19)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,8,17)\"},{\"v\":\"22\"}]},{\"c\":[{\"v\":\"Date(2015,9,3)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,5,26)\"},{\"v\":\"36\"}]},{\"c\":[{\"v\":\"Date(2015,2,26)\"},{\"v\":\"32\"}]},{\"c\":[{\"v\":\"Date(2015,6,2)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,8,16)\"},{\"v\":\"5\"}]},{\"c\":[{\"v\":\"Date(2015,9,16)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,3,7)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,3,1)\"},{\"v\":\"10\"}]},{\"c\":[{\"v\":\"Date(2015,5,3)\"},{\"v\":\"2\"}]},{\"c\":[{\"v\":\"Date(2015,2,16)\"},{\"v\":\"15\"}]},{\"c\":[{\"v\":\"Date(2015,5,15)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,8,24)\"},{\"v\":\"56\"}]},{\"c\":[{\"v\":\"Date(2015,6,22)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,9,18)\"},{\"v\":\"29\"}]},{\"c\":[{\"v\":\"Date(2015,8,18)\"},{\"v\":\"23\"}]},{\"c\":[{\"v\":\"Date(2015,5,25)\"},{\"v\":\"34\"}]},{\"c\":[{\"v\":\"Date(2015,8,30)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,5,24)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,2,25)\"},{\"v\":\"16\"}]},{\"c\":[{\"v\":\"Date(2015,7,3)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,9,17)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,3,8)\"},{\"v\":\"20\"}]},{\"c\":[{\"v\":\"Date(2015,2,15)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,9,14)\"},{\"v\":\"73\"}]},{\"c\":[{\"v\":\"Date(2015,6,27)\"},{\"v\":\"92\"}]},{\"c\":[{\"v\":\"Date(2015,2,23)\"},{\"v\":\"68\"}]},{\"c\":[{\"v\":\"Date(2015,2,18)\"},{\"v\":\"28\"}]},{\"c\":[{\"v\":\"Date(2015,9,20)\"},{\"v\":\"128\"}]},{\"c\":[{\"v\":\"Date(2015,8,14)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,5,18)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,6,12)\"},{\"v\":\"31\"}]},{\"c\":[{\"v\":\"Date(2015,5,23)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,8,23)\"},{\"v\":\"99\"}]},{\"c\":[{\"v\":\"Date(2015,9,15)\"},{\"v\":\"7\"}]},{\"c\":[{\"v\":\"Date(2015,9,6)\"},{\"v\":\"26\"}]},{\"c\":[{\"v\":\"Date(2015,6,28)\"},{\"v\":\"12\"}]},{\"c\":[{\"v\":\"Date(2015,2,24)\"},{\"v\":\"36\"}]},{\"c\":[{\"v\":\"Date(2015,6,1)\"},{\"v\":\"14\"}]},{\"c\":[{\"v\":\"Date(2015,3,6)\"},{\"v\":\"32\"}]},{\"c\":[{\"v\":\"Date(2015,2,17)\"},{\"v\":\"7\"}]},{\"c\":[{\"v\":\"Date(2015,3,10)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,9,21)\"},{\"v\":\"12\"}]},{\"c\":[{\"v\":\"Date(2015,6,13)\"},{\"v\":\"68\"}]},{\"c\":[{\"v\":\"Date(2015,8,22)\"},{\"v\":\"77\"}]},{\"c\":[{\"v\":\"Date(2015,5,22)\"},{\"v\":\"20\"}]},{\"c\":[{\"v\":\"Date(2015,2,30)\"},{\"v\":\"12\"}]},{\"c\":[{\"v\":\"Date(2015,6,15)\"},{\"v\":\"54\"}]},{\"c\":[{\"v\":\"Date(2015,9,7)\"},{\"v\":\"183\"}]},{\"c\":[{\"v\":\"Date(2015,9,12)\"},{\"v\":\"92\"}]},{\"c\":[{\"v\":\"Date(2015,3,2)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,3,3)\"},{\"v\":\"10\"}]},{\"c\":[{\"v\":\"Date(2015,6,24)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,2,20)\"},{\"v\":\"33\"}]},{\"c\":[{\"v\":\"Date(2015,5,21)\"},{\"v\":\"27\"}]},{\"c\":[{\"v\":\"Date(2015,8,21)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,8,12)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,6,14)\"},{\"v\":\"30\"}]},{\"c\":[{\"v\":\"Date(2015,6,6)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,5,8)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,2,31)\"},{\"v\":\"25\"}]},{\"c\":[{\"v\":\"Date(2015,6,16)\"},{\"v\":\"105\"}]},{\"c\":[{\"v\":\"Date(2015,7,21)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,7,17)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,9,13)\"},{\"v\":\"170\"}]},{\"c\":[{\"v\":\"Date(2015,9,8)\"},{\"v\":\"136\"}]},{\"c\":[{\"v\":\"Date(2015,6,26)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,2,22)\"},{\"v\":\"13\"}]},{\"c\":[{\"v\":\"Date(2015,8,29)\"},{\"v\":\"40\"}]},{\"c\":[{\"v\":\"Date(2015,2,21)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,3,4)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,2,29)\"},{\"v\":\"16\"}]},{\"c\":[{\"v\":\"Date(2015,8,20)\"},{\"v\":\"13\"}]},{\"c\":[{\"v\":\"Date(2015,2,19)\"},{\"v\":\"18\"}]},{\"c\":[{\"v\":\"Date(2015,5,19)\"},{\"v\":\"14\"}]},{\"c\":[{\"v\":\"Date(2015,8,8)\"},{\"v\":\"35\"}]},{\"c\":[{\"v\":\"Date(2015,8,27)\"},{\"v\":\"26\"}]},{\"c\":[{\"v\":\"Date(2015,5,9)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,8,10)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,6,21)\"},{\"v\":\"9\"}]},{\"c\":[{\"v\":\"Date(2015,5,30)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,6,17)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,9,1)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,8,19)\"},{\"v\":\"5\"}]},{\"c\":[{\"v\":\"Date(2015,9,19)\"},{\"v\":\"335\"}]},{\"c\":[{\"v\":\"Date(2015,9,9)\"},{\"v\":\"101\"}]},{\"c\":[{\"v\":\"Date(2015,8,7)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,6,4)\"},{\"v\":\"77\"}]},{\"c\":[{\"v\":\"Date(2015,2,28)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,5,1)\"},{\"v\":\"16\"}]},{\"c\":[{\"v\":\"Date(2015,8,28)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,3,9)\"},{\"v\":\"39\"}]},{\"c\":[{\"v\":\"Date(2015,2,14)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,8,26)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,6,20)\"},{\"v\":\"59\"}]},{\"c\":[{\"v\":\"Date(2015,9,11)\"},{\"v\":\"61\"}]},{\"c\":[{\"v\":\"Date(2015,5,27)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,9,2)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,6,5)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,2,27)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,2,13)\"},{\"v\":\"18\"}]},{\"c\":[{\"v\":\"Date(2015,6,29)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,8,25)\"},{\"v\":\"55\"}]},{\"c\":[{\"v\":\"Date(2015,6,19)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,8,17)\"},{\"v\":\"22\"}]},{\"c\":[{\"v\":\"Date(2015,9,3)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,5,26)\"},{\"v\":\"36\"}]},{\"c\":[{\"v\":\"Date(2015,2,26)\"},{\"v\":\"32\"}]},{\"c\":[{\"v\":\"Date(2015,6,2)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,8,16)\"},{\"v\":\"5\"}]},{\"c\":[{\"v\":\"Date(2015,9,16)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,3,7)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,3,1)\"},{\"v\":\"10\"}]},{\"c\":[{\"v\":\"Date(2015,5,3)\"},{\"v\":\"2\"}]},{\"c\":[{\"v\":\"Date(2015,2,16)\"},{\"v\":\"15\"}]},{\"c\":[{\"v\":\"Date(2015,5,15)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,8,24)\"},{\"v\":\"56\"}]},{\"c\":[{\"v\":\"Date(2015,6,22)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,9,18)\"},{\"v\":\"29\"}]},{\"c\":[{\"v\":\"Date(2015,8,18)\"},{\"v\":\"23\"}]},{\"c\":[{\"v\":\"Date(2015,5,25)\"},{\"v\":\"34\"}]},{\"c\":[{\"v\":\"Date(2015,8,30)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,5,24)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,2,25)\"},{\"v\":\"16\"}]},{\"c\":[{\"v\":\"Date(2015,7,3)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,9,17)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,3,8)\"},{\"v\":\"20\"}]},{\"c\":[{\"v\":\"Date(2015,2,15)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,9,14)\"},{\"v\":\"73\"}]},{\"c\":[{\"v\":\"Date(2015,6,27)\"},{\"v\":\"92\"}]},{\"c\":[{\"v\":\"Date(2015,2,23)\"},{\"v\":\"68\"}]},{\"c\":[{\"v\":\"Date(2015,2,18)\"},{\"v\":\"28\"}]},{\"c\":[{\"v\":\"Date(2015,9,20)\"},{\"v\":\"128\"}]},{\"c\":[{\"v\":\"Date(2015,8,14)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,5,18)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,6,12)\"},{\"v\":\"31\"}]},{\"c\":[{\"v\":\"Date(2015,5,23)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,8,23)\"},{\"v\":\"99\"}]},{\"c\":[{\"v\":\"Date(2015,9,15)\"},{\"v\":\"7\"}]},{\"c\":[{\"v\":\"Date(2015,9,6)\"},{\"v\":\"26\"}]},{\"c\":[{\"v\":\"Date(2015,6,28)\"},{\"v\":\"12\"}]},{\"c\":[{\"v\":\"Date(2015,2,24)\"},{\"v\":\"36\"}]},{\"c\":[{\"v\":\"Date(2015,6,1)\"},{\"v\":\"14\"}]},{\"c\":[{\"v\":\"Date(2015,3,6)\"},{\"v\":\"32\"}]},{\"c\":[{\"v\":\"Date(2015,2,17)\"},{\"v\":\"7\"}]},{\"c\":[{\"v\":\"Date(2015,3,10)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,9,21)\"},{\"v\":\"12\"}]},{\"c\":[{\"v\":\"Date(2015,6,13)\"},{\"v\":\"68\"}]},{\"c\":[{\"v\":\"Date(2015,8,22)\"},{\"v\":\"77\"}]},{\"c\":[{\"v\":\"Date(2015,5,22)\"},{\"v\":\"20\"}]},{\"c\":[{\"v\":\"Date(2015,2,30)\"},{\"v\":\"12\"}]},{\"c\":[{\"v\":\"Date(2015,6,15)\"},{\"v\":\"54\"}]},{\"c\":[{\"v\":\"Date(2015,9,7)\"},{\"v\":\"183\"}]},{\"c\":[{\"v\":\"Date(2015,9,12)\"},{\"v\":\"92\"}]},{\"c\":[{\"v\":\"Date(2015,3,2)\"},{\"v\":\"4\"}]},{\"c\":[{\"v\":\"Date(2015,3,3)\"},{\"v\":\"10\"}]},{\"c\":[{\"v\":\"Date(2015,6,24)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,2,20)\"},{\"v\":\"33\"}]},{\"c\":[{\"v\":\"Date(2015,5,21)\"},{\"v\":\"27\"}]},{\"c\":[{\"v\":\"Date(2015,8,21)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,8,12)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,6,14)\"},{\"v\":\"30\"}]},{\"c\":[{\"v\":\"Date(2015,6,6)\"},{\"v\":\"21\"}]},{\"c\":[{\"v\":\"Date(2015,5,8)\"},{\"v\":\"6\"}]},{\"c\":[{\"v\":\"Date(2015,2,31)\"},{\"v\":\"25\"}]},{\"c\":[{\"v\":\"Date(2015,6,16)\"},{\"v\":\"105\"}]},{\"c\":[{\"v\":\"Date(2015,7,21)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,7,17)\"},{\"v\":\"3\"}]},{\"c\":[{\"v\":\"Date(2015,9,13)\"},{\"v\":\"170\"}]},{\"c\":[{\"v\":\"Date(2015,9,8)\"},{\"v\":\"136\"}]},{\"c\":[{\"v\":\"Date(2015,6,26)\"},{\"v\":\"1\"}]},{\"c\":[{\"v\":\"Date(2015,2,22)\"},{\"v\":\"13\"}]},{\"c\":[{\"v\":\"Date(2015,8,29)\"},{\"v\":\"40\"}]},{\"c\":[{\"v\":\"Date(2015,2,21)\"},{\"v\":\"11\"}]},{\"c\":[{\"v\":\"Date(2015,3,4)\"},{\"v\":\"8\"}]},{\"c\":[{\"v\":\"Date(2015,2,29)\"},{\"v\":\"16\"}]},{\"c\":[{\"v\":\"Date(2015,8,20)\"},{\"v\":\"13\"}]},{\"c\":[{\"v\":\"Date(2015,2,19)\"},{\"v\":\"18\"}]},{\"c\":[{\"v\":\"Date(2015,5,19)\"},{\"v\":\"14\"}]},{\"c\":[{\"v\":\"Date(2015,8,8)\"},{\"v\":\"35\"}]}]}";

    }

    @GET
    @Produces({MediaType.APPLICATION_JSON })
    @Path("/averageLearnerActivities/{courseId}")
    public String averageActivityPerLearnerResult(@HeaderParam("Authorization") String token,
                                                  @PathParam("courseId") String courseId) throws IOException {
        return "{\"cols\":[{\"id\":\"Average all learners in the course\",\"label\":\"Average all learners in the course\",\"type\":\"string\"},{\"id\":\"Peers\",\"label\":\"Peers\",\"type\":\"number\"},{\"id\":\"You\",\"label\":\"You\",\"type\":\"number\"}],\"rows\":[{\"c\":[{\"v\":\"Peers vs you\"},{\"v\":\"12\"},{\"v\":\"2\"}]}]}";
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON })
    @Path("/dropoutMonitor")
    public String getDropoutMonitor() throws IOException {
        return "{\"cols\":[{\"id\":\"ID\",\"label\":\"ID\",\"type\":\"string\"},{\"id\":\"NumberActivities\",\"label\":\"NumberActivities\",\"type\":\"number\"},{\"id\":\"NumberOfLaunches\",\"label\":\"NumberOfLaunches\",\"type\":\"number\"},{\"id\":\"MoocProvider\",\"label\":\"MoocProvider\",\"type\":\"string\"},{\"id\":\"NumberOfRegisteredUsers\",\"label\":\"NumberOfRegisteredUsers\",\"type\":\"number\"}],\"rows\":[{\"c\":[{\"v\":\"eu.ecolearning.hub4:2\"},{\"v\":\"715\"},{\"v\":\"136\"},{\"v\":\"OpenMOOC\"},{\"v\":\"136\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub8:10\"},{\"v\":\"746\"},{\"v\":\"289\"},{\"v\":\"OpenMOOC\"},{\"v\":\"289\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub4:1\"},{\"v\":\"715\"},{\"v\":\"201\"},{\"v\":\"OpenMOOC\"},{\"v\":\"201\"}]},{\"c\":[{\"v\":\"oai:it.polimi.pok:course-v1:Polimi+MAT101+2015_M4\"},{\"v\":\"172\"},{\"v\":\"65\"},{\"v\":\"EDX\"},{\"v\":\"65\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub7:1\"},{\"v\":\"2261\"},{\"v\":\"799\"},{\"v\":\"OpenMOOC\"},{\"v\":\"799\"}]},{\"c\":[{\"v\":\"oai:de.humance.education:14901\"},{\"v\":\"518\"},{\"v\":\"164\"},{\"v\":\"LogiAssist\"},{\"v\":\"164\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub1:6\"},{\"v\":\"1531\"},{\"v\":\"542\"},{\"v\":\"OpenMOOC\"},{\"v\":\"542\"}]},{\"c\":[{\"v\":\"oai:pt.uab.imooc.eco:course_9_e-skills\"},{\"v\":\"1243\"},{\"v\":\"412\"},{\"v\":\"iMOOC\"},{\"v\":\"412\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub8:7\"},{\"v\":\"3602\"},{\"v\":\"1353\"},{\"v\":\"OpenMOOC\"},{\"v\":\"1353\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub8:9\"},{\"v\":\"2005\"},{\"v\":\"716\"},{\"v\":\"OpenMOOC\"},{\"v\":\"716\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub8:8\"},{\"v\":\"2029\"},{\"v\":\"851\"},{\"v\":\"OpenMOOC\"},{\"v\":\"851\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub0:2\"},{\"v\":\"26809\"},{\"v\":\"12313\"},{\"v\":\"OpenMOOC\"},{\"v\":\"12313\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub10b:4\"},{\"v\":\"478\"},{\"v\":\"182\"},{\"v\":\"OpenMOOC\"},{\"v\":\"182\"}]},{\"c\":[{\"v\":\"oai:com.telefonicalearningservices.ecoportal:101\"},{\"v\":\"1856\"},{\"v\":\"642\"},{\"v\":\"weMOOC\"},{\"v\":\"642\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub5:1\"},{\"v\":\"561\"},{\"v\":\"199\"},{\"v\":\"OpenMOOC\"},{\"v\":\"199\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub2:1\"},{\"v\":\"924\"},{\"v\":\"356\"},{\"v\":\"OpenMOOC\"},{\"v\":\"356\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub5:2\"},{\"v\":\"683\"},{\"v\":\"257\"},{\"v\":\"OpenMOOC\"},{\"v\":\"257\"}]},{\"c\":[{\"v\":\"eu.ecolearning.hub8:19\"},{\"v\":\"37093\"},{\"v\":\"19383\"},{\"v\":\"OpenMOOC\"},{\"v\":\"19383\"}]}]}";
   }

}
