package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAmenityEntity is a Querydsl query type for AmenityEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAmenityEntity extends EntityPathBase<AmenityEntity> {

    private static final long serialVersionUID = -1368640953L;

    public static final QAmenityEntity amenityEntity = new QAmenityEntity("amenityEntity");

    public final ListPath<DamenityEntity, QDamenityEntity> dormAmenities = this.<DamenityEntity, QDamenityEntity>createList("dormAmenities", DamenityEntity.class, QDamenityEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QAmenityEntity(String variable) {
        super(AmenityEntity.class, forVariable(variable));
    }

    public QAmenityEntity(Path<? extends AmenityEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAmenityEntity(PathMetadata metadata) {
        super(AmenityEntity.class, metadata);
    }

}

