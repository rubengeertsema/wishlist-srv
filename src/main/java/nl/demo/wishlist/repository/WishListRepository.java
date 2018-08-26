package nl.demo.wishlist.repository;

import nl.demo.wishlist.model.Wish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<Wish, Long> {
    public Page<Wish> findAllByOrderByDateTimeDesc(Pageable pageable);
}
