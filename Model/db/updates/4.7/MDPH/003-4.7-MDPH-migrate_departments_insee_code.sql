--Insee code migration
UPDATE marriage_information set marriage_postal_code='D_E_P'||marriage_postal_code where marriage_postal_code ~ '^[0-9]+$';
