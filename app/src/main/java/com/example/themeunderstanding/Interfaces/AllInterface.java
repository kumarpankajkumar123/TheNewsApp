package com.example.themeunderstanding.Interfaces;

import com.example.themeunderstanding.Modals.Latest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface AllInterface {



    @GET("topic/latest")
    Call<List<Latest>> getLatestNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);

    @GET("topic/world")
    Call<List<Latest>> getWorldNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);

    @GET("topic/business")
    Call<List<Latest>> getBusinessNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);

    @GET("topic/technology")
    Call<List<Latest>> getTechnologyNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);

    @GET("topic/entertainment")
    Call<List<Latest>> getEntertaintNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);

    @GET("topic/science")
    Call<List<Latest>> getScienceNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);

    @GET("topic/sports")
    Call<List<Latest>> getSportsNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);

    @GET("topic/health")
    Call<List<Latest>> getHealthNews(
            @Query("language") String language,
            @Query("region") String region,
            @Header("x-rapidapi-host") String host,
            @Header("x-rapidapi-key") String key);
}
