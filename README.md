# GestioneClienti (Progetto Finale Epicode)  
***************************************************************** LEGGIMI *******************************************************************  
Progetto che replica un gestionale CRM.  
Il backend è basato su Spring Boot Data JPA REST, scritto con Java11, che consente di gestire lato server e lato client un database basato su PostgreSQL contenente Regioni, Province e Comuni, fornite tramite appositi file .csv, Indirizzi, Clienti e Fatture. Tramite questo web service è possibile effettuare ricerche basate su diversi criteri, salvare, modificare ed eliminare le principali entità. È stato integrato un sistema di criptazione dei dati sensibili e di verifica dei ruoli dell'utente che accede, in modo da consentire ad admins e users di accedere a differenti funzionalità.  
Il frontend è composto da un piccolo portale basato su Thymeleaf e Bootstrap5 per fornire una migliore esperienza utente.  
  
In modo da far funzionare il servizio il database viene riempito automaticamente con dei dati di partenza salvati tramite un command line runner che fornisce la lista delle regioni, province e comuni, una serire di 20 clienti con due fattture ciascuno. Viene inoltre fornito un account admin col quale accedere (le credenziali possono essere trovate nella classe /EpicEnergyServices2/src/main/java/it/epicode/beservice/PopolaDB.java assieme a tutti gli altri dati). In caso si voglia verificare l'esperienza di un account user, basterà registrare un nuovo account tramite l'apposito form di sign up.  
Inoltre sarà necessario cambiare nel file application.properties le credenziali al database.
  
----
  
********************************************************************* READ ME ****************************************************************  
This project is a simulation of a CRM managment web service.  
The backend is based on Spring Boot Data JPA REST, written in Java11, and it allows to manage a PostgreSQL based database both server and client side. The database contains the whole lists of Regions, Provinces and Cities, all provided by specific .csv files, Addresses, Clients and Invoices. This web service allows to make specific queries such as searching by specific criterias, saving, updating and deleting the main entities. A security system is integrated in order to encrypt the most sensitive datas, along with a user's role check that allows access to different endpoints to admins and users.  
The frontend is composed of a simple web portal based on Thymeleaf and Bootstrap5 in order to provide a better user experience.  
  
To save your time, the database is automatically filled with starter datas saved through a command line runner that furnish a list of Italian regions, provinces and cities, a list of 20 clients with 2 invoices each. An admin account is also provided (credentials can be found in the class /EpicEnergyServices2/src/main/java/it/epicode/beservice/PopolaDB.java, alongside the rest of the starter datas). In case testing of a user account is needed, just sign up with the designated form (each account created with the sign up form will be provided only with the user role).  
In addition it is necessary to update the application.properties file with your personal database credentials.
