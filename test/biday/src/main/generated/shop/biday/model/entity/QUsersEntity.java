package shop.biday.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsersEntity is a Querydsl query type for UsersEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsersEntity extends EntityPathBase<UsersEntity> {

    private static final long serialVersionUID = 581325078L;

    public static final QUsersEntity usersEntity = new QUsersEntity("usersEntity");

    public final ListPath<BookingEntity, QBookingEntity> bookings = this.<BookingEntity, QBookingEntity>createList("bookings", BookingEntity.class, QBookingEntity.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> createAt = createDateTime("createAt", java.time.LocalDateTime.class);

    public final ListPath<DormEntity, QDormEntity> dorms = this.<DormEntity, QDormEntity>createList("dorms", DormEntity.class, QDormEntity.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final NumberPath<Integer> phoneNum = createNumber("phoneNum", Integer.class);

    public final ListPath<ReviewEntity, QReviewEntity> reviews = this.<ReviewEntity, QReviewEntity>createList("reviews", ReviewEntity.class, QReviewEntity.class, PathInits.DIRECT2);

    public final EnumPath<Role> role = createEnum("role", Role.class);

    public final StringPath status = createString("status");

    public final DateTimePath<java.time.LocalDateTime> updateAt = createDateTime("updateAt", java.time.LocalDateTime.class);

    public final ListPath<WishEntity, QWishEntity> wish = this.<WishEntity, QWishEntity>createList("wish", WishEntity.class, QWishEntity.class, PathInits.DIRECT2);

    public QUsersEntity(String variable) {
        super(UsersEntity.class, forVariable(variable));
    }

    public QUsersEntity(Path<? extends UsersEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsersEntity(PathMetadata metadata) {
        super(UsersEntity.class, metadata);
    }

}

