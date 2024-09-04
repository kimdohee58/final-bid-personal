package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomImgEntity is a Querydsl query type for RoomImgEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomImgEntity extends EntityPathBase<RoomImgEntity> {

    private static final long serialVersionUID = 1497510198L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomImgEntity roomImgEntity = new QRoomImgEntity("roomImgEntity");

    public final StringPath ext = createString("ext");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath nameOriginal = createString("nameOriginal");

    public final QRoomEntity room;

    public final StringPath size = createString("size");

    public QRoomImgEntity(String variable) {
        this(RoomImgEntity.class, forVariable(variable), INITS);
    }

    public QRoomImgEntity(Path<? extends RoomImgEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomImgEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomImgEntity(PathMetadata metadata, PathInits inits) {
        this(RoomImgEntity.class, metadata, inits);
    }

    public QRoomImgEntity(Class<? extends RoomImgEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

