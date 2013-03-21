-- Remove uses of "MISS" (and use "MADAM" instead)
UPDATE military_census_request SET child_title = 'MADAM'  Where child_title = 'MISS';
UPDATE study_grant_request SET account_holder_title = 'MADAM'  Where account_holder_title = 'MISS';
UPDATE bafa_grant_request SET account_holder_title = 'MADAM'  Where account_holder_title = 'MISS';
UPDATE domestic_help_request SET dhr_spouse_title = 'MADAM'  Where dhr_spouse_title = 'MISS';
UPDATE handicap_compensation_adult_request SET subject_title = 'MADAM'  Where subject_title = 'MISS';
UPDATE handicap_compensation_child_request SET referent_title = 'MADAM'  Where referent_title = 'MISS';
UPDATE remote_support_request SET spouse_title = 'MADAM'  Where spouse_title = 'MISS';
UPDATE military_census_request SET child_title = 'MADAM'  Where child_title = 'MISS';
