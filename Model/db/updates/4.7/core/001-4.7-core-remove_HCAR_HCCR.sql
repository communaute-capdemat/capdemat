-- Remove hcar and hcrr

alter table handicap_compensation_adult_request
    drop constraint FK73D0EACC2BC49188;

alter table handicap_compensation_adult_request
    drop constraint FK73D0EACCA933FB6F;

alter table handicap_compensation_adult_request
    drop constraint FK73D0EACC2F7F7877;

alter table handicap_compensation_adult_request
    drop constraint FK73D0EACC2AF072D5;

alter table handicap_compensation_adult_request
    drop constraint FK73D0EACC2633BF01;

alter table handicap_compensation_adult_request
    drop constraint FK73D0EACCF813ECA3;

alter table handicap_compensation_adult_request
    drop constraint FK73D0EACC86312376;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2E2BC49188;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2EA933FB6F;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2EE215BDD5;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2E2F7F7877;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2E356CE3FE;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2E2AF072D5;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2E2633BF01;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2EF813ECA3;

alter table handicap_compensation_child_request
    drop constraint FK309E3C2E489D3DBC;

alter table hcar_additional_fee
    drop constraint FKB357C9A17010720F;

alter table hcar_care_service
    drop constraint FKD2D3BA7A7AB5BC78;

alter table hcar_care_service
    drop constraint FKD2D3BA7A7010720F;

alter table hcar_family_assistance_member
    drop constraint FKF63BE3D97010720F;

alter table hcar_family_dependent
    drop constraint FK6E4B5577010720F;

alter table hcar_home_intervenant
    drop constraint FK6294A7D77010720F;

alter table hcar_other_benefit
    drop constraint FKA530B5D57010720F;

alter table hcar_other_folder
    drop constraint FK4681FB707010720F;

alter table hcar_professional
    drop constraint FK581A111AEB2A3B3A;

alter table hcar_professional
    drop constraint FK581A111A7010720F;

alter table hccr_additional_fee
    drop constraint FK54AB85A3A233A8CB;

alter table hccr_care_service
    drop constraint FK868A8EFCA233A8CB;

alter table hccr_care_service
    drop constraint FK868A8EFC7AB5BC78;

alter table hccr_family_assistance_member
    drop constraint FK68DE055BA233A8CB;

alter table hccr_family_dependent
    drop constraint FKA23978D9A233A8CB;

alter table hccr_home_intervenant
    drop constraint FKFDE96B59A233A8CB;

alter table hccr_other_benefit
    drop constraint FK68547193A233A8CB;

alter table hccr_other_folder
    drop constraint FKFA38CFF2A233A8CB;

alter table hccr_professional
    drop constraint FKBD0E59CA233A8CB;

alter table hccr_professional
    drop constraint FKBD0E59CEB2A3B3A;


drop table handicap_compensation_adult_request cascade;

drop table handicap_compensation_child_request cascade;

drop table hcar_additional_fee cascade;

drop table hcar_care_service cascade;

drop table hcar_family_assistance_member cascade;

drop table hcar_family_dependent cascade;

drop table hcar_home_intervenant cascade;

drop table hcar_other_benefit cascade;

drop table hcar_other_folder cascade;

drop table hcar_professional cascade;

drop table hccr_additional_fee cascade;

drop table hccr_care_service cascade;

drop table hccr_family_assistance_member cascade;

drop table hccr_family_dependent cascade;

drop table hccr_home_intervenant cascade;

drop table hccr_other_benefit cascade;

drop table hccr_other_folder cascade;

drop table hccr_professional cascade;

delete from request_action where request_id in (
  select id from request where request_type_id in (
    select id from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child'
  )
);

delete from request_note where request_id in (
  select id from request where request_type_id in (
    select id from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child'
  )
);

delete from request_document where request_id in (
  select id from request where request_type_id in (
    select id from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child'
  )
);

delete from request where request_type_id in (
  select id from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child'
);

delete from requirement where request_type_id in (
  select id from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child'
);

delete from forms where request_type_id in (
  select id from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child'
);

delete from request_season where request_type_id in (
  select id from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child'
);

delete from request_type where label='Handicap Compensation Adult' or label='Handicap Compensation Child';
