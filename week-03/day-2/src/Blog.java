import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> posts;

  public Blog(){
    posts = new ArrayList<>();
  }

  public void setPosts(List<BlogPost> posts) {
    this.posts = posts;
  }
}

/*
Reuse your BlogPost class
Create a Blog class which can
   store a list of BlogPosts
   add BlogPosts to the list
   delete(int) one item at given index
   update(int, BlogPost) one item at the given index and update it with another BlogPost

 */