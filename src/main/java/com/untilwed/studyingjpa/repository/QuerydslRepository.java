package com.untilwed.studyingjpa.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.QueryFactory;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPADeleteClause;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.jpa.impl.JPAUpdateClause;
import com.untilwed.studyingjpa.model.ch4_entity.pratice.Item;
import com.untilwed.studyingjpa.model.ch9_entity.MemberP9;
import com.untilwed.studyingjpa.model.ch9_entity.QMemberP9;
import com.untilwed.studyingjpa.model.ch9_entity.QOrderItemP9;
import com.untilwed.studyingjpa.model.ch9_entity.QOrderP9;
import com.untilwed.studyingjpa.model.ch9_entity.item.ItemP9;
import com.untilwed.studyingjpa.model.ch9_entity.item.QItemP9;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;


// .list()는 deprecated되었고 JPAQuery는 5.0.0 버전에서는 거의 쓰질 않는다고 함?

@Repository
public class QuerydslRepository {

    private final JPAQueryFactory queryFactory;
    private final EntityManager em;

    public QuerydslRepository(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
        this.em = em;
    }

    public void usingQueryDSL(){

        // 엔티티 직접 지정
        // 지정하지 않고 기본 인스턴스를 사용할 수 있으나 (QMemberP9.member;) 같은 엔티티 사용시 별칭 지정이 강제된다.
        QMemberP9 qMember = new QMemberP9("m");

        List<MemberP9> members =
                queryFactory.selectFrom(qMember)
                        .where(qMember.username.eq("회원1"))
                        .orderBy(qMember.username.desc())
                        .fetch();

    }


    //검색 조건 쿼리
    public void usingSearchCond(){

        QItemP9 item = QItemP9.itemP9;

        List<ItemP9> list = queryFactory.selectFrom(item)
                .where(item.name.eq("좋은 상품").and(item.price.gt(20000)))
                .fetch();
    }

    // 페이징과 정렬
    public void usingPagingAndSorting(){

        QItemP9 qItem = new QItemP9("q");

        QueryResults<ItemP9> results = queryFactory.selectFrom(qItem)
                .where(qItem.price.gt(20000))
                .orderBy(qItem.price.desc(), qItem.stockQuantity.asc())
                .offset(0).limit(10)
                .fetchResults();

        List<ItemP9> items = results.getResults();
        long total = results.getTotal(); // 검색된 전체 데이터 수 
    }

    // 그룹
    public void usingGroupAndHaving(){

        QItemP9 qItem = new QItemP9("q");

        queryFactory.selectFrom(qItem)
                .groupBy(qItem.price)
                .having(qItem.price.gt(10000))
                .fetch();
    }

    // 조인
    public void usingJoin(){
        QOrderP9 qOrder = QOrderP9.orderP9;
        QMemberP9 qMember = QMemberP9.memberP9;
        QOrderItemP9 qOrderItem = QOrderItemP9.orderItemP9;

        queryFactory.selectFrom(qOrder)
                .join(qOrder.member, qMember)
                .leftJoin(qOrder.orderItems, qOrderItem)
                .fetch();
    }

    //서브쿼리
    public void usingSubQuery(){
        QItemP9 qItem = QItemP9.itemP9;
        QItemP9 qItemSub = new QItemP9("itemsub");

        queryFactory.selectFrom(qItem)
                .where(qItem.price.eq(
                        JPAExpressions.select(qItemSub.price.max())
                                .from(qItemSub)
                ))
                .fetch();
    }

    //프로젝션 대상이 하나, 특정한 빈으로 받고싶을때
    public void usingOneProjection(){
        QItemP9 qItem = QItemP9.itemP9;

        List<String> result = queryFactory.select(qItem.name)
                .from(qItem)
                .fetch();

        // 여러 필드를 매핑
        List<ItemP9> itemDTOs = queryFactory.select(Projections.constructor(ItemP9.class,
                        qItem.name,
                        qItem.price))
                .from(qItem)
                .fetch();
    }

    // 수정, 삭제 배치 쿼리
    public void usingDeleteAndUpdate(){
        QItemP9 qItem = QItemP9.itemP9;

        JPAUpdateClause updateClause = new JPAUpdateClause(em, qItem);

        long count = updateClause.where(qItem.name.eq("시골개발자의 JPA 책"))
                .set(qItem.price, qItem.price.add(100))
                .execute();

        JPADeleteClause deleteClause = new JPADeleteClause(em, qItem);

        count = deleteClause.where(qItem.name.eq("시골개발자의 JPA책"))
                .execute();
    }

    // 동적 쿼리 예제
    public void usingDynamicQuery(){

        QItemP9 qItem = QItemP9.itemP9;

        BooleanBuilder builder = new BooleanBuilder();
        if(StringUtils.hasText("param.getName()")){
            builder.and(qItem.name.contains("param.getName"));
        }
        if("param.getPrice()" != null){
            builder.and(qItem.price.gt(1000));
        }


        List<ItemP9> result = queryFactory.selectFrom(qItem)
                .where(builder)
                .fetch();
    }

    //메소드 위임은 생략



}
