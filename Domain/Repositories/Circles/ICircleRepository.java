package Domain.Repositories.Circles;

import Domain.Models.Circles.*;

public interface ICircleRepository {
    void save(Circle circle);
    Circle find(CircleId id);
    Circle find(CircleName name);
}