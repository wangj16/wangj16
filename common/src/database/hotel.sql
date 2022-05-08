-- Table: public.hotels

-- DROP TABLE public.hotels;

CREATE TABLE public.hotels
(
    id integer NOT NULL DEFAULT nextval('hotels_id_seq'::regclass),
    name character varying(60) COLLATE pg_catalog."default",
    address character varying(120) COLLATE pg_catalog."default",
    province character varying(80) COLLATE pg_catalog."default",
    city_name character varying(50) COLLATE pg_catalog."default",
    country character varying(60) COLLATE pg_catalog."default",
    hotel_id integer,
    rating character varying(210) COLLATE pg_catalog."default",
    CONSTRAINT hotels_pkey PRIMARY KEY (id),
    CONSTRAINT hotels_hotel_id_fkey FOREIGN KEY (hotel_id)
        REFERENCES public.cities (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.hotels
    OWNER to postgres;
       	
    
INSERT INTO public.hotels (id, name, address, province, city_name, country, hotel_id, rating) VALUES (nextval('hotels_id_seq'), 
'Hotel_1', '160 sun street', 'VA', 'Leesburg', 'United States', 1, '5 star');
INSERT INTO public.hotels (id, name, address, province, city_name, country, hotel_id, rating) VALUES (nextval('hotels_id_seq'), 
'Hotel_2', '100 sun street', 'NY', 'Fresh', 'United States', 1, '5 star');
INSERT INTO public.hotels (id, name, address, province, city_name, country, hotel_id, rating) VALUES (nextval('hotels_id_seq'), 
'Hotel_3', '120 MAIN street', 'MA', 'Boston', 'United States', 1, '5 star');


    