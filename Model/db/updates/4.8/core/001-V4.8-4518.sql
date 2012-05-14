
create table demande_de_suivi_request (
        id int8 not null,
        commentaire varchar(1024),
        numero_demande varchar(255),
        primary key (id)
    );

alter TABLE request_note RENAME requestdata_id TO request_id;

