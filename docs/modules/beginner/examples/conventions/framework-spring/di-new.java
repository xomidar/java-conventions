public class MovieRecommender {

  private final CustomerPreferenceDao customerPreferenceDao;

  // <.>
  public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
    this.customerPreferenceDao = customerPreferenceDao;
  }
}
