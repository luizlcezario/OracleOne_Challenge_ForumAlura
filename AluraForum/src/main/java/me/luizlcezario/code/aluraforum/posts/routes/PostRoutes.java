

@RestController
@RequestMapping(value = "/posts")
public class PostRoutes {

	@Autowired
	private final PostController postController;

	public RoutePost(PostController postController) {
		this.postController = postController;
	}

	@GetMapping("/")
	public ResponseEntity<List<Post>> findAll() = postController.findAll();

	@GetMapping(value = "/search/{id}")
	public ResponseEntity<Post> findById(@PathVariable Long id) = postController.findById(id);
	
	@PostMapping(value = "/create")
	public ResponseEntity<Post> createPost(@Body CreateDtos body) = postController.create(body);

	@PutMapping(value = "/edit/{id}")
	public ResponseEntity<Post> editPost(@PathVariable Long id, @Body CreateDtos body) = postController.editPost(id, body);

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Post> deletePost(@PathVariable Long id) = postController.deletePost(id);
	
}