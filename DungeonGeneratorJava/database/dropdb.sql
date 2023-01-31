SELECT pg_terminate_backend(pid)
FROM pg_stat_activity
WHERE datname = 'npc_creator';

DROP DATABASE npc_creator;