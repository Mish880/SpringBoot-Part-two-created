package lk.project.spring.repo;


import lk.project.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Itemrepo extends JpaRepository<Item, String> {
}
