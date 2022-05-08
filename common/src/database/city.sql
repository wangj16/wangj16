-- Table: public.cities

-- DROP TABLE IF EXISTS public.cities;

CREATE TABLE IF NOT EXISTS public.cities
(
    id integer NOT NULL DEFAULT nextval('cities_id_seq'::regclass),
    name character varying(100) COLLATE pg_catalog."default",
    population integer,
    tour_places character varying(300) COLLATE pg_catalog."default",
    country_id integer,
    country_name character varying(80) COLLATE pg_catalog."default",
    provinces character varying(80) COLLATE pg_catalog."default",
    CONSTRAINT cities_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cities
    OWNER to postgres;
    
    
INSERT INTO public.cities (id, name, population, tour_places, country_id, country_name, provinces) VALUES (nextval('cities_id_seq'), 'Mclean', 12000, 'tour address', 38, 'United States', 'VA');





    
    



