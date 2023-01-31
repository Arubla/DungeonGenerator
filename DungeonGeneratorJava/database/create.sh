#!/bin/bash
export PGPASSWORD='postgres1'
BASEDIR=$(dirname $0)
DATABASE=npc_creator
psql -U postgres -f "$BASEDIR/dropdb.sql" &&