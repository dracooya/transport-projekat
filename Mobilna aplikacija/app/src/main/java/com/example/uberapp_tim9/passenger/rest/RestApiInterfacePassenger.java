package com.example.uberapp_tim9.passenger.rest;

import com.example.uberapp_tim9.model.dtos.LocationDTO;
import com.example.uberapp_tim9.model.dtos.RejectionReasonDTO;
import com.example.uberapp_tim9.shared.rest.RestApiManager;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RestApiInterfacePassenger {

    String DRIVER_API_PATH="driver";
    String RIDE_API_PATH = "ride/";

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })
    @GET(RestApiManager.BASE_URL + DRIVER_API_PATH + "/{driver_id}")
    Call<ResponseBody> getDriverDetails(@Path("driver_id") String driverId);


    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })
    @PUT(RestApiManager.BASE_URL + RIDE_API_PATH + "{ride_id}/panic")
    Call<ResponseBody> panic(@Path("ride_id") String rideId, @Body RejectionReasonDTO panicDTO);

}
