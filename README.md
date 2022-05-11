# listentoyourself

create table ltys_event
(
    id bigint not null primary key,
    name varchar(100) not null
);

curl --location --request POST 'http://localhost:8082/api/v1/produce' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":1,
    "name":"TestedName"
}'
