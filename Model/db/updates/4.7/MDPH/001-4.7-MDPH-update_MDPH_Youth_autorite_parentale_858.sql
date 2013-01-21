alter table mdph_youth_request drop constraint FK10277AB37DCFA968;





alter table mdph_youth_request add column autorite_parentale_les_deux_mere_id int8;
alter table mdph_youth_request add column autorite_parentale_les_deux_pere_id int8;


alter table mdph_youth_request 
        add constraint FK10277AB3E9AA5096 
        foreign key (autorite_parentale_les_deux_pere_id) 
        references myr_autorite_parentale;

alter table mdph_youth_request 
        add constraint FK10277AB37DCFA968 
        foreign key (information_autre_deteneur_autorite_parentale_id) 
        references myr_autorite_parentale_autre;



alter table mdph_youth_request 
        add constraint FK10277AB34AF79ED3 
        foreign key (autorite_parentale_les_deux_mere_id) 
        references myr_autorite_parentale;
