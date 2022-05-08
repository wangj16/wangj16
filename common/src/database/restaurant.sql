-- Table: public.restaurant

-- DROP TABLE public.restaurant;

CREATE TABLE public.restaurant
(
    id integer NOT NULL DEFAULT nextval('restaurant_id_seq'::regclass),
    name character varying(60) COLLATE pg_catalog."default",
    address character varying(120) COLLATE pg_catalog."default",
    post_code character varying(80) COLLATE pg_catalog."default",
    city character varying(50) COLLATE pg_catalog."default",
    country character varying(60) COLLATE pg_catalog."default",
    city_id integer,
    rating character varying(50) COLLATE pg_catalog."default",
    comment character varying(260) COLLATE pg_catalog."default",
    CONSTRAINT restaurant_id_seq PRIMARY KEY (id),
    CONSTRAINT city_id_fkey FOREIGN KEY (city_id)
        REFERENCES public.cities (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.restaurant
    OWNER to postgres;
       	
INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'Chefs able at Brooklyn Fare', '431 West 37th St, New York, NY 10018', '10018-037',
			'New York', 'US', 1, 'Michelin Three Star', 'the food is nice', 'https://www.brooklynfare.com/chefs-table/');

INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'Gravitas', '1401 Okie St NE Washington, D.C. 20002', '10018-037',
			'DC', 'US', 3, 'Michelin Three Star', 'the food is greate', 'http://www.gravitasdc.com/');
			
INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'Afghan Bistros', '1381 BEVERLY ROAD, MCLEAN, VA 22101', '10018-037',
			'McLean', 'US', 2, 'Michelin Three Star', 'the food is greate', 'https://www.aracosiamclean.com/');

INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'L''APPART', '225 Liberty St, New York, NY 10281', '10018-037',
			'New York', 'US', 1, 'Michelin Three Star', 'the food is nice', 'https://www.lappartnyc.com/');

INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'Le Jardinier', '610 LEXINGTON AVENUE GROUND FLOOR NEW YORK, NEW YORK 10022', '10018-037',
			'New York', 'US', 1, 'Michelin Three Star', 'the food is nice', 'https://lejardinier-nyc.com/');

INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'AQUAVIT', '65 EAST 55TH STREET, NEW YORK, NY 10022', '10018-037',
			'New York', 'US', 1, 'Michelin Three Star', 'the food is nice', 'http://www.aquavit.org/');

INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'Casa Mono', '52 Irving Place New York City, NY 10003', '10018-037',
			'New York', 'US', 1, 'Michelin Three Star', 'the food is nice', 'https://casamononyc.com/');

INSERT INTO public.restaurant(
	id, name, address, post_code, city, country, city_id, rating, comment, link_ip_address)
	VALUES (nextval('restaurant_id_seq'), 'Musket Room', '265 Elizabeth Street, New York, NY 10012 ', '10018-037',
			'New York', 'US', 1, 'Michelin Three Star', 'the food is nice', 'https://www.musketroom.com/');

UPDATE public.restaurant
SET link_ip_address= 'https://guide.michelin.com/us/en/new-york-state/new-york/restaurant/giuliana-s'
WHERE id = '3';

ALTER TABLE restaurant
ADD COLUMN phone VARCHAR,
ADD COLUMN email VARCHAR;

UPDATE public.restaurant
SET phone= '703-327-6262'
WHERE post_code = '10018-037';

UPDATE public.restaurant
SET phone= '703-327-6262'
WHERE post_code = '10018-037';

UPDATE public.restaurant
	SET name='Chefs able at Brooklyn Fare', address='431 West 37th St, New York, NY 10018', city_id=1, link_ip_address='https://guide.michelin.com/us/en/new-york-state/new-york/restaurant/giuliana-s', phone='703-327-6262', email='utest@yahoo.com'
	WHERE id = '3'

UPDATE public.restaurant
	SET comment = 'Required $200/person non-refundable deposit reschedulable up to 8 days prior to reservation. Deposit forfeited for any cancellations. 24 hour notice required for dietary restrictions, allergies & celebrations. Menu includes fish & shellfish, meats & desserts. No accommodation of seafood allergies, vegetarian/vegan or kosher diets. Email or call us for dietary requests. Formal business attire dress code. Suit jackets & dress shoes required for men. Dress down articles not permitted. We operate at 50% capacity. Temperature checks . Face masks are appreciated. Guests with fevers will be rescheduled or canceled. Please arrive on time. Photography without flash is permitted; videos are not. Service
will be refused if any policy is broken.' WHERE id = 3;


