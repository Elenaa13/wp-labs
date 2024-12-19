CREATE TABLE locations (
                           id BIGINT PRIMARY KEY,
                           name VARCHAR(255),
                           address VARCHAR(255),
                           capacity VARCHAR(255),
                           description VARCHAR(255)
);

CREATE TABLE events (
                        id BIGINT PRIMARY KEY,
                        name VARCHAR(255),
                        description VARCHAR(255),
                        popularity_score FLOAT,
                        location_id BIGINT,
                        CONSTRAINT fk_location FOREIGN KEY (location_id) REFERENCES locations(id)
);


-- Insert locations
INSERT INTO locations (name, address, capacity, description) VALUES
                                                                 ('Cineplexx', 'Adresa 1', '200', 'Filmovi'),
                                                                 ('Koncert', 'Adresa 3', '1000', 'Muzika'),
                                                                 ('Uciliste', 'Adresa 5', '600', 'Ucenje'),
                                                                 ('Seminar', 'Adresa 4', '300', 'Seminari'),
                                                                 ('Teatar', 'Adresa 2', '400', 'Pretstavi');

-- Insert events
INSERT INTO events (name, description, popularity_score, location_id) VALUES
                                                                          ('Oppenheimer', 'A film about the father of the atomic bomb', 9.5, 1),
                                                                          ('Dune', 'A science fiction film based on the novel', 8.8, 1),
                                                                          ('Jazz Festival', 'A night of jazz music and performances', 7.5, 2),
                                                                          ('Tech Summit 2023', 'Annual technology and innovation conference', 9.1, 3),
                                                                          ('Art Expo', 'Local artists showcasing unique works', 8.3, 3),
                                                                          ('Wine Tasting', 'Sample wines from around the world', 7.9, 4),
                                                                          ('Shakespeare in the Park', 'Outdoor performances of classic plays', 8.7, 5),
                                                                          ('Book Fair', 'Meet authors and discover new books', 7.4, 3),
                                                                          ('Film Marathon', 'Back-to-back screenings of classic films', 8.0, 5),
                                                                          ('Coding Bootcamp', 'A full day of hands-on programming workshops', 8.5, 3);
