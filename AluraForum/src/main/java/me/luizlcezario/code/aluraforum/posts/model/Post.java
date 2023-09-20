
@Entity
public class Post {
    UUID id;
    String titulo;
    String mensagem;
    Date dataCreation;
	Date dateEditation;
    StatusPost status
    User author;
    List<Course> courser;
	List<Comment> comment;
}