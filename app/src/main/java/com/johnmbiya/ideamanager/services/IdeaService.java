package com.johnmbiya.ideamanager.services;

import com.johnmbiya.ideamanager.models.Idea;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface IdeaService {

    @GET("ideas")
    Call<List<Idea>> getIdeas(@Query("owner") String owner, @QueryMap HashMap<String, String> filters);

    @GET("ideas/{id}")
    Call<Idea> getIdea(@Path("id") int id);


}
