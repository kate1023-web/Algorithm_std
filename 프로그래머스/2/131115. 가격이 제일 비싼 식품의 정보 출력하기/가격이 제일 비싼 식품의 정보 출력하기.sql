-- 코드를 입력하세요
with max_money as (
    select MAX(PRICE) as pri
    from FOOD_PRODUCT
)

SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
FROM FOOD_PRODUCT, max_money
WHERE PRICE = pri;