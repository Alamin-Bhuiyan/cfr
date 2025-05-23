package Infrastructure.Repositories;

import Application.Interfaces.Repositories.IRecommendationRepository;
import Domain.Recommendation;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class RecommendationRepository implements IRecommendationRepository, PanacheRepository<Recommendation> {
}
