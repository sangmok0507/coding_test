-- 코드를 입력하세요
SELECT 
    b.title,
    r.board_id,
    r.reply_id,
    r.writer_id,
    r.contents,
    DATE_FORMAT(r.created_date, '%Y-%m-%d') as created_date
from used_goods_board b
    join used_goods_reply r on r.board_id = b.board_id
where year(b.created_date) = 2022 and month(b.created_date) = 10
    order by r.created_date asc, b.title asc;