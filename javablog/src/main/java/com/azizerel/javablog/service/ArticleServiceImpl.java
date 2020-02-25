package com.azizerel.javablog.service;

import com.azizerel.javablog.common.ArticleModel;
import com.azizerel.javablog.converter.BaseCommonConverter;
import com.azizerel.javablog.entity.ArticleEntity;
import com.azizerel.javablog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * created by Abdulaziz Erel on 23:22 17.02.2020
 **/
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public ArticleModel saveArticle(ArticleModel articleModel) {
        ArticleEntity articleEntity = articleRepository.updateAndFlush(BaseCommonConverter.convert(articleModel, ArticleEntity.class));
        return BaseCommonConverter.convert(articleEntity, ArticleModel.class);
    }

    @Override
    public ArticleModel updateArticle(ArticleModel articleModel) {
        ArticleEntity articleEntity = articleRepository.save(BaseCommonConverter.convert(articleModel, ArticleEntity.class));
        return BaseCommonConverter.convert(articleEntity, ArticleModel.class);
    }

    @Override
    public void deleteById(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public ArticleModel findById(Long id) {
        Optional<ArticleEntity> articleEntity = articleRepository.findById(id);
        return BaseCommonConverter.convert(articleEntity.orElse(new ArticleEntity()), ArticleModel.class);
    }
}
