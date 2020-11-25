package com.cmadushan.android.myapplication.posts.api;


import com.cmadushan.android.myapplication.posts.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {
    @GET("/posts")
    Call<List<Post>>getPost();

}
