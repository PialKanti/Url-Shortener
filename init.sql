create table urls(
    id bigserial primary key,
    short_url varchar(255),
    long_url varchar(255)
);

create index urls_short_url_idx on urls(short_url);