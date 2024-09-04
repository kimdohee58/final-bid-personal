package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomEntity is a Querydsl query type for RoomEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomEntity extends EntityPathBase<RoomEntity> {

    private static final long serialVersionUID = -816670157L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomEntity roomEntity = new QRoomEntity("roomEntity");

    public final ListPath<BookingEntity, QBookingEntity> bookings = this.<BookingEntity, QBookingEntity>createList("bookings", BookingEntity.class, QBookingEntity.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final QDormEntity dorm;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<RoomImgEntity, QRoomImgEntity> images = this.<RoomImgEntity, QRoomImgEntity>createList("images", RoomImgEntity.class, QRoomImgEntity.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> person = createNumber("person", Integer.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath type = createString("type");

    public QRoomEntity(String variable) {
        this(RoomEntity.class, forVariable(variable), INITS);
    }

    public QRoomEntity(Path<? extends RoomEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomEntity(PathMetadata metadata, PathInits inits) {
        this(RoomEntity.class, metadata, inits);
    }

    public QRoomEntity(Class<? extends RoomEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dorm = inits.isInitialized("dorm") ? new QDormEntity(forProperty("dorm"), inits.get("dorm")) : null;
    }

}

