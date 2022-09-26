package domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostData is a Querydsl query type for PostData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostData extends EntityPathBase<PostData> {

    private static final long serialVersionUID = 1603488372L;

    public static final QPostData postData = new QPostData("postData");

    public final StringPath allowNumber = createString("allowNumber");

    public final StringPath cancelReason = createString("cancelReason");

    public final StringPath cancelRegDate = createString("cancelRegDate");

    public final StringPath closedDate = createString("closedDate");

    public final StringPath code = createString("code");

    public final StringPath controlNum = createString("controlNum");

    public final StringPath designateDate = createString("designateDate");

    public final StringPath foodSort = createString("foodSort");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedDate = createString("lastModifiedDate");

    public final StringPath locationAddress = createString("locationAddress");

    public final StringPath openDate = createString("openDate");

    public final StringPath openServiceId = createString("openServiceId");

    public final StringPath operationCode = createString("operationCode");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath reDesignateDate = createString("reDesignateDate");

    public final StringPath regDate = createString("regDate");

    public final StringPath renewedDate = createString("renewedDate");

    public final StringPath renewedSort = createString("renewedSort");

    public final NumberPath<Long> rowNumber = createNumber("rowNumber", Long.class);

    public final StringPath shopName = createString("shopName");

    public final StringPath streetAddress = createString("streetAddress");

    public final StringPath unAvailableDate = createString("unAvailableDate");

    public final StringPath unAvailableReason = createString("unAvailableReason");

    public QPostData(String variable) {
        super(PostData.class, forVariable(variable));
    }

    public QPostData(Path<? extends PostData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostData(PathMetadata metadata) {
        super(PostData.class, metadata);
    }

}

