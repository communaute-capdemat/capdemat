create table civil_status_certificate_request (
    id int8 not null,
    commentaire varchar(2048),
    date_evenement timestamp,
    format_acte varchar(255),
    motif varchar(255),
    nom_titulaire_acte varchar(38),
    nombre_actes bytea,
    precision_autre_motif varchar(255),
    prenoms_titulaire_acte varchar(255),
    type_acte varchar(255),
    type_demandeur varchar(255),
    complement_type_acte_id int8,
    informations_administration_id int8,
    informations_juridique_id int8,
    informations_particulier_id int8,
    primary key (id)
);

create table cscr_complement_type_acte (
    id int8 not null,
    mere_nom varchar(38),
    mere_prenoms varchar(255),
    pere_nom varchar(38),
    pere_prenoms varchar(255),
    primary key (id)
);

create table cscr_informations_administration (
    id int8 not null,
    nom_administration varchar(255),
    nom_mandataire_administration varchar(255),
    precision_autre_qualite_mandataire_administration varchar(255),
    qualite_mandataire_administration varchar(255),
    primary key (id)
);

create table cscr_informations_juridique (
    id int8 not null,
    nom_mandataire_juridique varchar(255),
    precision_autre_qualite_mandataire_juridique varchar(255),
    qualite_mandataire_juridique varchar(255),
    primary key (id)
);

create table cscr_informations_particulier (
    id int8 not null,
    precision_autre_qualite_demandeur_particulier varchar(255),
    qualite_demandeur_particulier varchar(255),
    primary key (id)
);


alter table civil_status_certificate_request
    add constraint FK930441E628AB0480
    foreign key (informations_particulier_id)
    references cscr_informations_particulier;

alter table civil_status_certificate_request
    add constraint FK930441E694A4BF34
    foreign key (informations_administration_id)
    references cscr_informations_administration;

alter table civil_status_certificate_request
    add constraint FK930441E6FAB66500
    foreign key (informations_juridique_id)
    references cscr_informations_juridique;

alter table civil_status_certificate_request
    add constraint FK930441E660321EF9
    foreign key (complement_type_acte_id)
    references cscr_complement_type_acte;
