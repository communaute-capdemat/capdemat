  
   /* Migration type complexe local */
   create table current_school (
        id int8 not null,
        current_school_address varchar(255),
        current_section varchar(32),
        current_school_name varchar(255),
        primary key (id)
    );
    
     create table a_levels_informations (
        id int8 not null,
        alevels varchar(255),
        alevels_date varchar(4),
        primary key (id)
    );
    
    create table current_school_name (
        sgr_current_school_id int8 not null,
        current_school_name_id int8 not null,
        current_school_name_index int4 not null,
        primary key (sgr_current_school_id, current_school_name_index)
    );

    create table current_studies_informations (
        id int8 not null,
        abroad_internship_school_name varchar(255),
        abroad_internship_school_country varchar(255),
        abroad_internship_end_date timestamp,
        other_studies_label varchar(255),
        current_studies_diploma varchar(255),
        abroad_internship bool,
        current_studies_level varchar(255),
        abroad_internship_start_date timestamp,
        sandwich_courses bool,
        primary key (id)
    );

    create table dhr_current_dwelling (
        id int8 not null,
        dhr_current_dwelling_arrival_date timestamp,
        dhr_current_dwelling_status varchar(255),
        dhr_current_dwelling_address_id int8,
        dhr_current_dwelling_kind varchar(255),
        dhr_current_dwelling_net_area int2,
        dhr_current_dwelling_number_of_room int2,
        dhr_current_dwelling_phone varchar(10),
        primary key (id)
    );

    create table dhr_family_referent (
        id int8 not null,
        dhr_referent_first_name varchar(38),
        dhr_referent_name varchar(38),
        dhr_have_family_referent bool,
        dhr_referent_address_id int8,
        primary key (id)
    );

    create table dhr_incomes (
        id int8 not null,
        dhr_allowances bytea,
        dhr_incomes_annual_total bytea,
        pensions bytea,
        dhr_net_income bytea,
        dhr_furniture_investment_income bytea,
        dhr_real_estate_investment_income bytea,
        primary key (id)
    );
    
        create table dhr_requester (
        id int8 not null,
        dhr_requester_birth_place varchar(255),
        dhr_requester_birth_date timestamp,
        dhr_requester_france_arrival_date timestamp,
        dhr_requester_is_french_resident bool,
        dhr_requester_nationality varchar(32),
        primary key (id)
    );

    create table dhr_requester_guardian (
        id int8 not null,
        dhr_guardian_name varchar(38),
        dhr_guardian_address_id int8,
        dhr_requester_have_guardian bool,
        dhr_guardian_measure varchar(255),
        primary key (id)
    );

    create table dhr_requester_pension_plan (
        id int8 not null,
        dhr_pension_plan_detail varchar(255),
        dhr_principal_pension_plan varchar(255),
        dhr_complementary_pension_plan varchar(255),
        primary key (id)
    );
    
    create table dhr_spouse (
        id int8 not null,
        dhr_spouse_nationality varchar(32),
        dhr_spouse_maiden_name varchar(38),
        dhr_spouse_france_arrival_date timestamp,
        dhr_spouse_first_name varchar(38),
        dhr_spouse_family_status varchar(255),
        dhr_spouse_name varchar(38),
        dhr_spouse_birth_place varchar(255),
        dhr_spouse_birth_date timestamp,
        dhr_request_kind varchar(255),
        dhr_spouse_title varchar(255),
        dhr_spouse_is_french_resident bool,
        primary key (id)
    );

    create table dhr_spouse_status (
        id int8 not null,
        dhr_spouse_principal_pension_plan varchar(255),
        dhr_spouse_profession varchar(255),
        dhr_spouse_pension_plan_detail varchar(255),
        dhr_is_spouse_retired bool,
        dhr_spouse_employer varchar(255),
        dhr_spouse_complementary_pension_plan varchar(255),
        dhr_spouse_address_id int8,
        primary key (id)
    );

    create table dhr_taxes_amount (
        id int8 not null,
        property_taxes bytea,
        professional_taxes bytea,
        local_rate bytea,
        dhr_income_tax bytea,
        primary key (id)
    );

    create table family_situation_information (
        id int8 not null,
        child_status varchar(255),
        state_pupil bool,
        alive_children bytea,
        prefect_pupil bool,
        children_in_charge bytea,
        other_situation varchar(255),
        prefect_pupil_department varchar(255),
        primary key (id)
    );

    create table father_information (
        id int8 not null,
        father_last_name varchar(38),
        father_first_names varchar(255),
        primary key (id)
    );
    
        create table marriage_father_information (
        id int8 not null,
        father_last_name varchar(38),
        father_first_names varchar(255),
        primary key (id)
    );

    create table marriage_husband_information (
        id int8 not null,
        marriage_husband_first_names varchar(255),
        marriage_husband_last_name varchar(38),
        primary key (id)
    );

    create table marriage_information (
        id int8 not null,
        marriage_date timestamp,
        marriage_city varchar(32),
        marriage_postal_code varchar(3),
        primary key (id)
    );

    create table marriage_mother_information (
        id int8 not null,
        mother_first_names varchar(255),
        mother_maiden_name varchar(38),
        primary key (id)
    );

    create table marriage_wife_information (
        id int8 not null,
        marriage_wife_first_names varchar(255),
        marriage_wife_last_name varchar(38),
        primary key (id)
    );
    
    create table military_father_information (
        id int8 not null,
        father_birth_city varchar(255),
        father_birth_date timestamp,
        father_birth_department varchar(255),
        father_first_name varchar(38),
        father_last_name varchar(38),
        father_birth_country varchar(255),
        father_nationality varchar(255),
        primary key (id)
    );

    create table military_mother_information (
        id int8 not null,
        mother_birth_date timestamp,
        mother_first_name varchar(38),
        mother_birth_country varchar(255),
        mother_nationality varchar(255),
        mother_birth_city varchar(255),
        mother_last_name varchar(38),
        mother_birth_department varchar(255),
        primary key (id)
    );

    create table mother_information (
        id int8 not null,
        mother_first_names varchar(255),
        mother_maiden_name varchar(38),
        primary key (id)
    );
    
    create table professional_situation_information (
        id int8 not null,
        child_diploma varchar(255),
        child_profession varchar(255),
        child_speciality varchar(255),
        child_situation varchar(255),
        primary key (id)
    );
    
    create table rsr_contact (
        id int8 not null,
        contact_last_name varchar(38),
        contact_first_name varchar(38),
        contact_phone varchar(10),
        primary key (id)
    );

    create table rsr_request_information (
        id int8 not null,
        request_information_emergency bool,
        request_information_request_kind varchar(255),
        request_information_emergency_motive varchar(180),
        primary key (id)
    );

    create table rsr_second_contact (
        id int8 not null,
        second_contact_phone varchar(10),
        second_contact_last_name varchar(38),
        second_contact_first_name varchar(38),
        primary key (id)
    );

    create table rsr_spouse (
        id int8 not null,
        spouse_is_disabled_person bool,
        spouse_last_name varchar(38),
        spouse_first_name varchar(38),
        spouse_birth_date timestamp,
        spouse_title varchar(255),
        primary key (id)
    );

    create table rsr_subject (
        id int8 not null,
        subject_reside_with varchar(255),
        subject_is_taxable bool,
        subject_is_disabled_person bool,
        subject_birth_date timestamp,
        subject_is_a_p_a_beneficiary bool,
        subject_title varchar(255),
        primary key (id)
    );

    create table rsr_trustee (
        id int8 not null,
        trustee_first_name varchar(38),
        trustee_last_name varchar(38),
        trustee_phone varchar(10),
        primary key (id)
    );

    create table subject_informations (
        id int8 not null,
        subject_birth_date timestamp,
        subject_address_id int8,
        subject_first_request bool,
        subject_mobile_phone varchar(10),
        subject_phone varchar(10),
        subject_email varchar(255),
        primary key (id)
    );
    
    create table sgr_current_school (
        id int8 not null,
        current_school_name_precision varchar(255),
        current_school_address_id int8,
        primary key (id)
    );
    
    alter table sgr_current_school
        add constraint FK369752BB6A39B687 
        foreign key (current_school_address_id) 
        references address;

    alter table current_school_name 
        add constraint FK7C728EB0693B5BC2 
        foreign key (current_school_name_id) 
        references sgr_current_school;

    alter table current_school_name
        add constraint FK7C728EB025B517D7 
        foreign key (sgr_current_school_id) 
        references local_referential_data;
        
    alter table dhr_current_dwelling 
        add constraint FK2FBD3727D6EC023A 
        foreign key (dhr_current_dwelling_address_id) 
        references address;

    alter table dhr_family_referent 
        add constraint FKC39F11589BB4925 
        foreign key (dhr_referent_address_id) 
        references address;
        
    alter table dhr_requester_guardian 
        add constraint FK104F5E653044483F 
        foreign key (dhr_guardian_address_id) 
        references address;

    alter table dhr_spouse_status 
        add constraint FKB4C0D6CBD045047B 
        foreign key (dhr_spouse_address_id) 
        references address;
        
    alter table subject_informations 
        add constraint FK81BE0CFA87B85F15 
        foreign key (subject_address_id) 
        references address;
        
/*migration domestic_help_request*/
    alter table domestic_help_request add column dhr_requester_id int8;
    alter table domestic_help_request add column dhr_requester_guardian_id int8;
    alter table domestic_help_request add column dhr_requester_pension_plan_id int8;
    alter table domestic_help_request add column dhr_current_dwelling_id int8;
    alter table domestic_help_request add column dhr_spouse_status_id int8;
    alter table domestic_help_request add column dhr_requester_incomes_id int8;
    alter table domestic_help_request add column dhr_family_referent_id int8;
    alter table domestic_help_request add column dhr_spouse_id int8;
    alter table domestic_help_request add column dhr_taxes_amount_id int8;
    alter table domestic_help_request add column dhr_spouse_incomes_id int8;
    
    alter table domestic_help_request
        add constraint FK3C0081126486DCF2
        foreign key (dhr_family_referent_id)
        references dhr_family_referent;
 
    alter table domestic_help_request
        add constraint FK3C00811231C4F524
        foreign key (dhr_requester_guardian_id)
        references dhr_requester_guardian;
 
    alter table domestic_help_request
        add constraint FK3C0081123788BDF4
        foreign key (dhr_spouse_status_id)
        references dhr_spouse_status;
 
    alter table domestic_help_request
        add constraint FK3C008112E0058325
        foreign key (dhr_requester_pension_plan_id)
        references dhr_requester_pension_plan;
    
    alter table domestic_help_request 
        add constraint FK3C008112E929E8FE 
        foreign key (dhr_taxes_amount_id) 
        references dhr_taxes_amount;

    alter table domestic_help_request 
        add constraint FK3C0081124C0A1A90 
        foreign key (dhr_requester_incomes_id) 
        references dhr_incomes;

    alter table domestic_help_request 
        add constraint FK3C0081125609992D 
        foreign key (dhr_requester_id) 
        references dhr_requester;

    alter table domestic_help_request 
        add constraint FK3C008112D3504D15 
        foreign key (dhr_spouse_incomes_id) 
        references dhr_incomes;

    alter table domestic_help_request 
        add constraint FK3C008112D78C587E 
        foreign key (dhr_current_dwelling_id) 
        references dhr_current_dwelling;

    alter table domestic_help_request 
        add constraint FK3C0081121C9BA187 
        foreign key (dhr_spouse_id) 
        references dhr_spouse;

CREATE FUNCTION migrate_domestic_help_request() RETURNS void AS $$
    DECLARE
        dhrr RECORD;
    BEGIN
        FOR dhrr IN SELECT * FROM domestic_help_request LOOP
            INSERT INTO dhr_current_dwelling 
                (id,
                dhr_current_dwelling_arrival_date, 
                dhr_current_dwelling_status, 
                dhr_current_dwelling_address_id, 
                dhr_current_dwelling_kind, 
                dhr_current_dwelling_net_area, 
                dhr_current_dwelling_number_of_room, 
                dhr_current_dwelling_phone) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_current_dwelling_arrival_date, 
                    dhrr.dhr_current_dwelling_status, 
                    dhrr.dhr_current_dwelling_address_id, 
                    dhrr.dhr_current_dwelling_kind, 
                    dhrr.dhr_current_dwelling_net_area, 
                    dhrr.dhr_current_dwelling_number_of_room, 
                    dhrr.dhr_current_dwelling_phone);
            
            INSERT INTO dhr_family_referent 
                (id,
                dhr_referent_first_name, 
                dhr_referent_name, 
                dhr_have_family_referent, 
                dhr_referent_address_id)
                VALUES
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_referent_first_name, 
                    dhrr.dhr_referent_name, 
                    dhrr.dhr_have_family_referent, 
                    dhrr.dhr_referent_address_id);

            INSERT INTO dhr_incomes 
                (id,
                dhr_allowances, 
                dhr_incomes_annual_total, 
                pensions, 
                dhr_net_income, 
                dhr_furniture_investment_income, 
                dhr_real_estate_investment_income)
                VALUES
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_allowances, 
                    dhrr.dhr_incomes_annual_total, 
                    dhrr.pensions, 
                    dhrr.dhr_net_income, 
                    dhrr.dhr_furniture_investment_income, 
                    dhrr.dhr_real_estate_investment_income);
            
            INSERT INTO dhr_requester 
                (id,
                dhr_requester_birth_place, 
                dhr_requester_birth_date, 
                dhr_requester_france_arrival_date, 
                dhr_requester_is_french_resident, 
                dhr_requester_nationality)
                VALUES 
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_requester_birth_place, 
                    dhrr.dhr_requester_birth_date, 
                    dhrr.dhr_requester_france_arrival_date, 
                    dhrr.dhr_requester_is_french_resident, 
                    dhrr.dhr_requester_nationality);
            
            INSERT INTO dhr_requester_guardian
                (id,
                dhr_guardian_name, 
                dhr_guardian_address_id, 
                dhr_requester_have_guardian, 
                dhr_guardian_measure)
                VALUES
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_guardian_name, 
                    dhrr.dhr_guardian_address_id, 
                    dhrr.dhr_requester_have_guardian, 
                    dhrr.dhr_guardian_measure);
                    
            INSERT INTO dhr_requester_pension_plan
                (id,
                dhr_pension_plan_detail, 
                dhr_principal_pension_plan, 
                dhr_complementary_pension_plan)
                VALUES
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_pension_plan_detail, 
                    dhrr.dhr_principal_pension_plan, 
                    dhrr.dhr_complementary_pension_plan);
                    
            INSERT INTO dhr_spouse
                (id,
                dhr_spouse_nationality,
                dhr_spouse_maiden_name,
                dhr_spouse_france_arrival_date,
                dhr_spouse_first_name,
                dhr_spouse_family_status,
                dhr_spouse_name,
                dhr_spouse_birth_place,
                dhr_spouse_birth_date, 
                dhr_request_kind,
                dhr_spouse_title,
                dhr_spouse_is_french_resident)
                VALUES
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_spouse_nationality,
                    dhrr.dhr_spouse_maiden_name,
                    dhrr.dhr_spouse_france_arrival_date,
                    dhrr.dhr_spouse_first_name,
                    dhrr.dhr_spouse_family_status,
                    dhrr.dhr_spouse_name,
                    dhrr.dhr_spouse_birth_place,
                    dhrr.dhr_spouse_birth_date, 
                    dhrr.dhr_request_kind,
                    dhrr.dhr_spouse_title,
                    dhrr.dhr_spouse_is_french_resident);
                    
            INSERT INTO dhr_spouse_status
                (id,
                dhr_spouse_principal_pension_plan, 
                dhr_spouse_profession, 
                dhr_spouse_pension_plan_detail, 
                dhr_is_spouse_retired, 
                dhr_spouse_employer, 
                dhr_spouse_complementary_pension_plan, 
                dhr_spouse_address_id)
                VALUES
                    (nextval('hibernate_sequence'),
                    dhrr.dhr_spouse_principal_pension_plan, 
                    dhrr. dhr_spouse_profession, 
                    dhrr.dhr_spouse_pension_plan_detail, 
                    dhrr.dhr_is_spouse_retired, 
                    dhrr.dhr_spouse_employer, 
                    dhrr.dhr_spouse_complementary_pension_plan, 
                    dhrr.dhr_spouse_address_id);
            
            INSERT INTO dhr_taxes_amount
                (id,
                property_taxes, 
                professional_taxes, 
                local_rate, 
                dhr_income_tax)
                VALUES
                    (nextval('hibernate_sequence'),
                    dhrr.property_taxes, 
                    dhrr.professional_taxes, 
                    dhrr.local_rate, 
                    dhrr.dhr_income_tax);
                    
          UPDATE domestic_help_request 
            SET (dhr_requester_id,
            dhr_requester_guardian_id,
            dhr_requester_pension_plan_id,
            dhr_current_dwelling_id,
            dhr_spouse_status_id,
            dhr_requester_incomes_id,
            dhr_family_referent_id,
            dhr_spouse_id,
            dhr_taxes_amount_id,
            dhr_spouse_incomes_id) =
              ((SELECT id FROM dhr_requester ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_requester_guardian ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_requester_pension_plan ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_current_dwelling ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_spouse_status ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_incomes ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_family_referent ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_spouse ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_taxes_amount ORDER BY id DESC LIMIT 1),
              (SELECT id FROM dhr_incomes ORDER BY id DESC LIMIT 1))
             WHERE id=dhrr.id;
         END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_domestic_help_request();
DROP FUNCTION migrate_domestic_help_request();

/*migration birth_details_request*/
 alter table birth_details_request add column mother_information_id int8;
 alter table birth_details_request add column father_information_id int8;
 
    alter table birth_details_request 
        add constraint FKB35696121CDC5A27 
        foreign key (mother_information_id) 
        references mother_information;

    alter table birth_details_request 
        add constraint FKB35696128F34B635 
        foreign key (father_information_id) 
        references father_information;

CREATE FUNCTION migrate_birth_details_request() RETURNS void AS $$
    DECLARE
        bdrr RECORD;
    BEGIN
        FOR bdrr IN SELECT * FROM birth_details_request LOOP
            INSERT INTO mother_information 
                (id,
                mother_first_names,
                mother_maiden_name) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    bdrr.mother_first_names,
                    bdrr.mother_maiden_name);
                    
            INSERT INTO father_information
                (id,
                father_last_name,
                father_first_names)
                VALUES
                    (nextval('hibernate_sequence'),
                    bdrr.father_last_name,
                    bdrr.father_first_names);
                    
            UPDATE birth_details_request
            SET (mother_information_id,
                father_information_id) =
                    ((SELECT id FROM mother_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM father_information ORDER BY id DESC LIMIT 1))
                  WHERE id=bdrr.id;
        END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;
/*{{{*/
SELECT migrate_birth_details_request();
DROP FUNCTION migrate_birth_details_request();

/* migration marriage_details_request*/
 alter table marriage_details_request add column marriage_husband_id int8;
 alter table marriage_details_request add column mother_information_id int8;
 alter table marriage_details_request add column marriage_id int8;
 alter table marriage_details_request add column father_information_id int8;
 alter table marriage_details_request add column marriage_wife_id int8;
 
    alter table marriage_details_request 
        add constraint FK38315C1D3A1CCF66 
        foreign key (marriage_id) 
        references marriage_information;

    alter table marriage_details_request 
        add constraint FK38315C1DF977627D 
        foreign key (mother_information_id) 
        references marriage_mother_information;

    alter table marriage_details_request 
        add constraint FK38315C1D96B71B5B 
        foreign key (marriage_husband_id) 
        references marriage_husband_information;

    alter table marriage_details_request 
        add constraint FK38315C1D6BCFBE8B 
        foreign key (father_information_id) 
        references marriage_father_information;

    alter table marriage_details_request 
        add constraint FK38315C1D3C2E0479 
        foreign key (marriage_wife_id) 
        references marriage_wife_information;/*}}}*/
        
CREATE FUNCTION migrate_marriage_details_request() RETURNS void AS $$
    DECLARE
        mdrr RECORD;
    BEGIN
        FOR mdrr IN SELECT * FROM marriage_details_request LOOP
            INSERT INTO marriage_information 
                (id,
                marriage_date,
                marriage_city,
                marriage_postal_code) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    mdrr.marriage_date,
                    mdrr.marriage_city,
                    mdrr.marriage_postal_code);
                    
            INSERT INTO marriage_mother_information 
                (id,
                mother_first_names,
                mother_maiden_name) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    mdrr.mother_first_names,
                    mdrr.mother_maiden_name);
                    
            INSERT INTO marriage_husband_information 
                (id,
                marriage_husband_first_names,
                marriage_husband_last_name) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    mdrr.marriage_husband_first_names,
                    mdrr.marriage_husband_last_name);
                    
            INSERT INTO marriage_father_information 
                (id,
                father_last_name,
                father_first_names) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    mdrr.father_last_name,
                    mdrr.father_first_names);
                    
            INSERT INTO marriage_wife_information 
                (id,
                marriage_wife_first_names,
                marriage_wife_last_name) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    mdrr.marriage_wife_first_names,
                    mdrr.marriage_wife_last_name);
                    
            UPDATE marriage_details_request
            SET (marriage_husband_id,
                mother_information_id,
                marriage_id,
                father_information_id,
                marriage_wife_id)
                =
                    ((SELECT id FROM marriage_husband_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM marriage_mother_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM marriage_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM marriage_father_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM marriage_wife_information ORDER BY id DESC LIMIT 1))
                  WHERE id = mdrr.id;
        END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_marriage_details_request();
DROP FUNCTION migrate_marriage_details_request();

/* migration military_census_request */
 alter table military_census_request add column mother_information_id int8;
 alter table military_census_request add column father_information_id int8;
 alter table military_census_request add column professional_situation_information_id int8;
 alter table military_census_request add column family_situation_information_id int8;

    alter table military_census_request
        add constraint FK56137C47B00DD8B6
        foreign key (mother_information_id)
        references military_mother_information;

    alter table military_census_request
        add constraint FK56137C47E639E5CC
        foreign key (professional_situation_information_id)
        references professional_situation_information;

    alter table military_census_request
        add constraint FK56137C47226634C4
        foreign key (father_information_id)
        references military_father_information;

    alter table military_census_request
        add constraint FK56137C475D5B37EC
        foreign key (family_situation_information_id)
        references family_situation_information;

CREATE FUNCTION migrate_military_census_request() RETURNS void AS $$
    DECLARE
        mcrr RECORD;
    BEGIN
        FOR mcrr IN SELECT * FROM military_census_request LOOP
            INSERT INTO military_mother_information
                (id,
                mother_birth_date,
                mother_first_name,
                mother_birth_country,
                mother_nationality,
                mother_birth_city,
                mother_last_name,
                mother_birth_department) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    mcrr.mother_birth_date,
                    mcrr.mother_first_name,
                    mcrr.mother_birth_country,
                    mcrr.mother_nationality,
                    mcrr.mother_birth_city,
                    mcrr.mother_last_name,
                    mcrr.mother_birth_department);
                    
            INSERT INTO professional_situation_information
                (id,
                child_diploma,
                child_profession,
                child_speciality,
                child_situation)
                VALUES
                    (nextval('hibernate_sequence'),
                    mcrr.child_diploma,
                    mcrr.child_profession,
                    mcrr.child_speciality,
                    mcrr.child_situation);
            
            INSERT INTO military_father_information
                (id,
                father_birth_city,
                father_birth_date,
                father_birth_department,
                father_first_name,
                father_last_name,
                father_birth_country,
                father_nationality) 
                VALUES 
                    (nextval('hibernate_sequence'),
                    mcrr.father_birth_city,
                    mcrr.father_birth_date,
                    mcrr.father_birth_department,
                    mcrr.father_first_name,
                    mcrr.father_last_name,
                    mcrr.father_birth_country,
                    mcrr.father_nationality);
                    
            INSERT INTO family_situation_information
                (id,
                child_status,
                state_pupil,
                alive_children,
                prefect_pupil,
                children_in_charge,
                other_situation,
                prefect_pupil_department)
                VALUES
                    (nextval('hibernate_sequence'),
                    mcrr.child_status,
                    mcrr.state_pupil,
                    mcrr.alive_children,
                    mcrr.prefect_pupil,
                    mcrr.children_in_charge,
                    mcrr.other_situation,
                    mcrr.prefect_pupil_department);
                    
            UPDATE military_census_request
            SET (mother_information_id,
                professional_situation_information_id,
                father_information_id,
                family_situation_information_id) =
                    ((SELECT id FROM military_mother_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM professional_situation_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM military_father_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM family_situation_information ORDER BY id DESC LIMIT 1))
                  WHERE id=mcrr.id;
         END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_military_census_request();
DROP FUNCTION migrate_military_census_request();

/* migration remote_support_request */
 alter table remote_support_request add second_contact_id int8;
 alter table remote_support_request add rsr_subject_id int8;
 alter table remote_support_request add first_contact_id int8;
 alter table remote_support_request add trustee_id int8;
 alter table remote_support_request add request_information_id int8;
 alter table remote_support_request add spouse_id int8;
 
    alter table remote_support_request 
        add constraint FKEAA6DC2614675EE7 
        foreign key (rsr_subject_id) 
        references rsr_subject;

    alter table remote_support_request 
        add constraint FKEAA6DC263B39907C 
        foreign key (request_information_id) 
        references rsr_request_information;

    alter table remote_support_request 
        add constraint FKEAA6DC26C09E0CB9 
        foreign key (trustee_id) 
        references rsr_trustee;

    alter table remote_support_request 
        add constraint FKEAA6DC26C87DCA10 
        foreign key (second_contact_id) 
        references rsr_second_contact;

    alter table remote_support_request 
        add constraint FKEAA6DC266E9453BB 
        foreign key (spouse_id) 
        references rsr_spouse;

    alter table remote_support_request 
        add constraint FKEAA6DC26B17BD0A8 
        foreign key (first_contact_id) 
        references rsr_contact;

CREATE FUNCTION migrate_remote_support_request() RETURNS void AS $$
    DECLARE
        rsrr RECORD;
    BEGIN
        FOR rsrr IN SELECT * FROM remote_support_request LOOP
            INSERT INTO rsr_subject
                (id,
                subject_reside_with,
                subject_is_taxable,
                subject_is_disabled_person,
                subject_birth_date,
                subject_is_a_p_a_beneficiary,
                subject_title)
                VALUES
                    (nextval('hibernate_sequence'),
                    rsrr.subject_reside_with,
                    rsrr.subject_is_taxable,
                    rsrr.subject_is_disabled_person,
                    rsrr.subject_birth_date,
                    rsrr.subject_is_a_p_a_beneficiary,
                    rsrr.subject_title);
                    
            INSERT INTO rsr_request_information
                (id,
                request_information_emergency,
                request_information_request_kind,
                request_information_emergency_motive)
                VALUES
                    (nextval('hibernate_sequence'),
                    rsrr.request_information_emergency,
                    rsrr.request_information_request_kind,
                    rsrr.request_information_emergency_motive);
                    
            INSERT INTO rsr_trustee
                (id,
                trustee_first_name,
                trustee_last_name,
                trustee_phone)
                VALUES
                    (nextval('hibernate_sequence'),
                    rsrr.trustee_first_name,
                    rsrr.trustee_last_name,
                    rsrr.trustee_phone);
                    
            INSERT INTO rsr_second_contact
                (id,
                second_contact_phone,
                second_contact_last_name,
                second_contact_first_name)
                VALUES
                    (nextval('hibernate_sequence'),
                    rsrr.second_contact_phone,
                    rsrr.second_contact_last_name,
                    rsrr.second_contact_first_name);
                    
            INSERT INTO rsr_spouse
                (id,
                spouse_is_disabled_person,
                spouse_last_name,
                spouse_first_name,
                spouse_birth_date,
                spouse_title)
                VALUES
                    (nextval('hibernate_sequence'),
                    rsrr.spouse_is_disabled_person,
                    rsrr.spouse_last_name,
                    rsrr.spouse_first_name,
                    rsrr.spouse_birth_date,
                    rsrr.spouse_title);
                    
            INSERT INTO rsr_contact
                (id,
                contact_last_name,
                contact_first_name,
                contact_phone)
                VALUES
                    (nextval('hibernate_sequence'),
                    rsrr.contact_last_name,
                    rsrr.contact_first_name,
                    rsrr.contact_phone);
                    
            UPDATE remote_support_request
            SET (second_contact_id,
                rsr_subject_id,
                first_contact_id,
                trustee_id,
                request_information_id,
                spouse_id) =
                    ((SELECT id FROM rsr_second_contact ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM rsr_subject ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM rsr_contact ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM rsr_trustee ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM rsr_request_information ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM rsr_spouse ORDER BY id DESC LIMIT 1))
                  WHERE id=rsrr.id;
         END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_remote_support_request();
DROP FUNCTION migrate_remote_support_request();

/* migrate school_registration_request */
 alter table school_registration_request add column current_school_id int8;
 
    alter table school_registration_request 
        add constraint FK7BDFE8F44E7B2104 
        foreign key (current_school_id) 
        references current_school;

CREATE FUNCTION migrate_school_registration_request() RETURNS void AS $$
    DECLARE
        srrr RECORD;
    BEGIN
        FOR srrr IN SELECT * FROM school_registration_request LOOP
            INSERT INTO current_school
                (id,
                current_school_address,
                current_section,
                current_school_name)
                VALUES
                    (nextval('hibernate_sequence'),
                    srrr.current_school_address,
                    srrr.current_section,
                    srrr.current_school_name);
                     
            UPDATE school_registration_request
            SET (current_school_id) =
            ((SELECT id FROM current_school ORDER BY id DESC LIMIT 1))
            WHERE id=srrr.id;
         END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_school_registration_request();
DROP FUNCTION migrate_school_registration_request();

/* migration study_grant_request */
 alter table study_grant_request add column current_school_id int8;
 alter table study_grant_request add column current_studies_informations_id int8;
 alter table study_grant_request add column subject_informations_id int8;
 alter table study_grant_request add column alevels_informations_id int8;
 
    alter table study_grant_request
        add constraint FK7D2F0A76FA4A5772
        foreign key (alevels_informations_id)
        references a_levels_informations;
        
    alter table study_grant_request 
        add constraint FK7D2F0A76BF38C433 
        foreign key (current_studies_informations_id) 
        references current_studies_informations;

    alter table study_grant_request 
        add constraint FK7D2F0A76C2DF1D38 
        foreign key (current_school_id) 
        references sgr_current_school;

    alter table study_grant_request 
        add constraint FK7D2F0A76BCDDB18A 
        foreign key (subject_informations_id) 
        references subject_informations;
        
CREATE FUNCTION migrate_study_grant_request() RETURNS void AS $$
    DECLARE
        sgrr RECORD;
    BEGIN
        FOR sgrr IN SELECT * FROM study_grant_request LOOP
            INSERT INTO a_levels_informations
                (id,
                alevels,
                alevels_date)
                VALUES
                    (nextval('hibernate_sequence'),
                    sgrr.alevels,
                    sgrr.alevels_date);
                    
            INSERT INTO current_studies_informations
                (id,
                abroad_internship_school_name,
                abroad_internship_school_country,
                abroad_internship_end_date,
                other_studies_label,
                current_studies_diploma,
                abroad_internship,
                current_studies_level,
                abroad_internship_start_date,
                sandwich_courses)
                VALUES
                    (nextval('hibernate_sequence'),
                    sgrr.abroad_internship_school_name,
                    sgrr.abroad_internship_school_country,
                    sgrr.abroad_internship_end_date,
                    sgrr.other_studies_label,
                    sgrr.current_studies_diploma,
                    sgrr.abroad_internship,
                    sgrr.current_studies_level,
                    sgrr.abroad_internship_start_date,
                    sgrr.sandwich_courses);
                    
            INSERT INTO sgr_current_school
                (id,
                current_school_name_precision,
                current_school_address_id)
                VALUES
                    (nextval('hibernate_sequence'),
                    sgrr.current_school_name_precision,
                    sgrr.current_school_address_id);
                     
            INSERT INTO subject_informations
                (id,
                subject_birth_date,
                subject_address_id,
                subject_first_request,
                subject_mobile_phone,
                subject_phone,
                subject_email)
                VALUES
                    (nextval('hibernate_sequence'),
                    sgrr.subject_birth_date,
                    sgrr.subject_address_id,
                    sgrr.subject_first_request,
                    sgrr.subject_mobile_phone,
                    sgrr.subject_phone,
                    sgrr.subject_email);
                    
            UPDATE study_grant_request
            SET (current_school_id,
                current_studies_informations_id,
                subject_informations_id,
                alevels_informations_id) =
                    ((SELECT id FROM sgr_current_school ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM current_studies_informations ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM subject_informations ORDER BY id DESC LIMIT 1),
                    (SELECT id FROM a_levels_informations ORDER BY id DESC LIMIT 1))
                  WHERE id=sgrr.id;
         END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_study_grant_request();
DROP FUNCTION migrate_study_grant_request();

 alter table domestic_help_request
        drop dhr_spouse_principal_pension_plan,
        drop dhr_spouse_profession,
        drop dhr_net_income,
        drop professional_taxes,
        drop dhr_is_spouse_retired,
        drop dhr_spouse_title,
        drop dhr_requester_birth_date,
        drop dhr_real_estate_investment_income,
        drop dhr_requester_is_french_resident,
        drop dhr_current_dwelling_address_id,
        drop dhr_spouse_france_arrival_date,
        drop dhr_requester_nationality,
        drop dhr_current_dwelling_arrival_date,
        drop dhr_referent_first_name,
        drop dhr_incomes_annual_total,
        drop dhr_requester_have_guardian,
        drop dhr_income_tax,
        drop dhr_spouse_birth_place,
        drop dhr_spouse_birth_date,
        drop dhr_current_dwelling_net_area,
        drop dhr_requester_france_arrival_date,
        drop dhr_current_dwelling_status,
        drop dhr_spouse_first_name,
        drop dhr_spouse_family_status,
        drop dhr_furniture_investment_income,
        drop dhr_guardian_address_id,
        drop dhr_referent_name,
        drop local_rate,
        drop dhr_spouse_employer,
        drop dhr_request_kind,
        drop dhr_principal_pension_plan,
        drop dhr_complementary_pension_plan,
        drop dhr_referent_address_id,
        drop property_taxes,
        drop dhr_guardian_name,
        drop pensions,
        drop dhr_current_dwelling_kind,
        drop dhr_current_dwelling_number_of_room,
        drop dhr_guardian_measure,
        drop dhr_current_dwelling_phone,
        drop dhr_spouse_is_french_resident,
        drop dhr_allowances,
        drop dhr_spouse_nationality,
        drop dhr_spouse_maiden_name,
        drop dhr_spouse_name,
        drop dhr_spouse_pension_plan_detail,
        drop dhr_requester_birth_place,
        drop dhr_spouse_address_id,
        drop dhr_have_family_referent,
        drop dhr_pension_plan_detail,
        drop dhr_spouse_complementary_pension_plan;
 alter table birth_details_request
    drop mother_first_names,
    drop mother_maiden_name,
    drop father_last_name,
    drop father_first_names;
 alter table marriage_details_request
    drop marriage_husband_first_names,
    drop marriage_husband_last_name,
    drop mother_first_names,
    drop mother_maiden_name,
    drop marriage_date,
    drop marriage_city,
    drop marriage_postal_code,
    drop father_last_name,
    drop father_first_names,
    drop marriage_wife_first_names, 
    drop marriage_wife_last_name;
 alter table military_census_request
    drop mother_birth_date,
    drop mother_first_name,
    drop mother_birth_country,
    drop mother_nationality,
    drop mother_birth_city,
    drop mother_last_name,
    drop mother_birth_department,
    drop child_diploma,
    drop child_profession, 
    drop child_speciality,
    drop child_situation,
    drop father_birth_city,
    drop father_birth_date,
    drop father_birth_department,
    drop father_first_name,
    drop father_last_name,
    drop father_birth_country,
    drop father_nationality,
    drop child_status,
    drop state_pupil,
    drop alive_children,
    drop prefect_pupil,
    drop children_in_charge,
    drop other_situation,
    drop prefect_pupil_department;
 alter table remote_support_request
    drop trustee_phone,
    drop spouse_is_disabled_person,
    drop subject_birth_date,
    drop subject_is_a_p_a_beneficiary,
    drop subject_reside_with,
    drop spouse_birth_date,
    drop contact_phone,
    drop spouse_last_name,
    drop request_information_emergency,
    drop request_information_request_kind,
    drop subject_is_disabled_person,
    drop second_contact_last_name,
    drop request_information_emergency_motive,
    drop contact_last_name,
    drop spouse_title,
    drop subject_title,
    drop spouse_first_name,
    drop contact_first_name,
    drop trustee_first_name,
    drop second_contact_first_name,
    drop subject_is_taxable,
    drop trustee_last_name,
    drop second_contact_phone;
 alter table school_registration_request
    drop current_school_address,
    drop current_school_name,
    drop current_section;
 alter table study_grant_request 
    drop alevels,
    drop alevels_date,
    drop abroad_internship_school_name,
    drop abroad_internship_school_country,
    drop abroad_internship_end_date,
    drop other_studies_label,
    drop current_studies_diploma,
    drop abroad_internship,
    drop current_studies_level,
    drop abroad_internship_start_date,
    drop sandwich_courses,
    drop current_school_name_precision,
    drop subject_birth_date,
    drop subject_address_id,
    drop subject_first_request,
    drop subject_mobile_phone,
    drop subject_phone,
    drop subject_email;

 alter table study_grant_request_current_school_name 
    drop constraint FK49484F6719BB0CC1;
 alter table study_grant_request_current_school_name 
    drop constraint FK49484F671E1FCE3;
 drop table study_grant_request_current_school_name;

   alter table mar_situation_professionnelle_stagiaire 
       drop constraint FKF7052B4E62A75AD3;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AB7264787;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A63BFEC12;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AFF86C1EE;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A99FF2501;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AF5443B12;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A10E64941;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AFDD4D637;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A6F6E0F42;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AD52FB460;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AD596CF96;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A36B07BF3;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A845CF77C;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A19686137;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AA9E7FEA5;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A26F87B5D;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A5ABFDF4;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AEFDB1FD2;

   alter table mdph_adult_request 
       drop constraint FKB0266E9ACDADA1AA;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A3CE43CFE;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A757D114D;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A9898F441;

   alter table mdph_adult_request 
       drop constraint FKB0266E9AC2C717FB;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A5F568781;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A64C05EEE;

   alter table mdph_adult_request 
       drop constraint FKB0266E9A82EE72B2;

   alter table mdph_youth_request 
       drop constraint FK10277AB35992B22A;

   alter table mdph_youth_request 
       drop constraint FK10277AB38FD1EB19;

   alter table mdph_youth_request 
       drop constraint FK10277AB3BF6C0D9B;

   alter table mdph_youth_request 
       drop constraint FK10277AB3C17DDB2A;

   alter table mdph_youth_request 
       drop constraint FK10277AB3B5384359;

   alter table mdph_youth_request 
       drop constraint FK10277AB3AF51D11F;

   alter table mdph_youth_request 
       drop constraint FK10277AB32A68722A;

   alter table mdph_youth_request 
       drop constraint FK10277AB371B93348;

   alter table mdph_youth_request 
       drop constraint FK10277AB3F1AADEDB;

   alter table mdph_youth_request 
       drop constraint FK10277AB3845CF77C;

   alter table mdph_youth_request 
       drop constraint FK10277AB32A10DA0F;

   alter table mdph_youth_request 
       drop constraint FK10277AB3628F7F8D;

   alter table mdph_youth_request 
       drop constraint FK10277AB394A5AE45;

   alter table mdph_youth_request 
       drop constraint FK10277AB35ABFDF4;

   alter table mdph_youth_request 
       drop constraint FK10277AB37DCFA968;

   alter table mdph_youth_request 
       drop constraint FK10277AB3942D19EA;

   alter table mdph_youth_request 
       drop constraint FK10277AB3B39AEA92;

   alter table mdph_youth_request 
       drop constraint FK10277AB36BE84516;

   alter table mdph_youth_request 
       drop constraint FK10277AB3A4811965;

   alter table mdph_youth_request 
       drop constraint FK10277AB364D29459;

   alter table mdph_youth_request 
       drop constraint FK10277AB35E1EBF5E;

   alter table mdph_youth_request 
       drop constraint FK10277AB3A8B460E3;

   alter table mdph_youth_request 
       drop constraint FK10277AB3DE68C399;

   alter table mdph_youth_request 
       drop constraint FK10277AB3ACB98906;

   alter table mdph_youth_request 
       drop constraint FK10277AB3200AECA;

   alter table myr_autorite_parentale 
       drop constraint FKFE8F9821725D4DCB;

   alter table myr_autorite_parentale_autre 
       drop constraint FKC3D57755725D4DCB;

   alter table myr_frais_supp_lies_handicap 
       drop constraint FKBB377E08E1F81DAC;

   alter table myr_situation_professionnelle_stagiaire 
       drop constraint FK16C3DA3662A75AD3;

   drop table mar_besoins_demande_pch;

   drop table mar_birth_place;

   drop table mar_choix_demande_alloc_et_compl;

   drop table mar_conjoint_identite;

   drop table mar_precedent_dossier_mdph;

   drop table mar_precision_preference_etablissement_ou_service;

   drop table mar_preference_etablissement_ou_service_scolaire;

   drop table mar_situation_professionnelle_autre;

   drop table mar_situation_professionnelle_beneficiaire_pension;

   drop table mar_situation_professionnelle_demandeur_emploi;

   drop table mar_situation_professionnelle_non_salarie;

   drop table mar_situation_professionnelle_retraite;

   drop table mar_situation_professionnelle_salarie;

   drop table mar_situation_professionnelle_stagiaire;

   drop table mdph_adult_request;

   drop table mdph_youth_request;

   drop table myr_autorite_parentale;

   drop table myr_autorite_parentale_autre;

   drop table myr_besoins_demande_pch;

   drop table myr_birth_place;

   drop table myr_conjoint_identite;

   drop table myr_frais_supp_lies_handicap;

   drop table myr_precedent_dossier_mdph;

   drop table myr_preference_etablissement_ou_service_scolaire;

   drop table myr_presence_personne_aupres_enfant;

   drop table myr_situation_professionnelle_autre;

   drop table myr_situation_professionnelle_beneficiaire_pension;

   drop table myr_situation_professionnelle_demandeur_emploi;

   drop table myr_situation_professionnelle_non_salarie;

   drop table myr_situation_professionnelle_retraite;

   drop table myr_situation_professionnelle_salarie;

   drop table myr_situation_professionnelle_stagiaire;

   create table mar_besoins_demande_pch (
       id int8 not null,
       aide_animaliere bool,
       charges_specifiques bool,
       aide_humaine bool,
       precision_amenagement_vehicule varchar(255),
       amenagement_vehicule bool,
       amenagement_logement_demenagement bool,
       precision_charges_specifiques varchar(255),
       precision_aide_humaine varchar(255),
       precision_aide_technique varchar(255),
       precision_aide_animaliere varchar(255),
       precision_amenagement_logement_demenagement varchar(255),
       aide_technique bool,
       primary key (id)
   );

   create table mar_birth_place (
       id int8 not null,
       postal_code varchar(5),
       country varchar(255),
       city varchar(32),
       primary key (id)
   );

   create table mar_choix_demande_alloc_et_compl (
       id int8 not null,
       complement_ressources bool,
       aah bool,
       primary key (id)
   );

   create table mar_conjoint_identite (
       id int8 not null,
       nom_naissance_conjoint varchar(38),
       prenom_conjoint varchar(38),
       date_naissance_conjoint timestamp,
       primary key (id)
   );

   create table mar_precedent_dossier_mdph (
       id int8 not null,
       departement_mdph varchar(3),
       numero_mdph varchar(13),
       primary key (id)
   );

   create table mar_precision_preference_etablissement_ou_service (
       id int8 not null,
       commune_etablissement_preference varchar(32),
       nom_etablissement_preference varchar(255),
       telephone_etablissement_preference varchar(10),
       code_postal_etablissement_preference varchar(5),
       primary key (id)
   );

   create table mar_preference_etablissement_ou_service_scolaire (
       id int8 not null,
       code_postal_preference_etablissement_ou_service varchar(5),
       nom_preference_etablissement_ou_service varchar(255),
       commune_preference_etablissement_ou_service varchar(32),
       primary key (id)
   );

   create table mar_situation_professionnelle_autre (
       id int8 not null,
       precision_autre_situation_professionnelle varchar(255),
       autre_depuis_le timestamp,
       primary key (id)
   );

   create table mar_situation_professionnelle_beneficiaire_pension (
       id int8 not null,
       allocation_supplementaire_invalidite bool,
       rente_accident_travail bool,
       categorie_pension_invalidite varchar(255),
       beneficiaire_pension_depuis_le timestamp,
       primary key (id)
   );

   create table mar_situation_professionnelle_demandeur_emploi (
       id int8 not null,
       allocation_solidarite_specifique bool,
       demandeur_emploi_depuis_le timestamp,
       indemnisation_depuis_le timestamp,
       primary key (id)
   );

   create table mar_situation_professionnelle_non_salarie (
       id int8 not null,
       regime_cotisations varchar(255),
       non_salarie_depuis_le timestamp,
       primary key (id)
   );

   create table mar_situation_professionnelle_retraite (
       id int8 not null,
       retraite_depuis_le timestamp,
       pension_retraite bool,
       supplementaire_personne_agee bool,
       primary key (id)
   );

   create table mar_situation_professionnelle_salarie (
       id int8 not null,
       salarie_date_debut_contrat timestamp,
       esat_depuis_le timestamp,
       salarie_date_fin_contrat timestamp,
       salarie_depuis_le timestamp,
       primary key (id)
   );

   create table mar_situation_professionnelle_stagiaire (
       id int8 not null,
       stage_renumeration bool,
       nom_employeur_stage varchar(38),
       telephone_employeur_stage varchar(10),
       adresse_employeur_stage_id int8,
       stagiaire_depuis_le timestamp,
       primary key (id)
   );

   create table mdph_adult_request (
       id int8 not null,
       adresse_responsable_legal_id int8,
       precision_preference_etablissement_ou_service_id int8,
       situation_professionnelle_vous_beneficiaire_pension_id int8,
       date_entree_souhaitee timestamp,
       choix_orientation_reclassement varchar(255),
       lieu_naissance_sujet_id int8,
       fax_sujet varchar(10),
       domiciliation_organisme_payeur_id int8,
       situation_professionnelle_vous_salarie_id int8,
       situation_professionnelle_conjoint_salarie_id int8,
       nom_responsable_legal varchar(255),
       numero_allocataire varchar(255),
       nombre_enfants_a_charge varchar(2),
       expression_projet_de_vie varchar(5096),
       allocation_personnalisee_autonomie bool,
       orientation_souhaitee varchar(255),
       choix_prestation_compensation varchar(255),
       precision_preferences_etablissement_ou_service_id int8,
       date_debut_revenu_recu timestamp,
       date_naissance_aidant timestamp,
       demande_libre_scolaire varchar(2048),
       autre bool,
       conseille_projet_de_vie varchar(255),
       precision_si_domicile_aupres_organisme varchar(255),
       situation_professionnelle_conjoint_autre_id int8,
       situation_professionnelle_vous_autre_id int8,
       domiciliation_aidant_id int8,
       situation_particuliere varchar(255),
       type_logement varchar(255),
       orientation_reclassement bool,
       date_arrivee_france timestamp,
       date_situation_familiale timestamp,
       date_naissance_sujet timestamp,
       carte_accompagnement bool,
       nationalite varchar(255),
       fax_responsable_legal varchar(10),
       identite_conjoint_id int8,
       email_responsable_legal varchar(255),
       situation_professionnelle_vous varchar(255),
       situation_professionnelle_conjoint varchar(255),
       situation_professionnelle_conjoint_retraite_id int8,
       precedent_dossier_mdph_id int8,
       organisme_payeur varchar(255),
       nom_allocataire varchar(38),
       preferences_etablissement_ou_service bool,
       situation_actuelle_precision varchar(255),
       besoins_demande_p_c_h_id int8,
       preference_etablissement_ou_service bool,
       prenom_allocataire varchar(38),
       representant_legal varchar(255),
       nom_organisme_securite_sociale varchar(50),
       situation_professionnelle_vous_stagiaire_id int8,
       situation_professionnelle_conjoint_beneficiaire_pension_id int8,
       situation_professionnelle_conjoint_demandeur_emploi_id int8,
       choix_projet_de_vie varchar(255),
       situation_professionnelle_vous_demandeur_emploi_id int8,
       carte_invalidite bool,
       choix_type_demande_alloc_et_compl_id int8,
       prime_reclassement bool,
       nom_organisme_payeur varchar(255),
       situation_maritale varchar(255),
       precision_logement_autre varchar(255),
       tel_responsable_legal varchar(10),
       carte_stationnement bool,
       date_fin_revenu_recu timestamp,
       domiciliation_etablissement_id int8,
       numero_securite_sociale_sujet varchar(13),
       situation_professionnelle_vous_retraite_id int8,
       precision_revenu_recu varchar(255),
       nom_etablissement varchar(255),
       precedents_revenus_recus varchar(255),
       situation_professionnelle_vous_non_salarie_id int8,
       lien_parente_aidant varchar(255),
       precision_autre varchar(255),
       rqth bool,
       situation_professionnelle_conjoint_stagiaire_id int8,
       nom_aidant varchar(38),
       situation_actuelle varchar(255),
       situation_professionnelle_conjoint_non_salarie_id int8,
       primary key (id)
   );

   create table mdph_youth_request (
       id int8 not null,
       situation_professionnelle_vous_beneficiaire_pension_id int8,
       lieu_naissance_sujet_id int8,
       fax_sujet varchar(10),
       type_scolarisation varchar(1024),
       domiciliation_organisme_payeur_id int8,
       situation_professionnelle_vous_salarie_id int8,
       presence_personne_aupres_enfant_id int8,
       situation_professionnelle_conjoint_salarie_id int8,
       enfant_en_internat bool,
       information_autre_deteneur_autorite_parentale_id int8,
       numero_allocataire varchar(50),
       nombre_enfants_a_charge varchar(2),
       expression_projet_de_vie varchar(5096),
       allocation_personnalisee_autonomie bool,
       choix_prestation_compensation varchar(255),
       precision_preferences_etablissement_ou_service_id int8,
       demande_libre_scolaire varchar(2048),
       precision_si_domicile_aupres_organisme varchar(255),
       situation_professionnelle_conjoint_autre_id int8,
       conseille_projet_de_vie varchar(255),
       situation_professionnelle_vous_autre_id int8,
       situation_particuliere varchar(255),
       type_logement varchar(255),
       en_internat_depuis_le timestamp,
       date_arrivee_france timestamp,
       date_situation_familiale timestamp,
       date_naissance_sujet timestamp,
       carte_accompagnement bool,
       nationalite varchar(255),
       identite_conjoint_id int8,
       situation_professionnelle_vous varchar(255),
       situation_professionnelle_conjoint varchar(255),
       situation_professionnelle_conjoint_retraite_id int8,
       precedent_dossier_mdph_id int8,
       organisme_payeur varchar(255),
       deteneur_autorite_parentale varchar(255),
       nom_allocataire varchar(38),
       preferences_etablissement_ou_service bool,
       besoins_demande_p_c_h_id int8,
       prenom_allocataire varchar(38),
       nom_organisme_securite_sociale varchar(50),
       situation_professionnelle_vous_stagiaire_id int8,
       situation_professionnelle_conjoint_beneficiaire_pension_id int8,
       situation_professionnelle_conjoint_demandeur_emploi_id int8,
       choix_projet_de_vie varchar(255),
       situation_professionnelle_vous_demandeur_emploi_id int8,
       carte_invalidite bool,
       frais_sejour_pris_en_charge bool,
       nom_organisme_payeur varchar(255),
       situation_maritale varchar(255),
       precision_logement_autre varchar(255),
       carte_stationnement bool,
       autorite_parentale_pere_id int8,
       domiciliation_etablissement_id int8,
       numero_securite_sociale_sujet varchar(13),
       type_accueil varchar(1024),
       situation_professionnelle_vous_retraite_id int8,
       nom_etablissement varchar(255),
       situation_professionnelle_vous_non_salarie_id int8,
       precision_autre varchar(255),
       situation_professionnelle_conjoint_stagiaire_id int8,
       autorite_parentale_mere_id int8,
       situation_professionnelle_conjoint_non_salarie_id int8,
       primary key (id)
   );

   create table myr_autorite_parentale (
       id int8 not null,
       nom varchar(38),
       email varchar(255),
       telephone varchar(10),
       fax varchar(10),
       prenom varchar(38),
       domiciliation_id int8,
       primary key (id)
   );

   create table myr_autorite_parentale_autre (
       id int8 not null,
       nom varchar(38),
       email varchar(255),
       telephone varchar(10),
       fax varchar(10),
       domiciliation_id int8,
       primary key (id)
   );

   create table myr_besoins_demande_pch (
       id int8 not null,
       aide_animaliere bool,
       charges_specifiques bool,
       aide_humaine bool,
       precision_amenagement_vehicule varchar(255),
       amenagement_vehicule bool,
       amenagement_logement_demenagement bool,
       precision_charges_specifiques varchar(255),
       precision_aide_humaine varchar(255),
       precision_aide_technique varchar(255),
       precision_aide_animaliere varchar(255),
       precision_amenagement_logement_demenagement varchar(255),
       aide_technique bool,
       primary key (id)
   );

   create table myr_birth_place (
       id int8 not null,
       postal_code varchar(5),
       country varchar(255),
       city varchar(32),
       primary key (id)
   );

   create table myr_conjoint_identite (
       id int8 not null,
       nom_naissance_conjoint varchar(38),
       prenom_conjoint varchar(38),
       date_naissance_conjoint timestamp,
       primary key (id)
   );

   create table myr_frais_supp_lies_handicap (
       id int8 not null,
       nature_frais varchar(255),
       reste_a_votre_charge varchar(8),
       montants_obtenus varchar(8),
       periodicite varchar(255),
       financeurs_sollicites varchar(255),
       mdph_youth_request_id int8,
       frais_supp_lies_handicap_index int4,
       primary key (id)
   );

   create table myr_precedent_dossier_mdph (
       id int8 not null,
       departement_mdph varchar(3),
       numero_mdph varchar(13),
       primary key (id)
   );

   create table myr_preference_etablissement_ou_service_scolaire (
       id int8 not null,
       code_postal_preference_etablissement_ou_service varchar(5),
       nom_preference_etablissement_ou_service varchar(255),
       commune_preference_etablissement_ou_service varchar(32),
       primary key (id)
   );

   create table myr_presence_personne_aupres_enfant (
       id int8 not null,
       exercice_activite_professionnelle bool,
       recours_emploi_remunere_tierce_personne varchar(255),
       nb_heure_par_an_emploi_non_regulier varchar(3),
       primary key (id)
   );

   create table myr_situation_professionnelle_autre (
       id int8 not null,
       precision_autre_situation_professionnelle varchar(255),
       autre_depuis_le timestamp,
       primary key (id)
   );

   create table myr_situation_professionnelle_beneficiaire_pension (
       id int8 not null,
       allocation_supplementaire_invalidite bool,
       rente_accident_travail bool,
       categorie_pension_invalidite varchar(255),
       beneficiaire_pension_depuis_le timestamp,
       primary key (id)
   );

   create table myr_situation_professionnelle_demandeur_emploi (
       id int8 not null,
       allocation_solidarite_specifique bool,
       demandeur_emploi_depuis_le timestamp,
       indemnisation_depuis_le timestamp,
       primary key (id)
   );

   create table myr_situation_professionnelle_non_salarie (
       id int8 not null,
       regime_cotisations varchar(255),
       non_salarie_depuis_le timestamp,
       primary key (id)
   );

   create table myr_situation_professionnelle_retraite (
       id int8 not null,
       retraite_depuis_le timestamp,
       pension_retraite bool,
       supplementaire_personne_agee bool,
       primary key (id)
   );

   create table myr_situation_professionnelle_salarie (
       id int8 not null,
       salarie_date_debut_contrat timestamp,
       esat_depuis_le timestamp,
       salarie_date_fin_contrat timestamp,
       salarie_depuis_le timestamp,
       primary key (id)
   );

   create table myr_situation_professionnelle_stagiaire (
       id int8 not null,
       stage_renumeration bool,
       nom_employeur_stage varchar(38),
       telephone_employeur_stage varchar(10),
       adresse_employeur_stage_id int8,
       stagiaire_depuis_le timestamp,
       primary key (id)
   );

   alter table mar_situation_professionnelle_stagiaire 
       add constraint FKF7052B4E62A75AD3 
       foreign key (adresse_employeur_stage_id) 
       references address;

   alter table mdph_adult_request 
       add constraint FKB0266E9AB7264787 
       foreign key (choix_type_demande_alloc_et_compl_id) 
       references mar_choix_demande_alloc_et_compl;

   alter table mdph_adult_request 
       add constraint FKB0266E9A63BFEC12 
       foreign key (situation_professionnelle_vous_autre_id) 
       references mar_situation_professionnelle_autre;

   alter table mdph_adult_request 
       add constraint FKB0266E9AFF86C1EE 
       foreign key (adresse_responsable_legal_id) 
       references address;

   alter table mdph_adult_request 
       add constraint FKB0266E9A99FF2501 
       foreign key (situation_professionnelle_conjoint_autre_id) 
       references mar_situation_professionnelle_autre;

   alter table mdph_adult_request 
       add constraint FKB0266E9AF5443B12 
       foreign key (situation_professionnelle_vous_salarie_id) 
       references mar_situation_professionnelle_salarie;

   alter table mdph_adult_request 
       add constraint FKB0266E9A10E64941 
       foreign key (situation_professionnelle_conjoint_stagiaire_id) 
       references mar_situation_professionnelle_stagiaire;

   alter table mdph_adult_request 
       add constraint FKB0266E9AFDD4D637 
       foreign key (precision_preferences_etablissement_ou_service_id) 
       references mar_preference_etablissement_ou_service_scolaire;

   alter table mdph_adult_request 
       add constraint FKB0266E9A6F6E0F42 
       foreign key (situation_professionnelle_vous_retraite_id) 
       references mar_situation_professionnelle_retraite;

   alter table mdph_adult_request 
       add constraint FKB0266E9AD52FB460 
       foreign key (precedent_dossier_mdph_id) 
       references mar_precedent_dossier_mdph;

   alter table mdph_adult_request 
       add constraint FKB0266E9AD596CF96 
       foreign key (precision_preference_etablissement_ou_service_id) 
       references mar_precision_preference_etablissement_ou_service;

   alter table mdph_adult_request 
       add constraint FKB0266E9A36B07BF3 
       foreign key (situation_professionnelle_conjoint_retraite_id) 
       references mar_situation_professionnelle_retraite;

   alter table mdph_adult_request 
       add constraint FKB0266E9A845CF77C 
       foreign key (domiciliation_organisme_payeur_id) 
       references address;

   alter table mdph_adult_request 
       add constraint FKB0266E9A19686137 
       foreign key (domiciliation_aidant_id) 
       references address;

   alter table mdph_adult_request 
       add constraint FKB0266E9AA9E7FEA5 
       foreign key (lieu_naissance_sujet_id) 
       references mar_birth_place;

   alter table mdph_adult_request 
       add constraint FKB0266E9A26F87B5D 
       foreign key (identite_conjoint_id) 
       references mar_conjoint_identite;

   alter table mdph_adult_request 
       add constraint FKB0266E9A5ABFDF4 
       foreign key (domiciliation_etablissement_id) 
       references address;

   alter table mdph_adult_request 
       add constraint FKB0266E9AEFDB1FD2 
       foreign key (situation_professionnelle_vous_stagiaire_id) 
       references mar_situation_professionnelle_stagiaire;

   alter table mdph_adult_request 
       add constraint FKB0266E9ACDADA1AA 
       foreign key (situation_professionnelle_conjoint_non_salarie_id) 
       references mar_situation_professionnelle_non_salarie;

   alter table mdph_adult_request 
       add constraint FKB0266E9A3CE43CFE 
       foreign key (situation_professionnelle_conjoint_demandeur_emploi_id) 
       references mar_situation_professionnelle_demandeur_emploi;

   alter table mdph_adult_request 
       add constraint FKB0266E9A757D114D 
       foreign key (situation_professionnelle_vous_demandeur_emploi_id) 
       references mar_situation_professionnelle_demandeur_emploi;

   alter table mdph_adult_request 
       add constraint FKB0266E9A9898F441 
       foreign key (situation_professionnelle_conjoint_salarie_id) 
       references mar_situation_professionnelle_salarie;

   alter table mdph_adult_request 
       add constraint FKB0266E9AC2C717FB 
       foreign key (situation_professionnelle_vous_non_salarie_id) 
       references mar_situation_professionnelle_non_salarie;

   alter table mdph_adult_request 
       add constraint FKB0266E9A5F568781 
       foreign key (situation_professionnelle_vous_beneficiaire_pension_id) 
       references mar_situation_professionnelle_beneficiaire_pension;

   alter table mdph_adult_request 
       add constraint FKB0266E9A64C05EEE 
       foreign key (besoins_demande_p_c_h_id) 
       references mar_besoins_demande_pch;

   alter table mdph_adult_request 
       add constraint FKB0266E9A82EE72B2 
       foreign key (situation_professionnelle_conjoint_beneficiaire_pension_id) 
       references mar_situation_professionnelle_beneficiaire_pension;

   alter table mdph_youth_request 
       add constraint FK10277AB35992B22A 
       foreign key (situation_professionnelle_vous_autre_id) 
       references myr_situation_professionnelle_autre;

   alter table mdph_youth_request 
       add constraint FK10277AB38FD1EB19 
       foreign key (situation_professionnelle_conjoint_autre_id) 
       references myr_situation_professionnelle_autre;

   alter table mdph_youth_request 
       add constraint FK10277AB3BF6C0D9B 
       foreign key (autorite_parentale_mere_id) 
       references myr_autorite_parentale;

   alter table mdph_youth_request 
       add constraint FK10277AB3C17DDB2A 
       foreign key (situation_professionnelle_vous_salarie_id) 
       references myr_situation_professionnelle_salarie;

   alter table mdph_youth_request 
       add constraint FK10277AB3B5384359 
       foreign key (situation_professionnelle_conjoint_stagiaire_id) 
       references myr_situation_professionnelle_stagiaire;

   alter table mdph_youth_request 
       add constraint FK10277AB3AF51D11F 
       foreign key (precision_preferences_etablissement_ou_service_id) 
       references myr_preference_etablissement_ou_service_scolaire;

   alter table mdph_youth_request 
       add constraint FK10277AB32A68722A 
       foreign key (situation_professionnelle_vous_retraite_id) 
       references myr_situation_professionnelle_retraite;

   alter table mdph_youth_request 
       add constraint FK10277AB371B93348 
       foreign key (precedent_dossier_mdph_id) 
       references myr_precedent_dossier_mdph;

   alter table mdph_youth_request 
       add constraint FK10277AB3F1AADEDB 
       foreign key (situation_professionnelle_conjoint_retraite_id) 
       references myr_situation_professionnelle_retraite;

   alter table mdph_youth_request 
       add constraint FK10277AB3845CF77C 
       foreign key (domiciliation_organisme_payeur_id) 
       references address;

   alter table mdph_youth_request 
       add constraint FK10277AB32A10DA0F 
       foreign key (presence_personne_aupres_enfant_id) 
       references myr_presence_personne_aupres_enfant;

   alter table mdph_youth_request 
       add constraint FK10277AB3628F7F8D 
       foreign key (lieu_naissance_sujet_id) 
       references myr_birth_place;

   alter table mdph_youth_request 
       add constraint FK10277AB394A5AE45 
       foreign key (identite_conjoint_id) 
       references myr_conjoint_identite;

   alter table mdph_youth_request 
       add constraint FK10277AB35ABFDF4 
       foreign key (domiciliation_etablissement_id) 
       references address;

   alter table mdph_youth_request 
       add constraint FK10277AB37DCFA968 
       foreign key (information_autre_deteneur_autorite_parentale_id) 
       references myr_autorite_parentale_autre;

   alter table mdph_youth_request 
       add constraint FK10277AB3942D19EA 
       foreign key (situation_professionnelle_vous_stagiaire_id) 
       references myr_situation_professionnelle_stagiaire;

   alter table mdph_youth_request 
       add constraint FK10277AB3B39AEA92 
       foreign key (situation_professionnelle_conjoint_non_salarie_id) 
       references myr_situation_professionnelle_non_salarie;

   alter table mdph_youth_request 
       add constraint FK10277AB36BE84516 
       foreign key (situation_professionnelle_conjoint_demandeur_emploi_id) 
       references myr_situation_professionnelle_demandeur_emploi;

   alter table mdph_youth_request 
       add constraint FK10277AB3A4811965 
       foreign key (situation_professionnelle_vous_demandeur_emploi_id) 
       references myr_situation_professionnelle_demandeur_emploi;

   alter table mdph_youth_request 
       add constraint FK10277AB364D29459 
       foreign key (situation_professionnelle_conjoint_salarie_id) 
       references myr_situation_professionnelle_salarie;

   alter table mdph_youth_request 
       add constraint FK10277AB35E1EBF5E 
       foreign key (autorite_parentale_pere_id) 
       references myr_autorite_parentale;

   alter table mdph_youth_request 
       add constraint FK10277AB3A8B460E3 
       foreign key (situation_professionnelle_vous_non_salarie_id) 
       references myr_situation_professionnelle_non_salarie;

   alter table mdph_youth_request 
       add constraint FK10277AB3DE68C399 
       foreign key (situation_professionnelle_vous_beneficiaire_pension_id) 
       references myr_situation_professionnelle_beneficiaire_pension;

   alter table mdph_youth_request 
       add constraint FK10277AB3ACB98906 
       foreign key (besoins_demande_p_c_h_id) 
       references myr_besoins_demande_pch;

   alter table mdph_youth_request 
       add constraint FK10277AB3200AECA 
       foreign key (situation_professionnelle_conjoint_beneficiaire_pension_id) 
       references myr_situation_professionnelle_beneficiaire_pension;

   alter table myr_autorite_parentale 
       add constraint FKFE8F9821725D4DCB 
       foreign key (domiciliation_id) 
       references address;

   alter table myr_autorite_parentale_autre 
       add constraint FKC3D57755725D4DCB 
       foreign key (domiciliation_id) 
       references address;

   alter table myr_frais_supp_lies_handicap 
       add constraint FKBB377E08E1F81DAC 
       foreign key (mdph_youth_request_id) 
       references mdph_youth_request;

   alter table myr_situation_professionnelle_stagiaire 
       add constraint FK16C3DA3662A75AD3 
       foreign key (adresse_employeur_stage_id) 
       references address;

 
 alter table marriage_information alter column marriage_postal_code type  varchar(255);
 alter table birth_details_request alter column birth_postal_code type varchar(255);
 alter table death_details_request alter column death_postal_code type varchar(255);
 alter table myr_precedent_dossier_mdph alter column departement_mdph type varchar(255);
 alter table mar_precedent_dossier_mdph alter column departement_mdph type varchar(255);

alter table domestic_help_request add column dhr_request_kind varchar(255);
update domestic_help_request set dhr_request_kind = (select dhr_spouse.dhr_request_kind from dhr_spouse, domestic_help_request  where domestic_help_request.dhr_spouse_id = dhr_spouse.id LIMIT 1);
alter table dhr_spouse drop column dhr_request_kind;

alter table remote_support_request add column request_information_request_kind varchar(255);
update remote_support_request set request_information_request_kind = (select rsr_request_information.request_information_request_kind from rsr_request_information, remote_support_request where remote_support_request.request_information_id = rsr_request_information.id LIMIT 1);
alter table rsr_request_information drop column request_information_request_kind;

/* Migration local complex type for HSR */
create table hsr_other_contact (
    id int8 not null,
    other_contact_address_id int8,
    other_contact_first_name varchar(38),
    other_contact_phone varchar(10),
    other_contact_last_name varchar(38),
    primary key (id)
);

alter table hsr_other_contact 
    add constraint FK7F7D3879E2AF3D30
    foreign key (other_contact_address_id) 
    references address;

alter table holiday_security_request add column other_contact_informations_id int8;

alter table holiday_security_request 
    add constraint FKED34C597F8DE1C66 
    foreign key (other_contact_informations_id) 
    references hsr_other_contact;

alter table holiday_security_request drop constraint FKED34C597E2AF3D30;

CREATE FUNCTION migrate_holiday_security_request() RETURNS void AS $$
    DECLARE
        hsr RECORD;
    BEGIN
        FOR hsr IN SELECT * FROM holiday_security_request LOOP
            INSERT INTO hsr_other_contact
                (id,
                other_contact_address_id,
                other_contact_first_name,
                other_contact_phone,
		other_contact_last_name)
                VALUES
                    (nextval('hibernate_sequence'),
                    hsr.other_contact_address_id,
                    hsr.other_contact_first_name,
                    hsr.other_contact_phone,
		    hsr.other_contact_last_name);
                     
            UPDATE holiday_security_request
            SET (other_contact_informations_id) =
                    ((SELECT id FROM hsr_other_contact ORDER BY id DESC LIMIT 1))
                    WHERE id =hsr.id;
         END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_holiday_security_request();
DROP FUNCTION migrate_holiday_security_request();

alter table holiday_security_request drop column other_contact_address_id;
alter table holiday_security_request drop column other_contact_first_name;
alter table holiday_security_request drop column other_contact_phone;
alter table holiday_security_request drop column other_contact_last_name;




/* Migration de DayCareCenterRegistration */

alter table day_care_center_registration_request add column telephone varchar(10);
alter table day_care_center_registration_request add column plage_horaire_accueil_reguliere_id int8;

alter table day_care_center_registration_request add column information_mere_id int8;
alter table day_care_center_registration_request add column information_pere_id int8;
alter table day_care_center_registration_request add column date_placement_accueil_regulier_id int8;
alter table day_care_center_registration_request add column lundi_id int8;
alter table day_care_center_registration_request add column mardi_id int8;
alter table day_care_center_registration_request add column mercredi_id int8;
alter table day_care_center_registration_request add column jeudi_id int8;
alter table day_care_center_registration_request add column vendredi_id int8;


alter table day_care_center_registration_request 
    drop constraint FKB69A86C8E44A3DDE;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C88C770038;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C863DC3BFC;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C840BC8382;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C87633B81C;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C87F7602B8;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C8C2F0B57C;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C8A20874A2;

alter table day_care_center_registration_request 
    drop constraint FKB69A86C8CC1ABED4;

drop table if exists dccrr_dates_placement;
drop table if exists dccrr_mere;
drop table if exists dccrr_pere;
drop table if exists dccrr_plage_horaire;
drop table if exists dccrr_plage_horaire_jeudi;
drop table if exists dccrr_plage_horaire_lundi;
drop table if exists dccrr_plage_horaire_mardi;
drop table if exists dccrr_plage_horaire_mercredi;
drop table if exists dccrr_plage_horaire_vendredi;


create table dccrr_dates_placement (
    id int8 not null,
    choix_type_date_placement_accueil_regulier varchar(255),
    date_placement_debut timestamp,
    primary key (id)
);

create table dccrr_mere (
    id int8 not null,
    commune_lieu_travail_mere varchar(255),
    est_horaires_reguliers_mere bool,
    horaires_reguliers_mere varchar(255),
    horaires_travail_jeudi_mere varchar(255),
    horaires_travail_lundi_mere varchar(255),
    horaires_travail_mardi_mere varchar(255),
    horaires_travail_mercredi_mere varchar(255),
    horaires_travail_vendredi_mere varchar(255),
    precision_autre_situation_actuelle_mere varchar(255),
    profession_mere varchar(255),
    situation_actuelle_mere varchar(255),
    primary key (id)
);

create table dccrr_pere (
    id int8 not null,
    commune_lieu_travail_pere varchar(255),
    est_horaires_reguliers_pere bool,
    horaires_reguliers_pere varchar(255),
    horaires_travail_jeudi_pere varchar(255),
    horaires_travail_lundi_pere varchar(255),
    horaires_travail_mardi_pere varchar(255),
    horaires_travail_mercredi_pere varchar(255),
    horaires_travail_vendredi_pere varchar(255),
    precision_autre_situation_actuelle_pere varchar(255),
    profession_pere varchar(255),
    situation_actuelle_pere varchar(255),
    primary key (id)
);

create table dccrr_plage_horaire (
    id int8 not null,
    horaire_placement_apres_midi_debut bytea,
    horaire_placement_apres_midi_fin bytea,
    horaire_placement_matin_debut bytea,
    horaire_placement_matin_fin bytea,
    primary key (id)
);

create table dccrr_plage_horaire_jeudi (
    id int8 not null,
    horaire_placement_apres_midi_debut_jeudi bytea,
    horaire_placement_apres_midi_fin_jeudi bytea,
    horaire_placement_matin_debut_jeudi bytea,
    horaire_placement_matin_fin_jeudi bytea,
    primary key (id)
);

create table dccrr_plage_horaire_lundi (
    id int8 not null,
    horaire_placement_apres_midi_debut_lundi bytea,
    horaire_placement_apres_midi_fin_lundi bytea,
    horaire_placement_matin_debut_lundi bytea,
    horaire_placement_matin_fin_lundi bytea,
    primary key (id)
);

create table dccrr_plage_horaire_mardi (
    id int8 not null,
    horaire_placement_apres_midi_debut_mardi bytea,
    horaire_placement_apres_midi_fin_mardi bytea,
    horaire_placement_matin_debut_mardi bytea,
    horaire_placement_matin_fin_mardi bytea,
    primary key (id)
);

create table dccrr_plage_horaire_mercredi (
    id int8 not null,
    horaire_placement_apres_midi_debut_mercredi bytea,
    horaire_placement_apres_midi_fin_mercredi bytea,
    horaire_placement_matin_debut_mercredi bytea,
    horaire_placement_matin_fin_mercredi bytea,
    primary key (id)
);

create table dccrr_plage_horaire_vendredi (
    id int8 not null,
    horaire_placement_apres_midi_debut_vendredi bytea,
    horaire_placement_apres_midi_fin_vendredi bytea,
    horaire_placement_matin_debut_vendredi bytea,
    horaire_placement_matin_fin_vendredi bytea,
    primary key (id)
);



alter table day_care_center_registration_request 
    add constraint FKB69A86C8E44A3DDE 
    foreign key (plage_horaire_accueil_reguliere_id) 
    references dccrr_plage_horaire;

alter table day_care_center_registration_request 
    add constraint FKB69A86C88C770038 
    foreign key (mercredi_id) 
    references dccrr_plage_horaire_mercredi;

alter table day_care_center_registration_request 
    add constraint FKB69A86C863DC3BFC 
    foreign key (jeudi_id) 
    references dccrr_plage_horaire_jeudi;

alter table day_care_center_registration_request 
    add constraint FKB69A86C840BC8382 
    foreign key (information_pere_id) 
    references dccrr_pere;

alter table day_care_center_registration_request 
    add constraint FKB69A86C87633B81C 
    foreign key (lundi_id) 
    references dccrr_plage_horaire_lundi;

alter table day_care_center_registration_request 
    add constraint FKB69A86C87F7602B8 
    foreign key (vendredi_id) 
    references dccrr_plage_horaire_vendredi;

alter table day_care_center_registration_request 
    add constraint FKB69A86C8C2F0B57C 
    foreign key (mardi_id) 
    references dccrr_plage_horaire_mardi;

alter table day_care_center_registration_request 
    add constraint FKB69A86C8A20874A2 
    foreign key (information_mere_id) 
    references dccrr_mere;

alter table day_care_center_registration_request 
    add constraint FKB69A86C8CC1ABED4 
    foreign key (date_placement_accueil_regulier_id) 
    references dccrr_dates_placement;


CREATE FUNCTION migrate_day_care_center_registration_request() RETURNS void AS $$
    DECLARE
        dccrr RECORD;
    BEGIN
        FOR dccrr IN SELECT * FROM day_care_center_registration_request LOOP
            INSERT INTO dccrr_dates_placement
                (id,
                choix_type_date_placement_accueil_regulier,
                date_placement_debut)
                VALUES
                    (nextval('hibernate_sequence'),
                    dccrr.choix_type_date_placement_accueil_regulier,
                    dccrr.date_placement_debut);

            INSERT INTO dccrr_mere
                (id,
                horaires_reguliers_mere,
                est_horaires_reguliers_mere,
                horaires_travail_lundi_mere,
                horaires_travail_mardi_mere,
                horaires_travail_mercredi_mere,
                horaires_travail_jeudi_mere,
                horaires_travail_vendredi_mere,
                profession_mere,
                situation_actuelle_mere,
                commune_lieu_travail_mere,
                precision_autre_situation_actuelle_mere)
                VALUES
                    (nextval('hibernate_sequence'),
                      dccrr.horaires_reguliers_mere,
                      dccrr.est_horaires_reguliers_mere,
                      dccrr.horaires_travail_lundi_mere,
                      dccrr.horaires_travail_mardi_mere,
                      dccrr.horaires_travail_mercredi_mere,
                      dccrr.horaires_travail_jeudi_mere,
                      dccrr.horaires_travail_vendredi_mere,
                      dccrr.profession_mere,
                      dccrr.situation_actuelle_mere,
                      dccrr.commune_lieu_travail_mere,
                      dccrr.precision_autre_situation_actuelle_mere
                  );
            INSERT INTO dccrr_pere
                (id,
                horaires_reguliers_pere,
                est_horaires_reguliers_pere,
                horaires_travail_lundi_pere,
                horaires_travail_mardi_pere,
                horaires_travail_mercredi_pere,
                horaires_travail_jeudi_pere,
                horaires_travail_vendredi_pere,
                profession_pere,
                situation_actuelle_pere,
                commune_lieu_travail_pere,
                precision_autre_situation_actuelle_pere)
                VALUES
                    (nextval('hibernate_sequence'),
                      dccrr.horaires_reguliers_pere,
                      dccrr.est_horaires_reguliers_pere,
                      dccrr.horaires_travail_lundi_pere,
                      dccrr.horaires_travail_mardi_pere,
                      dccrr.horaires_travail_mercredi_pere,
                      dccrr.horaires_travail_jeudi_pere,
                      dccrr.horaires_travail_vendredi_pere,
                      dccrr.profession_pere,
                      dccrr.situation_actuelle_pere,
                      dccrr.commune_lieu_travail_pere,
                      dccrr.precision_autre_situation_actuelle_pere
                  );

            INSERT INTO dccrr_plage_horaire_lundi
            (id,
              horaire_placement_matin_debut_lundi,
              horaire_placement_matin_fin_lundi,
              horaire_placement_apres_midi_debut_lundi,
              horaire_placement_apres_midi_fin_lundi)
            VALUES
            (nextval('hibernate_sequence'),
              dccrr.horaire_placement_matin_debut_lundi,
              dccrr.horaire_placement_matin_fin_lundi,
              dccrr.horaire_placement_apres_midi_debut_lundi,
              dccrr.horaire_placement_apres_midi_fin_lundi);


            INSERT INTO dccrr_plage_horaire_mardi
            (id,
              horaire_placement_matin_debut_mardi,
              horaire_placement_matin_fin_mardi,
              horaire_placement_apres_midi_debut_mardi,
              horaire_placement_apres_midi_fin_mardi)
            VALUES
            (nextval('hibernate_sequence'),
              dccrr.horaire_placement_matin_debut_mardi,
              dccrr.horaire_placement_matin_fin_mardi,
              dccrr.horaire_placement_apres_midi_debut_mardi,
              dccrr.horaire_placement_apres_midi_fin_mardi);


            INSERT INTO dccrr_plage_horaire_mercredi
            (id,
              horaire_placement_matin_debut_mercredi,
              horaire_placement_matin_fin_mercredi,
              horaire_placement_apres_midi_debut_mercredi,
              horaire_placement_apres_midi_fin_mercredi)
            VALUES
            (nextval('hibernate_sequence'),
              dccrr.horaire_placement_matin_debut_mercredi,
              dccrr.horaire_placement_matin_fin_mercredi,
              dccrr.horaire_placement_apres_midi_debut_mercredi,
              dccrr.horaire_placement_apres_midi_fin_mercredi);


            INSERT INTO dccrr_plage_horaire_jeudi
            (id,
              horaire_placement_matin_debut_jeudi,
              horaire_placement_matin_fin_jeudi,
              horaire_placement_apres_midi_debut_jeudi,
              horaire_placement_apres_midi_fin_jeudi)
            VALUES
            (nextval('hibernate_sequence'),
              dccrr.horaire_placement_matin_debut_jeudi,
              dccrr.horaire_placement_matin_fin_jeudi,
              dccrr.horaire_placement_apres_midi_debut_jeudi,
              dccrr.horaire_placement_apres_midi_fin_jeudi);


            INSERT INTO dccrr_plage_horaire_vendredi
            (id,
              horaire_placement_matin_debut_vendredi,
              horaire_placement_matin_fin_vendredi,
              horaire_placement_apres_midi_debut_vendredi,
              horaire_placement_apres_midi_fin_vendredi)
            VALUES
            (nextval('hibernate_sequence'),
              dccrr.horaire_placement_matin_debut_vendredi,
              dccrr.horaire_placement_matin_fin_vendredi,
              dccrr.horaire_placement_apres_midi_debut_vendredi,
              dccrr.horaire_placement_apres_midi_fin_vendredi);


            UPDATE day_care_center_registration_request
                SET (date_placement_accueil_regulier_id,
                information_mere_id,
                information_pere_id,
                lundi_id,
                mardi_id,
                mercredi_id,
                jeudi_id,
                vendredi_id) =
                ((SELECT id FROM dccrr_dates_placement ORDER BY id DESC LIMIT 1),
                (SELECT id FROM dccrr_mere ORDER BY id DESC LIMIT 1),
                (SELECT id FROM dccrr_pere ORDER BY id DESC LIMIT 1),
                (SELECT id FROM dccrr_plage_horaire_lundi ORDER BY id DESC LIMIT 1),
                (SELECT id FROM dccrr_plage_horaire_mardi ORDER BY id DESC LIMIT 1),
                (SELECT id FROM dccrr_plage_horaire_mercredi ORDER BY id DESC LIMIT 1),
                (SELECT id FROM dccrr_plage_horaire_jeudi ORDER BY id DESC LIMIT 1),
                (SELECT id FROM dccrr_plage_horaire_vendredi ORDER BY id DESC LIMIT 1))
              WHERE id=dccrr.id;
         END LOOP;
    RETURN;
    END;
$$ LANGUAGE plpgsql;

SELECT migrate_day_care_center_registration_request();
DROP FUNCTION migrate_day_care_center_registration_request();

alter table day_care_center_registration_request drop column choix_type_date_placement_accueil_regulier;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_debut_mardi;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_debut_mercredi;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_debut_vendredi;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_fin;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_fin_jeudi;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_fin_mardi;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_fin_mercredi;
alter table day_care_center_registration_request drop column horaire_placement_apres_midi_fin_vendredi;
alter table day_care_center_registration_request drop column horaire_placement_matin_debut;
alter table day_care_center_registration_request drop column horaire_placement_matin_debut_jeudi;
alter table day_care_center_registration_request drop column horaire_placement_matin_debut_lundi;
alter table day_care_center_registration_request drop column horaire_placement_matin_debut_mardi;
alter table day_care_center_registration_request drop column horaire_placement_matin_debut_mercredi;
alter table day_care_center_registration_request drop column horaire_placement_matin_debut_vendredi;
alter table day_care_center_registration_request drop column horaire_placement_matin_fin;
alter table day_care_center_registration_request drop column horaire_placement_matin_fin_jeudi;
alter table day_care_center_registration_request drop column horaires_reguliers_mere;
alter table day_care_center_registration_request drop column horaires_reguliers_pere;
alter table day_care_center_registration_request drop column horaires_travail_jeudi_mere;
alter table day_care_center_registration_request drop column horaires_travail_jeudi_pere;
alter table day_care_center_registration_request drop column horaires_travail_lundi_mere;
alter table day_care_center_registration_request drop column horaires_travail_lundi_pere;
alter table day_care_center_registration_request drop column horaires_travail_mardi_mere;
alter table day_care_center_registration_request drop column horaires_travail_mardi_pere;
alter table day_care_center_registration_request drop column horaires_travail_mercredi_mere;
alter table day_care_center_registration_request drop column horaires_travail_mercredi_pere;
alter table day_care_center_registration_request drop column horaires_travail_vendredi_mere;
alter table day_care_center_registration_request drop column horaires_travail_vendredi_pere;
--alter table day_care_center_registration_request drop column mode_accueil;
--alter table day_care_center_registration_request drop column mode_accueil_choix_deux;
--alter table day_care_center_registration_request drop column mode_accueil_choix_un;
--alter table day_care_center_registration_request drop column plage_horaire_contact;
alter table day_care_center_registration_request drop column precision_autre_situation_actuelle_mere;
alter table day_care_center_registration_request drop column precision_autre_situation_actuelle_pere;
alter table day_care_center_registration_request drop column profession_mere;
alter table day_care_center_registration_request drop column profession_pere;
alter table day_care_center_registration_request drop column situation_actuelle_mere;
alter table day_care_center_registration_request drop column situation_actuelle_pere;
--alter table day_care_center_registration_request drop column telephone_contact;


/* Migration de GlobalSchoolRegistration */
alter table global_school_registration_request add column ecole_derogation_id int8;
alter table global_school_registration_request add column ecole_secteur_id int8;

alter table global_school_registration_request
  drop constraint FK4566A65831FFB6C1;

alter table global_school_registration_request
  drop constraint FK4566A6588F89CCAE;

drop table if exists ecole_derog;
drop table if exists ecole_secteur;

create table ecole_derog (
    id int8 not null,
    id_ecole_derog varchar(255),
    label_ecole_derog varchar(255),
    primary key (id)
);

create table ecole_secteur (
    id int8 not null,
    id_ecole_secteur varchar(255),
    label_ecole_secteur varchar(255),
    primary key (id)
);

alter table global_school_registration_request
    add constraint FK4566A65831FFB6C1
    foreign key (ecole_derogation_id)
    references ecole_derog;

alter table global_school_registration_request
    add constraint FK4566A6588F89CCAE
    foreign key (ecole_secteur_id)
    references ecole_secteur;



CREATE FUNCTION migrate_global_school_registration_request() RETURNS void AS $$
    DECLARE
        gsrr RECORD;
    BEGIN
        FOR gsrr IN SELECT * FROM global_school_registration_request LOOP
          INSERT INTO ecole_secteur (id,id_ecole_secteur,label_ecole_secteur)
          VALUES (nextval('hibernate_sequence'), gsrr.id_ecole_secteur,gsrr.label_ecole_secteur);

          INSERT INTO ecole_derog (id,id_ecole_derog,label_ecole_derog)
          VALUES (nextval('hibernate_sequence'), gsrr.id_ecole_derog,gsrr.label_ecole_derog);

          UPDATE global_school_registration_request
          SET (ecole_secteur_id, ecole_derogation_id) =
          ((SELECT id FROM ecole_secteur ORDER BY id DESC LIMIT 1),
          (SELECT id FROM ecole_derog ORDER BY id DESC LIMIT 1))
          WHERE id = gsrr.id;
        END LOOP;
    RETURN;
END;
$$ LANGUAGE plpgsql;



SELECT migrate_global_school_registration_request();
DROP FUNCTION migrate_global_school_registration_request();


alter table global_school_registration_request drop column id_ecole_secteur;
alter table global_school_registration_request drop column id_ecole_derog;
alter table global_school_registration_request drop column label_ecole_secteur;
alter table global_school_registration_request drop column label_ecole_derog;

/* Migration de HolidayCampRegistration */

alter table holiday_camp_registration_request add column centre_sejours_id int8;

alter table holiday_camp_registration_request
  drop constraint FK9D0D66E0C812801A;

drop table if exists centre_sejours;

create table centre_sejours (
    id int8 not null,
    id_centre_sejours varchar(255),
    label_centre_sejours varchar(255),
    primary key (id)
);

alter table holiday_camp_registration_request
  add constraint FK9D0D66E0C812801A
  foreign key (centre_sejours_id)
  references centre_sejours;


CREATE FUNCTION migrate_holiday_camp_registration_request() RETURNS void AS $$
    DECLARE
        hcrr RECORD;
    BEGIN
        FOR hcrr IN SELECT * FROM holiday_camp_registration_request LOOP
          INSERT INTO centre_sejours (id,id_centre_sejours,label_centre_sejours)
          VALUES (nextval('hibernate_sequence'), hcrr.id_centre_sejours, hcrr.label_centre_sejours);

          UPDATE holiday_camp_registration_request
          SET centre_sejours_id = (SELECT id FROM centre_sejours ORDER BY id DESC LIMIT 1)
          WHERE id = hcrr.id;
        END LOOP;
    RETURN;
END;
$$ LANGUAGE plpgsql;

SELECT migrate_holiday_camp_registration_request();
DROP FUNCTION migrate_holiday_camp_registration_request();


alter table holiday_camp_registration_request drop column id_centre_sejours;
alter table holiday_camp_registration_request drop column label_centre_sejours;

/* Migration de LeisureCenterRegistration */

alter table leisure_center_registration_request add column centres_loisirs_id int8;
alter table leisure_center_registration_request add column transports_id int8;

alter table leisure_center_registration_request
    drop constraint FK25E6799150A571D;

alter table leisure_center_registration_request
    drop constraint FK25E6799FCB630A3;

drop table if exists centre_loisirs;
drop table if exists transports;

create table centre_loisirs (
    id int8 not null,
    id_centre_loisirs varchar(255),
    label_centre_loisirs varchar(255),
    primary key (id)
);

create table transports (
    id int8 not null,
    id_arret varchar(255),
    id_ligne varchar(255),
    label_arret varchar(255),
    label_ligne varchar(255),
    primary key (id)
);

alter table leisure_center_registration_request
    add constraint FK25E6799150A571D
    foreign key (centres_loisirs_id)
    references centre_loisirs;

alter table leisure_center_registration_request
    add constraint FK25E6799FCB630A3
    foreign key (transports_id)
    references transports;

CREATE FUNCTION migrate_leisure_center_registration_request() RETURNS void AS $$
    DECLARE
        lcrr RECORD;
    BEGIN
        FOR lcrr IN SELECT * FROM leisure_center_registration_request LOOP
          INSERT INTO centre_sejours (id, id_centre_loisirs, label_centre_loisirs)
          VALUES (nextval('hibernate_sequence'), lcrr.id_centre_loisirs, lcrr.label_centre_loisirs);

          INSERT INTO transports (id, id_arret, id_ligne, label_arret, label_ligne)
          VALUES (nextval('hibernate_sequence'), lcrr.id_arret, lcrr.id_ligne, lcrr.label_arret, lcrr.label_ligne);

          UPDATE leisure_center_registration_request
          SET (centre_loisirs_id, transports_id) = ((SELECT id FROM centre_sejours ORDER BY id DESC LIMIT 1), (SELECT id FROM transports ORDER BY id DESC LIMIT 1))
          WHERE id = lcrr.id;
        END LOOP;
    RETURN;
END;
$$ LANGUAGE plpgsql;


SELECT migrate_leisure_center_registration_request();
DROP FUNCTION migrate_leisure_center_registration_request();

alter table leisure_center_registration_request drop column id_arret;
alter table leisure_center_registration_request drop column id_centre_loisirs;
alter table leisure_center_registration_request drop column id_ligne;
alter table leisure_center_registration_request drop column label_arret;
alter table leisure_center_registration_request drop column label_centre_loisirs;
alter table leisure_center_registration_request drop column label_ligne;


/* migration de schoolTransportRegistration */


alter table school_transport_registration_request add column ligne_id int8;
alter table school_transport_registration_request add column arret_id int8;
alter table school_transport_registration_request add column frere_ou_soeur_autorise_id int8;

drop table if exists arret;
drop table if exists ligne;

create table arret (
    id int8 not null,
    id_arret varchar(255),
    label_arret varchar(255),
    primary key (id)
);

create table ligne (
    id int8 not null,
    id_ligne varchar(255),
    label_ligne varchar(255),
    primary key (id)
);

create table frere_ou_soeur_informations (
    id int8 not null,
    frere_ou_soeur_classe varchar(255),
    frere_ou_soeur_ecole varchar(255),
    frere_ou_soeur_nom varchar(38),
    frere_ou_soeur_prenom varchar(38),
    primary key (id)
);

alter table school_transport_registration_request
    add constraint FK7B1CA68A7F32DAF1
    foreign key (arret_id)
    references arret;

alter table school_transport_registration_request
    add constraint FK7B1CA68A8112951
    foreign key (ligne_id)
    references ligne;

alter table school_transport_registration_request
    add constraint FK7B1CA68AF6C2D767
    foreign key (frere_ou_soeur_autorise_id)
    references frere_ou_soeur_informations;

CREATE FUNCTION migrate_school_transport_registration_request() RETURNS void AS $$
    DECLARE
        strr RECORD;
    BEGIN
        FOR strr IN SELECT * FROM school_transport_registration_request LOOP
          INSERT INTO arret (id, id_arret, label_arret)
          VALUES (nextval('hibernate_sequence'), strr.id_arret, strr.label_arret);

          INSERT INTO ligne (id, id_ligne, label_ligne)
          VALUES (nextval('hibernate_sequence'), strr.id_ligne, strr.label_ligne);

          INSERT INTO frere_ou_soeur_informations (id, frere_ou_soeur_classe, frere_ou_soeur_ecole, frere_ou_soeur_nom, frere_ou_soeur_prenom)
          VALUES (nextval('hibernate_sequence'), strr.frere_ou_soeur_classe, strr.frere_ou_soeur_ecole, strr.frere_ou_soeur_nom, strr.frere_ou_soeur_prenom);

          UPDATE school_transport_registration_request
          SET (arret_id, ligne_id, frere_ou_soeur_autorise_id) = ((SELECT id FROM arret ORDER BY id DESC LIMIT 1), (SELECT id FROM ligne ORDER BY id DESC LIMIT 1), (SELECT id FROM frere_ou_soeur_informations ORDER BY id DESC LIMIT 1))
          WHERE id = strr.id;
        END LOOP;
    RETURN;
END;
$$ LANGUAGE plpgsql;


alter table school_transport_registration_request drop column id_arret;
alter table school_transport_registration_request drop column id_ligne;
alter table school_transport_registration_request drop column label_arret;
alter table school_transport_registration_request drop column label_ligne;
alter table school_transport_registration_request drop column frere_ou_soeur_classe;
alter table school_transport_registration_request drop column frere_ou_soeur_ecole;
alter table school_transport_registration_request drop column frere_ou_soeur_nom;
alter table school_transport_registration_request drop column frere_ou_soeur_prenom;

/* migration de sportAssociationGrant */


alter table sports_associations_grant_request add column contacts_association_id int8;
alter table sports_associations_grant_request add column numeros_association_id int8;
alter table sports_associations_grant_request add column precision_president_id int8;
alter table sports_associations_grant_request add column subvention_publique_fonctionnement_id int8;
alter table sports_associations_grant_request add column identifiant_e_demande_association  varchar(255);

alter table sagr_activite_association add column somme_sollicitee_activite numeric(19, 2);
alter table sagr_activite_association add column identifiant_e_demande_activite varchar(255);

drop table if exists sagr_numeros_association;
drop table if exists sagr_precision_president;
drop table if exists sagr_subvention_publique_fonctionnement;
drop table if exists sagr_contacts_association;

CREATE TABLE sagr_numeros_association (
    id int8 not null,
    numero_enregistrement_prefecture_association varchar(9),
    numero_siret_association varchar(14),
    primary key (id)
);

CREATE TABLE sagr_precision_president(
    id int8 not null,
    email_president varchar(255),
    nom_president varchar(38),
    prenom_president varchar(38),
    telephone_president varchar(10),
    primary key (id)
);

CREATE TABLE sagr_subvention_publique_fonctionnement (
    id int8 not null,
    budget_saison_ecoulee_depenses varchar(255),
    budget_saison_ecoulee_recette varchar(255),
    commune_annee_n varchar(255),
    commune_annee_n_plus_un varchar(255),
    nombre_licencie_moins_dix_huit_saison_ecoulee varchar(255),
    nombre_licencie_plus_dix_huit_saison_ecoulee varchar(255),
    primary key (id)
);

CREATE TABLE sagr_contacts_association (
    id int8 not null,
    email_club_ou_correspondant varchar(255),
    est_adresse_correspondant_principal bool,
    nom_complet_correspondant_principal varchar(255),
    adresse_correspondant_principal_id int8,
    primary key (id)
);

alter table sports_associations_grant_request
    drop constraint fkb93535bf6aeb0adf;

alter table sports_associations_grant_request
    add constraint FKB93535BF340B8454
    foreign key (numeros_association_id)
    references sagr_numeros_association;

alter table sports_associations_grant_request
    add constraint FKB93535BF4180BA26
    Foreign key (precision_president_id)
    references sagr_precision_president;

alter table sports_associations_grant_request
    add constraint FKB93535BF70548191
    foreign key (subvention_publique_fonctionnement_id)
    references sagr_subvention_publique_fonctionnement;

alter table sports_associations_grant_request
    add constraint FKB93535BF7AA4092A
    foreign key (contacts_association_id)
    references sagr_contacts_association;

CREATE FUNCTION migrate_sports_associations_grant_request() RETURNS void AS $$
    DECLARE
        sagr RECORD;
    BEGIN
        FOR sagr IN SELECT * FROM sports_associations_grant_request LOOP
          INSERT INTO sagr_numeros_association(id, numero_enregistrement_prefecture_association, numero_siret_association)
          VALUES (nextval('hibernate_sequence'), sagr.numero_enregistrement_prefecture_association, sagr.numero_siret_association);

          INSERT INTO sagr_precision_president(id, email_president, nom_president, prenom_president, telephone_president)
          VALUES (nextval('hibernate_sequence'), sagr.email_president, sagr.nom_president, sagr.prenom_president, sagr.telephone_president);

          INSERT INTO sagr_subvention_publique_fonctionnement (id, budget_saison_ecoulee_depenses , budget_saison_ecoulee_recette , commune_annee_n , commune_annee_n_plus_un , nombre_licencie_moins_dix_huit_saison_ecoulee , nombre_licencie_plus_dix_huit_saison_ecoulee)
          VALUES (nextval('hibernate_sequence'), sagr.budget_saison_ecoulee_depenses , sagr.budget_saison_ecoulee_recette , sagr.commune_annee_n , sagr.commune_annee_n_plus_un , sagr.nombre_licencie_moins_dix_huit_saison_ecoulee , sagr.nombre_licencie_plus_dix_huit_saison_ecoulee);

          INSERT INTO sagr_contacts_association(id, email_club_ou_correspondant , est_adresse_correspondant_principal , nom_complet_correspondant_principal , adresse_correspondant_principal_id)
          VALUES (nextval('hibernate_sequence'), sagr.email_club_ou_correspondant , sagr.est_adresse_correspondant_principal , sagr.nom_complet_correspondant_principal , sagr.adresse_correspondant_principal_id);

        UPDATE sports_associations_grant_request
          SET (contacts_association_id, numeros_association_id, precision_president_id, subvention_publique_fonctionnement_id) = (
            (SELECT id FROM sagr_contacts_association ORDER BY id DESC LIMIT 1), (SELECT id FROM sagr_numeros_association ORDER BY id DESC LIMIT 1), (SELECT id FROM sagr_precision_president ORDER BY id DESC LIMIT 1), (SELECT id FROM sagr_subvention_publique_fonctionnement ORDER BY id DESC LIMIT 1))
          WHERE id = sagr.id;
        END LOOP;
    RETURN;
END;
$$ LANGUAGE plpgsql;

SELECT migrate_sports_associations_grant_request();
DROP FUNCTION migrate_sports_associations_grant_request();

alter table sports_associations_grant_request drop column budget_saison_ecoulee_depenses;
alter table sports_associations_grant_request drop column budget_saison_ecoulee_recette;
alter table sports_associations_grant_request drop column commune_annee_n;
alter table sports_associations_grant_request drop column commune_annee_n_plus_un;
alter table sports_associations_grant_request drop column email_club_ou_correspondant;
alter table sports_associations_grant_request drop column email_president;
alter table sports_associations_grant_request drop column est_adresse_correspondant_principal;
alter table sports_associations_grant_request drop column nom_complet_correspondant_principal;
alter table sports_associations_grant_request drop column nom_president;
alter table sports_associations_grant_request drop column nombre_licencie_moins_dix_huit_saison_ecoulee;
alter table sports_associations_grant_request drop column nombre_licencie_plus_dix_huit_saison_ecoulee;
alter table sports_associations_grant_request drop column numero_enregistrement_prefecture_association;
alter table sports_associations_grant_request drop column numero_siret_association;
alter table sports_associations_grant_request drop column prenom_president;
alter table sports_associations_grant_request drop column telephone_president;
alter table sports_associations_grant_request drop column adresse_correspondant_principal_id;


/* migration de standardElectoralRollRegistration */

alter table standard_electoral_roll_registration_request add column fieldset_est_union_europeenne_id int8;
alter table standard_electoral_roll_registration_request add column lieu_naissance_id int8;
alter table standard_electoral_roll_registration_request add column precedent_lieu_inscription_id int8;

drop table if exists serrr_fieldset_est_union_europeenne ;
drop table if exists serrr_lieu_naissance;
drop table if exists serrr_precedent_lieu_inscription;

CREATE TABLE serrr_fieldset_est_union_europeenne (
    id int8 not null,
    commune_ou_localite_precedente varchar(32),
    pays_precedent varchar(255),
    precision_nationalite varchar(255),
    subdivision_administrative_precedente varchar(255),
    type_election varchar(255),
    primary key (id)
);

CREATE TABLE serrr_lieu_naissance (
    id int8 not null,
    lieu_naissance_departement varchar(255),
    lieu_naissance_pays varchar(255),
    ville_naissance_code_postal varchar(32),
    primary key (id)
);

CREATE TABLE serrr_precedent_lieu_inscription (
    id int8 not null,
    ancienne_commune varchar(32),
    departement_ancienne_commune varchar(255),
    primary key (id)
);
/*{{{*/
alter table standard_electoral_roll_registration_request
    add constraint FK4A4584A72928E95C
    foreign key (precedent_lieu_inscription_id)
    references serrr_precedent_lieu_inscription;

alter table standard_electoral_roll_registration_request
    add constraint FK4A4584A7AB51223
    foreign key (lieu_naissance_id)
    references serrr_lieu_naissance;

alter table standard_electoral_roll_registration_request
    add constraint FK4A4584A7DA80AB67
    foreign key (fieldset_est_union_europeenne_id)
    references serrr_fieldset_est_union_europeenne;
/*}}}*/

CREATE FUNCTION migrate_standard_electoral_roll_registration_request() RETURNS void AS $$
    DECLARE
        serrr RECORD;
    BEGIN
        FOR serrr IN SELECT * FROM standard_electoral_roll_registration_request LOOP
          INSERT INTO serrr_fieldset_est_union_europeenne (id, commune_ou_localite_precedente, pays_precedent, precision_nationalite, subdivision_administrative_precedente, type_election)
          VALUES (nextval('hibernate_sequence'), serrr.commune_ou_localite_precedente, serrr.pays_precedent, serrr.precision_nationalite, serrr.subdivision_administrative_precedente, serrr.type_election);

          INSERT INTO serrr_lieu_naissance (id, lieu_naissance_departement, lieu_naissance_pays, ville_naissance_code_postal)
          VALUES (nextval('hibernate_sequence'), serrr.lieu_naissance_departement, serrr.lieu_naissance_pays, serrr.ville_naissance_code_postal);

          INSERT INTO serrr_precedent_lieu_inscription (id, ancienne_commune, departement_ancienne_commune)
          VALUES (nextval('hibernate_sequence'), serrr.ancienne_commune, serrr.departement_ancienne_commune);

        UPDATE sports_associations_grant_request
          SET (fieldset_est_union_europeenne_id, lieu_naissance_id, precedent_lieu_inscription_id) = (
            (SELECT id FROM serrr_fieldset_est_union_europeenne ORDER BY id DESC LIMIT 1), (SELECT id FROM serrr_lieu_naissance ORDER BY id DESC LIMIT 1), (SELECT id FROM serrr_precedent_lieu_inscription ORDER BY id DESC LIMIT 1))
          WHERE id = serrr.id;
        END LOOP;
    RETURN;
END;
$$ LANGUAGE plpgsql;

SELECT migrate_standard_electoral_roll_registration_request();
DROP FUNCTION migrate_standard_electoral_roll_registration_request();

alter table standard_electoral_roll_registration_request drop column ancienne_commune;
alter table standard_electoral_roll_registration_request drop column commune_ou_localite_precedente;
alter table standard_electoral_roll_registration_request drop column departement_ancienne_commune;
alter table standard_electoral_roll_registration_request drop column lieu_naissance_departement;
alter table standard_electoral_roll_registration_request drop column lieu_naissance_pays;
alter table standard_electoral_roll_registration_request drop column pays_precedent;
alter table standard_electoral_roll_registration_request drop column precision_nationalite;
alter table standard_electoral_roll_registration_request drop column subdivision_administrative_precedente;
alter table standard_electoral_roll_registration_request drop column type_election;
alter table standard_electoral_roll_registration_request drop column ville_naissance_code_postal;

