    create table taverny_approval_road_occupancy_request (
        id int8 not null,
        avis_service_technique varchar(255),
        debut_periode timestamp,
        descriptif_lieu_concerne varchar(255),
        droits_voirie varchar(255),
        fin_periode timestamp,
        hauteur_surface_occupee varchar(255),
        largeur_surface_occupee varchar(255),
        longueur_surface_occupee varchar(255),
        nom_entreprise varchar(255),
        precisions_mesures_demandees varchar(255),
        precisions_objet_demande varchar(255),
        precisions_type_travaux varchar(255),
        precisions_zones_concernees varchar(255),
        proprietaire_lieu_concerne varchar(255),
        reglement bool,
        surface_totale varchar(255),
        telecopie_entreprise varchar(10),
        telephone_entreprise varchar(10),
        adresse_entreprise_id int8,
        adresse_lieu_concerne_id int8,
        primary key (id)
    );

    create table taverny_approval_road_occupancy_request_choix_mesures_demandees (
        taverny_approval_road_occupancy_request_id int8 not null,
        choix_mesures_demandees_id int8 not null,
        choix_mesures_demandees_index int4 not null,
        primary key (taverny_approval_road_occupancy_request_id, choix_mesures_demandees_index)
    );

    create table taverny_approval_road_occupancy_request_choix_objet_demande (
        taverny_approval_road_occupancy_request_id int8 not null,
        choix_objet_demande_id int8 not null,
        choix_objet_demande_index int4 not null,
        primary key (taverny_approval_road_occupancy_request_id, choix_objet_demande_index)
    );

    create table taverny_approval_road_occupancy_request_choix_type_travaux (
        taverny_approval_road_occupancy_request_id int8 not null,
        choix_type_travaux_id int8 not null,
        choix_type_travaux_index int4 not null,
        primary key (taverny_approval_road_occupancy_request_id, choix_type_travaux_index)
    );

    create table taverny_approval_road_occupancy_request_choix_zones_concernees (
        taverny_approval_road_occupancy_request_id int8 not null,
        choix_zones_concernees_id int8 not null,
        choix_zones_concernees_index int4 not null,
        primary key (taverny_approval_road_occupancy_request_id, choix_zones_concernees_index)
    );

    alter table taverny_approval_road_occupancy_request 
        add constraint FK543CC0DCB44D8DEF 
        foreign key (adresse_lieu_concerne_id) 
        references address;

    alter table taverny_approval_road_occupancy_request 
        add constraint FK543CC0DC83C9678B 
        foreign key (adresse_entreprise_id) 
        references address;

    alter table taverny_approval_road_occupancy_request_choix_mesures_demandees 
        add constraint FKB1DFF346828B7B4A 
        foreign key (choix_mesures_demandees_id) 
        references local_referential_data;

    alter table taverny_approval_road_occupancy_request_choix_mesures_demandees 
        add constraint FKB1DFF34670429E82 
        foreign key (taverny_approval_road_occupancy_request_id) 
        references taverny_approval_road_occupancy_request;

    alter table taverny_approval_road_occupancy_request_choix_objet_demande 
        add constraint FKAE2DEDD870429E82 
        foreign key (taverny_approval_road_occupancy_request_id) 
        references taverny_approval_road_occupancy_request;

    alter table taverny_approval_road_occupancy_request_choix_objet_demande 
        add constraint FKAE2DEDD8705E85F8 
        foreign key (choix_objet_demande_id) 
        references local_referential_data;

    alter table taverny_approval_road_occupancy_request_choix_type_travaux 
        add constraint FK8A4BCA1570429E82 
        foreign key (taverny_approval_road_occupancy_request_id) 
        references taverny_approval_road_occupancy_request;

    alter table taverny_approval_road_occupancy_request_choix_type_travaux 
        add constraint FK8A4BCA1573FC1681 
        foreign key (choix_type_travaux_id) 
        references local_referential_data;

    alter table taverny_approval_road_occupancy_request_choix_zones_concernees 
        add constraint FKCD7F651470429E82 
        foreign key (taverny_approval_road_occupancy_request_id) 
        references taverny_approval_road_occupancy_request;

    alter table taverny_approval_road_occupancy_request_choix_zones_concernees 
        add constraint FKCD7F6514E7ADDDA2 
        foreign key (choix_zones_concernees_id) 
        references local_referential_data;
