CREATE TABLE tb_client
(
  id_client uuid NOT NULL,
  st_email character varying(255),
  st_name character varying(255),
  CONSTRAINT tb_client_pkey PRIMARY KEY (id_client)
)
WITH (
  OIDS=FALSE
);