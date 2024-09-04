package shop.biday.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.domain.UsersModel;
import shop.biday.model.entity.UsersEntity;
import shop.biday.model.repository.UsersRepository;
import shop.biday.service.UsersService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    private final UsersRepository UsersRepository;

    @Override
    public List<UsersEntity> findAll() {
        return UsersRepository.findAll();
    }

    @Override
    public UsersEntity save(UsersModel entity) {
        return UsersRepository.save(entity.toEntity());
    }

    @Override
    public Optional<UsersEntity> findById(Long id) {
        return UsersRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return UsersRepository.existsById(id);
    }

    @Override
    public long count() {
        return UsersRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        UsersRepository.deleteById(id);
    }

//    @Override
//    public Map<?, ?> login(UsersModel model) {
//        return new HashMap<>();
//    }
}

