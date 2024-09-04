package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.UsersModel;
import shop.biday.model.entity.UsersEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface UsersService {
    List<UsersEntity> findAll();
    UsersEntity save(UsersModel category);
    Optional<UsersEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
