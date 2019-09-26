package Service;

import Model.User;
import Model.Post;
import Model.Todo;
import Model.Album;
import Model.Comment;
import Model.Photo;

import java.util.List;

public class ApiService {

    private static ApiService instance;

    public static synchronized ApiService getInstance() {

        if (instance == null) {
            instance = new ApiService();
        }
        return instance;
    }

    public List<Post> getPosts() {
        Repository repository = new RepositoryRequest();
        return repository.getPosts();
    }

    public List<User> getUsers() {

        Repository repository = new RepositoryRequest();
        return repository.getUsers();
    }

    public List<Album> getAlbums() {

        Repository repository = new RepositoryRequest();
        return repository.getAlbums();
    }

    public List<Comment> getComments() {

        Repository repository = new RepositoryRequest();
        return repository.getComments();
    }

    public List<Photo> getPhotos() {


        Repository repository = new RepositoryRequest();
        return repository.getPhotos();
    }

    public List<Todo> getTodos() {

        Repository repository = new RepositoryRequest();
        return repository.getTodos();
    }

}
