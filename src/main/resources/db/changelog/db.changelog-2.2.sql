--liquibase formatted sql

--changeset dmatveyenka:1
   ALTER TABLE user_aud
   DROP CONSTRAINT users_aud_username_key;
--changeset dmatveyenka:2
   ALTER TABLE user_aud
   ALTER COLUMN username DROP NOT NULL;
