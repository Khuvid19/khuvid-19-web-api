package khuvid19.vaccinated.repository;

import khuvid19.vaccinated.dao.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BoardRepository extends JpaRepository<Board, Long> {
    @Override
    Page<Board> findAll(Pageable pageable);
}
