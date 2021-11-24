//package khuvid19.vaccinated;
//
//import khuvid19.vaccinated.Constants.Gender;
//import khuvid19.vaccinated.Constants.SideEffectType;
//import khuvid19.vaccinated.Constants.VaccineType;
//import khuvid19.vaccinated.LoginUser.Data.User;
//import khuvid19.vaccinated.LoginUser.UserRepository;
//import khuvid19.vaccinated.Review.Data.DTO.ReviewCard;
//import khuvid19.vaccinated.Review.Data.DTO.ReviewInput;
//import khuvid19.vaccinated.Review.Data.Review;
//import khuvid19.vaccinated.Review.Data.ReviewRepository;
//import khuvid19.vaccinated.Review.ReviewService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.http.HttpStatus;
//
//import javax.transaction.Transactional;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@SpringBootTest
//@EnableJpaRepositories
//public class ReviewTests {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    ReviewRepository reviewRepository;
//
//    @Autowired
//    ReviewService reviewService;
//
//    @Autowired
//    ModelMapper modelMapper;
//
//    private User dummyUser;
//    private Review dummyReview;
//
//    @BeforeEach
//    void setUp() {
//
//        dummyUser = new User("emailemail", "winter", null, "image");
//        dummyUser.setGender(Gender.FEMALE);
//        User save = userRepository.save(dummyUser);
//        dummyUser = save;
//
//        dummyReview = new Review();
//        dummyReview.setDetailDisc("HAHAHAH");
//        dummyReview.setVaccine(VaccineType.ANSEN);
//
//        List<SideEffectType> dummySideEffects = new ArrayList<>();
//        dummySideEffects.add(SideEffectType.FATIGUE);
//        dummySideEffects.add(SideEffectType.HEADACHE);
//        dummyReview.setSideEffects(dummySideEffects);
//    }
//
//    @Test
//    @Transactional
//    void testInsertNewReview() {
//        ReviewInput reviewInput = new ReviewInput();
//        reviewInput.setVaccine(VaccineType.ANSEN_BOOST);
//        Review mappedReview = modelMapper.map(reviewInput, Review.class);
//        reviewService.insertReview(mappedReview, dummyUser);
//
//        List<ReviewCard> myReviews = reviewService.getMyReviews(dummyUser.getId());
//        System.out.println(myReviews.size());
//
//    }
//
//    @Test
//    void testGetSideEffects() {
//        List<Map<SideEffectType, String>> allTypes = SideEffectType.getAllTypes();
//        System.out.println(allTypes);
//    }
//}
