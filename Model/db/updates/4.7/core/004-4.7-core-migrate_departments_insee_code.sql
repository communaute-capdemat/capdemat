--Insee code migration
UPDATE birth_details_request set birth_postal_code='D_E_P'||birth_postal_code;
UPDATE death_details_request set death_postal_code='D_E_P'||death_postal_code;
UPDATE marriage_details_request set marriage_postal_code='D_E_P'||marriage_postal_code;
