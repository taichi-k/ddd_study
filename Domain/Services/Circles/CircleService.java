package Domain.Services.Circles;

import Domain.Models.Circles.*;
import Domain.Repositories.*;

public class CircleService {
    private final ICircleRepository circleRepository;


    public CircleService(ICircleRepository circleRepository) {
        this.circleRepository = circleRepository;
    }

    public Boolean exists(Circle circle) {
        Circle duplicated = circleRepository.find(circle.getName());
        return duplicated != null;
    }
}
