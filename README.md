# Docker wykład
Żeby pracować razem potrzebny nam bedzie zainstalowany docker. Poniżej instrukcje jak to zrobić w Windowsie. W systemie Linux jest to o wiele prostsze :)
W tym respozytorium jest też kod prostej aplikacji której bedziemy używać napisanej w Javie, żeby ją uruchomić potrzebujecie Java 11 oraz maven. Aplikacja 
narazie nie startuje ponieważ nie znajduje bazy danych. Podczas wykładu bedziemy próbowali dodac baze danych mysql w dockerze oraz zdockeryzowac sama aplikację.

# Instalacja Dockera
* W wyszukiwarce w pasku windows windows wpisz „Hyper” powinno podpowiedzieć „Turn Windows Features on and off” (można to tez znaleźć w Panelu sterowania)
* Włącz tam nastepujące funkcje: Hyper-V i Containers.
* Zamiast Hyper-V mozemy używać WSL2, jest to nowsza technologia i docker powinien na niej lepiej działać. Tutaj kroki jak zainstalować jak zainstalować/zorbić 
update do WSL2 https://docs.microsoft.com/en-us/windows/wsl/install-manual#step-4---download-the-linux-kernel-update-package 
* Zrestartuj komputer.
* Sprawdź czy masz włączoną wirtualizację sprzętową właczając menedżer zadań w windowsie i sprawdzając jak na obrazku. Gdyby była wyłaczona powinno się ją właczyć w 
BIOSie. Jak uruchomić BIOS oraz gdzie konkretnie włącza się wirtualizację zalezy od modelu waszego komputera. Tutaj przykładowe instrukcje https://2nwiki.2n.cz/pages/viewpage.action?pageId=75202968
![image](https://user-images.githubusercontent.com/38664635/159477607-03e37821-f4df-4a6e-87c1-7cf061870936.png)
* Idź do https://www.docker.com/get-started/, ściagnij i zainstaluj docker for windows.
* W przypadku problemów z dostepną pamiecią: po uruchomieniu docker desktop, kliknij prawym przyciskiej na ikonke w prawym dolnym rogu, wybierz settings i zmniejsz ilość urzywnej pamięci na 1 GB. 
Możesz też znaleźć pomoc tutaj: https://stackoverflow.com/questions/43170089/docker-wont-start-on-windows-not-enough-memory-to-start-docker

