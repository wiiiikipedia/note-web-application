CREATE TABLE note
(
    id          SERIAL PRIMARY KEY NOT NULL,
    note_header VARCHAR,
    note_body   VARCHAR,
    created_at  DATE,
    edited_at   DATE
);