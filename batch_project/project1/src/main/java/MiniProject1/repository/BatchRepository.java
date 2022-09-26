package MiniProject1.repository;

import domain.PostData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

//https://jinseobbae.github.io/jpa/2021/12/06/jpa-repository-not-managed-type-error.html
@NoRepositoryBean
public interface BatchRepository extends JpaRepository<PostData, Long> {

}
