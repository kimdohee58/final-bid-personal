package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookingEntity is a Querydsl query type for BookingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookingEntity extends EntityPathBase<BookingEntity> {

    private static final long serialVersionUID = 2028860391L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookingEntity bookingEntity = new QBookingEntity("bookingEntity");

    public final DateTimePath<java.time.LocalDateTime> checkIn = createDateTime("checkIn", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> checkOut = createDateTime("checkOut", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPaymentEntity payment;

    public final NumberPath<Integer> person = createNumber("person", Integer.class);

    public final QReviewEntity review;

    public final QRoomEntity room;

    public final StringPath status = createString("status");

    public final QUsersEntity user;

    public QBookingEntity(String variable) {
        this(BookingEntity.class, forVariable(variable), INITS);
    }

    public QBookingEntity(Path<? extends BookingEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookingEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookingEntity(PathMetadata metadata, PathInits inits) {
        this(BookingEntity.class, metadata, inits);
    }

    public QBookingEntity(Class<? extends BookingEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.payment = inits.isInitialized("payment") ? new QPaymentEntity(forProperty("payment"), inits.get("payment")) : null;
        this.review = inits.isInitialized("review") ? new QReviewEntity(forProperty("review"), inits.get("review")) : null;
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
        this.user = inits.isInitialized("user") ? new QUsersEntity(forProperty("user")) : null;
    }

}

