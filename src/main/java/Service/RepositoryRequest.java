package Service;

import Model.User;
import Model.Post;
import Model.Todo;
import Model.Album;
import Model.Comment;
import Model.Photo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class RepositoryRequest implements Repository {

    private final String url = "https://jsonplaceholder.typicode.com/";
    private String getHTTPRequest(String suff) {

        HttpResponce httpResponce = new HttpResponce();
        String urlRequest = url + suff;
        String result = null;

        try {
            result = httpResponce.getRequest(urlRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public List<Post> getPosts() {
        String suff = "posts";
        String result = getHTTPRequest(suff);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Post>>() {
        }.getType();

        return gson.fromJson(result, listType);
    }

    @Override
    public List<User> getUsers() {
        String suff = "users";
        String result = getHTTPRequest(suff);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<User>>() {
        }.getType();

        return gson.fromJson(result, listType);
    }

    @Override
    public List<Album> getAlbums() {
        String suff = "albums";
        String result = getHTTPRequest(suff);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Album>>() {
        }.getType();

        return gson.fromJson(result, listType);
    }

    @Override
    public List<Comment> getComments() {
        String suff = "comments";
        String result = getHTTPRequest(suff);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Comment>>() {
        }.getType();

        return gson.fromJson(result, listType);
    }

    @Override
    public List<Photo> getPhotos() {
        String suff = "photos";
        String result = getHTTPRequest(suff);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Photo>>() {
        }.getType();

        return gson.fromJson(result, listType);
    }

    @Override
    public List<Todo> getTodos() {
        String suff = "todos";
        String result = getHTTPRequest(suff);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Todo>>() {
        }.getType();

        return gson.fromJson(result, listType);
    }
}
