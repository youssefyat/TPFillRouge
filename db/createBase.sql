/*==============================================================*/
/* Equipe  : Wijdane & AIT-TALEB & HAMMADI                                     */
/* Date de création :  2017/02/28 04:03:52 PM                   */
/*==============================================================*/


drop table if exists Competition;

drop table if exists Equipe;

drop table if exists Rencontre;

drop table if exists Personne;

drop table if exists Poulle;

drop table if exists Pronostic;

/*==============================================================*/
/* Table : Competition                                          */
/*==============================================================*/
CREATE TABLE Competition (
    idCompetition INT NOT NULL AUTO_INCREMENT,
    libelleCompetition VARCHAR(40) NOT NULL,
    PRIMARY KEY (idCompetition)
);

/*==============================================================*/
/* Table : Equipe                                               */
/*==============================================================*/
CREATE TABLE Equipe (
    idEquipe INT NOT NULL AUTO_INCREMENT,
    libelleEquipe VARCHAR(40) NOT NULL,
    imgEquipe VARCHAR(30) NULL,
    PRIMARY KEY (idEquipe)
);

/*==============================================================*/
/* Table : Rencontre                                           */
/*==============================================================*/
CREATE TABLE Rencontre (
    idRencontre INT NOT NULL AUTO_INCREMENT,
    idPoulle INT NULL,
    idEquipe1 INT NOT NULL,
	idEquipe2 INT NOT NULL,
    idCompetition INT NOT NULL,
    datedebut DATETIME NULL  ,
    dateFin DATETIME NULL,
    butEquipe1 TINYINT ,
    butEquipe2 TINYINT,
    PRIMARY KEY (idRencontre)
);


/*==============================================================*/
/* Table : Personne                                             */
/*==============================================================*/
CREATE TABLE Personne (
    idPersonne INT NOT NULL AUTO_INCREMENT,
    nomPersonne VARCHAR(40) NOT NULL,
    prenomPersonne VARCHAR(40) NOT NULL,
    email VARCHAR(40) NOT NULL,
    passwd CHAR(32) NOT NULL,
    role VARCHAR(40) NOT NULL,
    PRIMARY KEY (idPersonne)
);

/*==============================================================*/
/* Table : Poulle                                               */
/*==============================================================*/
CREATE TABLE Poulle (
    idPoulle INT NOT NULL AUTO_INCREMENT,
    libellePoulle VARCHAR(20),
    PRIMARY KEY (idPoulle)
);

/*==============================================================*/
/* Table : Pronostic                                            */
/*==============================================================*/
CREATE TABLE Pronostic (
    idPronostic INT NOT NULL AUTO_INCREMENT,
    idRencontre INT NOT NULL,
    idPersonne INT NOT NULL,
    butEquipe1 INT NOT NULL,
    butEquipe2 INT NOT NULL,
    score INT,
    PRIMARY KEY (idPronostic)
);
/*==============================================================*/
/* FOREIGN KEY's                */
/*==============================================================*/


ALTER TABLE Rencontre add CONSTRAINT fk_RencontrePoulle FOREIGN KEY (idPoulle)
        REFERENCES Poulle (idPoulle);
ALTER TABLE Rencontre add CONSTRAINT fk_RencontreEquipe1 FOREIGN KEY (idEquipe1)
        REFERENCES Equipe (idEquipe);
ALTER TABLE Rencontre add CONSTRAINT fk_RencontreEquipe2 FOREIGN KEY (idEquipe2)
        REFERENCES Equipe (idEquipe);
ALTER TABLE Rencontre add CONSTRAINT fk_RencontreCompetition FOREIGN KEY (idCompetition)
        REFERENCES Competition(idCompetition);


ALTER TABLE Pronostic add CONSTRAINT fk_PronosticPersonne FOREIGN KEY (idPersonne)
        REFERENCES Personne (idPersonne);
ALTER TABLE Pronostic add CONSTRAINT fk_PronosticRencontre FOREIGN KEY (idRencontre )
        REFERENCES Rencontre  (idRencontre );