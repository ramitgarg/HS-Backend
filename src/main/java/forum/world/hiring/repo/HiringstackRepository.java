package forum.world.hiring.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import forum.world.hiring.entity.Hiringstack;

@Repository
public interface HiringstackRepository extends JpaRepository<Hiringstack, Integer> {

}
