-- Create the Post table
CREATE TABLE IF NOT EXISTS Post (
    postId INT PRIMARY KEY,
    profile VARCHAR(255),
    description TEXT,
    experienceReq INT
);

-- Create the TechStack table
CREATE TABLE TechStack  (
    id SERIAL PRIMARY KEY,
    postId INT,
    techId INT,
    FOREIGN KEY (postId) REFERENCES Post(postId)
);

--@block
SELECT * FROM job;