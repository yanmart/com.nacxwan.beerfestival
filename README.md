# com.nacxwan.beerfestival

## Prerequis 

- Installation de java
- Installation de maven
- Installation de docker/docker compose
- Installation de git

Les commandes suivantes seront pour un OS Linux Ubuntu.

### Installation de java

Mise a jour du dépot

```
sudo apt update
```

Installation de java

```
sudo apt install default-jdk -y
```

Verifier votre version , il faut qu'elle soit de 17 ou superieur.

```
java -version
```


### Installation de maven

Mise a jour du dépot

```
sudo apt update
```

Installation de maven

```
sudo apt install maven -y
```

Verify la version.

```
mvn -version
```


### Installation de Docker

Mise a jour  du dépot et ajout de la GPG key

```
sudo apt-get update
sudo apt-get install ca-certificates curl
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc
sudo chmod a+r /etc/apt/keyrings/docker.asc
```

Ajout du repository dans les sources Apt

```
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/ubuntu \
  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```
```
sudo apt-get update
```

Installation du docker / docker compose

```
sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```

Ajouter votre utilisateur linux dans le group docker

```
sudo usermod -aG docker ${USER}
```

Redémarrer

```
sudo reboot
```

Tester que vous pouvez bien lancer les commandes Docker

```
docker run hello-world
```

### Installation de git

Mise a jour du dépot

```
sudo apt upgrade
```

Installation de git

```
sudo apt install git
```

Verifier que l'installation c'est bien passé , en regardant la version

```
git --version
```

## Clonage du repot git et lancement

Se mettre dans un répertoire temporaire

```
cd /tmp
```

Cloner le repository git

```
git clone https://github.com/yanmart/com.nacxwan.beerfestival.git
```

```
cd com.nacxwan.beerfestival
```

Récuperer l'ip de votre machine , et la mettre dans la variable d'environnement DB_HOSTNAME ( ex : 192.168.1.161 )

```
ip a
```

```
export DB_HOSTNAME=<ip_machine_recupérer>
```
ex:

```
export DB_HOSTNAME=192.168.1.161
```

lancement de la DB en Docker

```
cd dblaunching/
```

```
docker compose up -d
```

```
cd ..
```

### Lancement du projet

```
mvn spring-boot:run
```

vous pouvez ouvrir un navigateur et aller a l'adresse suivante ( toujours avec l'ip de la machine que vous avez récuperé. )

http://<ip_machine_recupéré>:8080/

( ex : http://192.168.1.161:8080/ )






