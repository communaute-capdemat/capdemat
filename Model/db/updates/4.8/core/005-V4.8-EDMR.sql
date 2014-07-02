create table ecole_de_musique_request (
    id int8 not null,
    edmr_certifie_exactitude bool,
    produit_id int8,
    site_id int8,
    primary key (id)
);

create table produit (
  id int8 not null,
  id_produit varchar(255),
  label_produit varchar(255),
  primary key (id)
);

create table site (
  id int8 not null,
  id_site varchar(255),
  label_site varchar(255),
  primary key (id)
);
