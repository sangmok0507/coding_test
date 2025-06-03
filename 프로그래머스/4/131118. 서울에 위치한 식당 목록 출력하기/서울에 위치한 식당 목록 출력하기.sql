-- 코드를 입력하세요
SELECT ri.REST_ID,
        REST_NAME,
        FOOD_TYPE,
        FAVORITES,
        ADDRESS,
        round(avg(review_score), 2) as SCORE
    from rest_info as ri
        join rest_review rr on rr.rest_id = ri.rest_id
    where ADDRESS LIKE '서울%'
    group by rest_name
        order by SCORE desc, FAVORITES desc;