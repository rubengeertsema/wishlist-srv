package nl.demo.wishlist.dao;

import nl.demo.wishlist.model.Wish;
import nl.demo.wishlist.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class WishListDaoImpl implements WishListDao {

    private final WishListRepository wishListRepository;

    @Autowired
    public WishListDaoImpl(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    @Override
    public Page<Wish> getAll(Pageable pageable) {
        return wishListRepository.findAllByOrderByDateTimeDesc(pageable);
    }

    public Wish get(Long id) {
        return wishListRepository.getOne(id);
    }

    @Override
    public Wish create(Wish wish) {
        wish.setDateTime(ZonedDateTime.now());
        return wishListRepository.save(wish);
    }

    @Override
    public Wish update(Wish wish) {
        Wish updated = null;

        Wish toBeUpdated = wishListRepository.getOne(wish.getId());
        if (toBeUpdated != null) {
            toBeUpdated.setTitle(wish.getTitle());
            toBeUpdated.setDescription(wish.getDescription());
            toBeUpdated.setDateTime(ZonedDateTime.now());
            updated = wishListRepository.save(toBeUpdated);
        }

        return updated;
    }

    public Wish delete(Long id) {
        Wish deleted = null;

        Wish toBeDeleted = wishListRepository.getOne(id);
        if (toBeDeleted != null) {
            wishListRepository.delete(toBeDeleted);
            deleted = toBeDeleted;
        }

        return deleted;
    }

    @Override
    public void deleteAll() {
        wishListRepository.deleteAll();
    }
}
