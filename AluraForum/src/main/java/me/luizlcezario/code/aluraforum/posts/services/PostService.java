
@Service
class PostService {
	@Autowired
	private final PostRepository postRepository;

	public PostController(PostRepository postRepository) {
		this.postRepository = postRepository
	}

	public List<Post> findAll() {
		List<Post> obj = postRepository.findAll();
		return obj;
	}

	public Post findById(Long id) {
		Optional<Post> obj = postRepository.findById(id);
		if (obj.isEmpty()) {
			throw new Error()
		}
		return obj.get();
	}

	public Post createPost(CreateDtos body) {
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