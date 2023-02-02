CREATE USER dungeon_generator_owner
WITH PASSWORD 'dungeongenerator';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO dungeon_generator_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO dungeon_generator_owner;

CREATE USER dungeon_generator_appuser
WITH PASSWORD 'dungeongenerator';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO dungeon_generator_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO dungeon_generator_appuser;