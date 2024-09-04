package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDamenityEntity is a Querydsl query type for DamenityEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDamenityEntity extends EntityPathBase<DamenityEntity> {

    private static final long serialVersionUID = 1873295661L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDamenityEntity damenityEntity = new QDamenityEntity("damenityEntity");

    public final QAmenityEntity amenity;

    public final QDormEntity dorm;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QDamenityEntity(String variable) {
        this(DamenityEntity.class, forVariable(variable), INITS);
    }

    public QDamenityEntity(Path<? extends DamenityEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDamenityEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDamenityEntity(PathMetadata metadata, PathInits inits) {
        this(DamenityEntity.class, metadata, inits);
    }

    public QDamenityEntity(Class<? extends DamenityEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.amenity = inits.isInitialized("amenity") ? new QAmenityEntity(forProperty("amenity")) : null;
        this.dorm = inits.isInitialized("dorm") ? new QDormEntity(forProperty("dorm"), inits.get("dorm")) : null;
    }

}

