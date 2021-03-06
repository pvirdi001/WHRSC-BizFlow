SET DEFINE OFF;

--STORED PROCEDURE: SP_TRUNC_APPLICANT_NOTIFICATNS
CREATE OR REPLACE PROCEDURE SP_TRUNC_APPLICANT_NOTIFICATNS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_APPLICANT_NOTIFICATIONS Table
	EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_APPLICANT_NOTIFICATIONS';
	EXCEPTION 
		WHEN OTHERS THEN 
			SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_CERTIFICATE_LOCATIONS
CREATE OR REPLACE PROCEDURE SP_TRUNC_CERTIFICATE_LOCATIONS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_CERTIFICATE_LOCATIONS Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_CERTIFICATE_LOCATIONS';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_CERTIFICATES
CREATE OR REPLACE PROCEDURE SP_TRUNC_CERTIFICATES 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_CERTIFICATES Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_CERTIFICATES';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_NEW_HIRE_FORMS
CREATE OR REPLACE PROCEDURE SP_TRUNC_NEW_HIRE_FORMS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_NEW_HIRE_FORMS Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_NEW_HIRE_FORMS';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_NEW_HIRE_ONBRDNG_DOCS
CREATE OR REPLACE PROCEDURE SP_TRUNC_NEW_HIRE_ONBRDNG_DOCS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_NEW_HIRE_ONBOARDING_DOCS Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_NEW_HIRE_ONBOARDING_DOCS';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_NEW_HIRE_TASKS
CREATE OR REPLACE PROCEDURE SP_TRUNC_NEW_HIRE_TASKS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_NEW_HIRE_TASKS Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_NEW_HIRE_TASKS';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_NEW_HIRE_VACNCY_REQ
CREATE OR REPLACE PROCEDURE SP_TRUNC_NEW_HIRE_VACNCY_REQ 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_NEW_HIRE_VACANCY_REQUEST Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_NEW_HIRE_VACANCY_REQUEST';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_NEW_HIRES
CREATE OR REPLACE PROCEDURE SP_TRUNC_NEW_HIRES 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_NEW_HIRES Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_NEW_HIRES';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_PERMISSION_PROFILES
CREATE OR REPLACE PROCEDURE SP_TRUNC_PERMISSION_PROFILES 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_PERMISSION_PROFILES Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_PERMISSION_PROFILES';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_REQUEST_LOCATIONS
CREATE OR REPLACE PROCEDURE SP_TRUNC_REQUEST_LOCATIONS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_REQUEST_LOCATIONS Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_REQUEST_LOCATIONS';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_REQUEST_RATING_COMB
CREATE OR REPLACE PROCEDURE SP_TRUNC_REQUEST_RATING_COMB 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_REQUEST_RATING_COMBINATION Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_REQUEST_RATING_COMBINATION';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_REQUEST_VACNCY_COMB
CREATE OR REPLACE PROCEDURE SP_TRUNC_REQUEST_VACNCY_COMB 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_REQUEST_VACNCY_COMBINATION Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_REQUEST_VACNCY_COMBINATION';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_REQUESTS
CREATE OR REPLACE PROCEDURE SP_TRUNC_REQUESTS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_REQUESTS Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_REQUESTS';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_VACANCY
CREATE OR REPLACE PROCEDURE SP_TRUNC_VACANCY 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_VACANCY Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_VACANCY';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_VACANCY_ELIGIBILITIES
CREATE OR REPLACE PROCEDURE SP_TRUNC_VACANCY_ELIGIBILITIES 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_VACANCY_ELIGIBILITIES Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_VACANCY_ELIGIBILITIES';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_VACANCY_LOCATIONS
CREATE OR REPLACE PROCEDURE SP_TRUNC_VACANCY_LOCATIONS 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_VACANCY_LOCATIONS Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_VACANCY_LOCATIONS';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_VAC_MISSN_CRITCL_OCC
CREATE OR REPLACE PROCEDURE SP_TRUNC_VAC_MISSN_CRITCL_OCC 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_VAC_MISSION_CRITCL_OCCUPTN Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_VAC_MISSION_CRITCL_OCCUPTN';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

--STORED PROCEDURE: SP_TRUNC_VACANCY_RATING_COMB
CREATE OR REPLACE PROCEDURE SP_TRUNC_VACANCY_RATING_COMB 
AS 
BEGIN 
--DESCRIPTION: Truncates the DSS_VACANCY_RATING_COMBINATION Table
  EXECUTE IMMEDIATE 'TRUNCATE TABLE DSS_VACANCY_RATING_COMBINATION';
  EXCEPTION 
    WHEN OTHERS THEN 
      SP_ERROR_LOG(); 
END;
/

