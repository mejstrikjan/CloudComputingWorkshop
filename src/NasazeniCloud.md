☁️ Nasazení do cloudu:
--------------------------
Pomocí Render.com:

1. Otevřít Render.com
2. → New → Web Service
3. → Connect GitHub → vyber repo, v tomto případě je repo: https://github.com/mejstrikjan/CloudComputingWorkshop
4. 3️⃣ Nastav parametry:
   - Pole:      	Hodnota
   - Environment:	Docker
   - Branch:	    main
   - Build Command:	mvn clean package
   - Start Command:	java -jar target/*.jar
   - Instance Type:	Free
5. Klikni Deploy -> Api je nyní dostupné veřejné url formátu: https://cloud-workshop-api.onrender.com