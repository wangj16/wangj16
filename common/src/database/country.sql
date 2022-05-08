CREATE TABLE public.country
(
country_id int not null primary key,
country_name varchar(255) not null,
continent varchar(255) 
)
TABLESPACE pg_default;
ALTER TABLE public."country"
    OWNER to postgres;
    
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Burkina Faso',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Burundi',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Cabo Verde',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Cameroon',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Central African Republic',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Chad',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Ethiopia',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Gabon',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Egypt',' Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Kenya','Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Zambia','Africa');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Afghanistan','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Armenia','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Bahrain','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Bangladesh','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'China','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Cambodia','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Israel','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'India','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Iraq','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Lebanon','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Malaysia','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'North Korea','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Singapore','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'South Korea','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Vietnam','Asia');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Turkey','Asia');

INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'United States','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Bahamas','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Belize','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Canada','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Costa Rica','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Cuba','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Dominica','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Dominican Republic','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Jamaica','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Mexico','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Nicaragua','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Panama','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Anguilla','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Aruba','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Bonaire ','North America');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Puerto Rico','North America');

INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Austria','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Bulgaria','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Denmark','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Estonia','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Finland','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'France','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Germany','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Greece','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Hungary','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Iceland','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Ireland','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Italy','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Latvia','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Russia','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Spain','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'Sweden','Europe');
INSERT INTO public.country (country_id, country_name, continent) VALUES (nextval('country_id_seq'), 'United Kingdom','Europe');


