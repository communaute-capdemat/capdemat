create table activity_registration_request (
    id int8 not null,
    reglement bool,
    produit_id int8,
    segment_id int8,
    site_id int8,
    primary key (id)
);

create table segment (
    id int8 not null,
    id_segment varchar(255),
    label_segment varchar(255),
    primary key (id)
);

create table arr_produit (
    id int8 not null,
    id_produit varchar(255),
    label_produit varchar(255),
    type_produit varchar(255),
    primary key (id)
);

create table arr_site (
    id int8 not null,
    id_site varchar(255),
    label_site varchar(255),
    primary key (id)
);

