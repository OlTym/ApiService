package Service;

import Model.User;
import Model.Post;
import Model.Todo;
import Model.Album;
import Model.Comment;
import Model.Photo;

import java.util.List;


public interface Repository {

    List<Post> getPosts();

    List<User> getUsers();

    List<Album> getAlbums();

    List<Comment> getComments();

    List<Photo> getPhotos();

    List<Todo> getTodos();
}
