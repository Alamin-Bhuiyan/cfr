package Infrastructure.Repositories;

import Application.Interfaces.Repositories.IRecommendationTrackRepository;
import Domain.RecommendationTrack;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class RecommendationTrackRepository implements IRecommendationTrackRepository, PanacheRepository<RecommendationTrack> {
}
