package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDormEntity is a Querydsl query type for DormEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDormEntity extends EntityPathBase<DormEntity> {

    private static final long serialVersionUID = -1426984674L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDormEntity dormEntity = new QDormEntity("dormEntity");

    public final StringPath address = createString("address");

    public final StringPath city = createString("city");

    public final StringPath contactNum = createString("contactNum");

    public final ListPath<DamenityEntity, QDamenityEntity> damenities = this.<DamenityEntity, QDamenityEntity>createList("damenities", DamenityEntity.class, QDamenityEntity.class, PathInits.DIRECT2);

    public final QCategoryEntity dcategory;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<RoomEntity, QRoomEntity> rooms = this.<RoomEntity, QRoomEntity>createList("rooms", RoomEntity.class, QRoomEntity.class, PathInits.DIRECT2);

    public final StringPath status = createString("status");

    public final StringPath town = createString("town");

    public final QUsersEntity user;

    public QDormEntity(String variable) {
        this(DormEntity.class, forVariable(variable), INITS);
    }

    public QDormEntity(Path<? extends DormEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDormEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDormEntity(PathMetadata metadata, PathInits inits) {
        this(DormEntity.class, metadata, inits);
    }

    public QDormEntity(Class<? extends DormEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dcategory = inits.isInitialized("dcategory") ? new QCategoryEntity(forProperty("dcategory")) : null;
        this.user = inits.isInitialized("user") ? new QUsersEntity(forProperty("user")) : null;
    }

}

