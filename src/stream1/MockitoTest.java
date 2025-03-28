//package LearnCode;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MockitoTest {
//
//    @Autowired
//    private UserService service;
//
//    @MockBean
//    private UserRepository repository;
//
//    @Test
//    public void getUsersTest() {
//        when(repository.findAll()).thenReturn(Stream
//                .of(new User(376, "Danile", 31, "USA"), new User(958, "Huy", 35, "UK")).collect(Collectors.toList()));
//        assertEquals(2, service.getUsers().size());
//    }
//
//    @Test
//    public void getUserByAddressTest() {
//        String address = "Bangalore";
//        when(repository.findByAddress(address))
//                .thenReturn(Stream.of(new User(376, "Danile", 31, "USA")).collect(Collectors.toList()));
//        assertEquals(1, service.getUserbyAddress(address).size());
//    }
//
//    @Test
//    public void saveUserTest() {
//        User user = new User(999, "Pranya", 33, "Pune");
//        when(repository.save(user)).thenReturn(user);
//        assertEquals(user, service.addUser(user));
//    }
//
//    @Test
//    public void deleteUserTest() {
//        User user = new User(999, "Pranya", 33, "Pune");
//        service.deleteUser(user);
//        verify(repository, times(1)).delete(user);
//    }
//
//}
