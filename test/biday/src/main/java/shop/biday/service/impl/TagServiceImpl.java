package shop.biday.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.domain.TagModel;
import shop.biday.model.entity.TagEntity;
import shop.biday.model.repository.TagRepository;
import shop.biday.service.TagService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;

    @Override
    public List<TagEntity> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public TagEntity save(TagModel entity) {
        return tagRepository.save(entity.toEntity());
    }

    @Override
    public Optional<TagEntity> findById(Long id) {
        return tagRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return tagRepository.existsById(id);
    }

    @Override
    public long count() {
        return tagRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        tagRepository.deleteById(id);
    }
}

