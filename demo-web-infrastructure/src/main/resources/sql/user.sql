create table aa_user
(
    id          int auto_increment
        primary key,
    name        varchar(32)                         not null,
    age         int                                 not null,
    mark        varchar(128) null,
    create_time timestamp default CURRENT_TIMESTAMP not null,
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
);

create UNIQUE index aa_user_name
    on aa_user (name);
create index aa_user_create
    on aa_user (create_time);
create index aa_user_update
    on aa_user (update_time);