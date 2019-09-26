import Model.User;
import Model.Post;
import Model.Todo;
import Model.Album;
import Model.Comment;
import Model.Photo;

import Service.ApiService;

import java.util.List;

/*Написать класс MyApiService с использованием паттерна синглтон для доступа к API:
 (предварительно создать все необходимые модели List, Post, User...)
 Для следующих запросов:
 Posts https://jsonplaceholder.typicode.com/posts
 Comments https://jsonplaceholder.typicode.com/comments
 Albums https://jsonplaceholder.typicode.com/albums
 Photos https://jsonplaceholder.typicode.com/photos
 Users https://jsonplaceholder.typicode.com/users
 Todos https://jsonplaceholder.typicode.com/todos
*/
public class Main {

    public static void main(String[] args) {

        List<Post> postList = ApiService.getInstance().getPosts();
        System.out.println(postList);

        List<Album> albumList = ApiService.getInstance().getAlbums();
        System.out.println(albumList);

        List<Photo> photoList = ApiService.getInstance().getPhotos();
        System.out.println(photoList);

        List<Todo> todosList = ApiService.getInstance().getTodos();
        System.out.println(todosList);

        List<Comment> commentList = ApiService.getInstance().getComments();
        System.out.println(commentList);

        List<User> userList = ApiService.getInstance().getUsers();
        System.out.println(userList);


    }
}
