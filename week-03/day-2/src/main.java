public class main {
  public static void main(String[] args) {
    ///////////////// Post-It exercise//////////////

    PostIt firstpostit = new PostIt("orange", "blue", "Idea 1");
//    firstpostit.printit();

    PostIt secondpostit = new PostIt("pink", "black", "Awesome");
  //  secondpostit.printit();

    PostIt thirdpostit = new PostIt("yellow", "green", "Superb!" );
  //  thirdpostit.printit();

    ///////////////// BlogPost exercise//////////////

    BlogPost firstblog  = new BlogPost();
    firstblog.authorname = "John Doe";
    firstblog.title = "Lorem Ipsum";
    firstblog.text = "Lorem ipsum dolor sit amet.";
    firstblog.publicationDate = "2000.05.04.";
   // firstblog.printIt();

    BlogPost secondblog = new BlogPost();
    secondblog.authorname = "Tim Urban";
    secondblog.title = "Wait but why";
    secondblog.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    secondblog.publicationDate = "2010.10.10.";

    BlogPost thirdblog = new BlogPost();
    thirdblog.authorname = "William Turton";
    thirdblog.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    thirdblog.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    thirdblog.publicationDate = "2017.03.28.";

    ///////////////// Animal exercise//////////////

    Animal lion = new Animal("lion");
    lion.type = "lion";
    lion.hunger = 70;
    //lion.play();

    Animal cat = new Animal("cat");
    cat.type = "cat";
    //cat.play();
    //cat.play();


    ///////////////// Counter exercise//////////////

    Counter mycounter = new Counter(7);
    mycounter.add(6);
    mycounter.get();
    //System.out.println(mycounter.get());
    mycounter.reset();
    //System.out.println(mycounter.get());

    ///////////////// Sharpie exercise//////////////

    Sharpie oneSharpie = new Sharpie();
    Sharpie twoSharpie = new Sharpie();
    oneSharpie.use();
    oneSharpie.draw();
    twoSharpie.use();
    twoSharpie.use();
    twoSharpie.use();
    twoSharpie.draw();

    SharpieSet newSet = new SharpieSet();
    newSet.countUsable();
  }
}
