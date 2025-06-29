package Domain.Factories.Circles;

import Domain.Models.Circles.*;
import Domain.Models.Users.*;

public interface ICircleFactory {
    Circle create(CircleName name, User owner);
}
