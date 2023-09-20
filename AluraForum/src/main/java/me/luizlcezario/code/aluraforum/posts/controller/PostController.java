
@Service
public class PostController {

	@Autowired
	private final PostService postService;

	public PostController(PostService postService) {
		this.postService = postService
	}

	public ResponseEntity<List<Post>> findAll() {
		List<Post> obj = postController.findAll();
		return ResponseEntity.ok(obj);
	}

	public ResponseEntity<Post> findById(Long id) {
		Post obj = postController.findById(id);
		return ResponseEntity.ok(obj);
	}

	public ResponseEntity<Post> createPost(CreateDtos body) {
		Post obj = postController.create(body);
		return ResponseEntity.ok(obj);
	}

	public ResponseEntity<Post> editPost(Long id, CreateDtos body) {
		Post obj = postController.editPost(id, body);
		return ResponseEntity.ok(obj);
	}

	public ResponseEntity<Post> deletePost(Long id) {
		Post obj = postController.deletePost(id);
		return ResponseEntity.ok(obj);
	}
}