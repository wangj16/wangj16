select ct.id, ctry.continent, ct.city_name, ct.country, ct.provinces from public.country ctry, public.city ct where ctry.country_id = ct.country_id;
