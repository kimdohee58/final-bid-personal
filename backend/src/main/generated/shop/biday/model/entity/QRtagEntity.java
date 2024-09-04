package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRtagEntity is a Querydsl query type for RtagEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRtagEntity extends EntityPathBase<RtagEntity> {

    private static final long serialVersionUID = -923603584L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRtagEntity rtagEntity = new QRtagEntity("rtagEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QReviewEntity review;

    public final QTagEntity tag;

    public QRtagEntity(String variable) {
        this(RtagEntity.class, forVariable(variable), INITS);
    }

    public QRtagEntity(Path<? extends RtagEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRtagEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRtagEntity(PathMetadata metadata, PathInits inits) {
        this(RtagEntity.class, metadata, inits);
    }

    public QRtagEntity(Class<? extends RtagEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.review = inits.isInitialized("review") ? new QReviewEntity(forProperty("review"), inits.get("review")) : null;
        this.tag = inits.isInitialized("tag") ? new QTagEntity(forProperty("tag")) : null;
    }

}

