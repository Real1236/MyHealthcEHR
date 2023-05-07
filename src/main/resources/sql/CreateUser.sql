-- Drop user first if they exist
DROP USER if exists 'methacks'@'localhost' ;

-- Now create user with prop privileges
CREATE USER 'methacks'@'localhost' IDENTIFIED BY 'methacks';

GRANT ALL PRIVILEGES ON * . * TO 'methacks'@'localhost';