package nl.demo.wishlist.dao;

import nl.demo.wishlist.model.Wish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface WishListDao {
    public Wish get(Long id);
    public Wish create(Wish wish);
    public Wish update(Wish wish);
    public Wish delete(Long id);
    public Page<Wish> getAll(Pageable pageable);
    public void deleteAll();
}
