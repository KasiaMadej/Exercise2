# Exercise2 - zapis danych geolokalizacyjnych
Aby móc uruchomić zadanie należy stworzyć instancję bazy danych w PostgreSQL o nazwie geolocation. 
Następnie w plikach aplikacji:  application.properies należy podać własne hasło i login do SZBD PostgreSQL:
spring.datasource.username=/*enter username*/
spring.datasource.password=/*enter password*/

Po tych krokach nastąpi połączenie z bazą danych i możliwa będzie interakcja apliakcja- baza danych. 


Aplikacja serwerowa działa pod portem 8088
Widok próbnych danych dostępny jest pod adresem: http://localhost:8080/sample
Aby dokonać zapisu do bazy należy wejść na link : http://localhost:8080/saveGeolocationData

### Jak uruchomić?

Aplikacja wymaga zainstalowania Maven i wykonania komendy:
''' mvn clean install '''
Aby włączyć należy użyć komendy
''' mvn spring-boot:run'''
