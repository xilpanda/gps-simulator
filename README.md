# GPS Simulator

Ovaj projekat sadrži Java aplikaciju koja simulira GPS uređaje, generišući i šaljući lažne GPS koordinate. CILJ: Ovaj projekat kombinuje testiranje performansi sa virtualizacijom. 
GPS simulator pokrecem na jednoj ili više Ubuntu VM-ova na Proxmox serveru. Zašto? Da bi smo istisnuli maksimum iz svakog VM-a i zaista stekli osećaj tereta koji mogu da podnesu.

## Pretpostavke

Prijee nego što započnete, uvjerite se da imate instaliranu Java Development Kit (JDK) verziju 17 ili noviju.

## Instalacija JDK-a

1. Preuzmite JDK sa zvanične [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) stranice ili [OpenJDK](https://jdk.java.net/) ukoliko preferirate open-source opciju.
2. Instalirajte JDK prateći uputstva za vaš operativni sistem.

## Podešavanje Java okruženja

Na Windows-u:

1. Otvorite System Properties (Win + Pause).
2. Kliknite na 'Advanced system settings' i zatim na dugme 'Environment Variables'.
3. U System variables, potražite i izaberite `PATH`, zatim kliknite na 'Edit'.
4. Dodajte putanju do `bin` direktorijuma unutar JDK direktorijuma.
export JAVA_HOME=/putanja/do/vas/jdk
export PATH=$JAVA_HOME/bin:$PATH

Na macOS/Linux:

1. Otvorite terminal.
2. Ažurirajte vaš `.bashrc` ili `.zshrc` fajl dodavanjem:
3. Sačuvajte fajl i izvršite `source ~/.bashrc` ili `source ~/.zshrc` da primenite promene.

## Preuzimanje projekta

1. Klonirajte repozitorijum koristeći:
git clone https://github.com/username/gps-simulator.git

2. Navigirajte do direktorijuma projekta:
cd gps-simulator

## Kompajliranje i pokretanje

Iz direktorijuma projekta:

1. Kompajlirajte izvorni kod koristeći:
  javac GPSDeviceSimulator.java
2. Pokrenite aplikaciju koristeći:
  java GPSDeviceSimulator


## Korišćenje Eclipse IDE-a

Ako koristite Eclipse:

1. Otvorite Eclipse i izaberite 'File' > 'Open Projects from File System...'.
2. Pronađite direktorijum gde ste klonirali projekat i otvorite ga.
3. Desni klik na projekat u Package Explorer-u i izaberite 'Run As' > 'Java Application'.



