public class MovieRecommender {

  private final CustomerPreferenceDao customerPreferenceDao;

  @Autowired //<.>
  public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
    this.customerPreferenceDao = customerPreferenceDao;
  }
}
