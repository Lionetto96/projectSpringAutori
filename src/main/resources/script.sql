-- Table: public.autore

-- DROP TABLE public.autore;

CREATE TABLE IF NOT EXISTS public.autore
(
    id character varying(50),
    nome character(50),
    cognome character(50)
    
)

TABLESPACE pg_default;

CREATE TABLE IF NOT EXISTS public.libro
(
    id character varying(50),
    titolo character(50),
    pagine character(50)
    
)