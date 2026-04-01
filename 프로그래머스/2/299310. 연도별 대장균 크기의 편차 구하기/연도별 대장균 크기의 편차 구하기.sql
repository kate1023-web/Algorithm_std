-- 코드를 작성해주세요
with max_size as (
    select MAX(SIZE_OF_COLONY) as max_s, YEAR(DIFFERENTIATION_DATE) as years
    from ECOLI_DATA
    group by YEAR(DIFFERENTIATION_DATE)
    order by years
)

select YEAR(DIFFERENTIATION_DATE) as YEAR, (max_s - SIZE_OF_COLONY) as YEAR_DEV, ID
from ECOLI_DATA, max_size
where YEAR(DIFFERENTIATION_DATE) = years
order by YEAR ASC, YEAR_DEV ASC;
