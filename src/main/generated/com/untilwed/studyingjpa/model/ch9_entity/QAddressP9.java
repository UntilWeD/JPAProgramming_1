package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAddressP9 is a Querydsl query type for AddressP9
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAddressP9 extends BeanPath<AddressP9> {

    private static final long serialVersionUID = 1731468599L;

    public static final QAddressP9 addressP9 = new QAddressP9("addressP9");

    public final StringPath city = createString("city");

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QAddressP9(String variable) {
        super(AddressP9.class, forVariable(variable));
    }

    public QAddressP9(Path<? extends AddressP9> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddressP9(PathMetadata metadata) {
        super(AddressP9.class, metadata);
    }

}

